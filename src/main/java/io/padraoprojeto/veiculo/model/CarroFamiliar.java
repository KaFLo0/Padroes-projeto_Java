package io.padraoprojeto.veiculo.model;

import org.springframework.stereotype.Component;

@Component
public class CarroFamiliar extends Carro {
    @Override
    public String getTipo() {
        return "Carro Familiar";
    }
}
