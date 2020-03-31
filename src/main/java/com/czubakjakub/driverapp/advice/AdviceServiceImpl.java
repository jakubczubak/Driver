package com.czubakjakub.driverapp.advice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdviceServiceImpl implements AdviceService {

    private AdviceRepository adviceRepository;

    public AdviceServiceImpl(AdviceRepository adviceRepository){
        this.adviceRepository=adviceRepository;
    }

    @Override
    public List<Advice> getAllAdvice() {
        return adviceRepository.findAll();
    }

    @Override
    public Optional<Advice> getAdviceById(Long id) {
        return adviceRepository.findById(id);
    }

    @Override
    public void addAdvice(Advice advice) {
        adviceRepository.save(advice);
    }

    @Override
    public void editAdvice(Long id, Advice advice) {

    }


    @Override
    public void deleteAdvice(Long id) {
        adviceRepository.deleteById(id);
    }
}
