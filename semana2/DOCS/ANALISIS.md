# Análisis Orientado a Objetos - Seguros Total (Semana 02)

## 1. Identificación del Dominio

**Nombre del negocio:** Seguros Total  
**Tipo:** Compañía de seguros  
**Descripción:**  
Seguros Total administra pólizas de seguro, permitiendo registrar seguros de vida asociados a clientes, calcular la duración estimada de dichas pólizas y aplicar descuentos a seguros de coche según el año de fabricación del vehículo.

---

## 2. Objetos Identificados

### Objeto Principal: SegurodeVida

**¿Qué es?:**  
Representa una póliza de seguro de vida contratada por un cliente, en la cual se evalúan datos personales para estimar la duración del seguro.

**Atributos identificados:**
- `cliente`: Cliente – Cliente asociado al seguro de vida.
- `edad`: int – Edad del cliente asegurado.
- `genero`: String – Género del cliente.
- `duracion`: int – Duración inicial del seguro.
- `precio`: double – Precio del seguro de vida.

**Métodos identificados:**
- `InformacionSegurosdeVida()`: Muestra la información del seguro y del cliente.
- `DuracionEstimada()`: Calcula la duración estimada del seguro según la edad y el género.

---

### Objeto Secundario: SegurodeCoche

**¿Qué es?:**  
Representa un vehículo asegurado por la compañía, al cual se le puede aplicar un descuento dependiendo de su año de fabricación.

**Atributos identificados:**
- `marca`: String – Marca del vehículo.
- `modelo`: String – Modelo del vehículo.
- `año`: int – Año de fabricación del vehículo.
- `precio`: int – Precio del vehículo.
- `color`: String – Color del vehículo.

**Métodos identificados:**
- `InformacionCoche()`: Muestra la información del vehículo.
- `ObtenerDescuento()`: Calcula el valor del descuento según el año del vehículo.

---

### Objeto Administrador: Seguros

**¿Qué es?:**  
Representa la compañía Seguros Total, encargada de gestionar múltiples pólizas de seguro de vida.

**Atributos identificados:**
- `nombre`: String – Nombre de la compañía.
- `segurodeVidas`: ArrayList\<SegurodeVida> – Lista de seguros de vida registrados.

**Métodos identificados:**
- `AgregarSeguro(SegurodeVida segurodeVida)`: Agrega un seguro de vida a la lista.
- `MostrarTodosSeguros()`: Muestra todos los seguros registrados.
- `ContarSeguros()`: Retorna la cantidad total de seguros de vida.

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación

**Descripción:**  
Un SegurodeVida está asociado a un Cliente, ya que necesita su información para calcular la duración estimada.  
La clase Seguros administra múltiples objetos SegurodeVida mediante una colección `ArrayList`.

Ejemplo:  
“Una compañía de seguros puede tener múltiples seguros de vida, y cada seguro de vida pertenece a un cliente.”

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Los objetos representan entidades reales del dominio de seguros: clientes, seguros de vida, seguros de coche y la compañía administradora.

**¿Por qué estos atributos son importantes?**
- La edad y el género influyen en la duración del seguro de vida.
- El año del vehículo permite calcular descuentos en seguros de coche.
- La lista de seguros facilita la gestión de múltiples pólizas.

**¿Por qué estos métodos son necesarios?**
- `DuracionEstimada()` encapsula la lógica del negocio.
- `ObtenerDescuento()` permite aplicar reglas de descuento.
- Los métodos de mostrar información facilitan la visualización de datos.

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Estructurado):
Se utilizarían funciones sueltas y variables independientes, lo que dificulta la organización y reutilización del código.

### Con POO:
Se encapsulan datos y comportamientos en clases, mejorando la claridad y el mantenimiento del sistema.

**Ventajas específicas en mi dominio:**
1. Organización clara del sistema de seguros.
2. Reutilización de clases como Cliente y SegurodeVida.
3. Fácil ampliación a nuevos tipos de seguros.

---

## 6. Diagrama de Clases (Opcional)



