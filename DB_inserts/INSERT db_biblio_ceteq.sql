USE db_biblio_ceteq;

/*iNSERTAR AUTORES*/
INSERT INTO b_autores(apellidos, fecha_nacimiento, nacionalidad, nombre) VALUES ('de Saint-Exupéry', '1980-02-05', 'Frences', 'Antoine');
INSERT INTO b_autores(apellidos, fecha_nacimiento, nacionalidad, nombre) VALUES ('Pacheco', '1982-02-05', 'Mexicana', 'José Emilio');
INSERT INTO b_autores(apellidos, fecha_nacimiento, nacionalidad, nombre) VALUES ('Leon Portilla', '1983-02-05', 'Mexicana', 'Miguel');

/*iNSERTAR USUARIOS*/
INSERT INTO b_usuarios(apellidos, correo, curp, direccion, fecha_nacimiento, usuario, telefono) VALUES ('de Saint', 'anda@biblioteca.mx', 'HUJI900725MPLSGH01', '121 PONIENTE', '1990-07-25', 'Andrea', '222321234');
INSERT INTO b_usuarios(apellidos, correo, curp, direccion, fecha_nacimiento, usuario, telefono) VALUES ('Flores', 'flores@biblioteca.mx', 'HUTJ890706MPLSHT05', '121 PONIENTE', '1989-07-06', 'Gustavo', '222321234');
INSERT INTO b_usuarios(apellidos, correo, curp, direccion, fecha_nacimiento, usuario, telefono) VALUES ('Juarez', 'juarez@biblioteca.mx', 'HUYJ890706MPLSHT05', '121 PONIENTE', '1989-07-06', 'Gonzalo', '222321234');

/*iNSERTAR PRESTAMOS*/
INSERT INTO b_prestamos(fecha_entrega, fecha_prestamo, id_libro, id_usuario) VALUES('2021-02-06', '2021-02-03', 2, 1);
INSERT INTO b_prestamos(fecha_entrega, fecha_prestamo, id_libro, id_usuario) VALUES('2021-02-05', '2021-02-01', 1, 2);
INSERT INTO b_prestamos(fecha_entrega, fecha_prestamo, id_libro, id_usuario) VALUES('2021-02-05', '2021-02-02', 3, 3);

/*iNSERTAR MULTAS*/
INSERT INTO b_multas(fecha_multa, fecha_pago, saldo, id_prestamo) VALUES('2021-02-06', '2021-02-09', 20.00, 2);
INSERT INTO b_multas(fecha_multa, fecha_pago, saldo, id_prestamo) VALUES('2021-02-05', '2021-02-08', 20.00, 1);
INSERT INTO b_multas(fecha_multa, fecha_pago, saldo, id_prestamo) VALUES('2021-02-05', '2021-02-08', 20.00, 3);

/*iNSERTAR LIBROS*/
INSERT INTO b_libros(edicion, existencia, fecha, nombre, id_autor, id_categoria) VALUES ('Primera', 4, '2021-02-09', 'Las Battallas en el desierto', 1, 1);
INSERT INTO b_libros(edicion, existencia, fecha, nombre, id_autor, id_categoria) VALUES ('Segunda', 6, '2021-02-09', 'El principito', 2, 2);
INSERT INTO b_libros(edicion, existencia, fecha, nombre, id_autor, id_categoria) VALUES ('Tercera', 6, '2021-02-07', 'Vacunas', 2, 1);

/*iNSERTAR CATEGORIA*/
INSERT INTO b_categoria(nombre) VALUES("Ciencia");
INSERT INTO b_categoria(nombre) VALUES("Ficcion");
INSERT INTO b_categoria(nombre) VALUES("Terror");