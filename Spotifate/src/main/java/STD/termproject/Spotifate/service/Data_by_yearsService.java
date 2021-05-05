package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_years;
import STD.termproject.Spotifate.repository.Data_by_yearsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_yearsService implements IData_by_yearsService {

    @Autowired
    private Data_by_yearsRepository repository;

    @Override
    public List<Data_by_years> findAll() {
        return (List<Data_by_years>) repository.findAll();
    }




    @Override
    public List<Data_by_years> years_like(String search) {
        var data = (List<Data_by_years>) repository.years_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_like(String search) {
        var data = (List<Data_by_years>) repository.acoustic_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_like(String search) {
        var data = (List<Data_by_years>) repository.count_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_like(String search) {
        var data = (List<Data_by_years>) repository.dance_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_like(String search) {
        var data = (List<Data_by_years>) repository.duration_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_like(String search) {
        var data = (List<Data_by_years>) repository.energy_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_like(String search) {
        var data = (List<Data_by_years>) repository.instrumental_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_like(String search) {
        var data = (List<Data_by_years>) repository.key_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_like(String search) {
        var data = (List<Data_by_years>) repository.liveness_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_like(String search) {
        var data = (List<Data_by_years>) repository.loudness_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_like(String search) {
        var data = (List<Data_by_years>) repository.mode_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_like(String search) {
        var data = (List<Data_by_years>) repository.popularity_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_like(String search) {
        var data = (List<Data_by_years>) repository.speechiness_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_like(String search) {
        var data = (List<Data_by_years>) repository.tempo_like(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_like(String search) {
        var data = (List<Data_by_years>) repository.valence_like(search);
        return data;
    }




    @Override
    public List<Data_by_years> years_starts_with(String search) {
        var data = (List<Data_by_years>) repository.years_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_starts_with(String search) {
        var data = (List<Data_by_years>) repository.acoustic_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_starts_with(String search) {
        var data = (List<Data_by_years>) repository.count_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_starts_with(String search) {
        var data = (List<Data_by_years>) repository.dance_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_starts_with(String search) {
        var data = (List<Data_by_years>) repository.duration_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_starts_with(String search) {
        var data = (List<Data_by_years>) repository.energy_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_starts_with(String search) {
        var data = (List<Data_by_years>) repository.instrumental_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_starts_with(String search) {
        var data = (List<Data_by_years>) repository.key_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_starts_with(String search) {
        var data = (List<Data_by_years>) repository.liveness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_starts_with(String search) {
        var data = (List<Data_by_years>) repository.loudness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_starts_with(String search) {
        var data = (List<Data_by_years>) repository.mode_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_starts_with(String search) {
        var data = (List<Data_by_years>) repository.popularity_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_starts_with(String search) {
        var data = (List<Data_by_years>) repository.speechiness_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_starts_with(String search) {
        var data = (List<Data_by_years>) repository.tempo_starts_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_starts_with(String search) {
        var data = (List<Data_by_years>) repository.valence_starts_with(search);
        return data;
    }




    @Override
    public List<Data_by_years> years_ends_with(String search) {
        var data = (List<Data_by_years>) repository.years_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_ends_with(String search) {
        var data = (List<Data_by_years>) repository.acoustic_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_ends_with(String search) {
        var data = (List<Data_by_years>) repository.count_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_ends_with(String search) {
        var data = (List<Data_by_years>) repository.dance_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_ends_with(String search) {
        var data = (List<Data_by_years>) repository.duration_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_ends_with(String search) {
        var data = (List<Data_by_years>) repository.energy_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_ends_with(String search) {
        var data = (List<Data_by_years>) repository.instrumental_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_ends_with(String search) {
        var data = (List<Data_by_years>) repository.key_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_ends_with(String search) {
        var data = (List<Data_by_years>) repository.liveness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_ends_with(String search) {
        var data = (List<Data_by_years>) repository.loudness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_ends_with(String search) {
        var data = (List<Data_by_years>) repository.mode_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_ends_with(String search) {
        var data = (List<Data_by_years>) repository.popularity_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_ends_with(String search) {
        var data = (List<Data_by_years>) repository.speechiness_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_ends_with(String search) {
        var data = (List<Data_by_years>) repository.tempo_ends_with(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_ends_with(String search) {
        var data = (List<Data_by_years>) repository.valence_ends_with(search);
        return data;
    }




    @Override
    public List<Data_by_years> years_equal(String search) {
        var data = (List<Data_by_years>) repository.years_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_equal(String search) {
        var data = (List<Data_by_years>) repository.acoustic_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_equal(String search) {
        var data = (List<Data_by_years>) repository.count_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_equal(String search) {
        var data = (List<Data_by_years>) repository.dance_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_equal(String search) {
        var data = (List<Data_by_years>) repository.duration_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_equal(String search) {
        var data = (List<Data_by_years>) repository.energy_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_equal(String search) {
        var data = (List<Data_by_years>) repository.instrumental_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_equal(String search) {
        var data = (List<Data_by_years>) repository.key_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_equal(String search) {
        var data = (List<Data_by_years>) repository.liveness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_equal(String search) {
        var data = (List<Data_by_years>) repository.loudness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_equal(String search) {
        var data = (List<Data_by_years>) repository.mode_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_equal(String search) {
        var data = (List<Data_by_years>) repository.popularity_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_equal(String search) {
        var data = (List<Data_by_years>) repository.speechiness_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_equal(String search) {
        var data = (List<Data_by_years>) repository.tempo_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_equal(String search) {
        var data = (List<Data_by_years>) repository.valence_equal(search);
        return data;
    }



    @Override
    public List<Data_by_years> years_notequal(String search) {
        var data = (List<Data_by_years>) repository.years_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_notequal(String search) {
        var data = (List<Data_by_years>) repository.acoustic_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_notequal(String search) {
        var data = (List<Data_by_years>) repository.count_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_notequal(String search) {
        var data = (List<Data_by_years>) repository.dance_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_notequal(String search) {
        var data = (List<Data_by_years>) repository.duration_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_notequal(String search) {
        var data = (List<Data_by_years>) repository.energy_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_notequal(String search) {
        var data = (List<Data_by_years>) repository.instrumental_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_notequal(String search) {
        var data = (List<Data_by_years>) repository.key_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_notequal(String search) {
        var data = (List<Data_by_years>) repository.liveness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_notequal(String search) {
        var data = (List<Data_by_years>) repository.loudness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_notequal(String search) {
        var data = (List<Data_by_years>) repository.mode_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_notequal(String search) {
        var data = (List<Data_by_years>) repository.popularity_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_notequal(String search) {
        var data = (List<Data_by_years>) repository.speechiness_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_notequal(String search) {
        var data = (List<Data_by_years>) repository.tempo_notequal(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_notequal(String search) {
        var data = (List<Data_by_years>) repository.valence_notequal(search);
        return data;
    }



    @Override
    public List<Data_by_years> years_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.years_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.acoustic_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.count_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.dance_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.duration_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.energy_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.instrumental_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.key_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.liveness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.loudness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.mode_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.popularity_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.speechiness_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.tempo_lessthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_lessthan(Float search) {
        var data = (List<Data_by_years>) repository.valence_lessthan(search);
        return data;
    }



    @Override
    public List<Data_by_years> years_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.years_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.acoustic_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.count_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.dance_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.duration_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.energy_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.instrumental_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.key_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.liveness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.loudness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.mode_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.popularity_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.speechiness_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.tempo_lessthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_lessthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.valence_lessthan_or_equal(search);
        return data;
    }




    @Override
    public List<Data_by_years> years_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.years_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.acoustic_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.count_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.dance_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.duration_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.energy_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.instrumental_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.key_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.liveness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.loudness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.mode_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.popularity_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.speechiness_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.tempo_greaterthan(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_greaterthan(Float search) {
        var data = (List<Data_by_years>) repository.valence_greaterthan(search);
        return data;
    }



    @Override
    public List<Data_by_years> years_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.years_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> acoustic_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.acoustic_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> count_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.count_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> dance_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.dance_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> duration_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.duration_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> energy_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.energy_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> instrumental_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.instrumental_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> key_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.key_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> liveness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.liveness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> loudness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.loudness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> mode_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.mode_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> popularity_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.popularity_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> speechiness_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.speechiness_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> tempo_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.tempo_greaterthan_or_equal(search);
        return data;
    }
    @Override
    public List<Data_by_years> valence_greaterthan_or_equal(Float search) {
        var data = (List<Data_by_years>) repository.valence_greaterthan_or_equal(search);
        return data;
    }

}