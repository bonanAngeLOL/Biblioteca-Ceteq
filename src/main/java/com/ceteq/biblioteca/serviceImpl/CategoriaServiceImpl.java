package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.biblioteca.bean.CategoriaBean;
import com.ceteq.biblioteca.model.CategoriaModel;
import com.ceteq.biblioteca.repository.CategoriaRepository;
import com.ceteq.biblioteca.service.CategoriaService;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public String createCategoria(CategoriaBean categoriaBean) {
		CategoriaModel categoriaModel = new CategoriaModel();
		categoriaModel.setNombre(categoriaBean.getNombre());

		categoriaRepository.save(categoriaModel);

		String result = "Se guardo La Categoria:" + categoriaModel.getNombre();
		return result;
	}

	@Override
	public CategoriaBean findByID(Integer id) {

		CategoriaModel categoriaModel = this.categoriaRepository.findById(id).orElseThrow();

		CategoriaBean categoriaBean = new CategoriaBean();

		categoriaBean.setIdCategoria(categoriaModel.getIdCategoria());
		categoriaBean.setNombre(categoriaModel.getNombre());

		return categoriaBean;
	}

	@Override
	public List<CategoriaBean> findAll() {
		List<CategoriaModel> categoriaModelsList = categoriaRepository.findAll();

		List<CategoriaBean> categoriaBeansList = new ArrayList<>();

		for (CategoriaModel categoriaModel : categoriaModelsList) {

			CategoriaBean categoriaBean = new CategoriaBean();

			categoriaBean.setIdCategoria(categoriaModel.getIdCategoria());
			categoriaBean.setNombre(categoriaModel.getNombre());

			categoriaBeansList.add(categoriaBean);
		}
		return categoriaBeansList;
	}

	@Override
	public Boolean updateCategoria(CategoriaBean categoriaBean) {
		CategoriaModel categoriaModel = this.categoriaRepository.findById(categoriaBean.getIdCategoria()).orElseThrow();

		categoriaModel.setIdCategoria(categoriaBean.getIdCategoria());
		categoriaModel.setNombre(categoriaBean.getNombre());

		this.categoriaRepository.save(categoriaModel);
		return true;
	}

	@Override
	public Boolean deleteCategoria(Integer id_categoria) {
		CategoriaModel categoriaModel = this.categoriaRepository.findById(id_categoria).orElseThrow();
		this.categoriaRepository.delete(categoriaModel);

		return true;
	}

}
