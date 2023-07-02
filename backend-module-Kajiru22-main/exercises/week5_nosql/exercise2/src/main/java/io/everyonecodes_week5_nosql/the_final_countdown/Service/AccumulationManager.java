package io.everyonecodes_week5_nosql.the_final_countdown.Service;

import io.everyonecodes_week5_nosql.the_final_countdown.Data.Accumulation;
import io.everyonecodes_week5_nosql.the_final_countdown.Repository.AccumulationRepository;
import org.springframework.stereotype.Service;

@Service
public class AccumulationManager {

    private final AccumulationRepository accumulationRepository;

    public AccumulationManager(AccumulationRepository accumulationRepository) {
        this.accumulationRepository = accumulationRepository;
    }

    public void accumulate(int countdownNumber) {
        var accumulationTimes = accumulationRepository.findAll();
        if (accumulationTimes.isEmpty()) {
            accumulationRepository.save(new Accumulation(0));
        }
        if (countdownNumber == 0) {
            var newAccumulation = new Accumulation(accumulationTimes.get(0).getTimes() +1);
            accumulationRepository.deleteAll();
            accumulationRepository.save(newAccumulation);
            System.out.println("Times that the countdown went off: " + accumulationRepository.findAll().get(0).getTimes());
        }
    }
}
