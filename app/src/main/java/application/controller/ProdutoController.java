package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    public ProdutoRepository ProdutoRepo;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("produtos", ProdutoRepo.findAll())
        return "/produto/list";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "/produto/insert";
    }
}
