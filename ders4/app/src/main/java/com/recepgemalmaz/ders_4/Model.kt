package com.recepgemalmaz.ders_4


data class Kategori(var K_ID:Int = 0, var Aciklama:String = "")

data class Parca(
    var P_ID:Int = 0,
    var Kategori_ID:Int = 0,
    var Adi:String = "",
    var StokAdedi:Int = 0,
    var Fiyati:Long = 0L
)

class Veriler()
{
    public val kategoriler = listOf<Kategori>(
        Kategori(1, "Motor"),
        Kategori(2, "Elektrik"),
        Kategori(3, "Aksesuar"),
        Kategori(4, "Kaporta")
    )

    private val parcalar = listOf<Parca>(
        Parca(1, 1, "Segman Seti", 7, 1500L),
        Parca(2, 1, "Yağ Soğutucusu", 3, 3500L),
        Parca(3, 1, "Kasnak Gergisi", 20, 300L),
        Parca(4, 1, "Krank Keçesi", 30, 100L),
        Parca(5, 2, "Alternatör", 5, 6500L),
        Parca(6, 2, "Buji", 50, 200L),
        Parca(7, 3, "Difüzör", 2, 1500L),
        Parca(8, 3, "Pandizot", 9, 8500L),
        Parca(9, 4, "Kapı Sacı", 7, 500L)
    )

    fun GetParcalarByKategoriID(kid:Int) : MutableList<Parca>
    {
        var tmp = mutableListOf<Parca>()

        parcalar.forEach {
            if (it.Kategori_ID == kid)
            {
                tmp.add(it)
            }

            // tmp.add(parcalar.find { it.Kategori_ID == kid }!!)

        }

        return tmp
    }
}
