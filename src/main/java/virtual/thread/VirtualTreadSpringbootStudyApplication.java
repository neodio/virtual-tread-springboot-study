package virtual.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
//@EnableScheduling
@SpringBootApplication
public class VirtualTreadSpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirtualTreadSpringbootStudyApplication.class, args);
    }

}
