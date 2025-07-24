package virtual.thread.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.task.SimpleAsyncTaskSchedulerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.concurrent.SimpleAsyncTaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@Slf4j
public class SchedulerConfig {


    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setThreadNamePrefix("myScheduler-");
        threadPoolTaskScheduler.setPoolSize(10);
        // TODO: more settings...
        return threadPoolTaskScheduler;
    }

    @Primary
    @Bean
    public SimpleAsyncTaskScheduler simpleAsyncTaskScheduler(SimpleAsyncTaskSchedulerBuilder builder) {
        return builder.build();
    }

}
