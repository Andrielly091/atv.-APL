package br.edu.ifpe.andrielly.gestaocliente1.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpe.andrielly.gestaocliente1.model.Cliente;
import br.edu.ifpe.andrielly.gestaocliente1.model.UnidadeFederativa;

@Controller
public class ClienteController {
	
	@GetMapping("/clientes/new")
	public ModelAndView novoCliente() {
		ModelAndView mv = new ModelAndView("clientes/new");
		mv.addObject("unidadeFederativa", UnidadeFederativa.Acre.Amapa.Amazonas.Ceara.Maranhao.Para.Piaui.Rondonia.Roraima.Tocantins);
		return mv;
	}
		
	}
	


