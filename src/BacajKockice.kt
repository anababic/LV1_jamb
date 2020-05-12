object BacajKockice {
    fun bacanje(brojKockica: Int): List<Int> {
        val kockice = IntArray(brojKockica)

        return kockice.map {
            val rand = Math.random()
            dodajVrijednost(rand)
        }
    }

    private fun dodajVrijednost(rand: Double): Int {
        if (rand < 1.0 / 6.0)
            return 1

        if (rand < 2.0 / 6.0)
            return 2

        if (rand < 3.0 / 6.0)
            return 3

        if (rand < 4.0 / 6.0)
            return 4

        if (rand < 5.0 / 6.0)
            return 5

        return 6
    }
}