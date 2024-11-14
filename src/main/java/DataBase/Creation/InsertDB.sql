INSERT INTO pais (nombre) VALUES
      ("Argentina"),("Francia"),
      ("Australia"),("Estados Unidos"),
      ("Italia"),("España");

INSERT INTO provincia (nombre,pais_id) VALUES
       ("Mendoza",1),("Salta",1),
       ("Bordeos",2),("Borgoña",2),
       ("Barossa Valley",3),("California",4),
       ("Toscana",5),("Castilla y León",6)
;

INSERT INTO regionvitivinicola (nombre,descripcion,provincia_id) VALUES
     ("Alto Luján de Cuyo","Subregión ubicada en el Valle de Uco, Mendoza, conocida por sus grandes vinos tintos de altura.", 1),
     ("Luján de Cuyo","Una de las regiones vitivinícolas más importantes de Mendoza, conocida por sus vinos tintos de alta calidad.", 1),
     ("Valle de Uco","Una de las regiones vitivinícolas más importantes de Argentina, conocida por sus vinos blancos de gran calidad y expresión.", 1),
     ("Valles Calchaquíes","Una región vitivinícola única, ubicada en el norte de Argentina, conocida por sus vinos de gran carácter y expresión.", 2),
     ("Burdeos","Una de las regiones vitivinícolas más prestigiosas del mundo, conocida por sus vinos tintos de Cabernet Sauvignon y Merlot.", 3),
     ("Borgoña","Una de las regiones vitivinícolas más prestigiosas del mundo, conocida por sus Pinot Noir complejos y elegantes.", 4),
     ("Barossa Valley","Una de las regiones vitivinícolas más importantes de Australia, conocida por sus vinos tintos intensos y complejos.", 5),
     ("Napa Valley","La región vitivinícola más famosa de California, conocida por sus vinos tintos de alta gama.", 6),
     ("Toscana","Una de las regiones vitivinícolas más antiguas e importantes de Italia, conocida por sus vinos tintos de Sangiovese.", 7),
     ("Ribera del Duero","Una región vitivinícola española conocida por sus vinos tintos Tempranillo intensos y complejos.", 8);


INSERT INTO bodega (region_id, nombre, descripcion, coordenadasUbicacion, historia, periodoActualizacion) VALUES
      (1, 'Catena Zapata', 'Bodega familiar fundada en 1991, pionera en la elaboración de vinos de altura en Mendoza.', '-33.84644,-69.18972', 'https://www.catenazapata.com/es/nuestra-historia', '2021-07-01'),
      (2, 'Luigi Bosca', 'Bodega familiar fundada en 1958, reconocida por sus vinos elegantes y equilibrados.', '-33.64911,-68.71444', 'https://www.luigibosca.com.ar/es/nuestra-historia/', '2021-07-01'),
      (4, 'Norton', 'Bodega fundada en 1895, pionera en la elaboración de vinos de altura en Cafayate.', '-24.92922,-65.48083', 'https://www.nortonwines.com/es/historia/', '2021-07-01'),
      (3, 'Chapadmalal', 'Bodega boutique fundada en 1998, reconocida por sus vinos Chardonnay de alta gama.', '-33.82413,-68.82306', 'https://www.chapadmalal.com/es/historia/', '2021-07-01'),
      (3, 'Nieto Senetual', 'Bodega familiar fundada en 1942, pionera en la elaboración de vinos Torrontés en Argentina.', '-31.56083,-68.50639', 'https://nietosenetual.com.ar/es/historia/', '2021-07-01'),
      (3, 'Familia Zuccardi', 'Bodega familiar fundada en 1933, reconocida por sus vinos de alta gama y compromiso con la sostenibilidad.', '-33.04611,-68.73972', 'https://www.familiazuccardi.com/es/historia/', '2021-07-01'),
      (5, 'Château Margaux', 'Bodega histórica fundada en el siglo XVII, reconocida por sus vinos tintos de alta gama.', '45.043333,0.708333', 'https://www.chateaumargaux.com/en/history/', '2021-07-01'),
      (6, 'Domaine de la Romanée-Conti', 'Bodega familiar fundada en el siglo XIX, reconocida por sus excepcionales vinos tintos de Pinot Noir.', '47.136667,4.971667', 'https://www.domainederomaneconti.fr/en/history/', '2021-07-01'),
      (7, 'Penfolds', 'Bodega icónica fundada en 1844, reconocida por sus vinos tintos australianos de alta gama.', '-34.541667,138.658333', 'https://www.penfolds.com/en/our-story/', '2021-07-01'),
      (8, 'Screaming Eagle', 'Bodega boutique fundada en 1972, reconocida por sus vinos tintos Cabernet Sauvignon de culto.', '38.350278,-122.414444', 'https://www.screamingeagle.com/our-story/', '2021-07-01'),
      (9, 'Antinori', 'Bodega familiar fundada en el siglo XVI, reconocida por sus vinos tintos Super Tuscan innovadores.', '43.433333,11.283333', 'https://www.antinori.it/en/history/', '2021-07-01'),
      (10, 'Vega Sicilia', 'Bodega histórica fundada en 1882, reconocida por sus vinos tintos Tempranillo de alta gama.', '41.366667,-3.95', 'https://www.bodegasdearanda.com/en/history/', '2021-07-01'),
      (10, 'Château Rayas', 'Bodega familiar fundada en el siglo XIX, reconocida por sus vinos tintos Grenache excepcionales de Châteauneuf-du-Pape.', '44.308333,4.841667', 'https://www.chateauraayas.com/en/history/', '2021-07-01');

