public class Factura {
    private String numeroFactura;
    private String cliente;
    private double montoNeto;

    public Factura(String numeroFactura, String cliente, double montoNeto) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;

        if (montoNeto >= 0) {
            this.montoNeto = montoNeto;
        } else {
            this.montoNeto = 0;
        }
    }

    public double calcularTotalConIVA() {
        return montoNeto * 1.21;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMontoNeto() {
        return montoNeto;
    }
}
