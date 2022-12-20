package de.awacademy.zwitscher.kommentare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class KommentarfeldController {

    @Autowired
    private KommentarfeldService kommentarfeldService;

    @GetMapping("/kommentare")
    public String index(Model model) {
        model.addAttribute("kommentarfelder", kommentarfeldService.getKommentarfelder() );
        model.addAttribute("kommentarfeld", new Kommentarfeld("",""));
        return "kommentarseite.html";
    }

    @PostMapping("/neuerEintrag")
    public String neuerEintrag(Model model, @Valid @ModelAttribute Kommentarfeld kommentarfeld, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("kommentarfelder", kommentarfeldService.getKommentarfelder());
            model.addAttribute("kommentarfeld", new Kommentarfeld("",""));
            return "kommentarseite.html";
        }
        kommentarfeldService.addEintrag(kommentarfeld);
        return "redirect:/kommentare";
    }
}
