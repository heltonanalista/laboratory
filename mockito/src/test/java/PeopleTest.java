import org.example.Model.People;
import org.example.Repository.PeopleRepository;
import org.example.service.PeopleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class PeopleTest {
    public People people;
    public People returnedPeople;

    @BeforeEach
    public void setup() {
        people = new People("helton", "111.222.333-44", "25", 78.5, 1.78);


    }

    @InjectMocks
    private PeopleService peopleService;
    @Mock
    private PeopleRepository peopleRepository;

    @Test
    public void findPeopleWithCpfNumberThenReturnPeople() {
        Mockito.when(peopleRepository.getPeople("111.222.333-44")).thenReturn(people);
        returnedPeople = peopleService.getPeople("111.222.333-44");
        Mockito.verify(peopleRepository, times(1)).getPeople("111.222.333-44");
        Assertions.assertEquals(People.class, returnedPeople.getClass());
        Assertions.assertNotNull(people);
        Assertions.assertEquals("helton", people.getName());
        Assertions.assertEquals("111.222.333-44", people.getCpf());
        Assertions.assertEquals("25", people.getAge());
        Assertions.assertEquals(78.5, people.getWeight());
        Assertions.assertEquals(1.78, people.getHeight());


    }
}
