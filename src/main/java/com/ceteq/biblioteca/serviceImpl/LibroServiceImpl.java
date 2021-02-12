package com.ceteq.biblioteca.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.ceteq.biblioteca.bean.LibroBean;
import com.ceteq.biblioteca.bean.projection.LibroIdNombre;
import com.ceteq.biblioteca.model.AutorModel;
import com.ceteq.biblioteca.model.CategoriaModel;
import com.ceteq.biblioteca.model.LibroModel;
import com.ceteq.biblioteca.repository.LibroRepository;
import com.ceteq.biblioteca.service.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public String createLibro(LibroBean libroBean) {

        LibroModel libroModel = new LibroModel();

        libroModel.setNombre(libroBean.getNombre());
        libroModel.setIdAutor(new AutorModel(libroBean.getIdAutor()));
        libroModel.setIdCategoria(new CategoriaModel(libroBean.getIdCategoria()));
        libroModel.setFechaPublicacion(libroBean.getFechaPublicacion());
        libroModel.setExistencia(libroBean.getExistencia());
        libroModel.setEdicion(libroBean.getEdicion());

        libroRepository.save(libroModel);

        String result = "Registro guardado";

        return result;
    }

    @Override
    public LibroBean findByID(Integer id) {

        LibroModel libroModel = this.libroRepository.findById(id).orElseThrow();

        LibroBean libroBean = new LibroBean();

        libroBean.setIdLibro(libroModel.getIdLibro());
        libroBean.setNombre(libroModel.getNombre());
        libroBean.setIdAutor(libroModel.getIdAutor().getIdAutor());
        libroBean.setIdCategoria(libroModel.getIdCategoria().getIdCategoria());
        libroBean.setFechaPublicacion(libroModel.getFechaPublicacion());
        libroBean.setExistencia(libroModel.getExistencia());
        libroBean.setEdicion(libroBean.getEdicion());

        return libroBean;
    }

    @Override
    public List<LibroBean> findAll() {

        List<LibroModel> libroModelsList = libroRepository.findAll();

        List<LibroBean> libroBeansList = new ArrayList<LibroBean>();

        for (LibroModel libroModel : libroModelsList) {

            LibroBean libroBean = new LibroBean();

            libroBean.setIdLibro(libroModel.getIdLibro());
            libroBean.setNombre(libroModel.getNombre());
            libroBean.setIdAutor(libroModel.getIdAutor().getIdAutor());
            libroBean.setIdCategoria(libroModel.getIdCategoria().getIdCategoria());
            libroBean.setFechaPublicacion(libroModel.getFechaPublicacion());
            libroBean.setExistencia(libroModel.getExistencia());
            libroBean.setEdicion(libroModel.getEdicion());

            libroBeansList.add(libroBean);

        }

        return libroBeansList;
    }

    @Override
    public Boolean updateLibro(LibroBean libroBean) {

        LibroModel libroModel = this.libroRepository.findById(libroBean.getIdLibro()).orElseThrow();

        libroModel.setNombre(libroBean.getNombre());
        libroModel.setIdAutor(new AutorModel(libroBean.getIdAutor()));
        libroModel.setIdCategoria(new CategoriaModel(libroBean.getIdCategoria()));
        libroModel.setFechaPublicacion(libroBean.getFechaPublicacion());
        libroModel.setExistencia(libroBean.getExistencia());
        libroModel.setEdicion(libroBean.getEdicion());

        this.libroRepository.save(libroModel);

        return true;
    }

    @Override
    public Boolean deleteLibro(Integer id) {

        LibroModel libroModel = this.libroRepository.findById(id).orElseThrow();
        this.libroRepository.delete(libroModel);

        return true;
    }

    @Override
    public List<LibroIdNombre> getLibroByNombreAutor(String NombreAutor) {
        return this.libroRepository.getLibroByNombreAutor(NombreAutor);
    }

}
