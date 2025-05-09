# En busca de la solución del problema de la detención
## Enunciado
En teoría de la computabilidad, el problema de la detención consiste en determinar, a partir de la descripción de un programa informático arbitrario y una entrada, si el programa finalizará su ejecución o continuará ejecutándose indefinidamente.
## Hipótesis
A pesar de que Alan Turing demostró teóricamente que este enunciado era ***imposible*** de solucionar, podemos plantear que un factor determinante fueron las herramientas que Turing usó para construir su proceso de análisis. Es importante recordar que la idea derivada de las máquinas de Turing es que *los problemas se resuelven mediante algoritmos que se ejecutan de manera secuencial*. Desde este punto de vista ciertamente es imposible crear un programa que tenga las capacidades descritas en le enunciado, pero existe otra alternativa: ***la idea de John McCarthy***. McCarthy planteó una forma diferente de resolver los porblemas, y materializó esta idea en el lenguaje que creó llamado **LISP**.

¿Qué pasaría si simplemente Turing no pudo encontrar la respuesta porque su enfoque no era lo suficientemente potente?

## Tesis
Mediante el enfoque Carthiano (llamémosle así) podemos desarrollar un programa capaz de analizar un algoritmo y una entrada y decirnos si se ejecutará indefinidamente o no.

## Demostración
Para demostrar esto sentaremos las siguientes bases:
1. El algoritmo se desarrollará en LISP o en un dialecto de este lenguaje.
2. Se enfocará en aplicar la prueba a algoritmos desarrollados en su mismo lenguaje.

Con esto planteado es momento de desarrollar el método a seguir para demostrar que el **Halting Problem** se puede solucionar.
