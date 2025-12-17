# Análisis de Polimorfismo - Sistema de Seguros

## 1. Sobrecarga (Overloading)

### Métodos Sobrecargados

En el sistema de seguros, la sobrecarga se implementa en la clase **Seguros**, permitiendo buscar pólizas usando distintos criterios sin cambiar el nombre del método.

* `BuscarSeguro(int numeroPoliza)`
* `BuscarSeguro(String titular)`

### Justificación

En una compañía de seguros es común buscar pólizas **por código (número de póliza)** o **por titular**. Usar sobrecarga permite mantener un mismo nombre de método (`BuscarSeguro`) con diferentes parámetros, lo que hace el código más claro, coherente con el dominio y fácil de mantener.

---

## 2. Sobrescritura (Overriding)

### Tabla Comparativa

| Método             | Clase Padre (PolizadeSeguro)         | Subclase SegurodeVida              | Subclase SegurodeCoche                   |
| ------------------ | ------------------------------------ | ---------------------------------- | ---------------------------------------- |
| `calcularRiesgo()` | Retorna un riesgo base               | Calcula riesgo según edad y género | Calcula riesgo según año del vehículo    |
| `mostrarDatos()`   | Muestra datos generales de la póliza | Muestra datos + edad y riesgo      | Muestra datos + información del vehículo |

### Código Ejemplo

```java
@Override
public double calcularRiesgo() {
    if (edad > 60) {
        return 2.0;
    }
    return 1.2;
}
```

Este método sobrescribe el comportamiento definido en la clase padre, adaptándolo a las reglas específicas del **Seguro de Vida**.

---

## 3. Polimorfismo Dinámico

### Ejemplo de Dynamic Binding

```java
ArrayList<PolizadeSeguro> polizas = new ArrayList<>();

polizas.add(new SegurodeVida());
polizas.add(new SegurodeCoche());

for (PolizadeSeguro poliza : polizas) {
    poliza.mostrarDatos();
    System.out.println("Riesgo: " + poliza.calcularRiesgo());
}
```

### Explicación

Aunque todas las pólizas se manejan como objetos de tipo **PolizadeSeguro**, Java ejecuta en tiempo de ejecución el método sobrescrito correspondiente a la subclase real del objeto. Esto demuestra el **enlace dinámico**, ya que el comportamiento depende del tipo real del objeto y no del tipo de la referencia.

---

## 4. Beneficios

* **Flexibilidad**: El sistema puede manejar diferentes tipos de pólizas usando una sola referencia (`PolizadeSeguro`).
* **Extensibilidad**: Es posible agregar nuevos tipos de seguros sin modificar el código existente.
* **Mantenibilidad**: Reduce el uso de condicionales y facilita la lectura y el mantenimiento del código.
