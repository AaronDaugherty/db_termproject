package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_genres;
import STD.termproject.Spotifate.repository.Data_by_genresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_genresService implements IData_by_genresService {

    @Autowired
    private Data_by_genresRepository repository;

    @Override
    public List<Data_by_genres> findAll() {
        return (List<Data_by_genres>) repository.findAll();
    }




    @Override
    public List<Data_by_genres> genres_like(String search) {
        var data = (List<Data_by_genres>) repository.genres_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_like(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_like(String search) {
        var data = (List<Data_by_genres>) repository.count_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_like(String search) {
        var data = (List<Data_by_genres>) repository.dance_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_like(String search) {
        var data = (List<Data_by_genres>) repository.duration_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_like(String search) {
        var data = (List<Data_by_genres>) repository.energy_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_like(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_like(String search) {
        var data = (List<Data_by_genres>) repository.key_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_like(String search) {
        var data = (List<Data_by_genres>) repository.liveness_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_like(String search) {
        var data = (List<Data_by_genres>) repository.loudness_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_like(String search) {
        var data = (List<Data_by_genres>) repository.mode_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_like(String search) {
        var data = (List<Data_by_genres>) repository.popularity_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_like(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_like(String search) {
        var data = (List<Data_by_genres>) repository.tempo_like(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_like(String search) {
        var data = (List<Data_by_genres>) repository.valence_like(search);
        return data;
    }




    @Override
    public List<Data_by_genres> genres_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.genres_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.count_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.dance_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.duration_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.energy_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.key_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.liveness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.loudness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.mode_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.popularity_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.tempo_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_starts_with(String search) {
        var data = (List<Data_by_genres>) repository.valence_starts_with(search);
        return data;
    }




    @Override
    public List<Data_by_genres> genres_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.genres_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.count_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.dance_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.duration_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.energy_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.key_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.liveness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.loudness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.mode_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.popularity_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.tempo_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_ends_with(String search) {
        var data = (List<Data_by_genres>) repository.valence_ends_with(search);
        return data;
    }




    @Override
    public List<Data_by_genres> genres_equal(String search) {
        var data = (List<Data_by_genres>) repository.genres_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_equal(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_equal(String search) {
        var data = (List<Data_by_genres>) repository.count_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_equal(String search) {
        var data = (List<Data_by_genres>) repository.dance_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_equal(String search) {
        var data = (List<Data_by_genres>) repository.duration_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_equal(String search) {
        var data = (List<Data_by_genres>) repository.energy_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_equal(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_equal(String search) {
        var data = (List<Data_by_genres>) repository.key_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_equal(String search) {
        var data = (List<Data_by_genres>) repository.liveness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_equal(String search) {
        var data = (List<Data_by_genres>) repository.loudness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_equal(String search) {
        var data = (List<Data_by_genres>) repository.mode_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_equal(String search) {
        var data = (List<Data_by_genres>) repository.popularity_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_equal(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_equal(String search) {
        var data = (List<Data_by_genres>) repository.tempo_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_equal(String search) {
        var data = (List<Data_by_genres>) repository.valence_equal(search);
        return data;
    }



    @Override
    public List<Data_by_genres> genres_notequal(String search) {
        var data = (List<Data_by_genres>) repository.genres_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_notequal(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_notequal(String search) {
        var data = (List<Data_by_genres>) repository.count_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_notequal(String search) {
        var data = (List<Data_by_genres>) repository.dance_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_notequal(String search) {
        var data = (List<Data_by_genres>) repository.duration_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_notequal(String search) {
        var data = (List<Data_by_genres>) repository.energy_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_notequal(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_notequal(String search) {
        var data = (List<Data_by_genres>) repository.key_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_notequal(String search) {
        var data = (List<Data_by_genres>) repository.liveness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_notequal(String search) {
        var data = (List<Data_by_genres>) repository.loudness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_notequal(String search) {
        var data = (List<Data_by_genres>) repository.mode_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_notequal(String search) {
        var data = (List<Data_by_genres>) repository.popularity_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_notequal(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_notequal(String search) {
        var data = (List<Data_by_genres>) repository.tempo_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_notequal(String search) {
        var data = (List<Data_by_genres>) repository.valence_notequal(search);
        return data;
    }



    @Override
    public List<Data_by_genres> genres_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.genres_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.count_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.dance_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.duration_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.energy_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.key_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.liveness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.loudness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.mode_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.popularity_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.tempo_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_lessthan(String search) {
        var data = (List<Data_by_genres>) repository.valence_lessthan(search);
        return data;
    }



    @Override
    public List<Data_by_genres> genres_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.genres_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.count_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.dance_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.duration_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.energy_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.key_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.liveness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.loudness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.mode_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.popularity_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.tempo_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_lessthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.valence_lessthan_or_equal(search);
        return data;
    }




    @Override
    public List<Data_by_genres> genres_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.genres_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.count_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.dance_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.duration_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.energy_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.key_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.liveness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.loudness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.mode_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.popularity_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.tempo_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_greaterthan(String search) {
        var data = (List<Data_by_genres>) repository.valence_greaterthan(search);
        return data;
    }



    @Override
    public List<Data_by_genres> genres_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.genres_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> acoustic_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.acoustic_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> count_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.count_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> dance_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.dance_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> duration_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.duration_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> energy_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.energy_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> instrumental_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.instrumental_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> key_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.key_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> liveness_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.liveness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> loudness_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.loudness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> mode_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.mode_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> popularity_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.popularity_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> speechiness_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.speechiness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> tempo_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.tempo_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_genres> valence_greaterthan_or_equal(String search) {
        var data = (List<Data_by_genres>) repository.valence_greaterthan_or_equal(search);
        return data;
    }

}

