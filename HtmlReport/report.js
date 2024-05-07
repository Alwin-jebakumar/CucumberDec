$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel Using Adactin Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1835100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-using-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Jersily"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Click On The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Url()"
});
formatter.result({
  "duration": 2227517800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 196404900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 91388100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 663847800,
  "status": "passed"
});
formatter.after({
  "duration": 153700,
  "status": "passed"
});
});