object MoguciUnosi {
    fun get(listic: Listic, unosi: Unosi): Map<String, Int> {
        val fromUnosi =
            unosi.polja
                .filter { field -> listic.unosi.get(field.key) == null }
                .toList()

        val arrayList = arrayListOf<Pair<String, Int>>()

        arrayList.addAll(fromUnosi)

        return arrayList.toMap()
    }
}