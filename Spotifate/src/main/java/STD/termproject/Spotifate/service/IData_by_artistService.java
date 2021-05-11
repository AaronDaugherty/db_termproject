package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_artist;
import java.util.List;


/**
*@author Garrett
*@param Description IData_by_artistService defines all of the lists for artist queries
*
*/
public interface IData_by_artistService {

    List<Data_by_artist> findAll();

    List<Data_by_artist> artists_like(String search);
    List<Data_by_artist> genres_like(String search);
    List<Data_by_artist> acoustic_like(String search);
    List<Data_by_artist> count_like(String search);
    List<Data_by_artist> dance_like(String search);
    List<Data_by_artist> duration_like(String search);
    List<Data_by_artist> energy_like(String search);
    List<Data_by_artist> instrumental_like(String search);
    List<Data_by_artist> key_like(String search);
    List<Data_by_artist> liveness_like(String search);
    List<Data_by_artist> loudness_like(String search);
    List<Data_by_artist> mode_like(String search);
    List<Data_by_artist> popularity_like(String search);
    List<Data_by_artist> speechiness_like(String search);
    List<Data_by_artist> tempo_like(String search);
    List<Data_by_artist> valence_like(String search);

    List<Data_by_artist> artists_starts_with(String search);
    List<Data_by_artist> genres_starts_with(String search);
    List<Data_by_artist> acoustic_starts_with(String search);
    List<Data_by_artist> count_starts_with(String search);
    List<Data_by_artist> dance_starts_with(String search);
    List<Data_by_artist> duration_starts_with(String search);
    List<Data_by_artist> energy_starts_with(String search);
    List<Data_by_artist> instrumental_starts_with(String search);
    List<Data_by_artist> key_starts_with(String search);
    List<Data_by_artist> liveness_starts_with(String search);
    List<Data_by_artist> loudness_starts_with(String search);
    List<Data_by_artist> mode_starts_with(String search);
    List<Data_by_artist> popularity_starts_with(String search);
    List<Data_by_artist> speechiness_starts_with(String search);
    List<Data_by_artist> tempo_starts_with(String search);
    List<Data_by_artist> valence_starts_with(String search);

    List<Data_by_artist> artists_ends_with(String search);
    List<Data_by_artist> genres_ends_with(String search);
    List<Data_by_artist> acoustic_ends_with(String search);
    List<Data_by_artist> count_ends_with(String search);
    List<Data_by_artist> dance_ends_with(String search);
    List<Data_by_artist> duration_ends_with(String search);
    List<Data_by_artist> energy_ends_with(String search);
    List<Data_by_artist> instrumental_ends_with(String search);
    List<Data_by_artist> key_ends_with(String search);
    List<Data_by_artist> liveness_ends_with(String search);
    List<Data_by_artist> loudness_ends_with(String search);
    List<Data_by_artist> mode_ends_with(String search);
    List<Data_by_artist> popularity_ends_with(String search);
    List<Data_by_artist> speechiness_ends_with(String search);
    List<Data_by_artist> tempo_ends_with(String search);
    List<Data_by_artist> valence_ends_with(String search);

    List<Data_by_artist> artists_equal(String search);
    List<Data_by_artist> genres_equal(String search);
    List<Data_by_artist> acoustic_equal(String search);
    List<Data_by_artist> count_equal(String search);
    List<Data_by_artist> dance_equal(String search);
    List<Data_by_artist> duration_equal(String search);
    List<Data_by_artist> energy_equal(String search);
    List<Data_by_artist> instrumental_equal(String search);
    List<Data_by_artist> key_equal(String search);
    List<Data_by_artist> liveness_equal(String search);
    List<Data_by_artist> loudness_equal(String search);
    List<Data_by_artist> mode_equal(String search);
    List<Data_by_artist> popularity_equal(String search);
    List<Data_by_artist> speechiness_equal(String search);
    List<Data_by_artist> tempo_equal(String search);
    List<Data_by_artist> valence_equal(String search);

    List<Data_by_artist> artists_notequal(String search);
    List<Data_by_artist> genres_notequal(String search);
    List<Data_by_artist> acoustic_notequal(String search);
    List<Data_by_artist> count_notequal(String search);
    List<Data_by_artist> dance_notequal(String search);
    List<Data_by_artist> duration_notequal(String search);
    List<Data_by_artist> energy_notequal(String search);
    List<Data_by_artist> instrumental_notequal(String search);
    List<Data_by_artist> key_notequal(String search);
    List<Data_by_artist> liveness_notequal(String search);
    List<Data_by_artist> loudness_notequal(String search);
    List<Data_by_artist> mode_notequal(String search);
    List<Data_by_artist> popularity_notequal(String search);
    List<Data_by_artist> speechiness_notequal(String search);
    List<Data_by_artist> tempo_notequal(String search);
    List<Data_by_artist> valence_notequal(String search);

