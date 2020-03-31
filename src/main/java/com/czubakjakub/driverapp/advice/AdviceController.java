package com.czubakjakub.driverapp.advice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advice")
@AllArgsConstructor
public class AdviceController {

    private AdviceService adviceService;

    @GetMapping("")
    public List<Advice> showAllAdvice(){
        return adviceService.getAllAdvice();
    }

    @GetMapping("/{id}")
    public Advice showOneAdvice(@PathVariable Long id) {
        Optional<Advice> advice = adviceService.getAdviceById(id);
        return advice.orElseGet(Advice::new);
    }

    @PostMapping("")
    public void addAdvice(@RequestBody Advice advice) {
        adviceService.addAdvice(advice);
    }

    @PutMapping("/{id}")
    public void editAdvice(@PathVariable Long id, @RequestBody Advice advice) {
        adviceService.editAdvice(id, advice);
    }

    @DeleteMapping("/{id}")
    public void deleteAdvice(@PathVariable Long id) {
        adviceService.deleteAdvice(id);
    }
}
