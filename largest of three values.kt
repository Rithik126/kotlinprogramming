fun main(){
    var a:Int?= readLine()?.toInt()
    var b:Int?= readLine()?.toInt()
    var c:Int?= readLine()?.toInt()
    if(a!=null && b!=null && c!==null){
     if (a>b && a>c){
         print("$a is greatest")
     }
        else if (b>c && b>a){
            println("$b is greatest")

     }
        else{
            println("$c is greatest")
     }
    }
}
