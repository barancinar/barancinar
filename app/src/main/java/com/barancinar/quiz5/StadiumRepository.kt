package com.barancinar.quiz5

class StadiumRepository {
    fun getItems():ArrayList<StadiumModel> {
        val items = ArrayList<StadiumModel>()
        items.add(StadiumModel(1,R.drawable.el_beyt_img,"El-Beyt Stadium","60.000","Havr",R.drawable.like_icon_empty))
        items.add(StadiumModel(2,R.drawable.janoub_img,"El-Januub Stadium","40.000","Al Wakrah",R.drawable.like_icon_empty))
        items.add(StadiumModel(3,R.drawable.el_sumame_img,"Es-Sumame Stadium","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(4,R.drawable.luseyl_img,"Luseyl Stadium","80.000","Luseyl",R.drawable.like_icon_empty))
        items.add(StadiumModel(5,R.drawable.ahmad_img,"Ahmad Bin Ali Stadium","40.000","Umm Al Afaei",R.drawable.like_icon_empty))
        items.add(StadiumModel(6,R.drawable.thumama_img,"Al Thumama Stadium","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(7,R.drawable.education_img,"Education City Stadium","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(8,R.drawable.khalifa_img,"Khalifa International Stadium","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(9,R.drawable.stadium_974_img,"Stadium 974","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(5,R.drawable.ahmad_img,"Ahmad Bin Ali Stadium","40.000","Umm Al Afaei",R.drawable.like_icon_empty))
        items.add(StadiumModel(3,R.drawable.el_sumame_img,"Es-Sumame Stadium","40.000","Doha",R.drawable.like_icon_empty))
        items.add(StadiumModel(12,R.drawable.el_beyt_img,"El-Beyt Stadium","60.000","Havr",R.drawable.like_icon_empty))

        return items
    }
}