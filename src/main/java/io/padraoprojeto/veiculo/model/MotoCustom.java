package io.padraoprojeto.veiculo.model;

import org.springframework.stereotype.Component;

@Component
public class MotoCustom extends Moto {
    @Override
    public String getTipo() {
        return "Moto Custom";
    }
}