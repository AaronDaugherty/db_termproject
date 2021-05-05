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
import org.springframework.web.bind.annotation.RequestParam;



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

    @PostMapping("/genres-query")
    public String queryGenres(Model model, @RequestParam String search, @RequestParam String operator, @RequestParam String where) {

        if (operator.equals("LIKE")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_like(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("=")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }
            
            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_equal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<>")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_notequal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_lessthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_lessthan(search);
                model.addAttribute("data", data);
            }
        } 


        else if (operator.equals("<=")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_lessthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_lessthan_or_equal(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals(">")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_greaterthan(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_greaterthan(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals(">=")) {
            try{
                Float temp = Float.parseFloat(search);
                char firstChar = search.charAt(0);
                if ((temp < 1) && (firstChar == '.')) {
                    search = "0" + search;
                }
            }
            catch (NumberFormatException ex) {
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_greaterthan_or_equal(search);
                model.addAttribute("data", data);
            }
        }

        return "queryGenres";
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