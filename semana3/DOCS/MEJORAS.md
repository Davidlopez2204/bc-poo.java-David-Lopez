# Mejoras - Semana 03

## Encapsulación Aplicada

### Clase: Cliente
- Atributos encapsulados: `nombre`, `identificacion`, `direccion`, `telefono`, `correoelectronico` (todos declarados como `private`).
- Validaciones agregadas:
    1. En `setCorreoelectronico`: Se valida que el correo no sea nulo y contenga el carácter '@'.
    2. En `setNombre`: Se valida que el nombre no sea nulo y no esté vacío.

### Clase: SegurodeVida
- Atributos encapsulados: `cliente`, `edad`, `genero`, `duracion`, `precio` (todos declarados como `private`).
- Validaciones agregadas:
    1. En `setEdad`: Se valida que la nueva edad esté dentro del rango permitido (entre 1 y 90 años).
    2. En `setPrecio`: Se valida que el precio de la póliza sea mayor o igual a cero.
    3. **Regla de Negocio:** El método `DuracionEstimada()` aplica lógica para calcular la duración máxima de la póliza basada en la edad y añade 5 años extra si el género es 'femenino'.

## Constructores Sobrecargados

### Clase: Cliente
- Constructor 1 (Completo): Acepta todos los atributos (`nombre`, `identificacion`, `direccion`, `telefono`, `correoelectronico`).
- Constructor 2 (Parcial): Permite crear un cliente con solo tres atributos (`nombre`, `identificacion`, `direccion`), asignando valores por defecto (`0L` y `"null"`) al teléfono y correo electrónico.

### Clase: SegurodeVida
- Constructor 1 (Completo): Acepta todos los atributos (`cliente`, `edad`, `genero`, `duracion`, `precio`).
- Constructor 2 (Parcial): Permite crear la póliza con la información esencial (`cliente`, `edad`, `genero`), asignando valores por defecto (`0` y `0.0`) a la duración y el precio.

## Beneficios Logrados
- **Control de Acceso:** El encapsulamiento (`private` + `getters`/`setters`) obliga a cualquier cambio de estado a pasar por la lógica de validación definida.
- **Robustez en la Asignación de Valores:** Las validaciones previenen que se asignen datos inconsistentes (como una edad de 100 años o precios negativos) al objeto, mejorando la fiabilidad.
- **Flexibilidad en la Creación de Objetos:** La sobrecarga de constructores permite crear instancias con diferentes niveles de detalle inicial, facilitando su uso en diversas situaciones.
