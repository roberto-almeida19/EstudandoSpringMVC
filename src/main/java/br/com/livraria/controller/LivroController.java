package br.com.livraria.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.livraria.dao.LivroDAO;
import br.com.livraria.model.Livro;

@Controller
@Transactional
public class LivroController {
	

    @RequestMapping("/livros/form")
    public String form() {
        return "livros/form";
    }
    @Autowired(required=true)
    private LivroDAO livroDAO;

    @RequestMapping("*/form/salvar")
    public String gravar(Livro livro) {
        System.out.println(livro);
        livroDAO.gravar(livro);

        return "livros/ok";
    }
}
