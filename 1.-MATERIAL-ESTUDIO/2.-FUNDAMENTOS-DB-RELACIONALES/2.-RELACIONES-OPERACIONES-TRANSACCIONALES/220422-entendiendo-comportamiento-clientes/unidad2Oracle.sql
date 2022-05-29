CREATE TABLE IF NOT EXISTS cliente (
    id INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(40) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS compra (
    id INT NOT NULL PRIMARY KEY,
    cliente_id INT NOT NULL REFERENCES cliente(id),
    fecha DATE
);

CREATE TABLE IF NOT EXISTS producto (
    id INT NOT NULL PRIMARY KEY,
    descripcion VARCHAR(500) NOT NULL,
    stock INT CHECK (stock >= 0),
    precio INT
);

CREATE TABLE IF NOT EXISTS detalle_compra (
    id INT NOT NULL PRIMARY KEY,
    producto_id INT NOT NULL REFERENCES producto(id),
    compra_id INT NOT NULL REFERENCES compra(id),
    cantidad INT
);

INSERT INTO cliente (id, nombre, email) VALUES (2,	'usuario02', 'usuario02@yahoo.com');
INSERT INTO cliente (id, nombre, email) VALUES (3,	'usuario03', 'usuario03@hotmail.com');
INSERT INTO cliente (id, nombre, email) VALUES (4,	'usuario04', 'usuario04@hotmail.com');
INSERT INTO cliente (id, nombre, email) VALUES (5,	'usuario05', 'usuario05@yahoo.com');
INSERT INTO cliente (id, nombre, email) VALUES (6,	'usuario06', 'usuario06@hotmail.com');
INSERT INTO cliente (id, nombre, email) VALUES (7,	'usuario07', 'usuario07@yahoo.com');
INSERT INTO cliente (id, nombre, email) VALUES (8,	'usuario08', 'usuario08@yahoo.com');
INSERT INTO cliente (id, nombre, email) VALUES (9,	'usuario09', 'usuario09@hotmail.com');
INSERT INTO cliente (id, nombre, email) VALUES (10,	'usuario010', 'usuario010@hotmail.com');
INSERT INTO cliente (id, nombre, email) VALUES (1,	'usuario01', 'usuario01@gmail.com');

INSERT INTO compra (id, cliente_id, fecha) VALUES(1, 4, '2020-02-12');
INSERT INTO compra (id, cliente_id, fecha) VALUES(2, 5, '2020-03-14');
INSERT INTO compra (id, cliente_id, fecha) VALUES(3, 10, '2020-02-07');
INSERT INTO compra (id, cliente_id, fecha) VALUES(4, 9,	'2020-04-25');
INSERT INTO compra (id, cliente_id, fecha) VALUES(5, 7,	'2020-04-03');
INSERT INTO compra (id, cliente_id, fecha) VALUES(6, 2,	'2020-03-23');
INSERT INTO compra (id, cliente_id, fecha) VALUES(7, 9,	'2020-03-11');
INSERT INTO compra (id, cliente_id, fecha) VALUES(8, 3,	'2020-04-21');
INSERT INTO compra (id, cliente_id, fecha) VALUES(9, 2,	'2020-02-24');
INSERT INTO compra (id, cliente_id, fecha) VALUES(10, 10, '2020-04-18');
INSERT INTO compra (id, cliente_id, fecha) VALUES(11, 3, '2020-04-22');
INSERT INTO compra (id, cliente_id, fecha) VALUES(12, 8, '2020-03-22');
INSERT INTO compra (id, cliente_id, fecha) VALUES(13, 10, '2020-02-20');
INSERT INTO compra (id, cliente_id, fecha) VALUES(14, 9, '2020-02-07');
INSERT INTO compra (id, cliente_id, fecha) VALUES(15, 3, '2020-04-25');
INSERT INTO compra (id, cliente_id, fecha) VALUES(16, 4, '2020-03-20');
INSERT INTO compra (id, cliente_id, fecha) VALUES(17, 9, '2020-02-22');
INSERT INTO compra (id, cliente_id, fecha) VALUES(18, 8, '2020-02-17');
INSERT INTO compra (id, cliente_id, fecha) VALUES(19, 10, '2020-03-14');
INSERT INTO compra (id, cliente_id, fecha) VALUES(20, 9, '2020-03-07');
INSERT INTO compra (id, cliente_id, fecha) VALUES(21, 6, '2020-04-28');
INSERT INTO compra (id, cliente_id, fecha) VALUES(22, 5, '2020-02-06');
INSERT INTO compra (id, cliente_id, fecha) VALUES(23, 10, '2020-01-31');
INSERT INTO compra (id, cliente_id, fecha) VALUES(24, 3, '2020-02-15');
INSERT INTO compra (id, cliente_id, fecha) VALUES(25, 9, '2020-03-12');
INSERT INTO compra (id, cliente_id, fecha) VALUES(26, 1, '2020-01-31');
INSERT INTO compra (id, cliente_id, fecha) VALUES(27, 10, '2020-04-08');
INSERT INTO compra (id, cliente_id, fecha) VALUES(28, 3, '2020-03-20');
INSERT INTO compra (id, cliente_id, fecha) VALUES(29, 9, '2020-03-16');
INSERT INTO compra (id, cliente_id, fecha) VALUES(30, 5, '2020-04-09');
INSERT INTO compra (id, cliente_id, fecha) VALUES(31, 1, '2020-03-29');
INSERT INTO compra (id, cliente_id, fecha) VALUES(32, 2, '2020-03-29');

INSERT INTO producto (id, descripcion, stock, precio) VALUES(3, 'producto3', 9, 9449);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(4, 'producto4', 8, 194);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(5, 'producto5', 10, 3764);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(6, 'producto6', 6, 8655);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(7, 'producto7', 4, 2875);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(10, 'producto10', 1, 3001);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(11, 'producto11', 9, 7993);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(12, 'producto12', 3, 8504);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(13, 'producto13', 10, 2415);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(14, 'producto14', 5, 3824);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(15, 'producto15', 10, 7358);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(16, 'producto16', 7, 3631);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(17, 'producto17', 3, 4467);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(18, 'producto18', 2, 9383);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(19, 'producto19', 6, 1140);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(20, 'producto20', 4, 102);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(9, 'producto9', 4, 4219);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(1, 'producto1', 6, 9107);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(2, 'producto2', 5, 1760);
INSERT INTO producto (id, descripcion, stock, precio) VALUES(8, 'producto8', 0, 8923);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(1, 2, 2, 9);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(2, 7, 6, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(3, 16, 23, 1);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(4, 10, 13, 4);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(5, 7, 8, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(6, 2, 14, 6);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(7, 19, 8, 7);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(8, 7, 19, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(9, 17, 3, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(10, 2, 3, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(11, 16, 27, 8);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(12, 16, 10, 8);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(13, 13, 14, 8);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(14, 3, 30, 4);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(15, 13, 15, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(16, 20, 21, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(17, 15, 21, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(18, 15, 16, 3);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(19, 16, 19, 9);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(20, 1, 6, 10);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(21, 17, 1, 7);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(22, 18, 1, 9);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(23, 20, 4, 8);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(24, 16, 4, 9);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(25, 14, 5, 6);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(26, 17, 7, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(27, 17, 9, 6);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(28, 18, 11, 4);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(29, 20, 12, 7);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(30, 3, 17, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(31, 2, 18, 10);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(32, 20, 20, 1);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(33, 10, 22, 10);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(34, 18, 24, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(35, 3, 25, 10);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(36, 3, 26, 4);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(37, 3, 28, 2);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(38, 11, 29, 7);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(39, 9, 31, 5);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(40, 1, 32, 3);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(41, 2, 32, 3);
INSERT INTO detalle_compra (id, producto_id, compra_id, cantidad) VALUES(42, 8, 32, 3);
commit;
