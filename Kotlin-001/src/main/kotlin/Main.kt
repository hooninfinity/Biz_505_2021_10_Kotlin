import java.util.*




fun main() {

    var scan:Scanner = Scanner(System.`in`)

    print("1번 항목 정수를 입력하세요 : ")
    var strNum1 = scan.nextLine()

    print("2번 항목 정수를 입력하세요 : ")
    var strNum2 = scan.nextLine()

    var intNum1 = Integer.valueOf(strNum1)
    var intNum2 = Integer.valueOf(strNum2)

    view(intNum1, intNum2)

    // num1과 num2 순서를 바꿔서 보내고 싶다면
    /**
     * 함수에 값을 전달하면서 직접 매개변수 이름에 값을 할당하여 전달
     * Call By Name
     */
//    view(num2 = intNum1, num1 = intNum2)

}

fun view(num1:Int, num2:Int) {

    var sum = num1 + num2
    var minus = num1 - num2
    var times = num1 * num2
    var div = num1 / num2

    println("$num1 + $num2 = $sum")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = $times")
    println("$num1 / $num2 = $div")
}
