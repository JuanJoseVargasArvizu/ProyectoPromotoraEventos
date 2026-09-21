# Requerimientos Funcionales
## Módulo inventario
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
### **RF-05 (M) — Cambiar estado.** 
El sistema debe permitir asignar a un elemento uno de los estados: Disponible, Rentado, En mantenimiento, Dañado. Reglas: solo el administrador puede asignar En mantenimiento o Dañado; un elemento Rentado, no puede cambiar a Disponible hasta que su renta se marque como finalizada (RF-10); un elemento En mantenimiento o Dañado no puede agregarse a una renta.
&nbsp;
## Módulo: Rentas
&nbsp;

### **RF-06 (M) — Crear renta.** 
El sistema debe permitir registrar una renta con: nombre del cliente, contacto (teléfono), fecha y hora de inicio, paquete de tiempo, dirección del evento y lista de elementos solicitados (con cantidad de cada uno).
&nbsp;
### **RF-07 (M) — Verificar disponibilidad.** 
Antes de confirmar una renta, el sistema debe verificar automáticamente que cada elemento solicitado tenga cantidad suficiente disponible en el rango de fecha/hora solicitado (ni rentado, ni en mantenimiento, ni dañado). Si algún elemento no está disponible, el sistema debe indicar exactamente cuál y en qué cantidad falta, y permitir modificar la renta antes de confirmar, al trabajar con un equipo de trabajo debe verificar la disponibilidad en tiempo real para todos los usuarios, de modo que dos trabajadores no puedan apartar los mismos elementos. Si dos usuarios intentan confirmar rentas que compiten por el mismo inventario, el sistema debe bloquear la segunda renta y notificar el conflicto.
&nbsp;
### **RF-08 (M) — Confirmar renta.** 
Al confirmar, el sistema debe cambiar los elementos a estado rentado para el período solicitado y crear un registro visible en la agenda.
&nbsp;
### **RF-09 (M) — Editar renta.** 
El sistema debe permitir modificar los datos o elementos de una renta no finalizada, aplicando de nuevo la verificación de disponibilidad (RF-07) y actualizando la agenda.
&nbsp;
### **RF-10 (M) — Finalizar renta.** 
Al finalizar una renta, el sistema debe registrar la condición en que regresó cada elemento (en buen estado o dañado), liberar los elementos (estado Disponible o En mantenimiento según corresponda) y pedir el tiempo real de montaje/desmontaje para compararlo con el estimado.
&nbsp;
### **RF-11 (S) — Sugerir combinaciones.** 
Al agregar un elemento frecuente a una renta (ej. mesa de DJ), el sistema debe sugerir los elementos que comúnmente se rentan con él (bocinas, micrófonos, consola), sin imponerlos como paquete fijo.
&nbsp;
### **RF-12 (S) — Estado de renta visible para el equipo.** 
Los trabajadores asignados a una renta deben ver sus pendientes del día (qué montar, a qué hora, dónde), idealmente desde el celular en el sitio del evento.
&nbsp;
## Módulo: Agenda
&nbsp;

### **RF-13 (M) — Visualizar agenda.** 
El sistema debe mostrar las rentas en formato de calendario y de lista, con fecha, cliente, dirección y estado (Pendiente, Activa, Finalizada, Cancelada).
&nbsp;
### **RF-14 (M) — Detalle desde la agenda.** 
El sistema debe permitir abrir cualquier renta desde la agenda para ver y editar (RF-09) sus datos y elementos.
&nbsp;
### ****RF-15 (S) — Recordatorios.** 
El sistema debe mostrar, al iniciar sesión, las rentas de los próximos 2 días con su detalle, y permitir anotar recordatorios internos (ej. hora de llegada del personal, vehículo asignado).

# Requerimientos no funcionales

**RNF-01 — Rendimiento.** 
El sistema debe mostrar la lista del inventario y la agenda en menos de 2 segundos con hasta 500 elementos y 200 rentas registradas y 5 usuarios trabajando simultáneamente.
&nbsp;
**RNF-02 — Usabilidad.** 
Una persona sin conocimientos técnicos debe poder registrar una renta completa en menos de 5 minutos después de una capacitación de 1 hora.
&nbsp;
**RNF-03 — Respaldo.** 
El sistema debe generar una copia de seguridad automática de la base de datos cada 24 horas, con opción de restauración. (Crítico: hoy todo está en papel y en la memoria de una sola persona.)
&nbsp;
**RNF-04 — Seguridad.** 
El sistema debe requerir inicio de sesión con usuario y contraseña individual por cada trabajador de la empresa. Cada usuario tiene asignado un rol, como el administrador que al ser el dueño de la empresa tiene el acceso total o elEmpleado (consultar inventario/agenda, registrar y editar rentas, registrar daños). Solo el Administrador podría modificar los precios, agregar/eliminar elementos del inventario y confirmar recargos por daño.
&nbsp;
**RNF-06 — Compatibilidad.** El sistema debe funcionar en las versiones recientes de Chrome, Edge y Safari sin instalación adicional (aplicación web).
&nbsp;
**RNF-07 — Integridad.** El sistema debe impedir que dos rentas confirmadas compitan por los mismos elementos en fechas traslapadas (concurrencia controlada).