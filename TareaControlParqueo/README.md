Control de Parqueo

Datos del estudiante

Nombre: Daniela Nohemy Divas Carrillo
Carné: 9941 23 4568

Descripción

Este programa permite registrar varios vehículos que utilizan un parqueo.

El programa solicita la placa, el tipo de vehículo, las horas estacionadas y si el conductor perdió el ticket.

Dependiendo del tipo de vehículo se utiliza una tarifa diferente.

También se aplica un descuento del 15% cuando el vehículo permanece más de 8 horas y se agrega un recargo de Q50 cuando se pierde el ticket.

Al finalizar se muestra un resumen con la cantidad de vehículos de cada tipo, los tickets perdidos, el total recaudado y el vehículo que realizó el pago más alto.

 Métodos utilizados

- obtenerTarifa(): obtiene la tarifa dependiendo del tipo de vehículo.
- obtenerNombreVehiculo(): obtiene el nombre del tipo de vehículo.
- calcularDescuento(): calcula el descuento del 15%.
- calcularPago(): calcula el pago normal.
- calcularPago(): calcula el pago cuando existe un recargo.
- mostrarComprobante(): muestra el comprobante de cada vehículo.
- validarNumeroPositivo(): valida números mayores que cero.
- validarTipoVehiculo(): valida el tipo de vehículo.
- validarTicket(): valida la respuesta del ticket.
- validarHora(): valida la hora.
- validarMinutos(): valida los minutos.
- calcularMinutos(): calcula el tiempo estacionado.
- calcularHorasCobradas(): calcula las horas que se deben cobrar.
- mostrarResumen(): muestra el resumen de la jornada.

Sobrecarga

La sobrecarga se utiliza en el método calcularPago.

Se crearon dos métodos con el mismo nombre pero con diferente cantidad de parámetros.

Uno recibe las horas y la tarifa:

calcularPago(int horas, double tarifa)

El otro recibe las horas, la tarifa y el recargo:

calcularPago(int horas, double tarifa, double recargo)

Esto permite calcular el pago normal y el pago con recargo.




Caso de prueba

### Caso 1: vehículo normal

Se registró un automóvil durante 5 horas y no perdió el ticket.

Resultado:

5 × Q8 = Q40.00

 Caso 2: descuento y ticket perdido

Se registró un automóvil durante 10 horas y perdió el ticket.

Subtotal:

10 × Q8 = Q80.00

Descuento:

Q80 × 15% = Q12.00

Después del descuento:

Q80 - Q12 = Q68.00

Recargo:

Q50.00

Total:

Q118.00

 Caso 3: validación

Se ingresó un tipo de vehículo incorrecto, por ejemplo 5.

El programa rechazó el dato y volvió a solicitarlo.

 Caso 4: reto opcional

Se probó un vehículo que entró a las 22:30 y salió a las 02:10.

Tiempo estacionado:

3 horas y 40 minutos.

Horas cobradas:

4 horas.
 Reto opcional

El programa permite ingresar la hora y minutos de entrada y salida, valida los valores y calcula correctamente el tiempo cuando el vehículo sale al día siguiente.
