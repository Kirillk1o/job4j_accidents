package ru.job4j.accident.service;

import org.springframework.stereotype.Service;

import ru.job4j.accident.model.Authority;
import ru.job4j.accident.model.User;
import ru.job4j.accident.repository.AuthorityRepository;
@Service
public class AuthorityService {
    private final AuthorityRepository authorityRepository;

    public AuthorityService(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    public Authority findByAuthority(String authority) {
        return authorityRepository.findByAuthority(authority);
    }
}
