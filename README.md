# Tests can be run for different browsers by specifying a system property

Serenity currently has defaults to Firefox, but best to override the defaults as the following examples demonstrate

# Prerequisites
- Java 1.8 (There is issue with Java 10)

# first clone the project.  Then in the project do one of the following:

# Run on remote Selenium grid (Remote):
## choose one or both below
`mvn clean verify  -Dwebdriver.remote.url=http://<IP>:4444/wd/hub -Dwebdriver.driver=ie`

`mvn clean verify  -Dwebdriver.remote.url=http://<IP>7:4444/wd/hub -Dwebdriver.driver=chrome`




# Run locally on your machine, assuming chrome or firefox is installed in the default location on your machine:
## choose one or both below
* download appropriate webdriver from: [download link](https://chromedriver.storage.googleapis.com/index.html?path=2.33/) and unzip, et. al. into the chrome directory of this project

`mvn test verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=./chrome/chromedriver`
mvn clean verify -Dwebdriver.driver=chrome -Dcucumber.options="--plugin pretty" -DTARGET_HOST_BASE_URL=https://demo.titaniumrose.com/ 

* download appropriate webdriver from: [download link](https://github.com/mozilla/geckodriver/releases) and unzip, et. al. into the firefox directory of this project

`mvn test verify -Dwebdriver.driver=firefox -Dwebdriver.gecko.driver=./firefox/geckodriver`
mvn clean verify -Dwebdriver.driver=firefox -Dcucumber.options="--plugin pretty" -DTARGET_HOST_BASE_URL=https://demo.titaniumrose.com/ 