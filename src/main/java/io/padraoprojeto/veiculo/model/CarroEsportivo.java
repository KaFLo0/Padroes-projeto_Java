package io.padraoprojeto.veiculo.model;

import org.springframework.stereotype.Component;

@Component
public class CarroEsportivo extends Carro {
    @Override
    public String getTipo() {
        return "Carro Esportivo";
    }
}