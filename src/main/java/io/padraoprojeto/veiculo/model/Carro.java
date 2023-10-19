package io.padraoprojeto.veiculo.model;

public abstract class Carro implements Veiculo {
    @Override
    public String getTipo() {
        return "Carro";
    }
}
