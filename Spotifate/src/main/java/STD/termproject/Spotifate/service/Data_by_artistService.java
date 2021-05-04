package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_artist;
import STD.termproject.Spotifate.repository.Data_by_artistRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_artistService implements IData_by_artistService {

    @Autowired
    private Data_by_artistRepository repository;

    @Override
    public List<Data_by_artist> findAll() {

        return (List<Data_by_artist>) repository.findAll();
    }
}