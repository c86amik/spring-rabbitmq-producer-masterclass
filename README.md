# spring-rabbitmq-producer-masterclass

## A good understanding of the usage of Rabbit MQ Publisher/Producer using Spring Boot

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://gramfile.com/git-bash-download/)
* [Erlang](https://www.erlang.org/downloads)
* [Rabbit MQ](https://www.rabbitmq.com/install-windows.html#installer)


### Steps to install Erlang
* Go to Erland Download Page as mentioned above
* Click on the OTP 24.0 Windows 32-bit/64-bit Binary File (Based on the bit of your operating system click the desired link)
* It will download the exe file
* Double click on the exe file
* It will start installing on your local machine in default (Program Files) folder location
* After successful installation set the PATH variables
* Open the Environment Variables from Advance System Settings
* Click on Add
* Set the Name as `ERLANG_HOME`
* Set the Value as `C:\Program Files\erl-24.0`
* After that modify the `PATH` variable and put the value as `%ERLANG_HOME%\bin\`
* To verify open `cmd` and run the command as `erl -version`. It will output the version of installed Erlang in your local machine

### Steps to install Rabbit MQ
* Download the .exe file from the Page as mentioned above in the [Software Required] section


### Steps to clone and run the application
* Install MySQL. Complete installation steps of [MySQL Workbench](https://dev.mysql.com/downloads/mysql/) are provided
* If you face any problem while installing MySQL Workbench, then you can install SQLYog as mentioned in the Software Required steps
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-data-jpa-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7110</strong>
* Open the Postman and test the REST Endpoints

### Testing using Postman
<ol>
<li><strong>Get All Users</strong> - localhost:7110/allUsers</li>
<li><strong>Save an User</strong> - localhost:7110/saveUser</li>
<li><strong>Update an User</strong> - localhost:7110/updateUser/{id}. Here <strong>{id}</strong> is the id of the record stored in MongoDB</li>
<li><strong>Delete an User</strong> - localhost:7110/deleteUser/{id}</li>
<li><strong>Get user by firstName</strong> - localhost:7110/getUserByFirstName/{firstName}</li>
<li><strong>Get user by lastName</strong> - localhost:7110/getUserByLastName/{lastName}</li>
<li><strong>Get user by mobileNo</strong> - localhost:7110/getUserByMobileNo/{mobileNo}</li>
<li><strong>Get user by Email</strong> - localhost:7110/getUserByEmail/{email}</li>
<li><strong>Get user by panNo</strong> - localhost:7110/getUserByPan/{panNo}</li>
<li><strong>Get user by name</strong> - localhost:7110/getUserByName/{firstName}/{lastName}. Here <strong>name</strong> is the combination of <strong>firstName</strong> and <strong>lastName</strong></li>
</ol>

#### Dummy JSON object
* Body for the <strong>POST</strong> Method   
<code>{
	"firstName" : ${firstName},
	"middleName" : ${middleName},
	"lastName" : ${lastName},
	"mobileNo" : ${mobileNo},
	"email" : ${email},
	"panNo" : ${panNo}
}</code>
* Body for the <strong>PUT</strong> method
<code>{
	"userId" : ${mySQL_Id},
	"firstName" : ${firstName},
	"middleName" : ${middleName},
	"lastName" : ${lastName},
	"mobileNo" : ${mobileNo},
	"email" : ${email},
	"panNo" : ${panNo}
}</code>

	