# Board

Se debe implementar una clase `Board `, hija de `JPanel`, que representa un tablero. Esta clase recibe un entero que indica el tamaño del tablero, es decir la cantidad de filas y columnas que tendra el tablero.

Para construir el tablero se usa la clase `Box` que indica la posición en `(x, y)`, el ancho (`width`) y el alto (`height`) de cada casilla del tablero en el panel. Una vez definida la posicion de cada casilla, se procede a dibujarlas en el tablero como Rectangulos (`drawRect` o `fillRect`).

Además de las clases `Box`y `Board`,  se debe implementar una clase `Token` que representa una ficha del tablero. cada token esta en una casilla corresponidente a la fila `row` y columna `column` del tablero. Ademas el token tendrá un `Color`. El tablero tendrá una cantidad de tokens que se dibujaran dentro de la casilla que indican `row` y `column` como un circulo (`fillOval`). `row`y `column` son valores aleatorios. 

El panel se debe agregar a un `JFrame` correspondiente a la clase `Juego`. Este frame también tiene un `JButton` llamado `changeTokens` que cuando se presiona cambia la casilla donde se encuentra cada token. Cuando se cambian la casilla cada token es dibujado en su nueva posición (`repaint()`).

Para hallar la posición de cada casilla use el método `updateBoard` de la clase [Board](https://github.com/gomezpirry/interactiva/blob/master/board/Board.java) del repositorio.
