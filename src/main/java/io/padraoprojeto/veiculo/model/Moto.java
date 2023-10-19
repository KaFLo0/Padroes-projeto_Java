package io.padraoprojeto.veiculo.model;

public abstract class Moto implements Veiculo {
    @Override
    public String getTipo() {
        return "Motocicleta";
    }
}
