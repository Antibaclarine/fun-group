fun main() {
var add=sumOf(2,5)
    println(add)
var sum= addSum(arrayOf(2,3,4,5,6,7))
    println(sum)
var myName=letters("Clarine")
    println(myName)
    println(reverse("Clarine"))
    println(different("Mercy","Mercy"))
    println( oddNumbers(mutableListOf(1,2,3,4,5,6,7,8,9)))
    println(allSentence(arrayOf("Mercy","Mary","Atieno","cat")))
    println(secondLargest(mutableListOf(12,50,2,5,78,90)))
    println(capitalise(mutableListOf("nairobi","mombasa","kisumu")))
 var sent=  addSentence(mutableListOf("coming","to","kisumu"))
    println(sent)
}
//Write a function that takes two integers as parameters and returns their sum.

fun sumOf(num1:Int,num2:Int):Int{
    return num1+num2
}
//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.

fun addSum(num:Array<Int>):Int{
return num.sum()

}
//Write a function that takes an array of strings as a parameter and returns the length of the longest string.

fun allSentence(abs:Array<String>):Int{
    var len=0
   for (i in abs){
       if (i.length>len){
           len=i.length
       }
   }
    return len
}

//Write a function that takes a string as a parameter and returns the number of vowels in the string.

fun letters(string: String):Int{
    var count=0
    var vowels="a,e,i,o,u,A,E,I,O,U"
     for (i in string)
        if (i in vowels){
            count++
        }

return count

}

//Write a function that takes a string as a parameter and returns the string in reverse order.

fun reverse(name:String):String{
   return (name.reversed())
}
//Write a function that takes two strings as parameters and returns true if they are anagrams (have the same letters in a different order) and false otherwise.

//palindrome
fun different(name1:String,name2:String):Boolean{
    return name1.reversed()==name2.reversed()&&name2.reversed()==name1.reversed()
}
//Write a function that takes a list of integers as a parameter and returns a new list with all the even numbers removed.

fun oddNumbers(num:List<Int>):List<Int>{
    var oddNumbers= mutableListOf<Int>()
    for (i in num){
        if (i%2!==0){
            oddNumbers+=i
        }

    }
    return oddNumbers

}
//Write a function that takes a list of integers as a parameter and returns the second largest element in the list.
fun secondLargest(num:List<Int>):Int{
  var sort=  num.sortedByDescending { i->i }
    return sort[1]

}

//Write a function that takes a list of strings as a parameter and returns a new list with all the strings in uppercase.
fun capitalise(str:MutableList<String>):MutableList<String>{
    var newList= mutableListOf<String>()

    for (x in str){
        newList.add(x.uppercase())
    }
    return newList




//    var newList= mutableListOf<String>()
//   var words = str.map { s -> s.uppercase() }
//    newList.addAll(words)
//    return newList


}
//Write a function that takes a list of strings as a parameter and returns the concatenation of all the strings.
fun addSentence(name:MutableList<String>):String{
var allName=" "
    for (name in name){
        allName+=name
    }
    return allName
}