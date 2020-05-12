class Unosi(private val kockice: List<Int>) {
    private val kombinacija =
        setOf(1, 2, 3, 4, 5, 6)
            .map { number ->
                kockice.filter { it == number }.size
            }

    private val poker =
        if (kombinacija.contains(4))
            40
        else
            0

    private val malaSkala =
        if (kockice.containsAll(setOf(1, 2, 3, 4, 5)))
            35
        else
            0

    private val velikaSkala =
        if (kockice.containsAll(setOf(2, 3, 4, 5, 6)))
            45
        else
            0

    private val jamb =
        if (kockice.distinct().size == 1)
            50
        else
            0

    val polja =
        hashMapOf(
            Pair("Poker", poker),
            Pair("Mala skala", malaSkala),
            Pair("Velika skala", velikaSkala),
            Pair("Jamb", jamb)
        )
}