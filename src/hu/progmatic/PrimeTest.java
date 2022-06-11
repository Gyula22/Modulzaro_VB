package hu.progmatic;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @org.junit.jupiter.api.Test
    void test_isPrime() {
        assertTrue(Prime.isPrime(2));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime2() {
        assertFalse(Prime.isPrime(25));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime3() {
        assertTrue(Prime.isPrime(29));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime4() {
        assertTrue(Prime.isPrime(79));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime5() {
        assertTrue(Prime.isPrime(83));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime6() {
        assertTrue(Prime.isPrime(97));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime7() {
        assertTrue(Prime.isPrime(5));
    }
    @org.junit.jupiter.api.Test
    void test_isPrime8() {
        assertTrue(Prime.isPrime(7));
    }

}