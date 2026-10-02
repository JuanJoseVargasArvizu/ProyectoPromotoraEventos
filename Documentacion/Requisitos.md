# Requerimientos del Proyecto

## Requisitos Funcionales

| Requerimiento | Descripción | Tipo priorización |
| :--- | :--- | :--- |
| **RF01- Menú de inicio** | El sistema deberá mostrar en el menú de inicio el logo y nombre de la empresa y debajo botones con los siguientes apartados: Inventario, Rentas, Agenda y una leyenda de texto dándole la bienvenida al usuario en el centro. | Alta |
| **RF02- Iniciar sesión** | El sistema debe permitir al usuario ingresar al sistema luego de ingresar el nombre del usuario y contraseña. | Alta |
| **RF03- Gestionar inventario** | El sistema deberá mostrar un menú con opciones para la gestión de productos. | Alta |
| **RF03.1- Registro de elementos** | El sistema deberá permitir al usuario registrar un elemento, solicitando categoría, nombre del producto, folio, cantidad e imagen. | Alta |
| **RF03.2- Ajuste de elemento** | El sistema deberá permitir modificar la cantidad de elementos del inventario, incrementando o disminuyendo el número de elementos. Cada cambio a esta modificación debe ser mayor o igual a 0, de lo contrario mostrar un mensaje de error. | Alta |
| **RF03.3- Modificación de inventario** | El sistema deberá permitir al usuario modificar las características de los elementos. | Alta |
| **RF04- Módulo de agendas** | El sistema deberá mostrar un menú desplegado con opciones de agregar evento, la cantidad de eventos programados, los equipos en uso y una lista interactiva con posibilidad de modificación de los eventos disponibles. | Alta |
| **RF04.1- Visualización de calendario** | El sistema deberá mostrar un apartado de visualización de calendario en el que al dar clic en un día muestre el nombre del evento. | Media |
| **RF04.2- Impresión en PDF** | El sistema deberá permitir la impresión de la información en formato PDF. | Media |
| **RF05- Sistema de rentas** | El sistema deberá mostrar un menú con opciones de agregar una nueva renta. | Alta |
| **RF05.1- Agregar una renta** | El sistema deberá permitir agregar una nueva renta solicitando: nombre del evento, lugar del evento, fecha, lista de equipos con cantidad, hora del evento, hora de montaje y hora de desmontaje. | Alta |
| **RF05.2- Verificación de disponibilidad del equipo** | Antes de confirmar una renta el sistema deberá verificar que el equipo no se encuentre dañado o falte cantidad, y deberá mostrar una notificación con el correspondiente inconveniente. | Alta |
| **RF05.3- Modificación de la renta** | El sistema deberá permitir la modificación de la renta en dado caso que el cliente lo solicite, actualizando los datos en todo el sistema. | Alta |
| **RF05.4- Traslape de rentas** | Si dos usuarios intentan confirmar una renta al mismo tiempo, el sistema deberá bloquear la segunda renta y permitir la primera. | Alta |
| **RF06- Sistema de reportes** | El sistema deberá mostrar un menú dedicado a los reportes de daños del equipo, permitiendo registrar el daño, modificarlo y cambiarlo de estado para su uso. | Alta |
| **RF06.1- Agregar un nuevo reporte** | El sistema debe permitir agregar un nuevo reporte, especificando el tipo de daño, prioridad, descripción de la incidencia y ubicación. | Alta |

---

## Requisitos No Funcionales

| Requerimiento | Descripción |
| :--- | :--- |
| **RNF01- Usabilidad** | El sistema deberá ser fácil de usar, con interfaces simples e intuitivas, con un diseño adaptable y *responsive* para dispositivos móviles. |
| **RNF02- Disponibilidad del sistema** | El sistema deberá mantener una disponibilidad constante de aproximadamente 99.9%, garantizando que los usuarios no tengan que registrar manualmente por fallos del sistema. |
| **RNF03- Compatibilidad** | El sistema deberá funcionar en todos los navegadores web y dispositivos móviles. |
| **RNF04- Gestión de permisos** | Los permisos de acceso al sistema podrán ser cambiados únicamente por el usuario administrador. |