    List<Data_by_artist> artists_lessthan(Float search);
    List<Data_by_artist> genres_lessthan(Float search);
    List<Data_by_artist> acoustic_lessthan(Float search);
    List<Data_by_artist> count_lessthan(Float search);
    List<Data_by_artist> dance_lessthan(Float search);
    List<Data_by_artist> duration_lessthan(Float search);
    List<Data_by_artist> energy_lessthan(Float search);
    List<Data_by_artist> instrumental_lessthan(Float search);
    List<Data_by_artist> key_lessthan(Float search);
    List<Data_by_artist> liveness_lessthan(Float search);
    List<Data_by_artist> loudness_lessthan(Float search);
    List<Data_by_artist> mode_lessthan(Float search);
    List<Data_by_artist> popularity_lessthan(Float search);
    List<Data_by_artist> speechiness_lessthan(Float search);
    List<Data_by_artist> tempo_lessthan(Float search);
    List<Data_by_artist> valence_lessthan(Float search);

    List<Data_by_artist> artists_lessthan_or_equal(Float search);
    List<Data_by_artist> genres_lessthan_or_equal(Float search);
    List<Data_by_artist> acoustic_lessthan_or_equal(Float search);
    List<Data_by_artist> count_lessthan_or_equal(Float search);
    List<Data_by_artist> dance_lessthan_or_equal(Float search);
    List<Data_by_artist> duration_lessthan_or_equal(Float search);
    List<Data_by_artist> energy_lessthan_or_equal(Float search);
    List<Data_by_artist> instrumental_lessthan_or_equal(Float search);
    List<Data_by_artist> key_lessthan_or_equal(Float search);
    List<Data_by_artist> liveness_lessthan_or_equal(Float search);
    List<Data_by_artist> loudness_lessthan_or_equal(Float search);
    List<Data_by_artist> mode_lessthan_or_equal(Float search);
    List<Data_by_artist> popularity_lessthan_or_equal(Float search);
    List<Data_by_artist> speechiness_lessthan_or_equal(Float search);
    List<Data_by_artist> tempo_lessthan_or_equal(Float search);
    List<Data_by_artist> valence_lessthan_or_equal(Float search);

    List<Data_by_artist> artists_greaterthan(Float search);
    List<Data_by_artist> genres_greaterthan(Float search);
    List<Data_by_artist> acoustic_greaterthan(Float search);
    List<Data_by_artist> count_greaterthan(Float search);
    List<Data_by_artist> dance_greaterthan(Float search);
    List<Data_by_artist> duration_greaterthan(Float search);
    List<Data_by_artist> energy_greaterthan(Float search);
    List<Data_by_artist> instrumental_greaterthan(Float search);
    List<Data_by_artist> key_greaterthan(Float search);
    List<Data_by_artist> liveness_greaterthan(Float search);
    List<Data_by_artist> loudness_greaterthan(Float search);
    List<Data_by_artist> mode_greaterthan(Float search);
    List<Data_by_artist> popularity_greaterthan(Float search);
    List<Data_by_artist> speechiness_greaterthan(Float search);
    List<Data_by_artist> tempo_greaterthan(Float search);
    List<Data_by_artist> valence_greaterthan(Float search);

    List<Data_by_artist> artists_greaterthan_or_equal(Float search);
    List<Data_by_artist> genres_greaterthan_or_equal(Float search);
    List<Data_by_artist> acoustic_greaterthan_or_equal(Float search);
    List<Data_by_artist> count_greaterthan_or_equal(Float search);
    List<Data_by_artist> dance_greaterthan_or_equal(Float search);
    List<Data_by_artist> duration_greaterthan_or_equal(Float search);
    List<Data_by_artist> energy_greaterthan_or_equal(Float search);
    List<Data_by_artist> instrumental_greaterthan_or_equal(Float search);
    List<Data_by_artist> key_greaterthan_or_equal(Float search);
    List<Data_by_artist> liveness_greaterthan_or_equal(Float search);
    List<Data_by_artist> loudness_greaterthan_or_equal(Float search);
    List<Data_by_artist> mode_greaterthan_or_equal(Float search);
    List<Data_by_artist> popularity_greaterthan_or_equal(Float search);
    List<Data_by_artist> speechiness_greaterthan_or_equal(Float search);
    List<Data_by_artist> tempo_greaterthan_or_equal(Float search);
    List<Data_by_artist> valence_greaterthan_or_equal(Float search);

}
