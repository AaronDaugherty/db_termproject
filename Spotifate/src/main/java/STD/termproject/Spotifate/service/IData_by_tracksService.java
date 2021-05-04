package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_tracks;
import java.util.List;

public interface IData_by_tracksService {

    List<Data_by_tracks> findAll();
}