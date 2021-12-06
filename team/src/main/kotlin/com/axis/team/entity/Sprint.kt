package com.axis.team.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "SprintBacklog")
data class Sprint(@Id
                 var _id: String? = null,
                 var UserStory: String? = null,
                 var Task: String? = null,
                 var Owner: String? = null,
                 var Status: String? = null,
                 var StoryPoints: Int = 0) {
}