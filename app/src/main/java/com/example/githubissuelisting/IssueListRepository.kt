package com.example.githubissuelisting

import com.example.githubissuelisting.data.model.issuelist.IssueListItem

interface IssueListRepository {

    suspend fun getIssueList(): List<IssueListItem>?
    suspend fun updateIssueList(): List<IssueListItem>?
}