object OdabirKockica {
    fun odaberi(kockice: List<Int>): Pair<List<Int>, Boolean> {

        println("Odaberi kockice koje zelis zadrzati")

        println("Razmakom odvoji poziciju kockice koju zelis zadrzati (1-6):")

        val unos = readLine()!!

        val split = unos.split(" ")

        val pozicijeKockica = split.map { it.toInt() - 1 }

        if (pozicijeKockica == listOf(0,1,2,3,4,5)) {
            return Pair(kockice, true)
        }

        val zadrzaneKockice =
            kockice.filterIndexed { index, die ->
                pozicijeKockica.contains(index)
            }

        return Pair(zadrzaneKockice, false)
    }
}