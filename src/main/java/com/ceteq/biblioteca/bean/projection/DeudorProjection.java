package com.ceteq.biblioteca.bean.projection;

import java.util.Date; 

public interface DeudorProjection {

     int getIdUsuario();

     int getIdPrestamo();

     String getUsuario();

     Date getFecha_prestamo();

     Date getFecha_limite();

     String getMulta();
    
}
