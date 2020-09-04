
## /courses/{courseId}/pre-registration

## Method: POST
#### API Access Roles: [LEARNER]

All variable follow  default expects below table
* Default Min Size : 3
* Default Max Size : 30
* Default Value : from user
* Required : all
* Type: String

## will save automatically
Variable  | Type | Required | Min Size | Max Size | Default value
------------- | ------------- | ------------- | ------------- | ------------- | -------------
creatorUserId  | String  | required | -- | -- | loggedUserId

---
Requested URL : http://localhost:33001/courses/{courseId}/pre-registration<br>
--

Request Body
```json
      {
         "interestLevel":5
      }
```
**Response:** <br>
Success: 200<br>
Error: 401
```json
      {
         "preRegistrationId": "rftew-ewrt-ewrgtew",
         "orientationDateTime":"21-20-2020 12:30"
      }

```
