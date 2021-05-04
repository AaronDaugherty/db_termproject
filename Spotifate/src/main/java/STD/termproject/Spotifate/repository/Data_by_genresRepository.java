package STD.termproject.Spotifate.repository;

import STD.termproject.Spotifate.model.Data_by_genres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_by_genresRepository extends CrudRepository<Data_by_genres, Long> {

}