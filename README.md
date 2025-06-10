# 🎟️ Reservador de Asientos en Java

Este proyecto es una simulación en consola de un sistema de reserva de asientos, implementado en Java. Utiliza una matriz bidimensional para representar los asientos de una sala y permite al usuario seleccionar asientos disponibles mientras evita los ya ocupados.

---

## 🧩 Características

- Representación visual de una sala con **5 filas (A–E)** y **4 columnas (1–4)**.
- 8 asientos se **ocupan aleatoriamente** al inicio de la ejecución.
- El usuario puede:
  - Visualizar los asientos (libres u ocupados).
  - Reservar un asiento indicando su código (por ejemplo: `A3`).
  - Reservar múltiples asientos mientras desee continuar (`s/n`).

---

## 🔧 Estructura del código

- `asientos`: matriz `char[][]` que almacena el estado (`L` = libre, `X` = ocupado).
- `inicializarAsientos()`: llena la matriz con asientos libres.
- `ocuparAsientosAleatoriamente(int cantidad)`: marca una cantidad de asientos como ocupados al azar.
- `mostrarAsientos()`: imprime la sala de forma visual.
- `reservarAsiento(String seleccion)`: intenta reservar el asiento ingresado por el usuario, validando su disponibilidad y rango.

---

## ▶️ Cómo ejecutar

1. Clona este repositorio o copia el código en NetBeans/tu IDE favorito.
2. Ejecuta la clase `while5`.
3. Sigue las instrucciones en consola para reservar asientos.

---

## 📦 Requisitos

- Java 8 o superior
- IDE como [NetBeans](https://netbeans.apache.org/) o [IntelliJ IDEA](https://www.jetbrains.com/idea/)

---

## 📜 Licencia

Este proyecto está disponible bajo la licencia MIT. Puedes modificarlo y usarlo libremente.

---

## ✍️ Autor

Desarrollado por [Grupo 3 - Algoritmia - UNCP].
