/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP Notebook
 */
@Controller
public class WebController {
    
    @RequestMapping("/")
    public String home(){
    return "home";
    }
}   