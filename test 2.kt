fun main(){
    var digit=67
    if(digit>=0 && digit<10)
        println("$digit is a single digit")
    else if (digit>=10 && digit<=99 ){
        println("$digit is a double digit")
    }
    else{
        println("$digit has multiple  digits")
    }
}