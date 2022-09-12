package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//Guardando a lista de empresas
public class Banco {
	private static List<Empresa> lista = new ArrayList<>();
	
	//instanciando para iniciar o objeto com algo salvo
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adicionar(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
