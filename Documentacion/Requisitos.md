# Requerimientos del Proyecto

## Requisitos Funcionales

| Requerimiento | Descripción | Tipo priorización |
| :--- | :--- | :--- |
| **RF01- Iniciar sesión** | El sistema deberá permitir el acceso solo a usuarios registrados que se identifiquen con su nombre de usuario y contraseña, y rechazarán en caso de no existir el usuario o contraseña sin indicar cuál de los dos datos es incorrecto. | Alta |
| **RF01.1- Cierre de sesión** | El sistema deberá permitir cerrar sesión de forma manual y cerrarla automáticamente tras un tiempo de inactividad que se puede configurar. | Media |
| **RF02- Gestión de usuarios** | El administrador deberá poder crear, modificar y desactivar usuarios, y asignarles un rol. | Alta |
| **RF03- Gestión de inventario** | El sistema deberá mantener el inventario de los bienes de la renta y debe permitir registrar, consultar, ajustar y modificar sus elementos. | Alta |
| **RF03.1- Clasificación de elementos** | El sistema deberá permitir definir modelos de elementos con nombre, categoría, descripción y sus características. Las categorías iniciales son ventilación, luz y sonido, y mobiliario. | Alta |
| **RF03.2- Estado del elemento** | El sistema debe identificar 3 estados a los elementos del inventario: Disponible, En mantenimiento y Ocupado. | Alta |
| **RF03.3- Foliado de elementos** | El sistema deberá asignar a cada elemento un folio único e irrepetible, generado automáticamente por el sistema y con permisos al administrador para editar. | Alta |
| **RF03.4- Registro de elementos** | El sistema deberá permitir registrar un elemento solicitando: categoría, nombre del producto, descripción o características, folio, cantidad e imagen. | Alta |
| **RF03.5- Modificar elementos** | El sistema deberá permitir modificar las características de los modelos y los datos de los elementos, conservando el registro de los cambios. | Alta |
| **RF03.6- Búsqueda de elementos** | El sistema deberá permitir buscar y filtrar el inventario por nombre, folio, categoría, modelo y estado. | Alta |
| **RF03.7- Historial de los elementos en mantenimiento** | El sistema deberá ser capaz de conservar, por cada elemento con folio, el historial de mantenimientos y reparaciones. | Media |
| **RF03.8- Modificación de inventario** | El sistema deberá permitir al usuario modificar las características de los elementos. | Alta |
| **RF04- Agenda compartida** | El sistema deberá mantener una agenda única para todo el equipo de trabajo con las rentas confirmadas, actualizada para todos los usuarios, y deberá informar la cantidad de eventos programados y los equipos en uso al día. | Alta |
| **RF04.1- Consulta de rentas** | El sistema deberá permitir consultar las rentas programadas por día, semana y mes, para cada una muestra el nombre del evento, su horario (incluyendo montaje y desmontaje) y su estado. | Alta |
| **RF04.2- Impresión en PDF** | El sistema deberá generar en PDF la agenda de eventos del día seleccionado, con el detalle de equipo, personal y horarios de cada evento. | Media |
| **RF05- Sistema de rentas** | El sistema deberá permitir crear, consultar, modificar y cancelar rentas. | Alta |
| **RF05.1- Agregar una renta** | El sistema deberá permitir registrar una renta con: nombre del evento, cliente, lugar, fecha, hora del evento, duración (paquete de tiempo), hora de montaje, hora de desmontaje, lista de equipos con cantidad, personal y vehículos asignados. | Alta |
| **RF05.2- Sugerencia de combos de equipo** | El sistema deberá permitir crear plantillas de equipo para las combinaciones más frecuentes (por ejemplo, mesa de DJ con bocinas, micrófonos, consola y un DJ), aplicarlas a una renta y modificarlas agregando o quitando elementos. Las plantillas son atajos, no son fijos. | Medio |
| **RF05.3- Verificación de disponibilidad del equipo** | Antes de confirmar una renta, el sistema deberá verificar que el inventario exista en cantidad suficiente y sin daños o que esté en mantenimiento, el personal y los vehículos estén disponibles en la ventana de tiempo completa, incluyendo montaje y desmontaje. | Alta |
| **RF05.4- Modificación de la renta** | El sistema deberá permitir la modificación de la renta en dado caso que el cliente lo solicite, se deberán actualizar los datos en todo el sistema. | Alta |
| **RF05.5- Estados de la renta** | El sistema deberá manejar los estados: cotizada, confirmada, finalizada y cancelada. | - |
| **RF05.6- Traslape de rentas** | Si dos usuarios intentan confirmar al mismo tiempo rentas que usan los mismos elementos, el sistema deberá aceptar la primera y rechazar la segunda informando el motivo. Tampoco permitirá confirmar una renta que choque con otra confirmada previamente. | Alta |
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