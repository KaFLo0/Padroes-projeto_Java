package io.padraoprojeto.veiculo.fabrica;

import io.padraoprojeto.veiculo.model.CarroEsportivo;
import io.padraoprojeto.veiculo.model.CarroFamiliar;
import io.padraoprojeto.veiculo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetorCarro {
    private final CarroEsportivo carroEsportivo;
    private final CarroFamiliar carroFamiliar;

    @Autowired
    public SetorCarro(CarroEsportivo carroEsportivo, CarroFamiliar carroFamiliar) {
        this.carroEsportivo = carroEsportivo;
        this.carroFamiliar = carroFamiliar;
    }

    public Veiculo criarCarroEsportivo() {
        return carroEsportivo;
    }

    public Veiculo criarCarroFamiliar() {
        return carroFamiliar;
    }
}
