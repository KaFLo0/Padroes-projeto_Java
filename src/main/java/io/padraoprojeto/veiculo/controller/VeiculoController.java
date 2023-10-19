package io.padraoprojeto.veiculo.controller;

import ch.qos.logback.core.model.Model;
import io.padraoprojeto.veiculo.model.Veiculo;
import io.padraoprojeto.veiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping("/create/{vehicleType}/{subtype}")
    public ModelAndView createVehicle(@PathVariable String vehicleType, @PathVariable String subtype, Model model) {
        Veiculo veiculo = null;
        switch (vehicleType) {
            case "carro":
                if (subtype.equals("carroesportivo")) {
                    veiculo = veiculoService.criarCarroEsportivo();
                } else if (subtype.equals("carrofamiliar")) {
                    veiculo = veiculoService.criarCarroFamiliar();
                }
                break;
            case "moto":
                if (subtype.equals("scooter")) {
                    veiculo = veiculoService.criarScooter();
                } else if (subtype.equals("motocustom")) {
                    veiculo = veiculoService.criarMotoCustom();
                }
                break;
        }
        ModelAndView modelAndView;
        if (veiculo != null) {
            modelAndView = new ModelAndView("veiculo");
            modelAndView.addObject("veiculo", veiculo);
        } else {
            modelAndView = new ModelAndView("error");
            modelAndView.addObject("message", "Invalid request");
        }
        return modelAndView;
    }
}
