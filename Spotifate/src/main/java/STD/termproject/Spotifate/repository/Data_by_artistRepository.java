package STD.termproject.Spotifate.repository;

import STD.termproject.Spotifate.model.Data_by_artist;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Data_by_artistRepository extends CrudRepository<Data_by_artist, Long> {

    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> artists_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> genres_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> acoustic_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> count_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> dance_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> duration_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> energy_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> instrumental_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> key_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> liveness_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> loudness_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> mode_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> popularity_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> speechiness_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> tempo_like(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence LIKE %?1%", nativeQuery=true)
    List<Data_by_artist> valence_like(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> artists_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> genres_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> acoustic_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> count_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> dance_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> duration_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> energy_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> instrumental_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> key_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> liveness_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> loudness_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> mode_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> popularity_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> speechiness_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> tempo_starts_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence LIKE ?1%", nativeQuery=true)
    List<Data_by_artist> valence_starts_with(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists LIKE %?1", nativeQuery=true)
    List<Data_by_artist> artists_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres LIKE %?1", nativeQuery=true)
    List<Data_by_artist> genres_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness LIKE %?1", nativeQuery=true)
    List<Data_by_artist> acoustic_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count LIKE %?1", nativeQuery=true)
    List<Data_by_artist> count_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability LIKE %?1", nativeQuery=true)
    List<Data_by_artist> dance_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms LIKE %?1", nativeQuery=true)
    List<Data_by_artist> duration_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy LIKE %?1", nativeQuery=true)
    List<Data_by_artist> energy_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness LIKE %?1", nativeQuery=true)
    List<Data_by_artist> instrumental_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val LIKE %?1", nativeQuery=true)
    List<Data_by_artist> key_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness LIKE %?1", nativeQuery=true)
    List<Data_by_artist> liveness_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness LIKE %?1", nativeQuery=true)
    List<Data_by_artist> loudness_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode LIKE %?1", nativeQuery=true)
    List<Data_by_artist> mode_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity LIKE %?1", nativeQuery=true)
    List<Data_by_artist> popularity_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness LIKE %?1", nativeQuery=true)
    List<Data_by_artist> speechiness_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo LIKE %?1", nativeQuery=true)
    List<Data_by_artist> tempo_ends_with(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence LIKE %?1", nativeQuery=true)
    List<Data_by_artist> valence_ends_with(String search);
      

    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists = ?1", nativeQuery=true)
    List<Data_by_artist> artists_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres = ?1", nativeQuery=true)
    List<Data_by_artist> genres_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness = ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count = ?1", nativeQuery=true)
    List<Data_by_artist> count_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability = ?1", nativeQuery=true)
    List<Data_by_artist> dance_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms = ?1", nativeQuery=true)
    List<Data_by_artist> duration_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy = ?1", nativeQuery=true)
    List<Data_by_artist> energy_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness = ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val = ?1", nativeQuery=true)
    List<Data_by_artist> key_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness = ?1", nativeQuery=true)
    List<Data_by_artist> liveness_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness = ?1", nativeQuery=true)
    List<Data_by_artist> loudness_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode = ?1", nativeQuery=true)
    List<Data_by_artist> mode_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity = ?1", nativeQuery=true)
    List<Data_by_artist> popularity_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness = ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo = ?1", nativeQuery=true)
    List<Data_by_artist> tempo_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence = ?1", nativeQuery=true)
    List<Data_by_artist> valence_equal(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists <> ?1", nativeQuery=true)
    List<Data_by_artist> artists_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres <> ?1", nativeQuery=true)
    List<Data_by_artist> genres_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness <> ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count <> ?1", nativeQuery=true)
    List<Data_by_artist> count_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability <> ?1", nativeQuery=true)
    List<Data_by_artist> dance_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms <> ?1", nativeQuery=true)
    List<Data_by_artist> duration_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy <> ?1", nativeQuery=true)
    List<Data_by_artist> energy_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness <> ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val <> ?1", nativeQuery=true)
    List<Data_by_artist> key_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness <> ?1", nativeQuery=true)
    List<Data_by_artist> liveness_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness <> ?1", nativeQuery=true)
    List<Data_by_artist> loudness_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode <> ?1", nativeQuery=true)
    List<Data_by_artist> mode_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity <> ?1", nativeQuery=true)
    List<Data_by_artist> popularity_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness <> ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo <> ?1", nativeQuery=true)
    List<Data_by_artist> tempo_notequal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence <> ?1", nativeQuery=true)
    List<Data_by_artist> valence_notequal(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists < ?1", nativeQuery=true)
    List<Data_by_artist> artists_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres < ?1", nativeQuery=true)
    List<Data_by_artist> genres_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness < ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count < ?1", nativeQuery=true)
    List<Data_by_artist> count_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability < ?1", nativeQuery=true)
    List<Data_by_artist> dance_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms < ?1", nativeQuery=true)
    List<Data_by_artist> duration_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy < ?1", nativeQuery=true)
    List<Data_by_artist> energy_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness < ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val < ?1", nativeQuery=true)
    List<Data_by_artist> key_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness < ?1", nativeQuery=true)
    List<Data_by_artist> liveness_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness < ?1", nativeQuery=true)
    List<Data_by_artist> loudness_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode < ?1", nativeQuery=true)
    List<Data_by_artist> mode_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity < ?1", nativeQuery=true)
    List<Data_by_artist> popularity_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness < ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo < ?1", nativeQuery=true)
    List<Data_by_artist> tempo_lessthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence < ?1", nativeQuery=true)
    List<Data_by_artist> valence_lessthan(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists <= ?1", nativeQuery=true)
    List<Data_by_artist> artists_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres <= ?1", nativeQuery=true)
    List<Data_by_artist> genres_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness <= ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count <= ?1", nativeQuery=true)
    List<Data_by_artist> count_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability <= ?1", nativeQuery=true)
    List<Data_by_artist> dance_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms <= ?1", nativeQuery=true)
    List<Data_by_artist> duration_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy <= ?1", nativeQuery=true)
    List<Data_by_artist> energy_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness <= ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val <= ?1", nativeQuery=true)
    List<Data_by_artist> key_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness <= ?1", nativeQuery=true)
    List<Data_by_artist> liveness_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness <= ?1", nativeQuery=true)
    List<Data_by_artist> loudness_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode <= ?1", nativeQuery=true)
    List<Data_by_artist> mode_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity <= ?1", nativeQuery=true)
    List<Data_by_artist> popularity_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness <= ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo <= ?1", nativeQuery=true)
    List<Data_by_artist> tempo_lessthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence <= ?1", nativeQuery=true)
    List<Data_by_artist> valence_lessthan_or_equal(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists > ?1", nativeQuery=true)
    List<Data_by_artist> artists_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres > ?1", nativeQuery=true)
    List<Data_by_artist> genres_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness > ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count > ?1", nativeQuery=true)
    List<Data_by_artist> count_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability > ?1", nativeQuery=true)
    List<Data_by_artist> dance_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms > ?1", nativeQuery=true)
    List<Data_by_artist> duration_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy > ?1", nativeQuery=true)
    List<Data_by_artist> energy_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness > ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val > ?1", nativeQuery=true)
    List<Data_by_artist> key_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness > ?1", nativeQuery=true)
    List<Data_by_artist> liveness_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness > ?1", nativeQuery=true)
    List<Data_by_artist> loudness_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode > ?1", nativeQuery=true)
    List<Data_by_artist> mode_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity > ?1", nativeQuery=true)
    List<Data_by_artist> popularity_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness > ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo > ?1", nativeQuery=true)
    List<Data_by_artist> tempo_greaterthan(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence > ?1", nativeQuery=true)
    List<Data_by_artist> valence_greaterthan(String search);


    @Query(value="SELECT * FROM data_by_artist u WHERE u.artists >= ?1", nativeQuery=true)
    List<Data_by_artist> artists_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.genres >= ?1", nativeQuery=true)
    List<Data_by_artist> genres_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.acousticness >= ?1", nativeQuery=true)
    List<Data_by_artist> acoustic_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.count >= ?1", nativeQuery=true)
    List<Data_by_artist> count_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.danceability >= ?1", nativeQuery=true)
    List<Data_by_artist> dance_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.duration_ms >= ?1", nativeQuery=true)
    List<Data_by_artist> duration_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.energy >= ?1", nativeQuery=true)
    List<Data_by_artist> energy_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.instrumentalness >= ?1", nativeQuery=true)
    List<Data_by_artist> instrumental_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.key_val >= ?1", nativeQuery=true)
    List<Data_by_artist> key_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.liveness >= ?1", nativeQuery=true)
    List<Data_by_artist> liveness_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.loudness >= ?1", nativeQuery=true)
    List<Data_by_artist> loudness_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.mode >= ?1", nativeQuery=true)
    List<Data_by_artist> mode_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.popularity >= ?1", nativeQuery=true)
    List<Data_by_artist> popularity_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.speechiness >= ?1", nativeQuery=true)
    List<Data_by_artist> speechiness_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.tempo >= ?1", nativeQuery=true)
    List<Data_by_artist> tempo_greaterthan_or_equal(String search);
    @Query(value="SELECT * FROM data_by_artist u WHERE u.valence >= ?1", nativeQuery=true)
    List<Data_by_artist> valence_greaterthan_or_equal(String search);
}