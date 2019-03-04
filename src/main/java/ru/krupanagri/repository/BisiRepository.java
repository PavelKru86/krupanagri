package ru.krupanagri.repository;


import ru.krupanagri.model.Bisi;

import java.time.LocalDateTime;
import java.util.List;

public interface BisiRepository {
    // null if updated meal do not belong to userId
    Bisi save(Bisi meal, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Bisi get(int id, int userId);

    // ORDERED dateTime desc
    List<Bisi> getAll(int userId);

   /* // ORDERED dateTime desc
    List<Bisi> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);*/

    default Bisi getWithUser(int id, int userId) {
        throw new UnsupportedOperationException();
    }
}
