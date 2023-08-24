package guru.springframework.spring5webapp;

import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called Once ");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {

        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("in After each ");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After  - I am only called Once ");
    }
}