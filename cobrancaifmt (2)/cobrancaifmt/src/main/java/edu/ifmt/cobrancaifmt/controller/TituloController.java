package edu.ifmt.cobrancaifmt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import edu.ifmt.cobrancaifmt.model.Titulo;
import edu.ifmt.cobrancaifmt.repository.TituloRepository;

@Controller
public class TituloController {

    @Autowired
    private TituloRepository tituloRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("dd/MM/yyyy"), true));
    }

    @GetMapping("/titulos/novo")
    public String novo() {
        return "CadastroTitulo";
    }

    @PostMapping("/titulos")
    public String salvar(Titulo titulo) {
        tituloRepository.save(titulo);
        return "redirect:/titulos/novo";
    }
}