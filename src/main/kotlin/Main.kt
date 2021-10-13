import kotlin.math.sin

fun main() {

}

fun z1(x: Double, a: Double, n: Int) : Double {
    var res = x
    repeat(n) {
        res = (res+a)*(res+a)
    }
    res += a
    return res
}

fun z2(x: Double): Double {
    var s = 0.0
    var a = x
    for (i in 1..7) {
        s += a
        a = -a*x*x/((2*i)*(2*i+1))
    }
    return s
}

fun z3a(x: Double, n: Int) : Double {
    var s = 0.0
    val sin = sin(x)
    var a = 1.0
    repeat(n) {
        a *= sin
        s += a
    }
    return s
}

fun z3b(x: Double, n: Int) : Double {
    var s = 0.0
    var a = 1.0
    repeat(n) {
        a *= x
        s += sin(a)
    }
    return s
}

fun z4a(n : Int) : Int {
    var x = n
    var count = 0
    while (x > 0) {
        count++
        x /= 10
    }
    return count
}

fun z4b(n : Int) : Int {
    var x = n
    var sum = 0
    while (x > 0) {
        sum += x%10
        x /= 10
    }
    return sum
}

fun gcd(x : Int, y : Int) : Int {
    var a = x
    var b = y
    while (b != 0) {
        a = b.also { b = a % b }
    }
    return a
}

tailrec fun gcdRec(x: Int, y:Int) : Int = if (y==0) x else gcdRec(y, x%y)

fun readInt() = readLine()!!.toInt()

fun readDouble() = readLine()!!.toDouble()