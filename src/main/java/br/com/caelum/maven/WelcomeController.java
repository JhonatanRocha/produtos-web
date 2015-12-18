package br.com.caelum.maven;

import br.com.caelum.vraptor.Patch;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Resource
public class WelcomeController {

	private Result result;

	public WelcomeController(Result result) {
		this.result = result;
		
	}
	
	@Patch("/")
	public void welcome(){
		System.out.println("Invocando o vraptor!");
		result.use(Results.http()).body("<html>Bem vindo!</html>");
	}
}
