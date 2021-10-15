import kotlin.random.Random

fun main() {

    val rnd:Random = Random(System.currentTimeMillis())
    val array = arrayListOf<Int>()

    for (num in 1..100) {
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }
    println("$array")
    val primes = array.filter { it:Int
        {
            // it 이 소수인가? 판별하는 코드
            // 소수가 맞다 return true
            for (num in 2 until it) {
                if (num % it == 0) return false
            }
            return true
        }
    }














}