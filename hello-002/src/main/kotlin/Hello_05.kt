import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())

    var start1 = rnd.nextInt(100)
    var end1 = rnd.nextInt(100)

    println("$start1, $end1")

    /**
     * Random으로 생성된 start1과 end1 변수값을
     * 큰값은 max1 변수에 담고
     * 작은값은 min1 변수에 담고
     *
     * min1 ~ max1 까지 범위에서 짝수들의 합을 구하시오
     */
    var min1 = 0
    var max1 = 0
    var evensum = 0
    if (start1 < end1) {
        min1 = start1
        max1 = end1
    } else if (start1 > end1) {
        min1 = end1
        max1 = start1
    }

    for (num in min1..max1) {
        if (num % 2 == 0) {
            evensum += num
        }
    }
    println("$min1 ~ $max1 까지 범위에서 짝수들의 합은 $evensum")

    // 쌤 풀이
//    var min1 = if (start1 > end1) end1 else start1
//    var max1 = if (start1 > end1) start1 else end1
//    for (num in min1..max1) {
//        if (num % 2 == 0) {
//            // 덧셈
//        }
//    }

    /**
     * Random으로 생성된 start1과 end1 변수값을 사용하여
     * 작은값 ~ 큰값 순으로 짝수의 합을 구하시오
     *
     * 작은값과 큰값을 비교하여
     * 작은값이 start1 에 담기도록 변수값을 swap 하기
     */
    var temp = 0
    var sum = 0
    if (start1 > end1) {
        temp = start1
        start1 = end1
        end1 = temp
    }
    for (num in start1..end1) {
        if (num % 2 == 0) {
            sum += num
        }
    }
    println("$start1 ~ $end1 의 짝수의 합은 $sum ")


    // 쌤 해답
    // start1과 end1 두 변수에 담긴 값을 비교하여
    // 작은값이 start1에 담기고 큰값이 end1에 담기도록 먼저 처리

    // swap 코드
    // 만약 start1 의 값이 크면 start1과 end1을 서로 교환
    if (start1 > end1) {
        var temp = start1
        end1 = temp
    }
    var even = 0
    for (num in start1..end1) {
        if (num % 2 == 0) {
            even += num
        }
    }
    println("$start1 ~ $end1 범위의 짝수의 합 : $even")










}