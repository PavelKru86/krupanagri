package ru.krupanagri.controller.bisi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.krupanagri.model.Bisi;
import ru.krupanagri.service.BisiService;
import ru.krupanagri.to.BisiTo;
import ru.krupanagri.util.DateTimeUtil;
import ru.krupanagri.util.BisisUtil;
import ru.krupanagri.controller.SecurityUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static ru.krupanagri.util.Util.orElse;
import static ru.krupanagri.util.ValidationUtil.assureIdConsistent;
import static ru.krupanagri.util.ValidationUtil.checkNew;

public abstract class AbstractBisiController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BisiService service;

    public Bisi get(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("get Bisi {} for user {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("delete Bisi {} for user {}", id, userId);
        service.delete(id, userId);
    }

    public List<Bisi> getAll() {
        int userId = SecurityUtil.authUserId();
        log.info("getAll for user {}", userId);
        //return BisisUtil.getWithExcess(service.getAll(userId), SecurityUtil.authUserCaloriesPerDay());
        return service.getAll(userId);
    }

    public Bisi create(Bisi Bisi) {
        int userId = SecurityUtil.authUserId();
        checkNew(Bisi);
        log.info("create {} for user {}", Bisi, userId);
        return service.create(Bisi, userId);
    }

    public void update(Bisi Bisi, int id) {
        int userId = SecurityUtil.authUserId();
        assureIdConsistent(Bisi, id);
        log.info("update {} for user {}", Bisi, userId);
        service.update(Bisi, userId);
    }

    /**
     * <ol>Filter separately
     * <li>by date</li>
     * <li>by time for every date</li>
     * </ol>
     */


    public List<BisiTo> getBetween(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime) {
        int userId = SecurityUtil.authUserId();
        log.info("getBetween dates({} - {}) time({} - {}) for user {}", startDate, endDate, startTime, endTime, userId);

        /*List<Bisi> BisisDateFiltered = service.getBetweenDates(
                orElse(startDate, DateTimeUtil.MIN_DATE), orElse(endDate, DateTimeUtil.MAX_DATE), userId);

        return BisisUtil.getFilteredWithExcess(BisisDateFiltered, SecurityUtil.authUserCaloriesPerDay(),
                orElse(startTime, LocalTime.MIN), orElse(endTime, LocalTime.MAX)
        );*/
        return null;
    }
}