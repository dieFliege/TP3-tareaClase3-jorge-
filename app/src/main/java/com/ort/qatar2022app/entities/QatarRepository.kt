package com.ort.qatar2022app.entities

class QatarRepository {

    var qatarList : MutableList<Qatar> = mutableListOf()

    init {
        qatarList.add(Qatar("Qatar", "AFC", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Brasil", "CONMEBOL", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Bélgica", "UEFA", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Francia", "UEFA", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Argentina", "CONMEBOL", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Inglaterra", "UEFA", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("España", "UEFA", 1, "www.ole.com.ar"))
        qatarList.add(Qatar("Portugal", "UEFA", 1, "www.ole.com.ar"))

        qatarList.add(Qatar("México", "CONCACAF", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Países Bajos", "UEFA", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Dinamarca", "UEFA", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Alemania", "UEFA", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Estados Unidos", "CONCACAF", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Uruguay", "CONMEBOL", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Suiza", "UEFA", 2, "www.ole.com.ar"))
        qatarList.add(Qatar("Croacia", "UEFA", 2, "www.ole.com.ar"))

        qatarList.add(Qatar("Senegal", "CAF", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Irán", "AFC", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Japón", "AFC", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Marruecos", "CAF", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Serbia", "UEFA", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Polonia", "UEFA", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Corea del Sur", "AFC", 3, "www.ole.com.ar"))
        qatarList.add(Qatar("Túnez", "CAF", 3, "www.ole.com.ar"))

        qatarList.add(Qatar("Canadá", "CAF", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Camerún", "AFC", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Ecuador", "AFC", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Arabia Saudita", "CAF", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Ghana", "UEFA", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Nueva Zelanda / Costa Rica", "OFC / CONCACAF", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Perú / Australia / Emiratos Árabes", "CONMEBOL / AFC", 4, "www.ole.com.ar"))
        qatarList.add(Qatar("Gales / Ucrania / Escocia", "UEFA", 4, "www.ole.com.ar"))
    }

}