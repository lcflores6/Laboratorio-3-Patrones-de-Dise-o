package Singleton2;
import java.util.*;
public class Singleton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModuloVentas mv = new ModuloVentas(); 
        ModuloFacturacion mf = new ModuloFacturacion();
        
        int op;
        double monto;
        double montof;
        
        do {
            System.out.println("SISTEMA CAJA REGISTRADORA");
                    System.out.println("1. Registrar Venta");
                    System.out.println("2. Registrar Factura");
                    System.out.println("3. Ver Total Ventas");
                    System.out.println("4. Ver Total Facturas");
                    System.out.println("5. Ver Total de la Caja Registradora");
                    System.out.println("6. Salir");
                    System.out.print("Ingrese una Opcion: ");
                    op = sc.nextInt();
                    sc.nextLine();
                switch (op) {
                case 1:
                    System.out.println("Ingree el monto de la venta: ");
                    monto = sc.nextDouble();
                    sc.nextLine();  
                    mv.vender(monto);
                    break;
                case 2:
                    System.out.println("Total de ventas con facturacion: ");
                    montof = sc.nextDouble();
                    sc.nextLine();  
                    mf.facturar(montof); 
                    break;    
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Total de ventas sin factura: "+caja.getTotalVentas());
                     break;    
                case 4:  
                    CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                    System.out.println("Total facturado: "+cajaf.getTotalFacturas());
                    break;        
                case 5:  
                    CajaRegistradora cajat = CajaRegistradora.getInstancia();
                    System.out.println("Total de la caja registradora: "+cajat.getTotal());
                    break;        
                default: System.out.println("Opcion no valida");    
            }
        } while (op != 6);      
    }
}
