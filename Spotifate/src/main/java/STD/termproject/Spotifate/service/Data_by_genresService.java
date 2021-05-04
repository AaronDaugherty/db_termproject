package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_genres;
import STD.termproject.Spotifate.repository.Data_by_genresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_genresService implements IData_by_genresService {

    @Autowired
    private Data_by_genresRepository repository;

    @Override
    public List<Data_by_genres> findAll() {

        return (List<Data_by_genres>) repository.findAll();
    }
}