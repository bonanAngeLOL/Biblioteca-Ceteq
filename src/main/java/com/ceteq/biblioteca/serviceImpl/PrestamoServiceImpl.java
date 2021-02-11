package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ceteq.biblioteca.bean.PrestamoBean;
import com.ceteq.biblioteca.model.LibroModel;
import com.ceteq.biblioteca.model.PrestamoModel;
import com.ceteq.biblioteca.model.UsuarioModel;
import com.ceteq.biblioteca.repository.PrestamoRepository;
import com.ceteq.biblioteca.service.PrestamoService;

@Service
@Transactional
public class PrestamoServiceImpl implements PrestamoService {
	
	@Autowired 
	private PrestamoRepository prestamoRepository;

	@Override
	public String createPrestamo(PrestamoBean prestamoBean) {
		
		PrestamoModel prestamoModel = new PrestamoModel();

		prestamoModel.setIdPrestamo(prestamoBean.getIdPrestamos());
		prestamoModel.setFechaPrestamo(prestamoBean.getFechaPrestamo());
		prestamoModel.setFechaEntrega(prestamoBean.getFechaEntrega());
		prestamoModel.setIdLibro(new LibroModel(prestamoBean.getIdLibro()));
		prestamoModel.setIdUsuario(new UsuarioModel(prestamoBean.getIdUsuario()));

		this.prestamoRepository.save(prestamoModel);

		String result = "Prestamo guardado";

		return result;
	
	}

	@Override
	public PrestamoBean findById(Integer id) {
		PrestamoModel prestamoModel = this.prestamoRepository.findById(id).orElseThrow();

		PrestamoBean prestamoBean = new PrestamoBean();

		prestamoBean.setIdPrestamos(prestamoModel.getIdPrestamo());
		prestamoBean.setFechaPrestamo(prestamoModel.getFechaPrestamo());
		prestamoBean.setFechaEntrega(prestamoModel.getFechaEntrega());
		prestamoBean.setIdLibro(prestamoModel.getIdLibro().getIdLibro());
		prestamoBean.setIdUsuario(prestamoModel.getIdUsuario().getIdUsuario());

		return prestamoBean;
	}

	@Override
	public List<PrestamoBean> findAll() {
		
		List<PrestamoModel> PrestamoModelList = prestamoRepository.findAll();

		List<PrestamoBean> prestamoBeanList = new ArrayList<>();

		for (int i=0; i<PrestamoModelList.size(); i++) {
			
		

			PrestamoBean prestamoBean = new PrestamoBean();

			prestamoBean.setIdPrestamos(PrestamoModelList.get(i).getIdPrestamo());
			prestamoBean.setFechaEntrega(PrestamoModelList.get(i).getFechaEntrega());
			prestamoBean.setFechaPrestamo(PrestamoModelList.get(i).getFechaPrestamo());
			prestamoBean.setIdLibro(PrestamoModelList.get(i).getIdLibro().getIdLibro());
			prestamoBean.setIdUsuario(PrestamoModelList.get(i).getIdUsuario().getIdUsuario());

			prestamoBeanList.add(prestamoBean);
			
		}//for
			
			return prestamoBeanList;	
	}//Lista

	@Override
	public Boolean updatePrestamo(PrestamoBean prestamoBean) {
		
		PrestamoModel prestamoModel = this.prestamoRepository.findById(prestamoBean.getIdPrestamos()).orElseThrow();

		
		prestamoModel.setFechaEntrega(prestamoBean.getFechaEntrega());
		prestamoModel.setFechaPrestamo(prestamoBean.getFechaPrestamo());
		prestamoBean.setIdLibro(prestamoModel.getIdLibro().getIdLibro());
		prestamoBean.setIdUsuario(prestamoModel.getIdUsuario().getIdUsuario());

		this.prestamoRepository.save(prestamoModel);

	
		return true;
	}

	@Override
	public Boolean deletePrestamo(Integer id) {
		PrestamoModel prestamoModel = this.prestamoRepository.findById(id).orElseThrow();
		this.prestamoRepository.delete(prestamoModel);
		return true;
	}

	@Override
	public List<?> findAllPrestamos() {
		return this.prestamoRepository.findAllPrestamos();
	}

	@Override
	public List<?> findAllLibrosPrestados() {
		return this.prestamoRepository.findAllLibrosPrestados();
	}
	
	

}
