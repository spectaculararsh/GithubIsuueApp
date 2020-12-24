package com.example.githubissuelisting.data.model.issuedetail


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "issue_detail")
data class IssueDetails(
        @SerializedName("active_lock_reason")
    val activeLockReason: Any,
        @SerializedName("assignee")
    val assignee: Any,
        @SerializedName("assignees")
    val assignees: List<Any>,
        @SerializedName("author_association")
    val authorAssociation: String,
        @SerializedName("body")
    val body: String,
        @SerializedName("closed_at")
    val closedAt: Any,
        @SerializedName("closed_by")
    val closedBy: Any,
        @SerializedName("comments")
    val comments: Int,
        @SerializedName("comments_url")
    val commentsUrl: String,
        @SerializedName("created_at")
    val createdAt: String,
        @SerializedName("events_url")
    val eventsUrl: String,
        @SerializedName("html_url")
    val htmlUrl: String,
        @PrimaryKey
        @SerializedName("id")
    val id: Int,
        @SerializedName("labels")
    val labels: List<LabelX>,
        @SerializedName("labels_url")
    val labelsUrl: String,
        @SerializedName("locked")
    val locked: Boolean,
        @SerializedName("milestone")
    val milestone: Any,
        @SerializedName("node_id")
    val nodeId: String,
        @SerializedName("number")
    val number: Int,
        @SerializedName("performed_via_github_app")
    val performedViaGithubApp: Any,
        @SerializedName("repository_url")
    val repositoryUrl: String,
        @SerializedName("state")
    val state: String,
        @SerializedName("title")
    val title: String,
        @SerializedName("updated_at")
    val updatedAt: String,
        @SerializedName("url")
    val url: String,
        @SerializedName("user")
    val user: UserX
)