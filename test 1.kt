import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.util.Date

fun main(){
//    variables()
//    shake()
    time()
}

//fun variables() {
//    val q = 90
//    val w = 78
//    val x = 67
//
//    if (q >= w && q>= x){
//        println("the greatest is $q")
//    }
//
//    else if (w >= q && w>= x){
//        println("the greatest is $w")}
//
//
//    else{
//    println("the greatest is $x")}

//}
//fun shake(){
//    var grade =65
//    while (grade<15000){
//        println(grade)
//        grade++
//    }


//}

fun time(){
    val CurrentDate=
           Date()
    val dateFormat=
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formattedDate=dateFormat.format(CurrentDate)
    println("Current date and time is $formattedDate")


}











