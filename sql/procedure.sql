
-- Select database
USE almacen

-- Create store procedure
DELIMITER //
CREATE PROCEDURE contar_productos
(IN v_categoria_id INT, OUT v_nros_productos INT)
BEGIN
	SELECT count(*) INTO v_nros_productos
	FROM productos 
	WHERE categorias_id = v_categoria_id ;
END //

-- Delete store procedure
DROP PROCEDURE contar_productos;

-- Call store procedure
CALL contar_productos(1,@numbers) ;

-- Show value
SELECT @numbers AS number