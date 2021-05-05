package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_genres;
import java.util.List;

public interface IData_by_genresService {

    List<Data_by_genres> findAll();

    List<Data_by_genres> genres_like(String search);
    List<Data_by_genres> acoustic_like(String search);
    List<Data_by_genres> count_like(String search);
    List<Data_by_genres> dance_like(String search);
    List<Data_by_genres> duration_like(String search);
    List<Data_by_genres> energy_like(String search);
    List<Data_by_genres> instrumental_like(String search);
    List<Data_by_genres> key_like(String search);
    List<Data_by_genres> liveness_like(String search);
    List<Data_by_genres> loudness_like(String search);
    List<Data_by_genres> mode_like(String search);
    List<Data_by_genres> popularity_like(String search);
    List<Data_by_genres> speechiness_like(String search);
    List<Data_by_genres> tempo_like(String search);
    List<Data_by_genres> valence_like(String search);

    List<Data_by_genres> genres_equal(String search);
    List<Data_by_genres> acoustic_equal(String search);
    List<Data_by_genres> count_equal(String search);
    List<Data_by_genres> dance_equal(String search);
    List<Data_by_genres> duration_equal(String search);
    List<Data_by_genres> energy_equal(String search);
    List<Data_by_genres> instrumental_equal(String search);
    List<Data_by_genres> key_equal(String search);
    List<Data_by_genres> liveness_equal(String search);
    List<Data_by_genres> loudness_equal(String search);
    List<Data_by_genres> mode_equal(String search);
    List<Data_by_genres> popularity_equal(String search);
    List<Data_by_genres> speechiness_equal(String search);
    List<Data_by_genres> tempo_equal(String search);
    List<Data_by_genres> valence_equal(String search);

    List<Data_by_genres> genres_notequal(String search);
    List<Data_by_genres> acoustic_notequal(String search);
    List<Data_by_genres> count_notequal(String search);
    List<Data_by_genres> dance_notequal(String search);
    List<Data_by_genres> duration_notequal(String search);
    List<Data_by_genres> energy_notequal(String search);
    List<Data_by_genres> instrumental_notequal(String search);
    List<Data_by_genres> key_notequal(String search);
    List<Data_by_genres> liveness_notequal(String search);
    List<Data_by_genres> loudness_notequal(String search);
    List<Data_by_genres> mode_notequal(String search);
    List<Data_by_genres> popularity_notequal(String search);
    List<Data_by_genres> speechiness_notequal(String search);
    List<Data_by_genres> tempo_notequal(String search);
    List<Data_by_genres> valence_notequal(String search);

    List<Data_by_genres> genres_lessthan(String search);
    List<Data_by_genres> acoustic_lessthan(String search);
    List<Data_by_genres> count_lessthan(String search);
    List<Data_by_genres> dance_lessthan(String search);
    List<Data_by_genres> duration_lessthan(String search);
    List<Data_by_genres> energy_lessthan(String search);
    List<Data_by_genres> instrumental_lessthan(String search);
    List<Data_by_genres> key_lessthan(String search);
    List<Data_by_genres> liveness_lessthan(String search);
    List<Data_by_genres> loudness_lessthan(String search);
    List<Data_by_genres> mode_lessthan(String search);
    List<Data_by_genres> popularity_lessthan(String search);
    List<Data_by_genres> speechiness_lessthan(String search);
    List<Data_by_genres> tempo_lessthan(String search);
    List<Data_by_genres> valence_lessthan(String search);

    List<Data_by_genres> genres_lessthan_or_equal(String search);
    List<Data_by_genres> acoustic_lessthan_or_equal(String search);
    List<Data_by_genres> count_lessthan_or_equal(String search);
    List<Data_by_genres> dance_lessthan_or_equal(String search);
    List<Data_by_genres> duration_lessthan_or_equal(String search);
    List<Data_by_genres> energy_lessthan_or_equal(String search);
    List<Data_by_genres> instrumental_lessthan_or_equal(String search);
    List<Data_by_genres> key_lessthan_or_equal(String search);
    List<Data_by_genres> liveness_lessthan_or_equal(String search);
    List<Data_by_genres> loudness_lessthan_or_equal(String search);
    List<Data_by_genres> mode_lessthan_or_equal(String search);
    List<Data_by_genres> popularity_lessthan_or_equal(String search);
    List<Data_by_genres> speechiness_lessthan_or_equal(String search);
    List<Data_by_genres> tempo_lessthan_or_equal(String search);
    List<Data_by_genres> valence_lessthan_or_equal(String search);

    List<Data_by_genres> genres_greaterthan(String search);
    List<Data_by_genres> acoustic_greaterthan(String search);
    List<Data_by_genres> count_greaterthan(String search);
    List<Data_by_genres> dance_greaterthan(String search);
    List<Data_by_genres> duration_greaterthan(String search);
    List<Data_by_genres> energy_greaterthan(String search);
    List<Data_by_genres> instrumental_greaterthan(String search);
    List<Data_by_genres> key_greaterthan(String search);
    List<Data_by_genres> liveness_greaterthan(String search);
    List<Data_by_genres> loudness_greaterthan(String search);
    List<Data_by_genres> mode_greaterthan(String search);
    List<Data_by_genres> popularity_greaterthan(String search);
    List<Data_by_genres> speechiness_greaterthan(String search);
    List<Data_by_genres> tempo_greaterthan(String search);
    List<Data_by_genres> valence_greaterthan(String search);

    List<Data_by_genres> genres_greaterthan_or_equal(String search);
    List<Data_by_genres> acoustic_greaterthan_or_equal(String search);
    List<Data_by_genres> count_greaterthan_or_equal(String search);
    List<Data_by_genres> dance_greaterthan_or_equal(String search);
    List<Data_by_genres> duration_greaterthan_or_equal(String search);
    List<Data_by_genres> energy_greaterthan_or_equal(String search);
    List<Data_by_genres> instrumental_greaterthan_or_equal(String search);
    List<Data_by_genres> key_greaterthan_or_equal(String search);
    List<Data_by_genres> liveness_greaterthan_or_equal(String search);
    List<Data_by_genres> loudness_greaterthan_or_equal(String search);
    List<Data_by_genres> mode_greaterthan_or_equal(String search);
    List<Data_by_genres> popularity_greaterthan_or_equal(String search);
    List<Data_by_genres> speechiness_greaterthan_or_equal(String search);
    List<Data_by_genres> tempo_greaterthan_or_equal(String search);
    List<Data_by_genres> valence_greaterthan_or_equal(String search);

}
