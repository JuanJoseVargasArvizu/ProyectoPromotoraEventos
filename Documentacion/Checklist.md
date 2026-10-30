# ADT's
¿Piensas en tus clases como ADT's y evaluas sus interfaces desde ese punto de vista?

Clase Usuario: La clase usuario representa un Usuario el cual no hace mas que interactuar con el sistema mediante las interfaces que le da el mismo, el no toma parte en la logica del negocio, solo se le restringen accesos a la misma en base a su rol

Elemento: La clase elemento representa un producto para la prestacion como parte de una renta, por lo tanto tiene los datos del producto y el costo que tiene al ser rentado. Su interfaz simplementa esta para poder consultar sus datos y cambiarlos en caso de ser necesario, puesto que un producto no realiza acciones

¿Las clases tienen un proposito central?

¿La el nombre de la clase describe su proposito central?

¿La interfaz de la clase presenta una abstraccion consistente?

¿La interfaz de la clase hace obvio como deberias usarla?

¿La interfaz es lo suficientemente abstracta para que no tengas que pensar en como sus servicios estan implementados?

¿Los servicios de la clase estan lo suficientemente completos para que otras clases no tengan que tratar con sus atributos?

¿La informacion no relacionada ha sido movida fuera de la clase?

¿La clase oculta sus detalles de implementacion tanto como el lenguaje lo permite?

¿La clase no hace suposiciones sobre sus usuarios y clases derivadas?

¿La clase es independiente de otras clases?

¿La herencia es usada solo para representar relaciones de "Es un"?

¿La documentacion de la clase describe la estrategia de la herencia?

¿Las clases derivadas se hadieren al principio de sustitucion de Liskov?

¿Los datos, comportamientos y interfaces comunes estan en lo mas alto posible del harbol de herencia?

¿Los harboles de herencia no son muy profundos?

¿Son todos los atributos de la super clase privados en lugar de protegidos?

¿La clase contiene 7 atributos o menos?

¿La clase minimiza las llamadas de metodos directas e indirectas a otras clases?

¿La clase colabora con otras solo en el rango absolutamente necesario?

¿Todos los atributos son inicializados en el constructor?

¿La clase esta diseñada para ser utiliza como copia profunda en vez de copias superficiales?¿Hay alguna razon para usar copias superficiales?