package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.biblioteca.bean.MultaBean;
import com.ceteq.biblioteca.model.MultaModel;
import com.ceteq.biblioteca.model.PrestamoModel;
import com.ceteq.biblioteca.repository.MultaRepository;
import com.ceteq.biblioteca.service.MultaService;
@Service
@Transactional
public class MultaServiceImpl implements MultaService{
	@Autowired
	private MultaRepository multaRepo;
	@Override
	public String createMulta(MultaBean multaBean) {
		PrestamoModel prestamoModel = new PrestamoModel();
		prestamoModel.setIdPrestamo(multaBean.getIdPrestamo());
		MultaModel multaModel = new MultaModel();
		multaModel.setFechaMulta(multaBean.getFechaMulta());
		multaModel.setFechaPago(multaBean.getFechaPago());
		multaModel.setSaldo(multaBean.getSaldo());
		multaModel.setIdPrestamo(prestamoModel);
		this.multaRepo.save(multaModel);
		return "Se guardo la multa con id: " + multaModel.getIdMulta();
	}

	@Override
	public String updateMulta(MultaBean multaBean) {
		MultaModel multaModel = this.multaRepo.findById(multaBean.getIdMulta()).orElseThrow();
		PrestamoModel prestamoModel = new PrestamoModel();
		prestamoModel.setIdPrestamo(multaBean.getIdPrestamo());
		multaModel.setFechaMulta(multaBean.getFechaMulta());
		multaModel.setFechaPago(multaBean.getFechaPago());
		multaModel.setSaldo(multaBean.getSaldo());
		multaModel.setIdPrestamo(prestamoModel);
		this.multaRepo.save(multaModel);
		return "Se guardo la multa con id: " + multaModel.getIdMulta();
	}

	@Override
	public MultaBean getMulta(int idMulta) {
		MultaModel multaModel = this.multaRepo.findById(idMulta).orElseThrow(null);
		MultaBean multaBean = new MultaBean();
		multaBean.setIdMulta(multaModel.getIdMulta());
		multaBean.setFechaMulta(multaModel.getFechaMulta());
		multaBean.setFechaPago(multaModel.getFechaPago());
		multaBean.setSaldo(multaModel.getSaldo());
		multaBean.setIdPrestamo(multaModel.getIdPrestamo().getIdPrestamo());
		return multaBean;
	}

	@Override
	public List<MultaBean> getAllMulta() {
		List<MultaModel> multaModelList = this.multaRepo.findAll();
		List<MultaBean> multaBeanList = new ArrayList<>();
		for(MultaModel multam: multaModelList) {
			MultaBean multaBean = new MultaBean();
			multaBean.setIdMulta(multam.getIdMulta());
			multaBean.setFechaMulta(multam.getFechaMulta());
			multaBean.setFechaPago(multam.getFechaMulta());
			multaBean.setSaldo(multam.getSaldo());
			multaBean.setIdPrestamo(multam.getIdPrestamo().getIdPrestamo());
			multaBeanList.add(multaBean);
		}
		return multaBeanList;
	}

	@Override
	public String deleteMulta(int idMulta) {
		MultaModel multaModel = this.multaRepo.findById(idMulta).orElseThrow();
		this.multaRepo.delete(multaModel);
		return "Se elimino la multa con ID:  " + multaModel.getIdMulta();
	}

}
