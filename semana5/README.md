
# Semana 05 - Polimorfismo

---

# **Contenido minimo:**

# Bootcamp POO Java - David López

## 📋 Información

- **Estudiante:** David López
- **Ficha:** 3228970B
- **Dominio Asignado:** Seguros Total
- **Instructor:** Erick Granados
---

## 🏢 Compañía del Proyecto

**Nombre:** Seguros Total  
**Descripción:** Empresa dedicada a la gestión de pólizas de seguros de vida y de coche, aplicando los principios de la Programación Orientada a Objetos (POO) para modelar clientes, pólizas y reglas de negocio.

---

## 📁 Estructura del Repositorio

```text
Bootcamp-POO-Java/
│
├── semana-01/   # Introducción a la POO
├── semana-02/   # Clases, Objetos y Métodos de Negocio
├── semana-03/   # Encapsulación y Constructores
├── semana-04/   # Herencia
├── semana-05/   # Polimorfismo
└── README.md    # Documentación principal del proyecto
```
---
## 🚀 Cómo Ejecutar el Proyecto
cd semana-05/src

javac *.java

java Maincd semana-05/src

javac *.java

java Main

---

## 📝 Descripción

En esta semana se reforzaron los conceptos de **herencia y polimorfismo**, utilizando una clase base llamada **PolizadeSeguro**, de la cual heredan las clases **SegurodeVida** y **SegurodeCoche**.

Se implementó una clase gestora llamada **Seguros**, que utiliza una colección  
`ArrayList<PolizadeSeguro>` para almacenar diferentes tipos de pólizas y aplicar polimorfismo al mostrar la información y calcular el riesgo de cada una.

---

## 🎯 Objetivos Cumplidos

- [x] Implementar herencia mediante una clase base
- [x] Aplicar polimorfismo usando métodos sobrescritos
- [x] Utilizar `ArrayList` para manejar múltiples pólizas
- [x] Sobrescribir métodos según el tipo de seguro
- [x] Crear un programa funcional desde la clase `Main`
- [x] Documentar correctamente el proyecto

---

## 📂 Archivos Entregados

- **PolizadeSeguro.java**  
  Clase base del sistema. Contiene los atributos comunes de una póliza y métodos generales.

- **SegurodeVida.java**  
  Clase hija que sobrescribe el método de cálculo de riesgo según la edad del cliente.

- **SegurodeCoche.java**  
  Clase hija que sobrescribe el método de cálculo de riesgo según el modelo del vehículo.

- **Seguros.java**  
  Clase gestora que almacena las pólizas y permite mostrarlas y buscarlas.

- **Main.java**  
  Clase principal que ejecuta el sistema y demuestra el uso del polimorfismo.

---

## 🚀 Instrucciones de Ejecución

```bash
cd semana-05/src
javac *.java
java Main