package com.axis.team.service

import com.axis.team.entity.Sprint
import org.springframework.data.mongodb.core.aggregation.AggregationResults
import java.util.*

interface ISprintService {

    fun addSprint(sprint: Sprint):Any?
    fun getAllSprint(): MutableList<Sprint?>
    fun getSprintById(Id: String): Optional<Sprint?>
    fun getSprintVelocity(prodbacklog:String): AggregationResults<Any>

}