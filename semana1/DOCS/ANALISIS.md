# Análisis Orientado a Objetos - Seguros Total

## 1. Identificación del Dominio

**Nombre del negocio:** Seguros Total  
**Tipo:** Compañía de seguros  
**Descripción:**  
Seguros Total es una empresa dedicada a la gestión de pólizas de seguro, donde se registra la información de los clientes y las pólizas asociadas, permitiendo consultar datos básicos y calcular valores relacionados con las primas.

---

## 2. Objetos Identificados

### Objeto Principal: PolizadeSeguro

**¿Qué es?:**  
Representa una póliza de seguro contratada por un cliente, donde se almacena la información principal de la póliza y se realizan cálculos básicos sobre su prima.

**Atributos identificados:**
- `numerodepoliza`: int - Identificador único de la póliza.
- `tipo`: String - Tipo de póliza (vida, coche, etc.).
- `titular`: String - Nombre del titular de la póliza.
- `vigencia`: boolean - Indica si la póliza está vigente o no.
- `primamensual`: double - Valor mensual que paga el cliente por la póliza.

**Métodos identificados:**
- `mostrardatos()`: Muestra en consola la información completa de la póliza.
- `primamensual()`: Calcula y retorna el valor de la prima anual a partir de la prima mensual.
- `getNumerodepoliza()`: Retorna el número de la póliza.
- `setvigencia(boolean vigencia)`: Permite modificar el estado de vigencia de la póliza.

---

### Objeto Secundario: Cliente

**¿Qué es?:**  
Representa a la persona que contrata una póliza de seguro y de quien se almacena información básica de contacto.

**Atributos identificados:**
- `nombre`: String - Nombre completo del cliente.
- `identificacion`: long - Número de identificación del cliente.
- `direccion`: String - Dirección de residencia.
- `telefono`: long - Número de contacto.
- `correoelectronico`: String - Correo electrónico del cliente.

**Métodos identificados:**
- `mostrarinformacion()`: Muestra en consola los datos del cliente.
- `getnombre()`: Retorna el nombre del cliente.
- `setnombre(String nombre)`: Permite modificar el nombre del cliente.

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación

**Descripción:**  
El Cliente y la PolizadeSeguro están relacionados conceptualmente, ya que una póliza pertenece a un cliente. En esta primera semana la relación no se implementa directamente mediante referencias entre objetos, sino a través del atributo `titular` en la póliza, que almacena el nombre del cliente.

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Se eligieron los objetos Cliente y PolizadeSeguro porque representan las entidades principales del dominio de una compañía de seguros y permiten modelar un caso real de forma sencilla.

**¿Por qué estos atributos son importantes?**
- Los atributos del Cliente permiten identificar y contactar al asegurado.
- Los atributos de la PolizadeSeguro permiten identificar la póliza, conocer su estado y calcular valores económicos asociados.

**¿Por qué estos métodos son necesarios?**
- Los métodos de mostrar información facilitan la visualización de los datos.
- El método `primamensual()` encapsula la lógica de cálculo del valor anual de la póliza.
- Los getters y setters permiten un acceso controlado a los atributos.

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Estructurado):
El problema se resolvería usando variables sueltas y funciones independientes para manejar clientes y pólizas, lo que haría el código menos organizado y más difícil de mantener.

### Con POO:
El uso de clases permite agrupar datos y comportamientos relacionados, haciendo el código más claro, reutilizable y fácil de escalar.

**Ventajas específicas en mi dominio:**
1. Mejor organización del código.
2. Mayor facilidad para agregar nuevos tipos de seguros.
3. Reutilización de clases y métodos en futuras semanas.

---

## 6. Diagrama de Clases (Opcional)

# Análisis Orientado a Objetos - Seguros Total

## 1. Identificación del Dominio

**Nombre del negocio:** Seguros Total  
**Tipo:** Compañía de seguros  
**Descripción:**  
Seguros Total es una empresa dedicada a la gestión de pólizas de seguro, donde se registra la información de los clientes y las pólizas asociadas, permitiendo consultar datos básicos y calcular valores relacionados con las primas.

---

## 2. Objetos Identificados

### Objeto Principal: PolizadeSeguro

**¿Qué es?:**  
Representa una póliza de seguro contratada por un cliente, donde se almacena la información principal de la póliza y se realizan cálculos básicos sobre su prima.

**Atributos identificados:**
- `numerodepoliza`: int - Identificador único de la póliza.
- `tipo`: String - Tipo de póliza (vida, coche, etc.).
- `titular`: String - Nombre del titular de la póliza.
- `vigencia`: boolean - Indica si la póliza está vigente o no.
- `primamensual`: double - Valor mensual que paga el cliente por la póliza.

**Métodos identificados:**
- `mostrardatos()`: Muestra en consola la información completa de la póliza.
- `primamensual()`: Calcula y retorna el valor de la prima anual a partir de la prima mensual.
- `getNumerodepoliza()`: Retorna el número de la póliza.
- `setvigencia(boolean vigencia)`: Permite modificar el estado de vigencia de la póliza.

---

### Objeto Secundario: Cliente

**¿Qué es?:**  
Representa a la persona que contrata una póliza de seguro y de quien se almacena información básica de contacto.

**Atributos identificados:**
- `nombre`: String - Nombre completo del cliente.
- `identificacion`: long - Número de identificación del cliente.
- `direccion`: String - Dirección de residencia.
- `telefono`: long - Número de contacto.
- `correoelectronico`: String - Correo electrónico del cliente.

**Métodos identificados:**
- `mostrarinformacion()`: Muestra en consola los datos del cliente.
- `getnombre()`: Retorna el nombre del cliente.
- `setnombre(String nombre)`: Permite modificar el nombre del cliente.

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación

**Descripción:**  
El Cliente y la PolizadeSeguro están relacionados conceptualmente, ya que una póliza pertenece a un cliente. En esta primera semana la relación no se implementa directamente mediante referencias entre objetos, sino a través del atributo `titular` en la póliza, que almacena el nombre del cliente.

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Se eligieron los objetos Cliente y PolizadeSeguro porque representan las entidades principales del dominio de una compañía de seguros y permiten modelar un caso real de forma sencilla.

**¿Por qué estos atributos son importantes?**
- Los atributos del Cliente permiten identificar y contactar al asegurado.
- Los atributos de la PolizadeSeguro permiten identificar la póliza, conocer su estado y calcular valores económicos asociados.

**¿Por qué estos métodos son necesarios?**
- Los métodos de mostrar información facilitan la visualización de los datos.
- El método `primamensual()` encapsula la lógica de cálculo del valor anual de la póliza.
- Los getters y setters permiten un acceso controlado a los atributos.

---

## 5. Comparación: POO vs Programación Estructurada

### Sin POO (Estructurado):
El problema se resolvería usando variables sueltas y funciones independientes para manejar clientes y pólizas, lo que haría el código menos organizado y más difícil de mantener.

### Con POO:
El uso de clases permite agrupar datos y comportamientos relacionados, haciendo el código más claro, reutilizable y fácil de escalar.

**Ventajas específicas en mi dominio:**
1. Mejor organización del código.
2. Mayor facilidad para agregar nuevos tipos de seguros.
3. Reutilización de clases y métodos en futuras semanas.

---

## 6. Diagrama de Clases (Opcional)

