CREATE DATABASE Bonvino;
USE Bonvino;


CREATE TABLE Pais (
      id INT AUTO_INCREMENT PRIMARY KEY,
      nombre VARCHAR(100) NOT NULL
);


CREATE TABLE Provincia (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre VARCHAR(100) NOT NULL,
       pais_id INT,
       FOREIGN KEY (pais_id) REFERENCES Pais(id)
);


CREATE TABLE RegionVitivinicola (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(100) NOT NULL,
        descripcion TEXT,
        provincia_id INT,
        FOREIGN KEY (provincia_id) REFERENCES Provincia(id)
);


CREATE TABLE Bodega (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(100) NOT NULL,
        descripcion TEXT,
        coordenadasUbicacion VARCHAR(50),
        historia TEXT,
        periodoActualizacion DATE,
        region_id INT,
        FOREIGN KEY (region_id) REFERENCES RegionVitivinicola(id)
);


CREATE TABLE Vino (
      id INT AUTO_INCREMENT PRIMARY KEY,
      nombre VARCHAR(255) NOT NULL,
      anada INT,
      imagenEtiqueta VARCHAR(255),
      notaDeCadaBodega VARCHAR(50),
      precio DECIMAL(10, 2),
      bodega_id INT,
      FOREIGN KEY (bodega_id) REFERENCES Bodega(id)
);


CREATE TABLE Varietal (
      id INT AUTO_INCREMENT PRIMARY KEY,
      descripcion VARCHAR(100) NOT NULL,
      porcentajeComposicion DECIMAL(5, 2),
      vino_id INT,
      FOREIGN KEY (vino_id) REFERENCES Vino(id),
);


CREATE TABLE Resena (
        id INT AUTO_INCREMENT PRIMARY KEY,
        comentario TEXT,
        esPremium BOOLEAN,
        fechaResena DATE,
        puntaje INT,
        vino_id INT,
        FOREIGN KEY (vino_id) REFERENCES Vino(id)
);
