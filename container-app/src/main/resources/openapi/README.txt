1. 
cd "C:\Users\munabeel\git\spring-boot\container-app\src\main\resources\openapi"

2. 
mkdir temp

3. 
C:\Users\munabeel\Documents\jdk-21\bin\java -DapiDocs=true -jar "C:\Users\munabeel\.m2\repository\org\openapitools\openapi-generator-cli\7.1.0\openapi-generator-cli-7.1.0.jar" batch generator-config.yaml

4.

del C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_3_application\*ApiController.java
del C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_3_application\*ApiDelegate.java
del C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_2_presentation\*Api.java
del C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_2_presentation\ApiUtil.java
del C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_4_domain\api\model\*.java

copy .\temp\src\main\java\com\mna\container\app\_3_application\*ApiController.java ..\..\java\com\mna\container\app\_3_application
copy .\temp\src\main\java\com\mna\container\app\_3_application\*ApiDelegate.java ..\..\java\com\mna\container\app\_3_application
copy .\temp\src\main\java\com\mna\container\app\_3_application\*Api.java ..\..\java\com\mna\container\app\_2_presentation
copy .\temp\src\main\java\com\mna\container\app\_3_application\ApiUtil.java ..\..\java\com\mna\container\app\_2_presentation
copy .\temp\src\main\java\com\mna\container\app\_4_domain\api\model\*.java ..\..\java\com\mna\container\app\_4_domain\api\model

rm temp -r -force

(Get-Content C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_2_presentation\ApiUtil.java).Replace('package com.mna.container.app._3_application;', 'package com.mna.container.app._2_presentation;') | Set-Content C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_2_presentation\ApiUtil.java

Get-ChildItem 'C:\Users\munabeel\git\spring-boot\container-app\src\main\java\com\mna\container\app\_2_presentation\*Api.java' -Recurse | ForEach {
     (Get-Content $_ | ForEach  { $_ -replace 'package com.mna.container.app._3_application;', 'package com.mna.container.app._2_presentation;' }) |
     Set-Content $_
}