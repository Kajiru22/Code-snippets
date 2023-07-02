package io.everyonecodes.week2_properties.singapore_reconstruction.logic;

import io.everyonecodes.week2_properties.singapore_reconstruction.domain.Building;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

@Service
@ConfigurationProperties("singapore")
public class BuildingReconstructionCandidateAnaliser {

    private int yearThreshold;
    private List<Building> buildings;

    public List<Building> findCandidates() {
        return buildings.stream()
                .peek(System.out::println)
                .filter(isBuiltAfterThreshold())
                .filter(isNotHistoric())
                .collect(toList());
    }

    private Predicate<Building> isBuiltAfterThreshold() {
        return building -> building.getBuilt().isBefore(LocalDate.now().minusYears(yearThreshold));
    }

    private Predicate<Building> isNotHistoric() {
        return building -> !building.isHistoric();
    }

    void setYearThreshold(int yearThreshold) {
        this.yearThreshold = yearThreshold;
    }

    void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
}

