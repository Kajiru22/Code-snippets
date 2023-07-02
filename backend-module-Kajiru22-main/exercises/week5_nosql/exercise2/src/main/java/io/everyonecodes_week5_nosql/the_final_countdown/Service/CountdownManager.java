package io.everyonecodes_week5_nosql.the_final_countdown.Service;

import io.everyonecodes_week5_nosql.the_final_countdown.Data.Countdown;
import io.everyonecodes_week5_nosql.the_final_countdown.Repository.CountdownRepository;
import io.everyonecodes_week5_nosql.the_final_countdown.Service.AccumulationManager;
import org.springframework.stereotype.Service;

@Service
public class CountdownManager {

    private final CountdownRepository countdownRepository;
    private final AccumulationManager accumulationManager;

    public CountdownManager(CountdownRepository countdownRepository, AccumulationManager accumulationManager) {
        this.countdownRepository = countdownRepository;
        this.accumulationManager = accumulationManager;
    }

    public void startCountdown() {
        if (countdownRepository.findAll().isEmpty()) {
            countdownRepository.save(new Countdown(3));
        }
        var countdownNumber = countdownRepository.findAll().get(0).getCount();
        System.out.println(countdownNumber);
        accumulationManager.accumulate(countdownNumber);
        System.out.println();
        if (countdownNumber == 0) {
            countdownRepository.deleteAll();
            var newCountdown = new Countdown(3);
            countdownRepository.save(newCountdown);
            countdownNumber = 4;
        }
        if (countdownNumber > 0) {
            System.out.println("Countdown: " + countdownNumber);
        }
        countdownRepository.deleteAll();
        int newCountdown = countdownNumber - 1;
        countdownRepository.save(new Countdown(newCountdown));
    }
}
