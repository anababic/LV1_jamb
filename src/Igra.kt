class Igra {
    fun runda(listic: Listic){
        val odabirKockica =
            { kockice: List<Int> -> OdabirKockica.odaberi(kockice) }

        val odabirUnosa =
            { moguciUnosi: Map<String, Int> -> OdabirUnosa.odaberi(moguciUnosi) }

        val baceneKockice = Bacanje(odabirKockica)

        var kockice = listOf<Int>()

        for (i in 1..3) {
            val result = baceneKockice.bacaj(kockice)

            kockice = result.first

            if (result.second) {
                break
            }
        }

        val unosi = Unosi(kockice)

        val MoguciUnosi = MoguciUnosi.get(listic, unosi)

        val odabranUnos = odabirUnosa(MoguciUnosi)
    }
}