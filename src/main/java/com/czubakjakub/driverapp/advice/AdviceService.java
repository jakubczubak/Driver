package com.czubakjakub.driverapp.advice;

import java.util.List;
import java.util.Optional;

public interface AdviceService {
    List<Advice> getAllAdvice();

    Optional<Advice> getAdviceById(Long id);

    void addAdvice(Advice advice);

    void editAdvice(Long id, Advice advice);

    void deleteAdvice(Long id);
}
