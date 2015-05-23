# JavaClassGenerate

---------------------------------------------------------------------------------------------------------
Aplicacion PHP de linea de comando para generar clases JAVA y utilizarlas para trabajar en android.
---------------------------------------------------------------------------------------------------------

Modo de uso:

Ejecutar "./javaClassGenerate" y luego ingresar todos atributos para la clase.

También se puede usar creando un esquema de clases.

Crear un archivo de esquema con un nombre cualquiera (Ej.: products.schema) y agregarle el siguiente contenido:
Products(int id, string name, string description, int type_id, boolean active)
Types(int id, string name)

Luego ejecutar el siguiente comando:
./generateSchema products.schema

Y todas las clases se generaran dentro del directorio "Projects".
