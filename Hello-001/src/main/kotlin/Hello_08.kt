import java.util.*

// public에 선언된 변수(전역변수)는 프로젝트 전체에 공용으로 사용되므로
// 프로젝트 전체에 유일한 이름이어야 한다
val scan1:Scanner = Scanner(System.`in`)

fun main() {

    print("정수형 숫자 1을 입력하세요 ")
    var num1:String = scan1.nextLine()

    print("정수형 숫자 2을 입력하세요 ")
    var num2:String = scan1.nextLine()

    var intNum1 = Integer.valueOf(num1)
    var intNum2 = Integer.parseInt(num2)

    println("$num1 + $num2 = ${intNum1 + intNum2}")
    println("$num1 - $num2 = ${intNum1 - intNum2}")
    println("$num1 * $num2 = ${intNum1 * intNum2}")
    println("$num1 / $num2 = ${intNum1 / intNum2}")



}