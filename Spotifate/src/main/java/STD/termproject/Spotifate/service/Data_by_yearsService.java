package STD.termproject.Spotifate.service;

import STD.termproject.Spotifate.model.Data_by_years;
import STD.termproject.Spotifate.repository.Data_by_yearsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Data_by_yearsService implements IData_by_yearsService {

    @Autowired
    private Data_by_yearsRepository repository;

    @Override
    public List<Data_by_years> findAll() {

        return (List<Data_by_years>) repository.findAll();
    }
}