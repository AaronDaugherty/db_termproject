package STD.termproject.Spotifate.repository;

import STD.termproject.Spotifate.model.Data_by_tracks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_by_tracksRepository extends CrudRepository<Data_by_tracks, Long> {

}