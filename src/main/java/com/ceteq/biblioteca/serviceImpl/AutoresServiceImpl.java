package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.biblioteca.bean.AutorBean;
import com.ceteq.biblioteca.model.AutorModel;
import com.ceteq.biblioteca.repository.AutorRepository;
import com.ceteq.biblioteca.service.AutoresService;

@Service
@Transactional
public class AutoresServiceImpl implements AutoresService {

	@Autowired
	private AutorRepository autorRepository;

	@Override
	public String createAutor(AutorBean autorBean) {

		AutorModel autorModel = new AutorModel();

		autorModel.setNombre(autorBean.getNombre());
		autorModel.setApellidos(autorBean.getApellidos());
		autorModel.setFechaNacimiento(autorBean.getFechaNacimiento());
		autorModel.setNacionalidad(autorBean.getNacionalidad());

		autorRepository.save(autorModel);

		String result = "Registro guardado";

		return result;
	}

	@Override
	public AutorBean findById(Integer id) {

		AutorModel autorModel = this.autorRepository.findById(id).orElseThrow();

		AutorBean autorBean = new AutorBean();

		autorBean.setIdAutor(autorModel.getIdAutor());
		autorBean.setNombre(autorModel.getNombre());
		autorBean.setApellidos(autorModel.getApellidos());
		autorBean.setFechaNacimiento(autorModel.getFechaNacimiento());
		autorBean.setNacionalidad(autorModel.getNacionalidad());

		return autorBean;
	}

	@Override
	public List<AutorBean> findAll() {

		List<AutorModel> autorModelsList = autorRepository.findAll();

		List<AutorBean> autorBeansList = new ArrayList<>();

		for (AutorModel autorModel : autorModelsList) {

			AutorBean autorBean = new AutorBean();

			autorBean.setIdAutor(autorModel.getIdAutor());
			autorBean.setNombre(autorModel.getNombre());
			autorBean.setApellidos(autorModel.getApellidos());
			autorBean.setFechaNacimiento(autorModel.getFechaNacimiento());
			autorBean.setNacionalidad(autorModel.getNacionalidad());

			autorBeansList.add(autorBean);

			return autorBeansList;
		}

		return null;
	}

	@Override
	public Boolean updateAutor(AutorBean autorBean) {

		AutorModel autorModel = this.autorRepository.findById(autorBean.getIdAutor()).orElseThrow();

		autorModel.setNombre(autorBean.getNombre());
		autorModel.setApellidos(autorBean.getApellidos());
		autorModel.setFechaNacimiento(autorBean.getFechaNacimiento());
		autorModel.setNacionalidad(autorBean.getNacionalidad());

		this.autorRepository.save(autorModel);

		return null;
	}

	@Override
	public Boolean deleteAutor(Integer id) {

		AutorModel autorModel = this.autorRepository.findById(id).orElseThrow();
		this.autorRepository.delete(autorModel);

		return true;
	}

}
