import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.PI
import kotlin.math.sqrt

class MainKtTest {
    val EPS = 1e-6

    @Test
    fun testZ1() {
        val x = 1.0
        val a = 2.0
        assertEquals(11.0, z1(x,a,1), EPS)
        assertEquals(123.0, z1(x,a,2), EPS)
    }

    @Test
    fun testZ2() {
        assertEquals(1/sqrt(2.0), z2(PI/4), EPS)
        assertEquals(0.5, z2(PI/6), EPS)
    }


    @Test
    fun testZ3a() {
        assertEquals(0.5, z3a(PI/6, 1), EPS)
        assertEquals(0.75, z3a(PI/6, 2), EPS)
        assertEquals(0.875, z3a(PI/6, 3), EPS)
    }
//
//    @Test
//    fun testZ3b() {
//        assertEquals(0.5, z3b(PI/6,1), EPS)
//        assertEquals(0.770734, z3b(PI/6,2), EPS)
//        assertEquals(0.913789, z3b(PI/6,3), EPS)
//    }
//
//    @Test
//    fun testZ3c() {
//        assertEquals(0.5, z3c(PI/6, 1), EPS)
//        assertEquals(0.979425, z3c(PI/6, 2), EPS)
//        assertEquals(1.440695, z3c(PI/6, 3), EPS)
//    }
//
    @Test
    fun testZ4a() {
        assertEquals(1, z4a(6))
        assertEquals(2, z4a(76))
        assertEquals(3, z4a(123))
    }

    @Test
    fun testZ4b() {
        assertEquals(6, z4b(6))
        assertEquals(13, z4b(76))
        assertEquals(10, z4b(127))
    }

    @Test
    fun testGCD() {
        val a = 65
        val b = 1001
        assertEquals(13, gcd(a,b))
        assertEquals(1, gcd(81,64))
        assertEquals(13, gcdRec(a,b))
        assertEquals(1, gcdRec(81,64))
    }


}