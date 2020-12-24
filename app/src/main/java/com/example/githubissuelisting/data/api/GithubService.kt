package com.example.githubissuelisting.data.api

import com.example.githubissuelisting.data.model.issuedetail.IssueDetails
import com.example.githubissuelisting.data.model.issuelist.IssueList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("/repos/{owner}/{repo}/issues")
    suspend fun getIssueList(@Query("state")issueState:String):Response<IssueList>

    @GET("/repos/{owner}/{repo}/issues/{issue_number}")
    suspend fun getIssueDetails():Response<IssueDetails>
}