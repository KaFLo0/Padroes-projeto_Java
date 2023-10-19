package io.padraoprojeto.veiculo.service;

import io.padraoprojeto.veiculo.fabrica.SetorCarro;
import io.padraoprojeto.veiculo.fabrica.SetorMoto;
import io.padraoprojeto.veiculo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    private final SetorCarro setorCarro;
    private final SetorMoto setorMoto;

    @Autowired
    public VeiculoService(SetorCarro setorCarro, SetorMoto setorMoto) {
        this.setorCarro = setorCarro;
        this.setorMoto = setorMoto;
    }

    public Veiculo criarCarroEsportivo() {
        return setorCarro.criarCarroEsportivo();
    }

    public Veiculo criarCarroFamiliar() {
        return setorCarro.criarCarroFamiliar();
    }

    public Veiculo criarScooter() {
        return setorMoto.criarScooter();
    }

    public Veiculo criarMotoCustom() {
        return setorMoto.criarMotoCustom();
    }
}
