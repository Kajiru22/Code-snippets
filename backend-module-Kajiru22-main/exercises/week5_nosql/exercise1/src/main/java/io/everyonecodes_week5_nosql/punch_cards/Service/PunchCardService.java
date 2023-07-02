package io.everyonecodes_week5_nosql.punch_cards.Service;
import io.everyonecodes_week5_nosql.punch_cards.Data.PunchCard;
import io.everyonecodes_week5_nosql.punch_cards.Repositorys.PunchCardRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Service
public class PunchCardService {

    private final PunchCardRepository punchCardRepository;

    public PunchCardService(PunchCardRepository punchCardRepository) {
        this.punchCardRepository = punchCardRepository;
    }


    public void save() {
        String dayOfWeek = LocalDateTime.now().getDayOfWeek().toString();
        String time = LocalTime.now().toString();
        PunchCard punchCard = new PunchCard(dayOfWeek, time);
        punchCardRepository.save(punchCard);
        System.out.println("*** Punch Card created: " + punchCard);
    }
}
