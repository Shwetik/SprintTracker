package com.axis.master.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "Productbacklog")
data class Product(@Id
                        var id: String? = null,
                        var Role: String? = null,
                        var Task: String? = null,
                        var Result: String? = null,
                        var Status: String? = null,
                        var Priority: Int? = 0,
                        var TotalStoryPoints: Int? = 0,
                        var SprintId: Int? = 0)