import java.util.*


fun main() {

    var scan:Scanner = Scanner(System.`in`)

    while (true) {
        print("1번 항목 정수를 입력하세요 : ")
        var strNum1 = scan.nextLine()
        var intNum1 = try {
            Integer.valueOf(strNum1)
        } catch (e:NumberFormatException) {
            println("정수만 입력해야 합니다")
            println("다시 입력해 주세요~~")
            continue
        }

        print("2번 항목 정수를 입력하세요 : ")
        var strNum2 = scan.nextLine()
        var intNum2 = try {
            Integer.valueOf(strNum2)
        } catch (e:NumberFormatException) {
            println("정수만 입력해야 합니다")
            println("다시 입력해 주세요~~")
            continue
        }

        if (intNum1 < intNum2) {
            println("첫번째 값이 더 커야 합니다!!")
            println()
        } else {
            view2(intNum1, intNum2)
            break
        }
    }



}

fun view2(num1:Int, num2:Int) {

    var sum = num1 + num2
    var minus = num1 - num2
    var times = num1 * num2
    var div = num1 / num2

    println("$num1 + $num2 = $sum")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = $times")
    println("$num1 / $num2 = $div")
}
