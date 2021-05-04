package STD.termproject.Spotifate.controller;

import STD.termproject.Spotifate.model.Data_by_artist;
import STD.termproject.Spotifate.service.IData_by_artistService;
import STD.termproject.Spotifate.model.Data_by_genres;
import STD.termproject.Spotifate.service.IData_by_genresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private IData_by_artistService Data_by_artistService;

    @GetMapping("/artists")
    public String findArtists(Model model) {

        var data = (List<Data_by_artist>) Data_by_artistService.findAll();

        model.addAttribute("data", data);

        return "showArtists";

    }

    @Autowired
    private IData_by_genresService Data_by_genresService;
      @GetMapping("/genres")
    public String findGenres(Model model) {

        var data = (List<Data_by_genres>) Data_by_genresService.findAll();

        model.addAttribute("data", data);

        return "showGenres";

    }
}