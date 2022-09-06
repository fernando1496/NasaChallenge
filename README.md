CONTENTS OF THIS FILE
---------------------

* Introduction
* Requirements
* Recommended modules
* Installation
* Configuration
* How to run

INTRODUCTION
------------

This project was created with the purpose to complete the different point of the challenge. The framework was built using
a json driven approach, the framework cover UI* and API features. This project was developed using Java as coding language,
rest assured to mock the endpoints, TestNG to manage test cases, Allure reports for reports and POM
as a design pattern.


REQUIREMENTS
------------

This module requires the following dependencies:

* Java 8 
* Rest assured
* Lombok
* Jackson
* TestNG
* Allure reports


INSTALLATION
------------
Every dependency is already configured in the project, so only external configurations are needed in order to set it up in a new environment.


CONFIGURATION
-------------

* Token should be replaced with the generated token, this is done in the config.properties file, replace "DEMO_KEY" in api_key_value=DEMO_KEY


PROJECT EXECUTION GUIDE
-------------
The project helps keeping a high quality product, therefore the objectives of having an automation framework are the following:

* Ensure that the endpoints response is correct.
* Ensure that nothing affected in a negative way after a deployment.
* Provide stakeholders with rapid and accurate feedback in the status of the product.
* Ensure that the endpoints are working properly and have the correct json structure.

In order to fulfill these objectives, the automation framework need to be executed as described below:
* API regression tests must be executed 2 times a day to verify endpoints status.
* UI and API regression tests must be executed after a big deployment to the environments.
* UI regression tests must be executed before publishing the application.
* UI smoke tests must be executed after doing a change to a feature that may affect other features

After every execution reports will be created, they must be published and shared with the stakeholders and team working
in th project.

In the case of a test failure, the test must be run isolated to verify if it was a flaky test or a bug
in the application. Data will be provided by the logs and the reports that are generated after every execution.

How to run
-------------
In run configruation selecet TestNG and select the suite/class you want to execute.
