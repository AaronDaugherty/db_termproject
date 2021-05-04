package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_artist;
import java.util.List;

public interface IData_by_artistService {

    List<Data_by_artist> findAll();
}