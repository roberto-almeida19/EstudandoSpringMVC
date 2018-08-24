package br.com.livraria.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.livraria.model.Livro;


@Repository
@Transactional
public class LivroDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(Livro livro) {
        manager.persist(livro);
    }
}