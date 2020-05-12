class Bacanje(
    private val odabirKockica: (List<Int>) -> Pair<List<Int>, Boolean>) {

    fun bacaj(kockice: List<Int>): Pair<List<Int>, Boolean> {

        val odabir =
            if (kockice.isEmpty()) {
                Pair(listOf(), false)
            }
            else {
                odabirKockica(kockice)
            }

        val zadrzaneKockice = odabir.first
        val zadrzaneSveKockice = odabir.second

        if (zadrzaneSveKockice) {
            return Pair(kockice, true)
        }

        val kockiceZaBacanje = 6 - zadrzaneKockice.size

        val bacanjeKockica = BacajKockice.bacanje(kockiceZaBacanje)

        val noveKockice = arrayListOf<Int>()

        noveKockice.addAll(zadrzaneKockice)
        noveKockice.addAll(bacanjeKockica)

        noveKockice.forEach {
            print("$it ")
        }

        return Pair(noveKockice, false)
    }
}