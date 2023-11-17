# The bug

1. start the app with `mvn clean quarkus:dev`
2. visit `http://localhost:8080/user` with your browser, it should work :blush:

   ![browser shows it works](screen1.png)

3. edit the code by commenting something harmless (like the `println`) in the `GreetingResource.kt`

   ![Edit controller code](screen2.png)

4. visit `http://localhost:8080/user` again with your browser, it should crash :confused:

   ![Refresh browser and it crashes](screen3.png)

5. Edit the `JsonModule.kt` with something harmless (like adding a new line), it should start :open_mouth:

   ![Edit Json Module and it starts working again](screen4.png)

   ![Browser works again](screen1.png)