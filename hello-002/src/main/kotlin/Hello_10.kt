import java.util.*
import kotlin.math.PI

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    print("반지름을 정수값으로 입력하세요 : ")
    var strInput = scan.nextLine()
    var radius:Int = Integer.valueOf(strInput)

    // 원의 둘레 : 반지름 * 2 * PI
    // 원의 면적 : 반지름 * 반지름 * PI

    // 구의 표면적 : 반지름 * 반지름 * 4 * PI
    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * (4/3)
    var pi = Math.PI

    var round = radius * 2 * pi
    println("원의 둘레는 : $round")

    var area = radius * radius * pi
    println("원의 면적은 : $area")

    var surface = radius * radius * 4 * pi
    println("구의 표면적은 : $surface")

    var volume = radius * radius * radius * pi * (4/3)
    println("구의 부피는 : $volume")


}