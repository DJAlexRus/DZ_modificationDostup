class Registration(email:String) {
    internal var pass=""
    set(value){
        if((value.length>6)){
            println("Ваш пароль принят")
            field = value
        }else{
            println("Ошибка. Пароль меньше 6 символов")
            field=""
        }
    }

    private var email=email.uppercase()
    fun getEmail()=email
}
//