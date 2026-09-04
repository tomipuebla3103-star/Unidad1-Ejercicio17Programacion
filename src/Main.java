//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Factura factura = new Factura("F001", "Juan Perez", 100000);

    double iva = factura.getMontoNeto() * 0.21;
    double total = factura.calcularTotalConIVA();

    System.out.println("Número de factura: " + factura.getNumeroFactura());
    System.out.println("Cliente: " + factura.getCliente());
    System.out.println("Monto neto: $" + factura.getMontoNeto());
    System.out.println("IVA (21%): $" + iva);
    System.out.println("Total con IVA: $" + total);
}
