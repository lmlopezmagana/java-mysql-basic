CREATE TABLE alumno (

    id_alumno MEDIUMINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    edad INT NOT NULL,
    email VARCHAR(320),
    PRIMARY KEY (id_alumno)
);

INSERT INTO alumno (nombre, apellidos, edad, email)
VALUES  ('María', 'López Martínez', 18, NULL),
        ('José', 'García González', 23, "josexyz@gmail.com"),
        ('Ana', "Del Campo Rodríguez", 19, "anukyfield@gmail.com"),
        ('Martín', "Suárez Trevejo", 24, NULL);