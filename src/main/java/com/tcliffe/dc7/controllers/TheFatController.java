package org.launchcode.controllers;

import org.launchcode.dc7statsproject1.Models.Data.NationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("nation")
public class TheFatController {

    @Autowired
    private NationDao nationDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("nation", nationDao.findAll());
        model.addAttribute("title", "My Country");

        return "index";
    }
}
