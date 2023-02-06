create table estudiante(
    id int not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    telefono varchar(20) not null,
    correo varchar(200) not null,
    primary key(id)
);