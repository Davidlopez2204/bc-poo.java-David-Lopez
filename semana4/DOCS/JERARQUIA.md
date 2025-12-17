# Jerarquía de Clases - Semana 04

## Diagrama


             PolizadeSeguro
                    ▲
        ┌───────────┴───────────┐
        │                       │
    SegurodeVida               SegurodeCoche


---

## Justificación

Se eligió esta jerarquía porque en la compañía **Seguros Total** existen distintos tipos de pólizas que comparten información y comportamientos comunes, como el número de póliza, el titular, la vigencia y la prima mensual.

La clase **PolizadeSeguro** actúa como clase base y permite reutilizar código, mientras que las clases **SegurodeVida** y **SegurodeCoche** extienden su funcionalidad para aplicar reglas específicas de cálculo de riesgo según el tipo de seguro, cumpliendo los principios de **herencia**.

---

## Atributos Heredados (Clase Padre: PolizadeSeguro)

- numerodepoliza (int): Identificador único de la póliza
- tipo (String): Tipo de póliza
- titular (String): Nombre del titular del seguro
- vigencia (boolean): Indica si la póliza está vigente
- primaMensual (double): Valor mensual de la póliza

---

## Atributos Específicos

### SegurodeVida
- edad (int): Edad del asegurado
- genero (String): Género del asegurado

### SegurodeCoche
- modelo (String): Modelo del vehículo
- anoFabricacion (int): Año de fabricación del vehículo

---

## Métodos Sobrescritos

### calcularRiesgo()

- **PolizadeSeguro:**  
  Define un método general de cálculo de riesgo que sirve como base.

- **SegurodeVida:**  
  Calcula el riesgo teniendo en cuenta la edad del asegurado y el género, reduciendo el riesgo si el género es femenino.

- **SegurodeCoche:**  
  Calcula el riesgo según la antigüedad del vehículo, aumentando el riesgo para coches con más de 5 años y disminuyéndolo para vehículos más recientes.

---

## Conceptos POO Aplicados

- Herencia
- Uso de atributos `protected`
- Sobrescritura de métodos con `@Override`
- Reutilización de código mediante `super`

---

## Conclusión

La jerarquía implementada permite modelar correctamente los diferentes tipos de seguros de la empresa **Seguros Total**, facilitando la extensión del sistema y el mantenimiento del código.git


