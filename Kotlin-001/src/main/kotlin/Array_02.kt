import java.util.*
import kotlin.random.Random

fun main() {
    // 키보드를 사용하여 10 이상 100 이하의 정수를 입력 받고
    // 입력받은 정수만큼 배열을 생성하여
    // 1 ~ 100까지 중 임의의 난수를 생성하여 채워 넣기
    // 각 배열 요소에 +2 를 하여 새로운 배열을 생성
    // 원래 배열과 새로 생성된 배열을 Console 에 출력

    var rnd:Random = Random(System.currentTimeMillis())
    var scan: Scanner = Scanner(System.`in`)

    print("10 ~ 100까지 범위의 정수를 입력 : ")
    val strNum = scan.nextLine()
    val intNum = Integer.valueOf(strNum)
    val array = arrayListOf<Int>()

    for (num in 1..intNum) {}
    for (num in 0 until intNum) {
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }


    // +2
    // 간단한 방법
    val newArray1 = arrayListOf<Int>()
    for (arr in array) {
        newArray1.add(arr + 2)
    }

    // map을 사용한 방법
    val newArray2 = array.map { it + 2 }

    println("원래 배열 : $array")
    println("새로운 배열1 : $newArray1")
    println("새로운 배열2 : $newArray2")




}

