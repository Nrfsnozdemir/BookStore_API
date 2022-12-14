<h3 align="center">BookStore API Project</h3>  

* Swagger Documentation of the Application: https://demoqa.com/swagger/

* UI Page of the Application: https://demoqa.com/books
---

<!-- PROJECT LOGO --> 
<p align="center">
    <img src="images/bookStore_API.jpeg" width="700" height="500" title="book store">
</p>

#### TOOLS AND EXPLANATIONS

* The project has been prepared based on Cucumber BDD style.
* Maven build management tool is used in this project by Java language.
* In the project that includes six scenarios; 
  ````
  1- The first scenario is about "Create User for BookStore Using API POST request".
  2- The second scenario is about "Generate Token".
  3- The third scenario is about "Add Book to your account".
  4- The fourth scenario is about "GET user info and books from API and UI and verify them".
  5- The fifth scenario is about "Update book info for user".
  6- The sixth scenario is about "Delete User".
* For the test, a study has been done with these `end points`;
  ````
  apiBaseUrl: "https://demoqa.com",
  apiGenerateToken: "/Account/v1/GenerateToken",
  apiLogin: "/Account/v1/Login",
  apiAuthorized: "/Account/v1/Authorized",
  apiUser: "/Account/v1/User",
  apiGetUser: "/Account/v1/User/UUID",
  apiAddBook: /BookStore/v1/Books,
  uiLogin: "/login",
  uiProfile: "/profile",
  uiBooks: "/books"
* A special tag`(@wip1, @wip2, @wip3)` was used in the project. Thus, the desired feature can be run in Runner.

#### HOW TO RUN TESTS
```
-> Under the runner package "Runner" right click and run Runner. "src > test > java > runner > Runner"
-> mvn test --> in the IDE console or navigate project path in command line and run.
```

#### HOW TO CREATE TEST REPORTS

1) When you run tests with the **"mvn verify"** command from the console, you can see **Cucumber Html Report** under the target file.
-> **target** -> **cucumber-html-reports** > **overview-steps.html** (open with chrome option)

2) Second type of report, the project is run from **Runner** class, a **Cucumber Report link** is created in the IDE console automatically.
Sample link -> View your Cucumber Report at: (Works 24 hours later than it will delete automatically)
https://reports.cucumber.io/reports/d075d19d-4ccb-4e11-8da8-85e2220de650
Sample Screenshot -> **sample_cucumber_report.png**

3) The log documents are located at the project level under the **execution_log.txt** file.

#### SAMPLE NEWMAN REPORT

<!-- NEWMAN REPORT --> 
<p align="center">
    <img src="images/newman_report.jpg" width="700" height="800" title="newman report">
</p>

**Nurefsan Ozdemir**  
_Software Developer in Test_ :computer:

