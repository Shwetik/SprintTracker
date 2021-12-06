package com.axis.team.service

import com.axis.team.entity.Sprint
import com.axis.team.repository.ISprintRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.aggregation.AggregationResults
import org.springframework.stereotype.Service
import java.util.*

@Service
class SprintServiceImpl :ISprintService {

    @Autowired
    private lateinit var iSprintRepo: ISprintRepo

    override fun addSprint(sprint: Sprint): Sprint {

        return iSprintRepo.save(sprint)
    }

    override fun getAllSprint(): MutableList<Sprint?> {

        return iSprintRepo.findAll()
    }

    override fun getSprintById(Id: String): Optional<Sprint?> {
        return iSprintRepo.findById(Id)
    }

    override fun getSprintVelocity(prodbacklog:String): AggregationResults<Any> {
        return iSprintRepo.findSprintVelocity(prodbacklog)
    }

}