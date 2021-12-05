package com.axis.team.repository

import com.axis.team.entity.Sprint
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ISprintRepo : MongoRepository<Sprint, String> {
}