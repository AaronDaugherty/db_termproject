package STD.termproject.Spotifate.repository;

import STD.termproject.Spotifate.model.Data_by_years;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_by_yearsRepository extends CrudRepository<Data_by_years, Long> {

}