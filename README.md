# Data Validator

Create a simple REST API service in Spring Boot, store the data in JSON format in MongoDB  and perform some simple data validations:

- Store the JSON request in MongoDB (refer to below incoming request sample using "id":"{{$randomInt}}") into:  An “incoming” collection
- Validate the data types of the incoming JSON request. (string, boolean, integer)
- Build the following methods to manage the data and store the results in a MongoDB “outgoing” collection:
  - Select the largest number from the array “numbersMeetNumbers”
  - Find any duplicates in the string “findDuplicates”
  - Remove whitespaces from “whiteSpacesGalore” without using replace()
  - Store the results of the above methods in a MongoDB “outgoing” collection for a GET request
- Write a unit test for one of the above methods (positive and negative)

```
curl --location --request POST 'http://localhost:8080/incoming' \

--header 'Content-Type: application/json' \

--data-raw '{
  "id": "426",
  "findDuplicates": "ababcdeafe",
  "whiteSpacesGalore": "ab cd b",
  "validateMeOnlyIActuallyShouldBeABoolean": false,
  "numbersMeetNumbers": [
    35,
    2000,
    100,
    15,
    75,
    25,
    99
  ]
}'
``
