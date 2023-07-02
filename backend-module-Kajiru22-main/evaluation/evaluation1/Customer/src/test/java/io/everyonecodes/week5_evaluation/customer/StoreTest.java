package io.everyonecodes.week5_evaluation.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD
import org.springframework.boot.test.mock.mockito.MockBean;
=======
>>>>>>> origin/main

@SpringBootTest
class StoreTest {

<<<<<<< HEAD
    @MockBean
    Store store;

    public void test() {

=======
    @Autowired
    Store store;

    public void test() {
>>>>>>> origin/main
    }
}