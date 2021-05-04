package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_genres;
import java.util.List;

public interface IData_by_genresService {

    List<Data_by_genres> findAll();
}