package ru.krupanagri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.krupanagri.model.Bisi;
import ru.krupanagri.repository.BisiRepository;
import ru.krupanagri.repository.datajpa.CrudBisiRepository;
import ru.krupanagri.to.BisiTo;
import ru.krupanagri.util.exception.NotFoundException;

import java.util.List;

import static ru.krupanagri.util.ValidationUtil.checkNotFoundWithId;

@Service
public class BisiServiceImpl implements BisiService {

    /*private final BisiRepository repository;

    @Autowired
    public BisiServiceImpl (BisiRepository repository) {
        this.repository = repository;
    }

    @Override
    public Bisi create(Bisi bisi, int userId) {
        Assert.notNull(bisi, "bisi must not be null");
        return repository.save(bisi);
    }

    @Override
    public void delete(int id, int userId) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id, userId), id);
    }

    @Override
    public Bisi get(int id, int userId) throws NotFoundException {
        return repository.findById(id).orElse(null);
    }


    @Override
    public void update(Bisi bisi, int userId) {

    }

    @Override
    public void update(BisiTo bisi) {

    }

    @Override
    public List<Bisi> getAll() {
        return repository.findAll();
    }


    @Override
    public Bisi getWithBisi(int id) {
        return null;
    }*/

    private final BisiRepository repository;

    @Autowired
    public BisiServiceImpl(BisiRepository repository) {
        this.repository = repository;
    }

    @Override
    public Bisi get(int id, int userId) {
        return checkNotFoundWithId(repository.get(id, userId), id);
    }

    @Override
    public void delete(int id, int userId) {
        checkNotFoundWithId(repository.delete(id, userId), id);
    }

   /* @Override
    public List<Bisi> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId) {
        Assert.notNull(startDateTime, "startDateTime must not be null");
        Assert.notNull(endDateTime, "endDateTime  must not be null");
        return repository.getBetween(startDateTime, endDateTime, userId);
    }
*/
    @Override
    public List<Bisi> getAll(int userId) {
        return repository.getAll(userId);
    }

    @Override
    public void update(Bisi meal, int userId) {
        Assert.notNull(meal, "meal must not be null");
        checkNotFoundWithId(repository.save(meal, userId), meal.getId());
    }

    @Override
    public Bisi create(Bisi meal, int userId) {
        Assert.notNull(meal, "meal must not be null");
        return repository.save(meal, userId);
    }

    @Override
    public Bisi getWithUser(int id, int userId) {
        return checkNotFoundWithId(repository.getWithUser(id, userId), id);
    }


}
