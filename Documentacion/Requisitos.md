# Requerimientos del Proyecto

## Requisitos Funcionales

### Usuarios
| Requerimiento | Descripción |
| :--- | :--- |
|**RF01 - Tipos de usuarios**| Hay 3 tipos de usuarios Empleado, Tele Operador y Administrador, todos con un nombre y contraseña
|**RF02 - Niveles de acceso y permisos**|**Empleado**: Acceso a la agenda (consulta)  **Tele Operador**: Acceso a la agenda (consulta), inventario (consulta), serivicios de renta (registro de datos) y clientes (registro de datos). **Administrador**: Acceso a la agenda (consulta), inventario (consulta y uso de servicios de modificacion), servicios de renta (registro de datos, modificacion de los datos, establecer costos y personal, poder confirmar y finalizar servicios de renta), clientes (consulta, modificacion de registros) y usuarios (creacion de nuevos usuarios, eliminacion de usuarios)
|**RF03 - Inicio de sesion**| Para iniciar sesion se necesita introducir el nombre y contraseña

### Inventario
| Requerimiento | Descripción |
| :--- | :--- |
|**RF04 - Bienes de Alquiler**| El inventario contiene "Bienes de alquiler" los cuales tienen: folio, nombre de modelo, clasificacion (mobiliario, luz, sonido, cooler), precio de renta por dia y estado (Disponible, ocupado, dañado)
|**RF05 - Registro de bienes**| Se pueden registrar nuevos Bienes de alquiler en el sistema, proporcionando el nombre del modelo, clasificacion (mobiliario, luz, sonido, cooler) y precio de renta por dia. El folio sera asignado automaticamente por el sistema, y el estado por defecto sera disponible
|**RF06 - Eliminacion de bienes**| Los bienes ya registrados pueden ser eliminados del inventario
|**RF07 - Consulta de bienes**| Se pueden consultar los bienes del inventario y su informacion. Este proceso de consulta tambien puede hacerse con filtros, como busqueda por folio, nombre de modelo, estado o categoria
|**RF08 - Modificacion de bienes**| Se puede alterar la informacion de los Bienes de forma directa, a excepcion del folio
|**RF09 - Reporte Mensual Inventario**| Al final de cada mes se genera un reporte con copias de la informacion del inventario en ese momento, este sera almacenado junto con una fecha indicando su creacion

### Clientes
| Requerimiento | Descripción |
| :--- | :--- |
|**RF010 - Registros de Clientes**| El sistema puede tener registros de la informacion de clientes, un registro de un cliente tiene: Nombre, contacto, descuento, tipo (Fiscal, Empresa privada, Informal) 
|**RF11 - Registro de nuevos Clientes**| Se puede registrar la informacion de nuevos clientes, proporcionando la siguiente informacion: Nombre, contacto, descuento, tipo (Fiscal, Empresa privada, Informal)

### Servicios de Renta
| Requerimiento | Descripción |
| :--- | :--- |
|**RF12 - Registro de Servicio de Renta**| El sistema guarda el registro de la informacion de los Servicios de Renta, esta informacion es: Nombre del cliente, nombre del evento, bienes de alquiler prestados, Fechas y horarios, tarifas. El sistema los diferencia los registros por: Registros de servicios en proceso de cotizacion, Registros de Servicios Confirmados y Registros de Servicios Finalizados
|**RF13 - Registro de nuevos Servicios de Renta**| Se pueden registrar nuevos Servicios de Renta, proporcionando la siguiente informacion: Nombre del cliente, nombre del evente, bienes solicitados por el cliente1, fechas y horarios. Solo se permite introducir bienes que esten disponibles en el inventario
|**RF14 - Modificacion de registros de Servicios de Renta**| La informacion contenida en los registros de servicios de renta puede ser modificada.
|**RF15 - Eliminacion de registros de Servicios de Renta**| Los registros de servicio de renta pueden ser eliminados en caso de que la fecha de inicio del evento en el registro aun no haya llegado. De otra forma se niega la eliminacion
|**RF16 - Consulta de registros de Servicios de Renta**| Se puede consultar los registros y su informacion interna
|**RF17 - Integridad de los registros de Servicios de Renta**| Los registros en proceso de cotizacion utilizan el nombre del modelo de los bienes prestados para referenciarlos, pero los Confirmados y Finalizados utilizan copias completas de los datos de los bienes prestados



### Reporte de daños
| Requerimiento | Descripción |
| :--- | :--- |
|**RF18 - Reporte de daños durante un servicio de renta**| Se puede crear un reporte de daños para guardarlo en el sistema, estos tienen Nombre del evento que causo el daño, descripcion del daño y el folio del bien de alquiler dañado
|**RF19 - Generar nuevos reportes de daños**| Para generar un nuevo reporte de daños, se debe proporcionar el nombre del evento, la descripcion del daño y el folio del bien dañado. Al generarse uno de estos reportes, el bien de alquiler al que pertenece el folio sera puesto en estado de "Dañado"



## LISTA ANTIGUA

