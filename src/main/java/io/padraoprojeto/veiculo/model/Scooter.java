package io.padraoprojeto.veiculo.model;

import org.springframework.stereotype.Component;

@Component
public class Scooter extends Moto {
    @Override
    public String getTipo() {
        return "Scooter";
    }
}
