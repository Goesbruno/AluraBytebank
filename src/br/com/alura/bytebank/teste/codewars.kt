package br.com.alura.bytebank.teste


fun main() {
    val a = intArrayOf(1, 1, 1, 2, 3, 2, 3, 4)
    EnoughIsEnough.deleteNth(a, 2)
    EnoughIsEnough.deleteNth(intArrayOf(20, 37, 20, 21), 1)
    EnoughIsEnough.deleteNth(intArrayOf(1, 1, 3, 3, 7, 2, 2, 2, 2), 3)
    EnoughIsEnough.deleteNth(intArrayOf(1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1), 3)
    EnoughIsEnough.deleteNth(intArrayOf(), 5)
}

object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {

        val valuesElementsMapMutable = elements.groupBy { num -> num }
            .toMutableMap().values
            .toMutableList() as MutableList<MutableList<Int>>

        for (list in valuesElementsMapMutable) {
            if (list.size > maxOcurrences) {
                do {
                    list.remove(list.last())

                } while (list.size > maxOcurrences)
            }
        }


        val listaMutable = mutableListOf<Int>()
        for (list in valuesElementsMapMutable) {
            listaMutable += list
        }
        val listaFinal = listaMutable.toIntArray()
        println(listaFinal.contentToString())
        return listaFinal

    }
}
