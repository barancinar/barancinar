package com.barancinar.quiz3

class MatchRepository {
    fun getItemsSuperLig(): ArrayList<MatchModel> {
        val items = ArrayList<MatchModel>()

        items.add(
            MatchModel(1,132, R.drawable.bayrak, "TÜR S", "İY: 1-1", "MS", "13:30", "Göztepe","2-1", "Antalya"))
        items.add(
            MatchModel(2,133, R.drawable.bayrak, "TÜR S", "İY: 1-0", "MS", "13:30", "Kayseri","3-2", "Karabük"))
        items.add(
            MatchModel(3,136, R.drawable.bayrak, "TÜR S", "İY: 0-1", "MS", "16:00", "Y.Malatya","0-2", "Fenerbahçe"))
        items.add(
            MatchModel(4,148, R.drawable.bayrak, "TÜR S", "İY: 0-1", "MS", "19:00", "Galatasaray","2-1", "Konyaspor"))

        return items
    }

    fun getItemsBirinciLig(): ArrayList<MatchModel>{
        val items = ArrayList<MatchModel>()

        items.add(
            MatchModel(1,445, R.drawable.bayrak, "TÜR 1", "İY: 0-0", "MS", "13:00", "Gaziantep","2-1", "SamsunSpor"))
        items.add(
            MatchModel(2,487, R.drawable.bayrak, "TÜR 1", "İY: 0-2", "MS", "15:30", "Giresun","0-2", "Adana Demir"))
        items.add(
            MatchModel(3,542, R.drawable.bayrak, "TÜR 1", "İY: 3-1", "MS", "18:00", "Denizli","2-1", "ErzurumSpor"))
        items.add(
            MatchModel(1,425, R.drawable.bayrak, "TÜR 1", "İY: 0-9", "MS", "13:45", "BoluSpor","2-1", "PendikSpor"))
        items.add(
            MatchModel(2,765, R.drawable.bayrak, "TÜR 1", "İY: 3-2", "MS", "23:30", "KartalSpor","0-2", "EyüpSpor"))
        items.add(
            MatchModel(3,234, R.drawable.bayrak, "TÜR 1", "İY: 1-1", "MS", "14:00", "KaramanSpor","2-1", "ErzurumSpor"))

        return items
    }

    fun getItemsIngiltereLig(): ArrayList<MatchModel>{
        val items = ArrayList<MatchModel>()

        items.add(
            MatchModel(1,137, R.drawable.img, "INP", "İY: 0-3", "MS", "13:00", "Arsenal","0-1", "Watford"))
        items.add(
            MatchModel(2,279, R.drawable.img, "INP", "İY: 2-2", "MS", "15:30", "ManchesterU","2-2", "Fulham"))
        items.add(
            MatchModel(3,432, R.drawable.img, "INP", "İY: 4-1", "MS", "18:00", "Liverpool","2-1", "Westham"))

        items.add(
            MatchModel(1,137, R.drawable.img, "INP", "İY: 0-0", "MS", "13:00", "Brighton","1-1", "Crystal"))
        items.add(
            MatchModel(2,279, R.drawable.img, "INP", "İY: 1-2", "MS", "15:30", "Burnley","0-2", "Everton"))
        items.add(
            MatchModel(3,432, R.drawable.img, "INP", "İY: 0-5", "MS", "18:00", "Luton","2-1", "Chelsea"))

        return items
    }
}