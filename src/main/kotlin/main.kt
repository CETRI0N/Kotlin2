fun main() {
    var sj = Message("Sydney")
    var js = Message("Joy")
    var jw = Message("John Wick")
    var ww = Message("Wolf")
    sj.introduce()
    js.introduce()
    jw.introduce()
    ww.introduce()
}
class Message(var username: String) {
     fun introduce() {
        println("Привет, меня зовут ${username}")
    }
}
