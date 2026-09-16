package br.com.starlog.model.ModuloCarga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.starlog.exception.CapacidadeExcedidaException;

public class ModuloCarga {
    private String codigoModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();
    
    public ModuloCarga(String codigoModulo, int capacidadeMaxima) {
        this.codigoModulo = codigoModulo;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    //---- RN02 ----
    public void CarregarCarga(Carga carga) throws CapacidadeExcedidaException {
        if (cargas.size() >= capacidadeMaxima) {
            throw new CapacidadeExcedidaException(
                    "Modulo '" + codigoModulo + "' atingiu a capacidade maxima de " + capacidadeMaxima + " cargas.");
        }
        cargas.add(carga);
    }
    
    //---- RN05 ----
    public double calcularSeguroTotal() {
        return cargas.stream()
                .mapToDouble(Carga::getValorSeguro)
                .sum();
    }

    public long contarCargasPorCategoria(String categoria) {
        return cargas.stream()
                .filter(c -> c.getCategoria().equals(categoria))
                .count();
    }

    public double calcularSeguroCargasPesadas(String categoria, double pesoMinimo) {
        return cargas.stream()
                .filter(c -> c.getCategoria().equals(categoria))
                .filter(c -> c.getPesoKg() > pesoMinimo)
                .mapToDouble(Carga::getValorSeguro)
                .sum();
    }


    //---- Getters ----

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Carga> getCargas() {
        return Collections.unmodifiableList(cargas);
    }

    
}
