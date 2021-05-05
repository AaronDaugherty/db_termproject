package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_artist;
import STD.termproject.Spotifate.repository.Data_by_artistRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_artistService implements IData_by_artistService {

    @Autowired
    private Data_by_artistRepository repository;

    @Override
    public List<Data_by_artist> findAll() {
        return (List<Data_by_artist>) repository.findAll();
    }



    @Override
    public List<Data_by_artist> artists_like(String search) {
        var data = (List<Data_by_artist>) repository.artists_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_like(String search) {
        var data = (List<Data_by_artist>) repository.genres_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_like(String search) {
        var data = (List<Data_by_artist>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_like(String search) {
        var data = (List<Data_by_artist>) repository.count_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_like(String search) {
        var data = (List<Data_by_artist>) repository.dance_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_like(String search) {
        var data = (List<Data_by_artist>) repository.duration_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_like(String search) {
        var data = (List<Data_by_artist>) repository.energy_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_like(String search) {
        var data = (List<Data_by_artist>) repository.instrumental_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_like(String search) {
        var data = (List<Data_by_artist>) repository.key_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_like(String search) {
        var data = (List<Data_by_artist>) repository.liveness_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_like(String search) {
        var data = (List<Data_by_artist>) repository.loudness_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_like(String search) {
        var data = (List<Data_by_artist>) repository.mode_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_like(String search) {
        var data = (List<Data_by_artist>) repository.popularity_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_like(String search) {
        var data = (List<Data_by_artist>) repository.speechiness_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_like(String search) {
        var data = (List<Data_by_artist>) repository.tempo_like(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_like(String search) {
        var data = (List<Data_by_artist>) repository.valence_like(search);
        return data;
    }




    @Override
    public List<Data_by_artist> artists_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.artists_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.genres_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.acoustic_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.count_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.dance_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.duration_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.energy_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.instrumental_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.key_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.liveness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.loudness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.mode_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.popularity_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.speechiness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.tempo_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_starts_with(String search) {
        var data = (List<Data_by_artist>) repository.valence_starts_with(search);
        return data;
    }




    @Override
    public List<Data_by_artist> artists_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.artists_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.genres_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.acoustic_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.count_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.dance_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.duration_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.energy_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.instrumental_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.key_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.liveness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.loudness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.mode_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.popularity_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.speechiness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.tempo_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_ends_with(String search) {
        var data = (List<Data_by_artist>) repository.valence_ends_with(search);
        return data;
    }




    @Override
    public List<Data_by_artist> artists_equal(String search) {
        var data = (List<Data_by_artist>) repository.artists_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_equal(String search) {
        var data = (List<Data_by_artist>) repository.genres_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_equal(String search) {
        var data = (List<Data_by_artist>) repository.acoustic_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_equal(String search) {
        var data = (List<Data_by_artist>) repository.count_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_equal(String search) {
        var data = (List<Data_by_artist>) repository.dance_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_equal(String search) {
        var data = (List<Data_by_artist>) repository.duration_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_equal(String search) {
        var data = (List<Data_by_artist>) repository.energy_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_equal(String search) {
        var data = (List<Data_by_artist>) repository.instrumental_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_equal(String search) {
        var data = (List<Data_by_artist>) repository.key_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_equal(String search) {
        var data = (List<Data_by_artist>) repository.liveness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_equal(String search) {
        var data = (List<Data_by_artist>) repository.loudness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_equal(String search) {
        var data = (List<Data_by_artist>) repository.mode_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_equal(String search) {
        var data = (List<Data_by_artist>) repository.popularity_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_equal(String search) {
        var data = (List<Data_by_artist>) repository.speechiness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_equal(String search) {
        var data = (List<Data_by_artist>) repository.tempo_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_equal(String search) {
        var data = (List<Data_by_artist>) repository.valence_equal(search);
        return data;
    }



    @Override
    public List<Data_by_artist> artists_notequal(String search) {
        var data = (List<Data_by_artist>) repository.artists_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_notequal(String search) {
        var data = (List<Data_by_artist>) repository.genres_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_notequal(String search) {
        var data = (List<Data_by_artist>) repository.acoustic_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_notequal(String search) {
        var data = (List<Data_by_artist>) repository.count_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_notequal(String search) {
        var data = (List<Data_by_artist>) repository.dance_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_notequal(String search) {
        var data = (List<Data_by_artist>) repository.duration_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_notequal(String search) {
        var data = (List<Data_by_artist>) repository.energy_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_notequal(String search) {
        var data = (List<Data_by_artist>) repository.instrumental_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_notequal(String search) {
        var data = (List<Data_by_artist>) repository.key_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_notequal(String search) {
        var data = (List<Data_by_artist>) repository.liveness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_notequal(String search) {
        var data = (List<Data_by_artist>) repository.loudness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_notequal(String search) {
        var data = (List<Data_by_artist>) repository.mode_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_notequal(String search) {
        var data = (List<Data_by_artist>) repository.popularity_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_notequal(String search) {
        var data = (List<Data_by_artist>) repository.speechiness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_notequal(String search) {
        var data = (List<Data_by_artist>) repository.tempo_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_notequal(String search) {
        var data = (List<Data_by_artist>) repository.valence_notequal(search);
        return data;
    }



    @Override
    public List<Data_by_artist> artists_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.artists_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.genres_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.acoustic_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.count_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.dance_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.duration_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.energy_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.instrumental_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.key_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.liveness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.loudness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.mode_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.popularity_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.speechiness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.tempo_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_lessthan(Float search) {
        var data = (List<Data_by_artist>) repository.valence_lessthan(search);
        return data;
    }



    @Override
    public List<Data_by_artist> artists_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.artists_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.genres_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.acoustic_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.count_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.dance_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.duration_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.energy_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.instrumental_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.key_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.liveness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.loudness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.mode_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.popularity_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.speechiness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.tempo_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_lessthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.valence_lessthan_or_equal(search);
        return data;
    }




    @Override
    public List<Data_by_artist> artists_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.artists_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.genres_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.acoustic_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.count_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.dance_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.duration_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.energy_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.instrumental_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.key_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.liveness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.loudness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.mode_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.popularity_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.speechiness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.tempo_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_greaterthan(Float search) {
        var data = (List<Data_by_artist>) repository.valence_greaterthan(search);
        return data;
    }



    @Override
    public List<Data_by_artist> artists_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.artists_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> genres_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.genres_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> acoustic_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.acoustic_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> count_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.count_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> dance_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.dance_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> duration_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.duration_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> energy_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.energy_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> instrumental_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.instrumental_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> key_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.key_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> liveness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.liveness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> loudness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.loudness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> mode_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.mode_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> popularity_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.popularity_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> speechiness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.speechiness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> tempo_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.tempo_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_artist> valence_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_artist>) repository.valence_greaterthan_or_equal(search);
        return data;
    }

}