INSERT INTO vino (nombre, anada, imagenEtiqueta, notaDeCadaBodega, precio, bodega_id) VALUES
      ('Catena Zapata Adrianna Vineyard Malbec', 2019, 'https://www.catenazapata.com/sites/default/files/styles/vino_grande/public/adrianna_vineyard_malbec_2019.jpg', '99 pts. James Suckling', 18000, 1),
      ('Luigi Bosca Finca Las Lilas Malbec', 2020, 'https://www.luigibosca.com.ar/wp-content/uploads/2021/03/fincalaslilas_malbec_2020_web.jpg', '93 pts. Robert Parker', 6000, 2),
      ('Norton Finca La Empanada Malbec', 2018, 'https://www.nortonwines.com/wp-content/uploads/2021/07/FINCA-LA-EMPANADA-SINGLE-VINEYARD-MALBEC-2018-WEB.png', '91 pts. Tim Atkin', 4500, 3),
      ('Chapadmalal Chardonnay', 2021, 'https://www.chapadmalal.com/wp-content/uploads/2022/01/Chapadmalal-Chardonnay-2021-web.jpg', '95 pts. James Suckling', 5800, 4),
      ('Nieto Senetual Torrontés', 2022, 'https://nietosenetual.com.ar/wp-content/uploads/2022/09/NIETO-SENETUAL-TORRONTES-2022-web.jpg', '90 pts. Decanter', 3200, 5),
      ('Familia Zuccardi Q Chardonnay', 2021, 'https://www.familiazuccardi.com/wp-content/uploads/2022/02/Q-Chardonnay-2021-web.jpg', '94 pts. Robert Parker', 7500, 6),
      ('Château Margaux 2016', 2016, 'https://www.chateaumargaux.com/wp-content/uploads/2020/02/CMargaux2016-300x300.jpg', '98 pts. James Suckling', 12000, 7),
      ('Domaine de la Romanée-Conti Romanée-Conti Grand Cru 2018', 2018, 'https://www.domainederomaneconti.fr/wp-content/uploads/2021/06/DRC-Romanee-Conti-2018-300x300.jpg', '100 pts. Robert Parker', 30000, 8),
      ('Penfolds Grange 2021', 2021, 'https://www.penfolds.com/wp-content/uploads/2022/09/Penfolds-Grange-2021-300x300.jpg', '98 pts. James Suckling', 15000, 9),
      ('Screaming Eagle Cabernet Sauvignon 2019', 2019, 'https://www.screamingeagle.com/wp-content/uploads/2022/02/Screaming-Eagle-2019-300x300.jpg', '100 pts. Robert Parker', 100000, 10),
      ('Tignanello 2018', 2018, 'https://www.antinori.it/wp-content/uploads/2022/02/Tignanello-2018-300x300.jpg', '98 pts. James Suckling', 6000, 11),
      ('Vega Sicilia Único 2010', 2010, 'https://www.bodegasdearanda.com/wp-content/uploads/2021/03/unico-2010-300x300.jpg', '99 pts. Penfolds', 3500, 12),
      ('Clos Du Pape Château Rayas 2016', 2016, 'https://www.chateauraayas.com/wp-content/uploads/2021/03/CDP2016-300x300.jpg', '100 pts. Robert Parker', 12000, 13);


