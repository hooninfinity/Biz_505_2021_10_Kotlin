import java.util.*

// public 변수로 scan을 선언
// type java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워드 없이 그냥 호출하여 객체를 초기화 한다
var scan:Scanner = Scanner(System.`in`)

fun main() {

    print("문자열을 입력 : ")
    var input:String = scan.nextLine()
    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 4칙연산을 수행하여 console 에 표시하시오
     */
    print("문자열 1을 입력 : ")
    var input1:String = scan.nextLine()
    print("문자열 2을 입력 : ")
    var input2:String = scan.nextLine()
    print("계산할 기호를 입력 : ")
    var input3:String = scan.nextLine()
    println("입력한 4칙연산 : $input1 ")

}