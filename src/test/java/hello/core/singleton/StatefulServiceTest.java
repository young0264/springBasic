package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //스레드a : a사용자 10000원주문
        int userAPrice = statefulService1.order("userA", 10000);
        //스레드b : b사용자 10000원주문
        int userBPrice = statefulService1.order("userB", 20000);

        //사용자a주문금액조회
//        int price = statefulService1.getPrice();
        System.out.println("priceA = " + userAPrice);
        System.out.println("priceB = " + userBPrice);

//        assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}