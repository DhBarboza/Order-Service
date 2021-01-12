package com.devbarboza.orderservice.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbarboza.orderservice.domain.model.Cliente;

@RestController
public class ClienteControl {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Douglas");
		cliente1.setTelefone("99799-9999");
		cliente1.setEmail("teste@teste.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Henrique");
		cliente2.setTelefone("99799-9991");
		cliente2.setEmail("teste1@teste.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
