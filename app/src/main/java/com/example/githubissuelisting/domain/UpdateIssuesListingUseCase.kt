package com.example.githubissuelisting.domain

import com.example.githubissuelisting.IssueListRepository
import com.example.githubissuelisting.data.model.issuelist.IssueListItem

class UpdateIssuesListingUseCase(private val issueListRepository: IssueListRepository) {
    suspend fun execute():List<IssueListItem>? = issueListRepository.updateIssueList()
}