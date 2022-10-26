package br.com.tiago.mvc.Lojavirtual.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tiago.mvc.Lojavirtual.model.Pedido;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {

		Pedido pedido = new Pedido();

		pedido.setNomeProduto("Notebook");
		pedido.setDescricaoDoproduto("NOTEBOOK SAMSUNG GALAXY BOOK GO 4GB 128GB 14'' WIN 11 PRO, Prata");
		pedido.setImgDoProduto("https://m.media-amazon.com/images/I/71e+BYPrsvL._AC_SL1500_.jpg");
		List<Pedido> pedidos = Arrays.asList(pedido);

		model.addAttribute("pedidos", pedidos);

		return "home";

	}
}
