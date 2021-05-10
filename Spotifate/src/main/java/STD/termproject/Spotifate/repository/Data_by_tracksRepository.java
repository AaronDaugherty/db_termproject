package STD.termproject.Spotifate.repository;

import STD.termproject.Spotifate.model.Data_by_tracks;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Data_by_tracksRepository extends CrudRepository<Data_by_tracks, Long> {

    @Query(value="SELECT * FROM data_o u WHERE u.id LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> id_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.year LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> year_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.name LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> name_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> explicit_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> artists_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> release_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> acoustic_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> dance_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> duration_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> energy_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> instrumental_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> key_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> liveness_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> loudness_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> mode_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> popularity_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> speechiness_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> tempo_like(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> valence_like(String search);


    @Query(value="SELECT * FROM data_o u WHERE u.id LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> id_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.year LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> year_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.name LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> name_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> explicit_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> artists_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> release_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> acoustic_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> dance_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> duration_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> energy_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> instrumental_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> key_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> liveness_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> loudness_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> mode_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> popularity_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> speechiness_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> tempo_starts_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence LIKE ?1%", nativeQuery=true)
    List<Data_by_tracks> valence_starts_with(String search);


    @Query(value="SELECT * FROM data_o u WHERE u.id LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> id_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.year LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> year_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.name LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> name_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> explicit_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> artists_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> release_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> dance_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> duration_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> energy_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> key_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> liveness_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> loudness_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> mode_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> popularity_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> tempo_ends_with(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence LIKE %?1", nativeQuery=true)
    List<Data_by_tracks> valence_ends_with(String search);
      

    @Query(value="SELECT * FROM data_o u WHERE u.id = ?1", nativeQuery=true)
    List<Data_by_tracks> id_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.year = ?1", nativeQuery=true)
    List<Data_by_tracks> year_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.name = ?1", nativeQuery=true)
    List<Data_by_tracks> name_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit = ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists = ?1", nativeQuery=true)
    List<Data_by_tracks> artists_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date = ?1", nativeQuery=true)
    List<Data_by_tracks> release_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness = ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability = ?1", nativeQuery=true)
    List<Data_by_tracks> dance_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms = ?1", nativeQuery=true)
    List<Data_by_tracks> duration_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy = ?1", nativeQuery=true)
    List<Data_by_tracks> energy_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness = ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val = ?1", nativeQuery=true)
    List<Data_by_tracks> key_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness = ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness = ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode = ?1", nativeQuery=true)
    List<Data_by_tracks> mode_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity = ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness = ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo = ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_equal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence = ?1", nativeQuery=true)
    List<Data_by_tracks> valence_equal(String search);


    @Query(value="SELECT * FROM data_o u WHERE u.id <> ?1", nativeQuery=true)
    List<Data_by_tracks> id_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.year <> ?1", nativeQuery=true)
    List<Data_by_tracks> year_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.name <> ?1", nativeQuery=true)
    List<Data_by_tracks> name_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit <> ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists <> ?1", nativeQuery=true)
    List<Data_by_tracks> artists_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date <> ?1", nativeQuery=true)
    List<Data_by_tracks> release_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness <> ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability <> ?1", nativeQuery=true)
    List<Data_by_tracks> dance_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms <> ?1", nativeQuery=true)
    List<Data_by_tracks> duration_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy <> ?1", nativeQuery=true)
    List<Data_by_tracks> energy_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness <> ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val <> ?1", nativeQuery=true)
    List<Data_by_tracks> key_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness <> ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness <> ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode <> ?1", nativeQuery=true)
    List<Data_by_tracks> mode_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity <> ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness <> ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo <> ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_notequal(String search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence <> ?1", nativeQuery=true)
    List<Data_by_tracks> valence_notequal(String search);


    @Query(value="SELECT * FROM data_o u WHERE u.id < ?1", nativeQuery=true)
    List<Data_by_tracks> id_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.year < ?1", nativeQuery=true)
    List<Data_by_tracks> year_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.name < ?1", nativeQuery=true)
    List<Data_by_tracks> name_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit < ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists LIKE %?1%", nativeQuery=true)
    List<Data_by_tracks> artists_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date < ?1", nativeQuery=true)
    List<Data_by_tracks> release_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness < ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability < ?1", nativeQuery=true)
    List<Data_by_tracks> dance_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms < ?1", nativeQuery=true)
    List<Data_by_tracks> duration_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy < ?1", nativeQuery=true)
    List<Data_by_tracks> energy_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness < ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val < ?1", nativeQuery=true)
    List<Data_by_tracks> key_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness < ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness < ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode < ?1", nativeQuery=true)
    List<Data_by_tracks> mode_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity < ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness < ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo < ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_lessthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence < ?1", nativeQuery=true)
    List<Data_by_tracks> valence_lessthan(Float search);


    @Query(value="SELECT * FROM data_o u WHERE u.id <= ?1", nativeQuery=true)
    List<Data_by_tracks> id_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.year <= ?1", nativeQuery=true)
    List<Data_by_tracks> year_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.name <= ?1", nativeQuery=true)
    List<Data_by_tracks> name_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit <= ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists <= ?1", nativeQuery=true)
    List<Data_by_tracks> artists_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date <= ?1", nativeQuery=true)
    List<Data_by_tracks> release_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness <= ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability <= ?1", nativeQuery=true)
    List<Data_by_tracks> dance_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms <= ?1", nativeQuery=true)
    List<Data_by_tracks> duration_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy <= ?1", nativeQuery=true)
    List<Data_by_tracks> energy_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness <= ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val <= ?1", nativeQuery=true)
    List<Data_by_tracks> key_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness <= ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness <= ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode <= ?1", nativeQuery=true)
    List<Data_by_tracks> mode_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity <= ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness <= ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo <= ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_lessthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence <= ?1", nativeQuery=true)
    List<Data_by_tracks> valence_lessthan_or_equal(Float search);


    @Query(value="SELECT * FROM data_o u WHERE u.id > ?1", nativeQuery=true)
    List<Data_by_tracks> id_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.year > ?1", nativeQuery=true)
    List<Data_by_tracks> year_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.name > ?1", nativeQuery=true)
    List<Data_by_tracks> name_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit > ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists > ?1", nativeQuery=true)
    List<Data_by_tracks> artists_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date > ?1", nativeQuery=true)
    List<Data_by_tracks> release_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness > ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability > ?1", nativeQuery=true)
    List<Data_by_tracks> dance_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms > ?1", nativeQuery=true)
    List<Data_by_tracks> duration_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy > ?1", nativeQuery=true)
    List<Data_by_tracks> energy_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness > ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val > ?1", nativeQuery=true)
    List<Data_by_tracks> key_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness > ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness > ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode > ?1", nativeQuery=true)
    List<Data_by_tracks> mode_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity > ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness > ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo > ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_greaterthan(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence > ?1", nativeQuery=true)
    List<Data_by_tracks> valence_greaterthan(Float search);


    @Query(value="SELECT * FROM data_o u WHERE u.id >= ?1", nativeQuery=true)
    List<Data_by_tracks> id_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.year >= ?1", nativeQuery=true)
    List<Data_by_tracks> year_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.name >= ?1", nativeQuery=true)
    List<Data_by_tracks> name_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.explicit >= ?1", nativeQuery=true)
    List<Data_by_tracks> explicit_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.artists >= ?1", nativeQuery=true)
    List<Data_by_tracks> artists_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.release_date >= ?1", nativeQuery=true)
    List<Data_by_tracks> release_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.acousticness >= ?1", nativeQuery=true)
    List<Data_by_tracks> acoustic_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.danceability >= ?1", nativeQuery=true)
    List<Data_by_tracks> dance_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.duration_ms >= ?1", nativeQuery=true)
    List<Data_by_tracks> duration_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.energy >= ?1", nativeQuery=true)
    List<Data_by_tracks> energy_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.instrumentalness >= ?1", nativeQuery=true)
    List<Data_by_tracks> instrumental_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.key_val >= ?1", nativeQuery=true)
    List<Data_by_tracks> key_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.liveness >= ?1", nativeQuery=true)
    List<Data_by_tracks> liveness_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.loudness >= ?1", nativeQuery=true)
    List<Data_by_tracks> loudness_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.mode >= ?1", nativeQuery=true)
    List<Data_by_tracks> mode_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.popularity >= ?1", nativeQuery=true)
    List<Data_by_tracks> popularity_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.speechiness >= ?1", nativeQuery=true)
    List<Data_by_tracks> speechiness_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.tempo >= ?1", nativeQuery=true)
    List<Data_by_tracks> tempo_greaterthan_or_equal(Float search);
    @Query(value="SELECT * FROM data_o u WHERE u.valence >= ?1", nativeQuery=true)
    List<Data_by_tracks> valence_greaterthan_or_equal(Float search);
}