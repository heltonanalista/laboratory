package org.example.Service;

import org.example.Model.People;
import org.example.Repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
@Autowired
private PeopleRepository peopleRepository;
public People getPeople(String cpf){

return peopleRepository.getPeople(cpf);
}
}
