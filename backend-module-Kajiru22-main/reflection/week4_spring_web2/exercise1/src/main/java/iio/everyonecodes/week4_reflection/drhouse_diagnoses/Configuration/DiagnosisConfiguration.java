package iio.everyonecodes.week4_reflection.drhouse_diagnoses.Configuration;

import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data.Diagnosis;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
@ConfigurationProperties("diagnoses")
public class DiagnosisConfiguration {

    public List<Diagnosis> diagnoses;

    public void setDiagnoses(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    @Bean
    @Qualifier("list")
    List<Diagnosis> diagnoses() {
        return diagnoses;
    }
    //had big troubles with this class, didnt wanted to create the diagnoses list, thats why no test
}
