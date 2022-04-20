package com.example.transwellsummit.data

class ItineraryDataSource(
    private val db: SessionDao
) {
    suspend fun addSessionToItinerary(session: Session) = db.addSessionToItinerary(session)
}