INSERT INTO varietal (descripcion,vino_id,porcentajeComposicion) VALUES
     ('Malbec', 1, 100), ('Malbec', 2, 100),('Malbec', 3, 100),('Chardonnay',4, 100),
     ('Torrontés',5, 100),('Chardonnay',6,100),('Cabernet Sauvignon',7,65), ('Merlot',7,25),
     ('Petit Verdot',7,8), ('Cabernet Franc',7,2),('Pinot Noir',8,100),
     ('Shiraz',9,80), ('Cabernet Sauvignon',9,19), ('Grenache',9,1),('Cabernet Sauvignon',10,100),
     ('Sangiovese',11,80), ('Cabernet Sauvignon',11,15), ('Canaiolo',11,5),('Tempranillo',12,100),
     ('Grenache',13,100);



INSERT INTO Resena (comentario, esPremium, fechaResena, puntaje, vino_id) VALUES
      ('Un Malbec excepcional, con aromas intensos a frutas negras, especias y violetas, taninos firmes y un final largo y persistente. Un vino de guarda con un gran potencial.', true, '2024-05-25', 98, 1),
      ('Un vino complejo y elegante, que refleja a la perfección el terroir único del viñedo Adrianna. Un Malbec que no te defraudará.', false, '2023-12-25', 95, 1),
      ('Un Malbec de clase mundial, que merece estar en la cava de cualquier coleccionista. Un vino que te dejará sin palabras.', true, '2022-10-10', 100, 1),
      ('Un vino que te transporta a las montañas de Mendoza. Un Malbec fresco, vibrante y lleno de sabor.', false, '2021-07-04', 92, 1),
      ('Un Malbec que te invita a disfrutar de cada momento. Un vino perfecto para compartir con amigos y familia.', true, '2020-04-01', 94, 1),
      ('Un Malbec equilibrado y armonioso, con aromas a frutas rojas maduras, especias y chocolate. Taninos suaves y un final persistente.', true, '2024-05-25', 92, 2),
      ('Un vino elegante y complejo, que expresa fielmente las características del terroir de Luján de Cuyo.', false, '2023-11-11', 90, 2),
      ('Un Malbec ideal para acompañar carnes rojas, pastas y quesos.', true, '2022-08-08', 91, 2),
      ('Un vino que te sorprenderá por su relación calidad-precio.', false, '2021-05-05', 88, 2),
      ('Un Malbec perfecto para disfrutar en cualquier ocasión.', true, '2020-02-02', 89, 2),
      ('Un Malbec intenso y expresivo, con aromas a frutas negras, especias y violetas. Taninos firmes y un final largo y persistente.', true, '2024-01-30', 93, 3),
      ('Un vino que refleja a la perfección el terroir único de los Valles Calchaquíes.', false, '2023-09-09', 90, 3),
      ('Un Malbec ideal para acompañar carnes rojas, pastas y quesos maduros.', true, '2022-06-06', 92, 3),
      ('Un Chardonnay excepcional, con aromas intensos a frutas blancas, cítricos y flores blancas. Un cuerpo cremoso, acidez equilibrada y un final largo y persistente.', true, '2024-03-30', 96, 4),
      ('Un vino complejo y elegante, que refleja a la perfección el terroir único del Alto Valle de Uco.', false, '2023-05-04', 94, 4),
      ('Un Torrontés aromático y floral, con aromas intensos a jazmín, flores blancas y frutas tropicales. Un cuerpo ligero, acidez refrescante y un final vibrante.', true, '2024-05-30', 92, 5),
      ('Un vino que refleja a la perfección la cepa Torrontés, una de las más emblemáticas de Argentina.', false, '2023-03-03', 89, 5),
      ('Un Torrontés ideal para acompañar ensaladas, pescados y mariscos.', true, '2022-02-02', 91, 5),
      ('Un vino perfecto para disfrutar en cualquier ocasión.', false, '2021-01-01', 88, 5),
      ('Un Chardonnay excepcional, con aromas intensos a frutas blancas, cítricos y flores blancas. Un cuerpo elegante, acidez equilibrada y un final largo y persistente.', true, '2024-03-23', 96, 6),
      ('Un vino que refleja a la perfección el terroir único del Valle de Uco.', false, '2023-12-12', 93, 6),
      ('Un Chardonnay ideal para acompañar platos de pescado, aves y quesos.', true, '2022-09-09', 95, 6),
      ('Un vino tinto excepcional, con aromas intensos a frutas negras, especias y tabaco. En boca, tiene un cuerpo estructurado, taninos firmes y un final largo y persistente. Un vino de guarda con un gran potencial de envejecimiento.', true, '2024-02-05', 99, 7),
      ('Un Château Margaux clásico, que expresa a la perfección el terroir de Margaux.', false, '2023-10-10', 97, 7),
      ('Un vino ideal para acompañar carnes rojas, caza y quesos maduros.', true, '2022-07-07', 98, 7),
      ('Un vino tinto de Pinot Noir excepcional, considerado por muchos como uno de los mejores del mundo. Posee aromas intensos a frutos rojos, especias y flores, con un cuerpo elegante y complejo, taninos sedosos y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-05-30', 99, 8),
      ('Una expresión pura y sin adulterar del terroir único de Romanée-Conti.', false, '2023-08-08', 98, 8),
      ('Un vino que requiere tiempo y paciencia para apreciarlo en toda su plenitud.', true, '2022-05-05', 100, 8),
      ('Una obra maestra de la elaboración del vino, que representa lo mejor de Borgoña.', false, '2021-02-02', 99, 8),
      ('Un vino tinto australiano legendario, con aromas intensos a frutas negras, especias y chocolate. En boca, es corpulento, con taninos firmes y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-01-13', 99, 9),
      ('Una expresión magistral del estilo único de Penfolds Grange.', false, '2023-04-04', 97, 9),
      ('Un vino tinto californiano de culto, con aromas intensos a frutas negras, especias y cedro. En boca, es elegante y equilibrado, con taninos suaves y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-05-30', 99, 10),
      ('Un vino tinto italiano innovador, que combina la tradición con la modernidad. Tiene aromas intensos a frutas negras, especias y violetas. En boca, es elegante y complejo, con taninos firmes y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-02-10', 99, 11),
      ('Un Tignanello clásico, que expresa a la perfección el terroir único de Chianti Classico.', false, '2023-11-11', 97, 11),
      ('Un vino tinto español legendario, considerado por muchos como uno de los mejores del mundo. Tiene aromas intensos a frutas negras, especias y cuero. En boca, es complejo y elegante, con taninos firmes y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-01-30', 100, 12),
      ('Una expresión magistral del terroir único de la Ribera del Duero.', false, '2022-09-09', 98, 12),
      ('Un vino que requiere tiempo y paciencia para apreciarlo en toda su plenitud.', true, '2021-03-03', 99, 12),
      ('Un vino tinto francés excepcional, considerado por muchos como uno de los mejores Châteauneuf-du-Pape del mundo. Tiene aromas intensos a frutas negras, especias y garbanzos. En boca, es corpulento y estructurado, con taninos firmes y un final largo y persistente. Es un vino de guarda con un gran potencial de envejecimiento.', true, '2024-02-16', 99, 13),
      ('Una expresión pura y sin adulterar del terroir único de Château Rayas.', false, '2023-02-02', 98, 13),
      ('Un vino que requiere tiempo y paciencia para apreciarlo en toda su plenitud.', true, '2022-06-06', 100, 13),
      ('Una obra maestra de la elaboración del vino, que representa lo mejor del Rhône Valley.', false, '2021-10-10', 99, 13);








