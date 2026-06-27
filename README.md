# Práctica 12 – Simple Factory de Laptops

**Autor:** LEONARDO  
**Curso:** Patrones de Diseño  
**Fecha:** Junio 2026

---

## 📌 Descripción del problema

Se requiere desarrollar un sistema que permita crear tres tipos de laptops:

- **Laptop para uso básico**
- **Laptop para gamers**
- **Laptop para uso profesional**

Cada laptop debe tener los siguientes atributos:
- Marca y modelo
- Año de fabricación
- Tipo de procesador
- Tamaño de la pantalla

Además, todas deben sobrescribir un método `ejecutarPrueba()` que muestre un mensaje indicando el tipo de laptop y sus características.

---

## 🧩 Solución implementada

Se aplica el patrón **Simple Factory** para encapsular la creación de objetos. La clase `LaptopFactory` decide qué subclase concreta instanciar según un parámetro de tipo (`"basica"`, `"gamer"`, `"profesional"`). El cliente (`Main`) solo conoce la fábrica y la interfaz abstracta `Laptop`, desacoplando la creación del uso.

### Diagrama de clases UML

El diagrama se encuentra en el archivo `uml.pdf` incluido en este repositorio.

---
