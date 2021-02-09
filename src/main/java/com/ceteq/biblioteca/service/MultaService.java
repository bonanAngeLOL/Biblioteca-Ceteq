package com.ceteq.biblioteca.service;

import java.util.List;

import com.ceteq.biblioteca.bean.MultaBean;

public interface MultaService {
	public String createMulta(MultaBean multaBean);
	public String updateMulta(MultaBean multaBean);
	public MultaBean getMulta(int idMulta);
	public List<MultaBean> getAllMulta();
	public String deleteMulta(int idMulta); 
}
