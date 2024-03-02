/*this file contains my day one progress where i completed basics of kotlin like variables, data types, if-else , ,arrays ,loops , functions , recursion and OOPs concepts.
this file a combination of everything that i learnt today
*/
open class Calc(){
    /*using open keyword i have made this Class calc extendable
      this class have basic arithmatic operations*/
    fun add(num1:Int,num2: Int):Int{
        return num1+num2
    }fun sub(num1: Int,num2: Int):Int{
        return num1-num2
    }fun mul(num1:Int,num2:Int):Int{
        return num1*num2
    }fun divi(num1: Int,num2: Int):Int {
        return num1/num2
    }

}
class AdvanceCalc():Calc(){
    /* this class extends calc and its method using inharitence*/
    fun factorial(num:Int):Int{
        return if (num==1 || num==0) 1
        /*here i have used mul() function of calc class to multiply num and result of
        * faltorial() function this is the example of recursion*/
        else mul(num,factorial(num-1))
    }
    fun fib(num: Int):Int = when (num) {
        0 ->0
        1 ->1
        /*when you have multiple if conditions you use when instead of if
        * here recursion is used with add() function to get fibonacci sequence*/
        else ->add(fib(num-1),fib(num-2))
    }
}
fun main(){
    /*this is the object of the class and through it i have called each function*/
    val ac = AdvanceCalc()
    println(ac.factorial(5))
    println(ac.fib(10))
    /*another way to print this is
    * x=ac.factorial(5)
    * y = ac.fib(10)
    * println(x, y)*/
}