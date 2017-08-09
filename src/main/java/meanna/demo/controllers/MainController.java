package meanna.demo.controllers;

import meanna.demo.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/songform")
    public String loadSongFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/songform")
    public String processSongFromPage(@Valid Song song, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "songform";
        }
        return "confirmsong";
    }

}