| Requerimiento | Descripción |
| :--- | :--- |
| **RF03.5- Modificar elementos** | Todos los datos de un bien de alquiler pueden ser modificados, a execpcion de su folio
| **RF03.6- Consulta de bienes de alquiler en el inventario** | Se puede consultar la lista completos de bienes de alquiler en el inventario, esta consulta tambien puede hacerse en base a criterios para reducir la cantidad de resultados devueltos, como pueden ser: folio, estado del bien, nombre modelo y categoria 
| **RF03.7- Historial de los elementos en mantenimiento** | El sistema deberá ser capaz de conservar, por cada elemento con folio, el historial de mantenimientos y reparaciones. 
| **RF04- Agenda compartida** | El sistema deberá mantener una agenda única para todo el equipo de trabajo con las rentas confirmadas, actualizada para todos los usuarios, y deberá informar la cantidad de eventos programados y los equipos en uso al día. 
| **RF04.1- Consulta de rentas** | El sistema deberá permitir consultar las rentas programadas por día, semana y mes, para cada una muestra el nombre del evento, su horario (incluyendo montaje y desmontaje) y su estado. 
| **RF04.2- Impresión en PDF** | El sistema deberá generar en PDF la agenda de eventos del día seleccionado, con el detalle de equipo, personal y horarios de cada evento. | Media |

| **RF05.1- Agregar una renta** | El sistema deberá permitir registrar una renta con: nombre del evento, cliente, lugar, fecha, hora del evento, duración (paquete de tiempo), hora de montaje, hora de desmontaje, lista de equipos con cantidad, personal y vehículos asignados. | Alta |
| **RF05.7- Alerta de rentas** | En caso de que un elemento dañado esté asignado a rentas futuras, el sistema deberá avisar al usuario para que pueda reemplazarlo o reprogramar. | Media |
| **RF05.8- Cancelar una renta** | El sistema deberá permitir cancelar una renta registrando el motivo, permitirá liberar los elementos del inventario. | - |
| **RF06- Sistema de reportes** | El sistema deberá permitir registrar los daños del equipo, modificarlos, cambiar su estado y consultarlos. | Alta |
| **RF06.1- Agregar un nuevo reporte** | El sistema deberá permitir registrar un nuevo reporte con los datos: tipo de daño, folio del elemento y folio de renta. | Alta |
| **RF06.2- Estados del reporte** | El sistema deberá manejar los estados reportado, en mantenimiento y resuelto. Al reportar un daño, el elemento afectado pasará a mantenimiento; al resolverlo, volverá a disponible. | Alta |
| **RF06.3- Costo de reparación** | El sistema deberá registrar el costo estimado y el costo real de la reparación de cada incidencia. | Alta |
| **RF07- Sistema de reportes mensuales** | El sistema deberá permitir al administrador seleccionar un mes o año y generar el reporte mensual de la operación. | Alta |
| **RF07.1- Reporte de rentas** | El reporte deberá mostrar la cantidad y el listado de rentas creadas, canceladas y finalizadas durante todo el mes. | Alta |
| **RF07.2- Reporte de inventario** | El reporte deberá mostrar los aumentos y reducciones del inventario durante el mes y las existencias cuando finalice del mes. | Media |
| **RF07.3- Reporte de incidencias** | El reporte deberá mostrar los daños reportados, reparados y pendientes, el costo total de reparación, cuánto pagó la empresa y cuánto se cobró a los clientes, y los equipos con más incidencias o mantenimientos. | - |
| **RF07.4- Exportación del reporte** | El sistema deberá permitir descargar el reporte mensual en PDF y en formato de hoja de cálculo. | Media |
| **RF07.5- Comparativo mensual** | El reporte deberá mostrar la variación respecto a meses anteriores. | Baja |
| **RF08- Presupuesto y monto** | El sistema deberá calcular el monto final de cada renta. No se registran ni procesan pagos, el cobro al cliente se realiza fuera del sistema. | Alta |
| **RF08.2- Catálogo de presupuestos** | El sistema deberá permitir al administrador definir el precio de cada modelo o servicio por paquete de tiempo (por ejemplo 6 horas, 10 horas o día completo). | Alta |
| **RF08.3- Cálculo del monto** | El sistema deberá calcular el presupuesto de una renta a partir de los elementos, sus cantidades, el paquete de tiempo y los servicios adicionales (personal, traslado u horas extra). | Alta |
| **RF08.4- Exportación de presupuesto** | El sistema deberá generar el presupuesto en PDF con el detalle de la renta, el total y su vigencia, para entregarlo al cliente antes de confirmar. | Media |
| **RF08.5- Monto final de la renta** | Al finalizar una renta, el sistema deberá calcular su monto final considerando el presupuesto más horas extra y/o recargos por daños. | Alta |
| **RF08.6- Recargo por daños** | Cuando se le cobre daño de un elemento al cliente, el sistema deberá permitir agregar a la renta un recargo igual al costo de reparación, vinculado al reporte. | Alta |

---

## Requisitos No Funcionales

| Requerimiento | Descripción | Tipo priorización |
| :--- | :--- | :--- |
| **RNF01- Usabilidad** | El sistema deberá ser fácil de usar, con interfaces simples e intuitivas, con un diseño adaptable y "responsive" para dispositivos móviles. | Alta |
| **RNF02- Disponibilidad del sistema** | El sistema deberá mantener una disponibilidad constante de aproximadamente 99%, garantizando que los usuarios no tengan que registrar manualmente por fallos del sistema. | Alta |
| **RNF03- Compatibilidad** | El sistema deberá funcionar en todos los navegadores y dispositivos móviles. | Alta |
| **RNF04- Respaldo** | El sistema deberá generar respaldos automáticos diarios de la información y conservarlos al menos 30 días. | Media |
| **RNF05- Características** | El sistema deberá estar en español, con montos en pesos mexicanos y fechas en formato día/mes/año y zona horaria configurable. | Alta |
| **RNF06- Permisos** | Los permisos de acceso solo podrán ser modificados por el administrador. | Alta |