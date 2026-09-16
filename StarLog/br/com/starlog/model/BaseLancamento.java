package br.com.starlog.model.BaseLancamento;

import java.util.HashMap;
import java.util.Map;

public class BaseLancamento {
    // RN04
    private Map<String, ModuloCarga> modulos = new HashMap<>();

    public void cadastrarModulo(ModuloCarga modulo) {
        modulos.put(modulo.getCodigoModulo(), modulo);
    }

    public ModuloCarga buscarModulo(String codigoModulo) {
        return modulos.get(codigoModulo);
    }
}