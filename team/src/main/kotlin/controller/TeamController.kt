package com.axis.team.controller

import com.axis.team.entity.Sprint
import com.axis.team.repository.ISprintRepo
import com.axis.team.service.ISprintService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/team")
class TeamController {

    @Autowired
    private lateinit var iSprintRepo: ISprintRepo

    @Autowired
    private lateinit var iSprintService: ISprintService

    @PostMapping("/addSprint")
    fun addSprint(@RequestBody sprint: Sprint): ResponseEntity<Any?> {
        var addParking = iSprintService.addSprint(sprint)
        return ResponseEntity(addParking, HttpStatus.OK)
    }

    @GetMapping("/getAllSprint")
    fun getAllSprint(): ResponseEntity<MutableList<Sprint?>>
    {
        var parkinglist = iSprintService.getAllSprint()
        return ResponseEntity(parkinglist, HttpStatus.OK)
    }

    @GetMapping("/getSprintById/{id}")
    fun getSprintById(@PathVariable id:String): ResponseEntity<Optional<Sprint?>> {
        var springDetails = iSprintService.getSprintById(id)
        return ResponseEntity(springDetails, HttpStatus.OK)
    }
}