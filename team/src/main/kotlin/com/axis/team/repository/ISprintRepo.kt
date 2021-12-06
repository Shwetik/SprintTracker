package com.axis.team.repository

import com.axis.team.entity.Sprint
import org.springframework.data.mongodb.core.aggregation.AggregationResults
import org.springframework.data.mongodb.repository.Aggregation
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ISprintRepo : MongoRepository<Sprint, String> {

    @Aggregation(
        pipeline = ["""{${"$"}project: {
        _id: 0,
     }}""", """{${"$"}group: { 
          _id: ${"$"}ProductBacklog',
          Sprint_Velocity: {${"$"}avg: ${"$"}StoryPoints},
          }
      }"""]
    )
    fun findSprintVelocity(prodbacklog: String): AggregationResults<Any>
}