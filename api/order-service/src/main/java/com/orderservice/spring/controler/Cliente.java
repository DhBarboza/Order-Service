package com.orderservice.spring.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.spring.domain.model.ClienteModel;

@RestController
public class Cliente {
	
	@GetMapping("/clientes")
	public List<ClienteModel> listar() {
		var cliente1 = new ClienteModel();
		cliente1.setId(1L);
		cliente1.setNome("Douglas");
		cliente1.setEmail("douglasdeveloper@gmail.com");
		cliente1.setTelefone("12 99799-9999");
		
		var cliente2 = new ClienteModel();
		cliente2.setId(2L);
		cliente2.setNome("Henrique");
		cliente2.setEmail("henriquedeveloper@gmail.com");
		cliente2.setTelefone("12 99799-9991");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
