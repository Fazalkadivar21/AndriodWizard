open class Calc(){

    fun add(num1:Int,num2: Int):Int{
        return num1+num2
    }fun sub(num1: Int,num2: Int):Int{
        return num1-num2
    }fun mul(num1:Int,num2:Int):Int{
        return num1*num2
    }fun div(num1: Int,num2: Int):Int {
        return num1/num2
    }

}
class AdvanceCalc():Calc(){
    fun factorial(num:Int):Int{
        return if (num==1 || num==0) 1
        else mul(num,factorial(num-1))
    }
    fun fib(num: Int):Int = when (num) {
        0 ->0
        1 ->1
        else ->add(fib(num-1),fib(num-2))
    }
}
fun main(){
    val ac = AdvanceCalc()
    println(ac.factorial(5))
    println(ac.fib(10))
}