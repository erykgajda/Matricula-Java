# Sistema de Matrícula - Java

Este proyecto es un sistema de matrícula simple desarrollado en Java. Permite a los usuarios realizar la matrícula en diferentes cursos educativos, seleccionando especialidades y grados, todo desde la consola. ¡Ideal para practicar lógica y manejo de entradas!

## Características del Proyecto

- Solicita información personal: **nombre**, **apellido** y **edad**.
- Verifica si el estudiante es **mayor de edad**.
- Confirma si el estudiante es **repetidor**.
- Ofrece opciones para matricularse en cursos como:
  - ESO
  - FP Medio
  - FP Superior
  - Bachiller
- Permite seleccionar especialidades según el curso:
  - FP Medio: Gestión Administrativa o Sistemas Microinformáticos y Redes.
  - FP Superior: Administración y Finanzas o Desarrollo Multiplataforma.
  - Bachiller: Ciencias, Humanidades, Artes o Mixto.
- Muestra un resumen detallado de la matrícula al finalizar.

## Tecnologías y Conceptos Usados

Este proyecto utiliza los siguientes conceptos de Java:

- **Estructuras de control**:
  - `if-else`
  - `switch`
- **Entrada de datos con `Scanner`**.
- **Manejo de cadenas**: validaciones con `.toLowerCase()` y comparaciones.
- **Estructuras de repetición y lógica condicional**.
- **Try-finally** para garantizar el cierre del `Scanner`.

## Ejecución

1. Clona este repositorio en tu máquina local.
2. Abre el archivo `Matricula.java` en tu IDE preferido.
3. Ejecuta el programa y sigue las instrucciones proporcionadas en la consola.

## Ejemplo de Uso

```plaintext
Bienvenido al IES Torrevigia
Vas hacer la telematricula con lo que quiero que me indiques algunos datos:

Introduceme tu nombre:
Juan

Introduceme tu apellido:
Pérez

Introduceme tu edad:
20

Eres mayor de edad puedes hacer tu matricula.
¿Eres repetidor?
no

Puedes continuar con tu matricula.

Introduceme al curso que quieres matricular: (eso/fpmedio/fpsuperior/batchiller)
fpmedio

Matricula guardada para FP Medio.
Si es tan amable eliga su tipo de especialidad para la FP.
1. Gestion administrativa (gestion).
2. Sistemas microinformática en red (smr).

Introduce el tipo de especialidad para fpmedio.
2

Has seleccionado Sistemas microinformáticos y redes como tu especialidad.
Muy bien ya solicitaste el curso que es: fpmedio
A continuación dime que año es: 1/2/3/4
1

Has selecionado que sera tu primer año en fpmedio.

Gracias por realizar la matrícula. A continuación, dejo la información:
Nombre registrado: Juan.
Apellido registrado: Pérez.
Edad registrada: 20.
¿Repetidor?: no.
Curso que va a realizar: fpmedio.
Especialidad seleccionada: Sistemas microinformáticos y redes.
Grado que va a realizar: 1.
