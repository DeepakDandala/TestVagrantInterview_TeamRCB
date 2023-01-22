# TestVagrantInterview_TeamRCB
This project contains tests asked by Test Vagrant as part of SDET interview process

Pre-requisites to run this project on your local:

1. Install JDK1.8+
2. Install git to clone the repo
3. Setup SSH keys for git authorization(Google out for instructions on how to do it)
4. Clone the repo
5. Install an IDE like eclipse or intelliJ
6. Import the cloned project to the IDE as an existing Maven project
7. Make sure to install TestNG from eclipse market place if you want to run from the IDE

In order to run this project follow the following steps:

1. To run from the IDE, go to the /src/test/resources/RCBTest.xml and open it
2. Right click anywhere inside the RCBTest.xml and select Run As->TestNG Suite
3. In the project explorer pane on the left side of the IDE, refresh the project, go to test-output->emailable-report.html or test-output->index.html and open those in your browser to see the results