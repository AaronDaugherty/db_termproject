package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_tracks;
import STD.termproject.Spotifate.repository.Data_by_tracksRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_tracksService implements IData_by_tracksService {

    @Autowired
    private Data_by_tracksRepository repository;

    @Override
    public List<Data_by_tracks> findAll() {

        return (List<Data_by_tracks>) repository.findAll();
    }
}