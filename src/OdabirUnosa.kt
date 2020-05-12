object OdabirUnosa {
    fun odaberi(moguciUnosi: Map<String, Int>): Pair<String, Int> {

        val moguciUnosiLista = moguciUnosi.toList()

        println("Odaberi unos koji zelis:")

        moguciUnosiLista.forEachIndexed { index, pair ->
            println("${index + 1}\t${pair.first}\t${pair.second}")
        }

        var unos = readLine()!!.toInt()

        while (!moguciUnosiLista.indices.contains(unos - 1)) {
            println("$unos nije moguc. Probaj ponovo!")
            unos = readLine()!!.toInt()
        }

        return moguciUnosiLista[unos]
    }
}