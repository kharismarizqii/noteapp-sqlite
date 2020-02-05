package com.kharismarizqii.mynotesapp.helper

import android.database.Cursor
import com.kharismarizqii.mynotesapp.db.DatabaseContract
import com.kharismarizqii.mynotesapp.entity.Note

object MappingHelper {
    fun mapCursorToArrayList(notesCursor: Cursor): ArrayList<Note>{
        val noteList = ArrayList<Note>()
        notesCursor.moveToFirst()
        while (notesCursor.moveToNext()){
            val id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID))
            val title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.TITLE))
            val description = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DESCRIPTION))
            val date = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE))
        }
        return noteList
    }
}