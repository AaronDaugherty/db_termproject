package STD.termproject.Spotifate.controller;

import STD.termproject.Spotifate.model.Data_by_artist;
import STD.termproject.Spotifate.service.IData_by_artistService;
import STD.termproject.Spotifate.model.Data_by_genres;
import STD.termproject.Spotifate.service.IData_by_genresService;
import STD.termproject.Spotifate.model.Data_by_years;
import STD.termproject.Spotifate.service.IData_by_yearsService;
import STD.termproject.Spotifate.model.Data_by_tracks;
import STD.termproject.Spotifate.service.IData_by_tracksService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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


    @PostMapping("/artists-query")
    public String queryArtists(Model model, @RequestParam String search, @RequestParam String operator, @RequestParam String where, @RequestParam List<String> columns) {

        if (columns.isEmpty()) {
            return "ERROR: Please select at least one column";
        }

        if (operator.equals("LIKE")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_like(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("STARTS WITH")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_starts_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("ENDS WITH")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_ends_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("=")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_equal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<>")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_notequal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<")) {
            Float fSearch;

            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_lessthan(fSearch);
                model.addAttribute("data", data);
            }
        } 


        else if (operator.equals("<=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals(">")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_greaterthan(fSearch);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals(">=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_artist>) Data_by_artistService.genres_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) {
                var data = (List<Data_by_artist>) Data_by_artistService.artists_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.acoustic_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_artist>) Data_by_artistService.count_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_artist>) Data_by_artistService.dance_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_artist>) Data_by_artistService.duration_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_artist>) Data_by_artistService.energy_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.instrumental_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_artist>) Data_by_artistService.key_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.liveness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.loudness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_artist>) Data_by_artistService.mode_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_artist>) Data_by_artistService.popularity_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_artist>) Data_by_artistService.speechiness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_artist>) Data_by_artistService.tempo_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_artist>) Data_by_artistService.valence_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }

        model.addAttribute("columns", columns);

        return "queryArtists";
    }
    











    @Autowired
    private IData_by_yearsService Data_by_yearsService;
      @GetMapping("/years")
    public String findYears(Model model) {

        var data = (List<Data_by_years>) Data_by_yearsService.findAll();

        model.addAttribute("data", data);

        return "showYears";
    }


    @PostMapping("/years-query")
    public String queryYears(Model model, @RequestParam String search, @RequestParam String operator, @RequestParam String where, @RequestParam List<String> columns) {

        if (columns.isEmpty()) {
            return "ERROR: Please select at least one column";
        }

        if (operator.equals("LIKE")) {
            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_like(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("STARTS WITH")) {
            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_starts_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("ENDS WITH")) {
            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_ends_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("=")) {
            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_equal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<>")) {
            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_notequal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_lessthan(fSearch);
                model.addAttribute("data", data);
            }
        } 


        else if (operator.equals("<=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals(">")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_greaterthan(fSearch);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals(">=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("years")) {
                var data = (List<Data_by_years>) Data_by_yearsService.years_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.acoustic_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_years>) Data_by_yearsService.count_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_years>) Data_by_yearsService.dance_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_years>) Data_by_yearsService.duration_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_years>) Data_by_yearsService.energy_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.instrumental_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_years>) Data_by_yearsService.key_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.liveness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.loudness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_years>) Data_by_yearsService.mode_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_years>) Data_by_yearsService.popularity_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_years>) Data_by_yearsService.speechiness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_years>) Data_by_yearsService.tempo_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_years>) Data_by_yearsService.valence_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }

        model.addAttribute("columns", columns);

        return "queryYears";
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
    public String queryGenres(Model model, @RequestParam String search, @RequestParam String operator, @RequestParam String where, @RequestParam List<String> columns) {

        if (columns.isEmpty()) {
            return "ERROR: Please select at least one column";
        }

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


        else if (operator.equals("STARTS WITH")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_starts_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("ENDS WITH")) {
            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_ends_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("=")) {
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
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_lessthan(fSearch);
                model.addAttribute("data", data);
            }
        } 


        else if (operator.equals("<=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals(">")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_greaterthan(fSearch);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals(">=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("genres")) {
                var data = (List<Data_by_genres>) Data_by_genresService.genres_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acousticness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.acoustic_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("count")) {
                var data = (List<Data_by_genres>) Data_by_genresService.count_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("danceability")) {
                var data = (List<Data_by_genres>) Data_by_genresService.dance_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration")) {
                var data = (List<Data_by_genres>) Data_by_genresService.duration_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) {
                var data = (List<Data_by_genres>) Data_by_genresService.energy_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumentalness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.instrumental_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("keyval")) {
                var data = (List<Data_by_genres>) Data_by_genresService.key_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.liveness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.loudness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) {
                var data = (List<Data_by_genres>) Data_by_genresService.mode_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) {
                var data = (List<Data_by_genres>) Data_by_genresService.popularity_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) {
                var data = (List<Data_by_genres>) Data_by_genresService.speechiness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) {
                var data = (List<Data_by_genres>) Data_by_genresService.tempo_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) {
                var data = (List<Data_by_genres>) Data_by_genresService.valence_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }

        model.addAttribute("columns", columns);

        return "queryGenres";
    }








    @Autowired
    private IData_by_tracksService Data_by_tracksService;

    @GetMapping("/tracks")
    public String findTracks(Model model) {

        var data = (List<Data_by_tracks>) Data_by_tracksService.findAll();

        model.addAttribute("data", data);

        return "showTracks";
    }

    @PostMapping("/tracks-query")
    public String queryTracks(Model model, @RequestParam String search, @RequestParam String operator, @RequestParam String where, @RequestParam List<String> columns) {

        if (columns.isEmpty()) {
            return "ERROR: Please select at least one column";
        }

        if (operator.equals("LIKE")) {
            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_like(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_like(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("STARTS WITH")) {
            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_starts_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_starts_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("ENDS WITH")) {
            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_ends_with(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_ends_with(search);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals("=")) {
            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_equal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_equal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<>")) {
            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_notequal(search);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_notequal(search);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals("<")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_lessthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_lessthan(fSearch);
                model.addAttribute("data", data);
            }
        } 


        else if (operator.equals("<=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_lessthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }


        else if (operator.equals(">")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_greaterthan(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_greaterthan(fSearch);
                model.addAttribute("data", data);
            }
        }

        else if (operator.equals(">=")) {
            Float fSearch;
            try{
                fSearch = Float.parseFloat(search);
            }
            catch (NumberFormatException ex) {
                return "ERROR: Please use integer values for [<, >, <=, >=]";
            }

            if (where.equals("id")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.id_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("year")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.year_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("name")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.name_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("explicit")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.explicit_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("artists")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.artists_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("release_date")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.release_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("acoustic")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.acoustic_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("dance")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.dance_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("duration_ms")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.duration_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("energy")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.energy_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("instrumental")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.instrumental_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("key_val")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.key_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("liveness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.liveness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("loudness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.loudness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("mode")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.mode_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("popularity")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.popularity_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("speechiness")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.speechiness_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("tempo")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.tempo_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            } else if (where.equals("valence")) { 
                var data = (List<Data_by_tracks>) Data_by_tracksService.valence_greaterthan_or_equal(fSearch);
                model.addAttribute("data", data);
            }
        }

        model.addAttribute("columns", columns);

        return "queryTracks";
    }

}