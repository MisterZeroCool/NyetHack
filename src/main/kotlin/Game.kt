fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false
    // Аура
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    // Состояние игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
//    castFireball()
    println( castFireball(name,5))

}
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"

}
private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}
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
