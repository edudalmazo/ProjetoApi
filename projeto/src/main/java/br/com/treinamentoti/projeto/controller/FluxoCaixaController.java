package br.com.treinamentoti.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamentoti.projeto.dao.FluxoCaixaDao;
import br.com.treinamentoti.projeto.model.FluxoCaixa;

@RestController
public class FluxoCaixaController {

	@Autowired
	private FluxoCaixaDao dao;
	
	@GetMapping("/fluxocaixa")
	
	public ArrayList<FluxoCaixa> recuperarTudo(){
		ArrayList<FluxoCaixa> lista;
		lista=(ArrayList<FluxoCaixa>)dao.findAll();
		return lista;
	}
}
