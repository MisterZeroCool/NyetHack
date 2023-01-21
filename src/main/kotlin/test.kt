fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false

    //Aura
    val  auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val  auraColor = if (auraVisible) "GREEN" else "NONE"
//    println("(Aura: $auraColor) " + "(Blessed: ${if(isBlessed) "YES" else "NO"})")

    println(castFireball(1))



//    Задание: вывод расширенной информации
//    об ауре
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    var karmaColor = when(karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> {"что то пошло не так"}
    }

    val healthStatus = when (healthPoints){
        100 -> " is in excellent condition!"
        in  90..99  -> " has a few scratches"
        in 75..89 -> if (isBlessed){
            " has some minor wounds but is healing quite quickly!"
        }else{
            " has some minor wounds"
        }
        in 15..74 -> " looks pretty hurt"
        else -> " is in awful condition!"
    }

    //Состояние игрока
//    println(name + " " + healthStatus)
//    println("$name $healthStatus \nAura has  $karmaColor color! $karma")

    //race
    val race = "gnome"
    val faction = when (race){
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> {}
    }

//    Задание: настраиваемый формат
//    строки состояния
//    В этом более сложном задании сделаем строку состояния настраиваемой с по-
//            мощью шаблонной строки. Используйте символ B для обозначения благосло-
//    вения, А — для ауры, Н — для healthStatus, HP — для healthPoints. Например,
//    шаблонная строка:
//              val statusFormatString = "(HP)(A) -> H"
//    должна выводить состояние игрока как:
//              (HP: 100)(Aura: Green) -> Madrigal is in excellent condition!

    val B = "Blessed: $isBlessed"
    val A = "Aura: $auraColor"
    val H = "$healthStatus"
    val HP = "HP: $healthPoints"

    val  statusFormatString = "($HP) ($A) -> $H"
    println(statusFormatString)
}



//    Задание: дурманящий эффект fireball
//    Заклинание, создающее бокал с дурманящим напитком, не только выводит
//    сообщение в консоль. В NyetHack действует мягко и оказывает дурманящий
//    эффект на заклинателя. Заставьте функцию castFireball возвращать значение
//    результата одурманивания, зависящего от количества наколдованных бокалов.
//    Уровень одурманивания должен изменяться в пределах значений от 1 до 50,
//    где 50 — максимальное значение, доступное в игре.
private fun castFireball(numFireballs: Int ): String {
    if (numFireballs > 50) {
        return "Это слишком много!"
    }else if (numFireballs == 0 ){
        return "Угостите бакальчиком"
    }else
        return "Столько я смогу выаить $numFireballs"
}

//функция с единственным выражением
//private fun castFireball(numFireballs: Int = 2) =
//    println(" A glass of Fireball spring into existence. (x$numFireballs)")

private fun castFireball(name: String,numFireballs: Int = 0 ) =
    when(numFireballs) {
        50 -> "$name напился"
        in 35..49 -> "$name очень пьян"
        in 20..34 -> "$name пьяный"
        in 1..19 -> "$name слегка опьянел"
        else -> "$name трезвый"
    }

//Задание: функции с единственным
//выражением
//Ранее мы рассматривали синтаксис функции с единственным выражением как
//способ более компактной записи функций. Можете ли вы переписать auraColor,
//использовав синтаксис функции с единственным выражением?
//private fun auraColor(isBlessed: Boolean,
//                      healthPoints: Int,
//                      isImmortal: Boolean): String {
//    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    val auraColor = if (auraVisible) "GREEN" else "NONE"
//    return auraColor
//}

//переписанная функция auraColor с единственным выражением
private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"