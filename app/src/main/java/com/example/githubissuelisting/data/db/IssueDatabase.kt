package com.example.githubissuelisting.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.githubissuelisting.data.model.issuedetail.IssueDetails
import com.example.githubissuelisting.data.model.issuelist.IssueList

@Database(entities = [IssueList::class, IssueDetails::class],
version = 1,
exportSchema = false
)
abstract class IssueDatabase : RoomDatabase(){
    abstract fun issueDao(): IssueDAO
    abstract fun issueDetailDao(): IssueDetailDAO
}