CREATE TABLE cliente (
    id NUMBER NOT NULL PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    email VARCHAR2(40) NOT NULL UNIQUE
);

CREATE TABLE compra (
    id NUMBER NOT NULL PRIMARY KEY,
    cliente_id NUMBER NOT NULL REFERENCES cliente(id),
    fecha date
);

CREATE TABLE producto (
    id NUMBER NOT NULL PRIMARY KEY,
    descripcion VARCHAR2(500) NOT NULL,
    stock NUMBER CHECK (stock >= 0),
    precio NUMBER
);

CREATE TABLE detalle_compra (
    id NUMBER NOT NULL PRIMARY KEY,
    producto_id NUMBER NOT NULL REFERENCES producto(id),
    compra_id NUMBER NOT NULL REFERENCES compra(id),
    cantidad NUMBER
);

INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (2,	'usuario02', 'usuario02@yahoo.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (3,	'usuario03', 'usuario03@hotmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (4,	'usuario04', 'usuario04@hotmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (5,	'usuario05', 'usuario05@yahoo.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (6,	'usuario06', 'usuario06@hotmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (7,	'usuario07', 'usuario07@yahoo.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (8,	'usuario08', 'usuario08@yahoo.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (9,	'usuario09', 'usuario09@hotmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (10,	'usuario010', 'usuario010@hotmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, EMAIL) VALUES (1,	'usuario01', 'usuario01@gmail.com');

INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(1, 4, TO_DATE('2020-02-12', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(2, 5, TO_DATE('2020-03-14', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(3, 10, TO_DATE('2020-02-07', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(4, 9,	TO_DATE('2020-04-25', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(5, 7,	TO_DATE('2020-04-03', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(6, 2,	TO_DATE('2020-03-23', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(7, 9,	TO_DATE('2020-03-11', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(8, 3,	TO_DATE('2020-04-21', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(9, 2,	TO_DATE('2020-02-24', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(10, 10, TO_DATE('2020-04-18', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(11, 3, TO_DATE('2020-04-22', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(12, 8, TO_DATE('2020-03-22', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(13, 10, TO_DATE('2020-02-20', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(14, 9, TO_DATE('2020-02-07', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(15, 3, TO_DATE('2020-04-25', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(16, 4, TO_DATE('2020-03-20', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(17, 9, TO_DATE('2020-02-22', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(18, 8, TO_DATE('2020-02-17', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(19, 10, TO_DATE('2020-03-14', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(20, 9, TO_DATE('2020-03-07', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(21, 6, TO_DATE('2020-04-28', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(22, 5, TO_DATE('2020-02-06', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(23, 10, TO_DATE('2020-01-31', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(24, 3, TO_DATE('2020-02-15', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(25, 9, TO_DATE('2020-03-12', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(26, 1, TO_DATE('2020-01-31', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(27, 10, TO_DATE('2020-04-08', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(28, 3, TO_DATE('2020-03-20', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(29, 9, TO_DATE('2020-03-16', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(30, 5, TO_DATE('2020-04-09', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(31, 1, TO_DATE('2020-03-29', 'yyyy-mm-dd'));
INSERT INTO COMPRA (ID, CLIENTE_ID, FECHA) VALUES(32, 2, TO_DATE('2020-03-29', 'yyyy-mm-dd'));

INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(3, 'producto3', 9, 9449);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(4, 'producto4', 8, 194);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(5, 'producto5', 10, 3764);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(6, 'producto6', 6, 8655);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(7, 'producto7', 4, 2875);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(10, 'producto10', 1, 3001);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(11, 'producto11', 9, 7993);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(12, 'producto12', 3, 8504);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(13, 'producto13', 10, 2415);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(14, 'producto14', 5, 3824);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(15, 'producto15', 10, 7358);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(16, 'producto16', 7, 3631);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(17, 'producto17', 3, 4467);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(18, 'producto18', 2, 9383);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(19, 'producto19', 6, 1140);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(20, 'producto20', 4, 102);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(9, 'producto9', 4, 4219);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(1, 'producto1', 6, 9107);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(2, 'producto2', 5, 1760);
INSERT INTO PRODUCTO (ID, DESCRIPCION, STOCK, PRECIO) VALUES(8, 'producto8', 0, 8923);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(1, 2, 2, 9);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(2, 7, 6, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(3, 16, 23, 1);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(4, 10, 13, 4);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(5, 7, 8, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(6, 2, 14, 6);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(7, 19, 8, 7);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(8, 7, 19, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(9, 17, 3, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(10, 2, 3, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(11, 16, 27, 8);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(12, 16, 10, 8);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(13, 13, 14, 8);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(14, 3, 30, 4);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(15, 13, 15, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(16, 20, 21, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(17, 15, 21, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(18, 15, 16, 3);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(19, 16, 19, 9);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(20, 1, 6, 10);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(21, 17, 1, 7);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(22, 18, 1, 9);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(23, 20, 4, 8);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(24, 16, 4, 9);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(25, 14, 5, 6);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(26, 17, 7, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(27, 17, 9, 6);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(28, 18, 11, 4);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(29, 20, 12, 7);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(30, 3, 17, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(31, 2, 18, 10);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(32, 20, 20, 1);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(33, 10, 22, 10);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(34, 18, 24, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(35, 3, 25, 10);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(36, 3, 26, 4);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(37, 3, 28, 2);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(38, 11, 29, 7);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(39, 9, 31, 5);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(40, 1, 32, 3);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(41, 2, 32, 3);
INSERT INTO DETALLE_COMPRA (ID, PRODUCTO_ID, COMPRA_ID, CANTIDAD) VALUES(42, 8, 32, 3);
commit;
