# Revision Proyecto

## Diagrama de clases y diseño de la interfaz

* No se presenta el diagram de clases
* No se presenta el diseño de la interfaz grafica
  
## Nota (40%): 0.0

## Código Fuente

## 1. El tablero del juego puede ser una matriz de 8x8, 10x10 o 12x12. El usuario escoje el tamaño

* Funcion no implementada

### Puntos: 0.0

## 2. El numero de jugadores es de al menos 2 pero un jugador puede jugar contra la maquina

* Se puede jugar de dos jugadores
* No permite jugar con un jugador maquina

### Puntos: 0.5

## 3. Cada jugador tiene una ficha con diferente color y el jugador puede escojer el color

* Funcion implementada

### Puntos: 1.0

## 4. El tablero de juego es construido aleatoriamente y el usaurio puede escojer la densidad de los deslizadores y escaleras  

* El tablero no es construido aleatoriamente
* Funcion no se puede definir la densidad de los deslizadores y escaleras

### Puntos: 0.0

## 5. El juego debe tener un dado para indicar cuantas casillas debe mover un jugador

* Funcion implementada

### Puntos: 1.0

## 6. Cada cuadro en el juego es enumerado para indicar el orden en el cual debe avanzar 

* Funcion implementada, aunque es mas porque el tablero esta definido por una imagen

### Puntos: 1.0

## 7. Si el jugador cae en la parte superior de un deslizador debe bajar hasta la parte inferior y si cae en la casilla inferior de una escalera debe subir hasta la parte superior

* Funcion implementada
  
### Puntos: 0.5

## 8. Una escalera o deslizador puede mover el jugador en cualquier direccion pero no debe ser mayor a la mitad del tablero

* No hay ninguna logica en el juego que permita evaluar esta condicion

### Puntos: 0.0

## 9. Cuanod un jugador llega a una escalera o deslizador se debe reproducir un sonido

* Funcion no implementada

### Puntos: 0.0

## 10. Un jugador debe alcanzar la casilla final exactamente. Si el valor excede debe retorceder

* Funcion implementada

### Puntos: 1.0

## 11. Una animacion es presentada cuando un jugador gana

* Funcion no implementada, simplemente se muestra un label donde muestra que gano

### Puntos: 0.0

## 12. El juego guarda los 10 mejores puntajes. Una vez el juego termina, se evalua la cantidad de lanzamientos y el tiempo de juego

* Funcion no implementada

### Puntos: 0.0

## 13. El juego debe ser reseatado en cualquier momento

* Funcion implementada

### Puntos: 1.0

## Comentarios Generales

* Deben mejorar estilo de programacion, estan usando variables cuyo identificador no significa nada por ejemplo variable a, b, etc.
* No se estan validando los botones de cancelar cuando se elije el nombre, si se cancela y no se elije nombre o ficha, el juego de todas maneras continua generando error
* Las casillas quedan con la fihgura del jugador aunque no tenga la ficha
* No validaorn que la ultima casilla no tenga un obstaculo, sino por ejemplo queda un deslizador alli, nunca va aganar nadie

* Puntos Totales: 6
## Nota (60%): 2.3

# Nota Final: 1.38