package com.example.githubissuelisting.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.githubissuelisting.data.model.issuedetail.IssueDetails

@Dao
interface IssueDetailDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveIssuesDetails(issue: IssueDetails)

    @Query("DELETE FROM issue_detail")
    suspend fun deleteAllIssues()

    @Query("SELECT * FROM issue_detail")
    suspend fun getIssuesList(issueDetail: IssueDetails)
}