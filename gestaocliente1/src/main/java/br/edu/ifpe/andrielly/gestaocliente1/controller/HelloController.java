package br.edu.ifpe.andrielly.gestaocliente1.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpe.andrielly.gestaocliente1.model.Cliente;
import br.edu.ifpe.andrielly.gestaocliente1.model.UnidadeFederativa;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
		
	}
	@GetMapping("/hello-servlet")
	public String hello1(HttpServletRequest request) {
		request.setAttribute("ifpe", "sou aluna do IFPE-Campus Palmares :)");
		return "hello";
		
	}
	@GetMapping("/hello-model")
	public ModelAndView hellow() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("ifpe", "Queridos alunos!!!!");
		return mv ;
	}
	@GetMapping("/hello-clientes")
	public ModelAndView cli() {
		Cliente cliente1 = new Cliente(1, "Andrielly", "Santa Lúzia", "Palmares", "PE");
		Cliente cliente2 = new Cliente(2, "Lavínia", "Coronel Isácio", "Palmares", "PE");
		Cliente cliente3 = new Cliente(3, "Mayara", "Cohab", "Catende" ,"PE");
		
		List<Object> clientes= Arrays.asList(cliente1.getCodigo(),cliente1.getNome(),cliente1.getEndereco(),
				cliente1.getCidade(),cliente1.getUf(),cliente2.getCodigo(),cliente2.getNome(),cliente2.getEndereco(),
				cliente2.getCidade(),cliente2.getUf(),cliente3.getCodigo(),cliente3.getNome(),cliente3.getEndereco(),
				cliente3.getCidade(),cliente3.getUf());
		
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("ifpe", clientes);
		
		return mv;
		
} 
	@GetMapping("hello-new")
	public ModelAndView novoCliente() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("unidadeFederativa", UnidadeFederativa.Acre.Amapa.Amazonas.Ceara.Maranhao.Para.Piaui.Rondonia.Roraima.Tocantins);
		return mv;
	}
}