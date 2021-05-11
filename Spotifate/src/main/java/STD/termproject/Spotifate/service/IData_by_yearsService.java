package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_years;
import java.util.List;

public interface IData_by_yearsService {

    /**
*@author Garrett
*@param Description IData_by_yearsService defines all of the lists for years queries
*
*/

    List<Data_by_years> findAll();

    List<Data_by_years> years_like(String search);
    List<Data_by_years> acoustic_like(String search);
    List<Data_by_years> count_like(String search);
    List<Data_by_years> dance_like(String search);
    List<Data_by_years> duration_like(String search);
    List<Data_by_years> energy_like(String search);
    List<Data_by_years> instrumental_like(String search);
    List<Data_by_years> key_like(String search);
    List<Data_by_years> liveness_like(String search);
    List<Data_by_years> loudness_like(String search);
    List<Data_by_years> mode_like(String search);
    List<Data_by_years> popularity_like(String search);
    List<Data_by_years> speechiness_like(String search);
    List<Data_by_years> tempo_like(String search);
    List<Data_by_years> valence_like(String search);

    List<Data_by_years> years_starts_with(String search);
    List<Data_by_years> acoustic_starts_with(String search);
    List<Data_by_years> count_starts_with(String search);
    List<Data_by_years> dance_starts_with(String search);
    List<Data_by_years> duration_starts_with(String search);
    List<Data_by_years> energy_starts_with(String search);
    List<Data_by_years> instrumental_starts_with(String search);
    List<Data_by_years> key_starts_with(String search);
    List<Data_by_years> liveness_starts_with(String search);
    List<Data_by_years> loudness_starts_with(String search);
    List<Data_by_years> mode_starts_with(String search);
    List<Data_by_years> popularity_starts_with(String search);
    List<Data_by_years> speechiness_starts_with(String search);
    List<Data_by_years> tempo_starts_with(String search);
    List<Data_by_years> valence_starts_with(String search);

    List<Data_by_years> years_ends_with(String search);
    List<Data_by_years> acoustic_ends_with(String search);
    List<Data_by_years> count_ends_with(String search);
    List<Data_by_years> dance_ends_with(String search);
    List<Data_by_years> duration_ends_with(String search);
    List<Data_by_years> energy_ends_with(String search);
    List<Data_by_years> instrumental_ends_with(String search);
    List<Data_by_years> key_ends_with(String search);
    List<Data_by_years> liveness_ends_with(String search);
    List<Data_by_years> loudness_ends_with(String search);
    List<Data_by_years> mode_ends_with(String search);
    List<Data_by_years> popularity_ends_with(String search);
    List<Data_by_years> speechiness_ends_with(String search);
    List<Data_by_years> tempo_ends_with(String search);
    List<Data_by_years> valence_ends_with(String search);

    List<Data_by_years> years_equal(String search);
    List<Data_by_years> acoustic_equal(String search);
    List<Data_by_years> count_equal(String search);
    List<Data_by_years> dance_equal(String search);
    List<Data_by_years> duration_equal(String search);
    List<Data_by_years> energy_equal(String search);
    List<Data_by_years> instrumental_equal(String search);
    List<Data_by_years> key_equal(String search);
    List<Data_by_years> liveness_equal(String search);
    List<Data_by_years> loudness_equal(String search);
    List<Data_by_years> mode_equal(String search);
    List<Data_by_years> popularity_equal(String search);
    List<Data_by_years> speechiness_equal(String search);
    List<Data_by_years> tempo_equal(String search);
    List<Data_by_years> valence_equal(String search);

    List<Data_by_years> years_notequal(String search);
    List<Data_by_years> acoustic_notequal(String search);
    List<Data_by_years> count_notequal(String search);
    List<Data_by_years> dance_notequal(String search);
    List<Data_by_years> duration_notequal(String search);
    List<Data_by_years> energy_notequal(String search);
    List<Data_by_years> instrumental_notequal(String search);
    List<Data_by_years> key_notequal(String search);
    List<Data_by_years> liveness_notequal(String search);
    List<Data_by_years> loudness_notequal(String search);
    List<Data_by_years> mode_notequal(String search);
    List<Data_by_years> popularity_notequal(String search);
    List<Data_by_years> speechiness_notequal(String search);
    List<Data_by_years> tempo_notequal(String search);
    List<Data_by_years> valence_notequal(String search);

