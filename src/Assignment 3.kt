fun main(){
    school()
    intro("Yvonne",23)
    var long= length("Nairobi")
    println(long)
    call("Yvonne")
    call("Katama")

}

fun school(){
    var school= "Akirachix"
    print(school[0])
    print(school[2])
    println(school[3])
}

fun intro(name:String,age:Int){
println("Hi my name is $name and I am $age years old")
}

fun length(county:String):Int{
    var long= county.length
    return long
}

fun call(X:String){
    if(X=="Yvonne"){
        println("That's me" )

    }
    else{
        println("I dont know who is that?")
    }
}