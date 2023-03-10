package ru.job4j.accident.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.repository.AccidentTypeRepository;

import java.util.*;

@Service
@AllArgsConstructor
public class AccidentTypeService {
    private final AccidentTypeRepository repository;

    public List<AccidentType> getAllAccidentTypes() {
       return repository.findAll();
    }

    public Optional<AccidentType> getAccidentTypeById(int id) {
        return Optional.ofNullable(repository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Тип нарушения с id = " + id + "не найден")));
    }
}
