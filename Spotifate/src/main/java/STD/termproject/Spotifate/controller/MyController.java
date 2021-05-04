package STD.termproject.Spotifate.controller;

import STD.termproject.Spotifate.model.Data_by_artist;
import STD.termproject.Spotifate.service.IData_by_artistService;
import STD.termproject.Spotifate.model.Data_by_genres;
import STD.termproject.Spotifate.model.Query;
import STD.termproject.Spotifate.service.IData_by_genresService;
import STD.termproject.Spotifate.model.Data_by_years;
import STD.termproject.Spotifate.service.IData_by_yearsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/query")
    public String search(Query query, Model model) {

        //@Query(value="SELECT devname,hrs,ot FROM imaginaryTable",nativeQuery=true)
        //private List<Object> getValues();

        String toQuery = "SELECT " + query.getSelect() + " FROM " + query.getFrom() + " WHERE " + query.getWhere() + " " + query.getOperator() + " " + query.getSearch();
        System.out.println(toQuery);
/*
        @Query(value="SELECT %s FROM %s WHERE %s %s %s", 
            (query.getSelect(), query.getFrom(), query.getWhere(),
            query.getOperator(), query.getSearch()), nativeQuery=true)

        private List<Object> getValues();
*/
        return "showQuery";
    }


	
    @Autowired
    private IData_by_yearsService Data_by_yearsService;
      @GetMapping("/years")
    public String findYears(Model model) {

        var data = (List<Data_by_years>) Data_by_yearsService.findAll();

        model.addAttribute("data", data);

        return "showYears";

    }
}