package com.example.transwellsummit.data

import androidx.constraintlayout.utils.widget.MockView
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Session(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val presenter: String,
    val room: Int,
    val description: String,
    val favorite: Int,
    val poster: String,
) {

    companion object {

        fun MockK () = Session(
            id = 0,
            title = "Session Mock",
            presenter = "Dr. Zayus",
            room = 111,
            description = "Frozen II, also known as Frozen 2, is a 2019 American 3D computer-animated musical fantasy film produced by Walt Disney Animation Studios. The 58th animated film produced by the studio, it is the sequel to the 2013 film Frozen and features the return of directors Chris Buck and Jennifer Lee, producer Peter Del Vecho, songwriters Kristen Anderson-Lopez and Robert Lopez, and composer Christophe Beck. Lee also returns as screenwriter, penning the screenplay from a story by her, Buck, Marc E. Smith, Anderson-Lopez, and Lopez,[2] while Byron Howard executive-produced the film.[a][1] Veteran voice cast Kristen Bell, Idina Menzel, Josh Gad, Jonathan Groff, and Ciarán Hinds return as their previous characters, and they are joined by newcomers Sterling K. Brown, Evan Rachel Wood, Alfred Molina, Martha Plimpton, Jason Ritter, Rachel Matthews, and Jeremy Sisto.",

            favorite = 0,
            poster = "https://user-images.githubusercontent.com/24237865/75087936-5c1d9f80-553e-11ea-81d3-a912634dd8f7.jpg",
        )
    }
}