CREATE TABLE topicos(

    id bigint NOT NULL auto_increment,
    titulo VARCHAR(100) NOT NULL UNIQUE,
    mensaje VARCHAR(100) NOT NULL UNIQUE,
    fecha_creacion DATE NOT NULL,
    status_topico VARCHAR(20) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)

);