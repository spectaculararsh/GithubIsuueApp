package com.example.githubissuelisting.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.githubissuelisting.data.model.issuelist.IssueListItem

@Dao
interface IssueDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveIssues(issue: List<IssueListItem>)

    @Query("DELETE FROM issue_list")
    suspend fun deleteAllIssues()

    @Query("SELECT * FROM issue_list")
    suspend fun getIssuesList(issues: List<IssueListItem>)

}