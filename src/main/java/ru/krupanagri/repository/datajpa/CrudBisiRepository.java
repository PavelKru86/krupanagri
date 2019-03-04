package ru.krupanagri.repository.datajpa;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.krupanagri.model.Bisi;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CrudBisiRepository extends JpaRepository<Bisi, Integer> {

    @Modifying
    @Transactional
    @Query("DELETE FROM Bisi m WHERE m.id=:id AND m.user.id=:userId")
    int delete(@Param("id") int id, @Param("userId") int userId);

    @Override
    @Transactional
    Bisi save(Bisi item);

    @Modifying
    @Query("SELECT m FROM Bisi m WHERE m.user.id=:userId ORDER BY m.date_time DESC")
    List<Bisi> getAll(@Param("userId") int userId);

   /* @SuppressWarnings("JpaQlInspection")
    @Query("SELECT m from Bisi m WHERE m.user.id=:userId AND m.dateTime BETWEEN :startDate AND :endDate ORDER BY m.dateTime DESC")
    List<Bisi> getBetween(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate, @Param("userId") int userId);*/

    @Query("SELECT m FROM Bisi m JOIN FETCH m.user WHERE m.id = ?1 and m.user.id = ?2")
    Bisi getWithUser(int id, int userId);



}