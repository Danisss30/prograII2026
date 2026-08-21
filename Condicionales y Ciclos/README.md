Desafíos Lógicos — Semana 3

Introducción

En este programa se realizaron diferentes ejercicios para practicar condiciones y ciclos en Java. El programa funciona por medio de un menú donde el usuario puede seleccionar diferentes opciones.

Se utilizaron estructuras como if, else if, else, switch, for, while y do while. También se utilizaron break, continue, contadores, acumuladores y validaciones.

 Opción 1 — Generar una secuencia

En esta opción el usuario ingresa un número inicial, un número final y un incremento.

El programa revisa que el incremento sea mayor que cero y que el número final sea mayor que el inicial.

Si los datos son correctos, se utiliza un ciclo `for` para mostrar la secuencia.

Por ejemplo:

5 10 15 20 25 30 35 40 45 50

 Opción 2 — Conteo regresivo

En esta opción el usuario debe ingresar un número entre 10 y 50.

Se utiliza un ciclo while para volver a pedir el número cuando no está dentro del rango.

Cuando el número es correcto, el programa realiza un conteo regresivo hasta llegar a cero y después muestra el mensaje "¡Despegue!".

Opción 3 — Analizar números

Esta opción permite ingresar varios números. El ingreso termina cuando el usuario escribe 0.

El programa cuenta los números positivos y negativos y también suma los números válidos.

Los números que son múltiplos de 5 son ignorados. Para esto se utiliza "continue".

También se utiliza `break` para terminar el ciclo cuando se ingresa el número 0.

 Opción 4 — Dibujar una pirámide

En esta opción el usuario ingresa una altura entre 3 y 10.

Se utilizan dos ciclos "for". Uno sirve para colocar los espacios y otro para colocar los asteriscos.

Los dos ciclos están dentro de otro ciclo, por lo que se utilizan ciclos anidados.

 Opción 5 — Validar palabra secreta

En esta opción el usuario debe escribir la palabra "Guatemala".

El programa acepta la palabra aunque se escriba con mayúsculas, minúsculas o con espacios al inicio y al final.

Se utiliza "trim()" para quitar los espacios y "equalsIgnoreCase()" para comparar la palabra sin importar las mayúsculas y minúsculas.

También se utiliza un ciclo "do while" para continuar solicitando la palabra hasta que sea correcta.

 Opción 6 — Salir

Cuando el usuario selecciona la opción 6, el programa muestra el mensaje:

"Programa finalizado correctamente."

Después de esto el menú deja de aparecer y el programa termina.



