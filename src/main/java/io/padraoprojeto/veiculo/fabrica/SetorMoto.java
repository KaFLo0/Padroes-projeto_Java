package io.padraoprojeto.veiculo.fabrica;

import io.padraoprojeto.veiculo.model.MotoCustom;
import io.padraoprojeto.veiculo.model.Scooter;
import io.padraoprojeto.veiculo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetorMoto {
    private final Scooter scooter;
    private final MotoCustom motoCustom;

    @Autowired
    public SetorMoto(Scooter scooter, MotoCustom motoCustom) {
        this.scooter = scooter;
        this.motoCustom = motoCustom;
    }

    public Veiculo criarScooter() {
        return scooter;
    }

    public Veiculo criarMotoCustom() {
        return motoCustom;
    }
}
