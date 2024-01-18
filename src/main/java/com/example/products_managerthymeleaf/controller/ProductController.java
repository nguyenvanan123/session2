package com.example.products_managerthymeleaf.controller;

import com.example.products_managerthymeleaf.model.Product;
import com.example.products_managerthymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public String showhome( Model model) {
        List<Product> products = productService.getAllProducts();
        System.out.println (products );
        model.addAttribute ( products );
        return "/home";
    }


    @GetMapping("/add")
    public String showProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "/create";
    }

    @PostMapping("/create")
    public String createProduct( @ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        System.out.println(product);
        productService.createProduct(product);
        return "/home";

    }
    @GetMapping("/edit")
    public String update( @PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/update";
    }



}
