package adapter;

public class PagoAdapter implements Pago {
    private PagoEuro pagoEuro;
    private PagoPesosCol pagoPesos;
    private PagoReales pagoReal;
    private int op;

    public PagoAdapter(int op) {
        this.op = op;
        this.pagoEuro = new PagoEuro();
        this.pagoPesos = new PagoPesosCol();
        this.pagoReal = new PagoReales();
    }

    @Override
    public void pagar(double monto) {
        switch (op) {
            case 1: double euros = monto * 0.84;
                    pagoEuro.pagarenEuros(euros);break;
            case 2: double pesos = monto * 3677.71;
                    pagoPesos.pagarenPesosCol(pesos);break;
            case 3: double reales = monto * 5.23;
                    pagoReal.pagarenReales(reales);;break;
            default:
                System.out.println("Divisa no valida");
        }
    }   
}
