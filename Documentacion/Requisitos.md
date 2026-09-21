# Requerimientos Funcionales
## Inventario
&nbsp;

### **RF-01 (M) — Consultar inventario.** 
El sistema debe mostrar el inventario como tabla con las columnas: ID, nombre, categoría, cantidad en almacén, cantidad disponible (no rentada ni en mantenimiento) y estado. Las categorías deben ser: Mobiliario (sillas, mesas), Luz y sonido (DJ, bocinas, micrófonos, consola, luces) y Climatización (coolers/ventiladores). Los elementos con cantidad 0 deben mostrarse con un indicador visual de "agotado".

&nbsp;

### **RF-02 (M) — Registrar elemento.** 
El sistema debe permitir agregar un nuevo elemento solicitando: nombre, categoría (de la lista del RF-01), cantidad inicial (entero ≥ 0) y precio por paquete de tiempo. El sistema debe rechazar nombres duplicados en la misma categoría y mostrar mensaje de error.

&nbsp;

### **RF-03 (M) — Ajustar cantidades.** 
El sistema debe permitir aumentar o disminuir la cantidad en almacén de un elemento ingresando un número entero. El sistema debe rechazar cualquier operación que deje la cantidad menor a 0 y registrar cada cambio con fecha, cantidad anterior, cantidad nueva y motivo.
 

&nbsp;

### **RF-04 (S) — Identificador por pieza.** 
El sistema debe permitir asignar a cada pieza física un identificador único (ej. una serie), de modo que dos coolers "iguales" sean distinguibles entre sí, y llevar el historial individual de cada pieza (rentas, daños, mantenimientos).

&nbsp;

### RF - : La agenda debe permitir interactuar con las rentas atravez de los recordatorios
Se puede interactuar con los recordatorios para:
- Visualizar los elementos rentados
- Visualizar la informacion de la renta
- Permitir alterar los elementos rentados
- Permitir alterar la informacion de la renta

&nbsp;

## Gestor
### RF - : Permite crear grupos de objetos rentados
Permite otorgarle a un grupo de objetos del inventario el estado de rentado, el sistema debe pedir los datos de la renta a la hora de usar esta funcion:
- Nombre de el cliente
- Fecha
- Direccion
- Contacto del cliente
Despues los elementos pasaran a tener el estado de "Rentado" y se agregara en la agenda un recordatorio