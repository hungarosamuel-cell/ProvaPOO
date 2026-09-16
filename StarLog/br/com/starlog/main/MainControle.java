package br.com.starlog.main;

import java.util.HashSet;
import java.util.Locale;

import br.com.starlog.exception.CapacidadeExcedidaException;
import br.com.starlog.model.BaseLancamento;
import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;

public class MainControle {
    public static void main(String[] args) {
        // P01
        Carga c1 = new Carga("ORB-101-SP", "CRIOGENICA", 2.5, 450.00);
        Carga c2 = new Carga("ORB-102-RJ", "PADRAO", 8.0, 120.00);
        Carga c3 = new Carga("ORB-103-MG", "CRIOGENICA", 12.0, 850.00);
        Carga c4 = new Carga("ORB-104-PR", "BIOLOGICA", 15.0, 300.00);
        System.out.println(c1);
        System.out.println(c4);

    }
}
