package ru.krupanagri.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.krupanagri.model.Bisi;
import ru.krupanagri.repository.*;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class DataJpaBisiRepositoryImpl implements BisiRepository {

    @Autowired
    private CrudBisiRepository crudBisiRepository;

    @Autowired
    private CrudUserRepository crudUserRepository;

    @Override
    @Transactional
    public Bisi save(Bisi meal, int userId) {
        if (!meal.isNew() && get(meal.getId(), userId) == null) {
            return null;
        }
        meal.setUser(crudUserRepository.getOne(userId));
        return crudBisiRepository.save(meal);
    }

    @Override
    public boolean delete(int id, int userId) {
        return crudBisiRepository.delete(id, userId) != 0;
    }

    @Override
    public Bisi get(int id, int userId) {
        return crudBisiRepository.findById(id).filter(meal -> meal.getUser().getId() == userId).orElse(null);
    }

    @Override
    public List<Bisi> getAll(int userId) {
        return crudBisiRepository.getAll(userId);
    }

    /*@Override
    public List<Bisi> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return crudBisiRepository.getBetween(startDate, endDate, userId);
    }*/

    @Override
    public Bisi getWithUser(int id, int userId) {
        return crudBisiRepository.getWithUser(id, userId);
    }
}
