import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())
    var num1:Int = rnd.nextInt(100)

    when (num1 % 2) {
        0-> println("$num1 짝수")
        1-> println("$num1 홀수")
    }

    // when : 여러가지 나온 결과를 모두 캐치하고 싶을때 사용
    var result:String = when (num1 % 3) {
        0->"3의 배수"
        1->"글쎄"
        2->"결가가 2이면 뭘까"
        else->"알수 없음"
    }
    print("$num1 $result")



}