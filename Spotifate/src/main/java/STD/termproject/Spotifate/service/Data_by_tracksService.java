package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_tracks;
import STD.termproject.Spotifate.repository.Data_by_tracksRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_tracksService implements IData_by_tracksService {

    @Autowired
    private Data_by_tracksRepository repository;

    @Override
    public List<Data_by_tracks> findAll() {
        return (List<Data_by_tracks>) repository.findAll();
    }




    @Override
    public List<Data_by_tracks> id_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_like(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_like(String search) {
        var data = (List<Data_by_tracks>) repository.dance_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_like(String search) {
        var data = (List<Data_by_tracks>) repository.duration_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_like(String search) {
        var data = (List<Data_by_tracks>) repository.energy_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_like(String search) {
        var data = (List<Data_by_tracks>) repository.instrumental_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_like(String search) {
        var data = (List<Data_by_tracks>) repository.key_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_like(String search) {
        var data = (List<Data_by_tracks>) repository.liveness_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_like(String search) {
        var data = (List<Data_by_tracks>) repository.loudness_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_like(String search) {
        var data = (List<Data_by_tracks>) repository.mode_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_like(String search) {
        var data = (List<Data_by_tracks>) repository.popularity_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_like(String search) {
        var data = (List<Data_by_tracks>) repository.speechiness_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_like(String search) {
        var data = (List<Data_by_tracks>) repository.tempo_like(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_like(String search) {
        var data = (List<Data_by_tracks>) repository.valence_like(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.id_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.year_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.name_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.artists_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.explicit_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.release_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.dance_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.duration_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.energy_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.instrumental_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.key_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.liveness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.loudness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.mode_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.popularity_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.speechiness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.tempo_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_starts_with(String search) {
        var data = (List<Data_by_tracks>) repository.valence_starts_with(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.id_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.year_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.name_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.artists_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.explicit_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.release_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.dance_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.duration_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.energy_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.instrumental_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.key_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.liveness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.loudness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.mode_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.popularity_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.speechiness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.tempo_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_ends_with(String search) {
        var data = (List<Data_by_tracks>) repository.valence_ends_with(search);
        return data;
    }






    @Override
    public List<Data_by_tracks> id_equal(String search) {
        var data = (List<Data_by_tracks>) repository.id_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_equal(String search) {
        var data = (List<Data_by_tracks>) repository.year_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_equal(String search) {
        var data = (List<Data_by_tracks>) repository.name_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_equal(String search) {
        var data = (List<Data_by_tracks>) repository.artists_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_equal(String search) {
        var data = (List<Data_by_tracks>) repository.explicit_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_equal(String search) {
        var data = (List<Data_by_tracks>) repository.release_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_equal(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_equal(String search) {
        var data = (List<Data_by_tracks>) repository.dance_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_equal(String search) {
        var data = (List<Data_by_tracks>) repository.duration_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_equal(String search) {
        var data = (List<Data_by_tracks>) repository.energy_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_equal(String search) {
        var data = (List<Data_by_tracks>) repository.instrumental_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_equal(String search) {
        var data = (List<Data_by_tracks>) repository.key_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_equal(String search) {
        var data = (List<Data_by_tracks>) repository.liveness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_equal(String search) {
        var data = (List<Data_by_tracks>) repository.loudness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_equal(String search) {
        var data = (List<Data_by_tracks>) repository.mode_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_equal(String search) {
        var data = (List<Data_by_tracks>) repository.popularity_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_equal(String search) {
        var data = (List<Data_by_tracks>) repository.speechiness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_equal(String search) {
        var data = (List<Data_by_tracks>) repository.tempo_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_equal(String search) {
        var data = (List<Data_by_tracks>) repository.valence_equal(search);
        return data;
    }






    @Override
    public List<Data_by_tracks> id_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.id_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.year_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.name_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.artists_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.explicit_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.release_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.acoustic_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.dance_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.duration_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.energy_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.instrumental_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.key_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.liveness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.loudness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.mode_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.popularity_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.speechiness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.tempo_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_notequal(String search) {
        var data = (List<Data_by_tracks>) repository.valence_notequal(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.id_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.year_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.name_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.artists_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.explicit_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.release_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.acoustic_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.dance_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.duration_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.energy_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.instrumental_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.key_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.liveness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.loudness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.mode_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.popularity_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.speechiness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.tempo_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_lessthan(Float search) {
        var data = (List<Data_by_tracks>) repository.valence_lessthan(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.id_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.year_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.name_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.artists_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.explicit_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.release_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.acoustic_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.dance_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.duration_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.energy_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.instrumental_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.key_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.liveness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.loudness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.mode_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.popularity_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.speechiness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.tempo_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_lessthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.valence_lessthan_or_equal(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.id_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.year_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.name_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.artists_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.explicit_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.release_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.acoustic_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.dance_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.duration_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.energy_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.instrumental_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.key_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.liveness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.loudness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.mode_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.popularity_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.speechiness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.tempo_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_greaterthan(Float search) {
        var data = (List<Data_by_tracks>) repository.valence_greaterthan(search);
        return data;
    }





    @Override
    public List<Data_by_tracks> id_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.id_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> year_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.year_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> name_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.name_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> artists_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.artists_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> explicit_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.explicit_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> release_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.release_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> acoustic_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.acoustic_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> dance_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.dance_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> duration_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.duration_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> energy_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.energy_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> instrumental_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.instrumental_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> key_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.key_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> liveness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.liveness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> loudness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.loudness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> mode_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.mode_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> popularity_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.popularity_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> speechiness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.speechiness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> tempo_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.tempo_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_tracks> valence_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_tracks>) repository.valence_greaterthan_or_equal(search);
        return data;
    }

}