    List<Data_by_years> years_lessthan(Float search);
    List<Data_by_years> acoustic_lessthan(Float search);
    List<Data_by_years> count_lessthan(Float search);
    List<Data_by_years> dance_lessthan(Float search);
    List<Data_by_years> duration_lessthan(Float search);
    List<Data_by_years> energy_lessthan(Float search);
    List<Data_by_years> instrumental_lessthan(Float search);
    List<Data_by_years> key_lessthan(Float search);
    List<Data_by_years> liveness_lessthan(Float search);
    List<Data_by_years> loudness_lessthan(Float search);
    List<Data_by_years> mode_lessthan(Float search);
    List<Data_by_years> popularity_lessthan(Float search);
    List<Data_by_years> speechiness_lessthan(Float search);
    List<Data_by_years> tempo_lessthan(Float search);
    List<Data_by_years> valence_lessthan(Float search);

    List<Data_by_years> years_lessthan_or_equal(Float search);
    List<Data_by_years> acoustic_lessthan_or_equal(Float search);
    List<Data_by_years> count_lessthan_or_equal(Float search);
    List<Data_by_years> dance_lessthan_or_equal(Float search);
    List<Data_by_years> duration_lessthan_or_equal(Float search);
    List<Data_by_years> energy_lessthan_or_equal(Float search);
    List<Data_by_years> instrumental_lessthan_or_equal(Float search);
    List<Data_by_years> key_lessthan_or_equal(Float search);
    List<Data_by_years> liveness_lessthan_or_equal(Float search);
    List<Data_by_years> loudness_lessthan_or_equal(Float search);
    List<Data_by_years> mode_lessthan_or_equal(Float search);
    List<Data_by_years> popularity_lessthan_or_equal(Float search);
    List<Data_by_years> speechiness_lessthan_or_equal(Float search);
    List<Data_by_years> tempo_lessthan_or_equal(Float search);
    List<Data_by_years> valence_lessthan_or_equal(Float search);

    List<Data_by_years> years_greaterthan(Float search);
    List<Data_by_years> acoustic_greaterthan(Float search);
    List<Data_by_years> count_greaterthan(Float search);
    List<Data_by_years> dance_greaterthan(Float search);
    List<Data_by_years> duration_greaterthan(Float search);
    List<Data_by_years> energy_greaterthan(Float search);
    List<Data_by_years> instrumental_greaterthan(Float search);
    List<Data_by_years> key_greaterthan(Float search);
    List<Data_by_years> liveness_greaterthan(Float search);
    List<Data_by_years> loudness_greaterthan(Float search);
    List<Data_by_years> mode_greaterthan(Float search);
    List<Data_by_years> popularity_greaterthan(Float search);
    List<Data_by_years> speechiness_greaterthan(Float search);
    List<Data_by_years> tempo_greaterthan(Float search);
    List<Data_by_years> valence_greaterthan(Float search);

    List<Data_by_years> years_greaterthan_or_equal(Float search);
    List<Data_by_years> acoustic_greaterthan_or_equal(Float search);
    List<Data_by_years> count_greaterthan_or_equal(Float search);
    List<Data_by_years> dance_greaterthan_or_equal(Float search);
    List<Data_by_years> duration_greaterthan_or_equal(Float search);
    List<Data_by_years> energy_greaterthan_or_equal(Float search);
    List<Data_by_years> instrumental_greaterthan_or_equal(Float search);
    List<Data_by_years> key_greaterthan_or_equal(Float search);
    List<Data_by_years> liveness_greaterthan_or_equal(Float search);
    List<Data_by_years> loudness_greaterthan_or_equal(Float search);
    List<Data_by_years> mode_greaterthan_or_equal(Float search);
    List<Data_by_years> popularity_greaterthan_or_equal(Float search);
    List<Data_by_years> speechiness_greaterthan_or_equal(Float search);
    List<Data_by_years> tempo_greaterthan_or_equal(Float search);
    List<Data_by_years> valence_greaterthan_or_equal(Float search);

}
