fun main(){
    val hoursStudied = 8
    val totalHours = 24
    val restHours: Int = 3
    val timeSpent: Double = (hoursStudied.toDouble() / totalHours.toDouble()) * 100
    val compare = (hoursStudied > 2)
    val isGreater = hoursStudied in 5..10

    println("Hours Studied: $hoursStudied out of $totalHours")
    println("Study Percentage: $timeSpent %")
    println("Daily Study Hours: $hoursStudied")
    println("Studying more than 2 hours daily: $compare")
    println("Studied between 5-10 hours today: $isGreater")

}