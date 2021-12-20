
# Scrum Sprint Tracker

This project is about monitoring the Key Performance Indicator(KPI) of a Sprint, found in Scrum project management.

### Scrum Master (API : localhost:8080/master/**)

The Scrum master is responsible for creating the ProductBacklog for the Project which defines all the stories that needs to be completed in order to ship the product.

Product Model :-

- Role
- Task
- Result
- Status
- Priority
- TotalStoryPoints
- SprintId

Api :-

- localhost:8080/master/addProduct
- localhost:8080/master/getAllProduct
- localhost:8080/master/getProductById
- localhost:8080/master/deleteProduct

### Team (API : localhost:8080/team/**)

The Team is responsible to consume the Product ProductBacklog created by the Scrum Master and produce a Sprint Result.


Product Model :-

- UserStory
- Task
- Owner
- Status
- StoryPointsCompleted


Api :-

- localhost:8080/master/addSprint
- localhost:8080/master/getAllSprint
- localhost:8080/master/getSprintById


Key Performance Indicator (API : localhost:8080/team/getSprintVelocity)

