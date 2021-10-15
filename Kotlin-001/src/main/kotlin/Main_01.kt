import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while (true) {

        print("첫번째 정수를 입력하세요 : ")
        var strNum1 = scan.nextLine()
        var intNum1 = try {
            Integer.valueOf(strNum1)
        } catch (e:Exception) {
            println("정수로만 입력해야 합니다")
            continue
        }

        print("두번째 정수를 입력하세요 : ")
        var strNum2 = scan.nextLine()
        var intNum2 = try {
            Integer.valueOf(strNum2)
        } catch (e:Exception) {
            println("정수로만 입력해야 합니다")
            continue
        }



    }




}