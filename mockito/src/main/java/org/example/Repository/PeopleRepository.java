package org.example.Repository;

import org.example.Model.People;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    public People getPeople(String cpf) {
        if (cpf.equals("111.222.333-44")) {

            return new People();
        } else return null;
    }
}
