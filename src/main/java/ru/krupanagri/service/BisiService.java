package ru.krupanagri.service;

import ru.krupanagri.model.Bisi;
import ru.krupanagri.to.BisiTo;
import ru.krupanagri.util.exception.NotFoundException;

import java.util.List;

public interface BisiService {
    Bisi get(int id, int userId) throws NotFoundException;

    void delete(int id, int userId) throws NotFoundException;

   /* default List<Bisi> getBetweenDates(LocalDate startDate, LocalDate endDate, int userId) {
        return getBetweenDateTimes(LocalDateTime.of(startDate, LocalTime.MIN), LocalDateTime.of(endDate, LocalTime.MAX), userId);
    }*/

    /*List<Bisi> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId);*/

    List<Bisi> getAll(int userId);

    void update(Bisi meal, int userId) throws NotFoundException;

    Bisi create(Bisi meal, int userId);

    Bisi getWithUser(int id, int userId);
}
