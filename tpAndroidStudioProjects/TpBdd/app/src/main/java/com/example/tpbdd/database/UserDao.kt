package com.example.tpbdd.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getUsers(): List<User>

    @Query("Select * FROM User WHERE id=:id")
    fun getUserById(id: Int): User

    @Insert
    fun insert(vararg user: User)

    @Delete
    fun delete(user: User)

    @Query("DELETE FROM User")
    fun deleteAll()

}