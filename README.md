# ReadMe

# CARSPOTTER Group Members:

### ST10090394 - Richard Pettitt
### ST10133787 - Ntando Ngubeni
### ST10090100 - Phemelo Sebopela
### ST10143427 - Azile Nzimande
### ST10050374 - Chelsea Lennet
### ST10090454 - Muaaz Jassat

# Youtube Link:
https://youtu.be/0jAEoab_lcU : Part 2
https://youtu.be/jNvYGc3tQao : Part 3 Final

# Description:
CARSPOTTER is a user-friendly mobile app designed for Vehicle enthusiasts and Speed Lovers. Whether you're a vehicle owner or fuel junky, CARSPOTTER is your go-to companion for Car spotting turned into an app.

## Requirements

To run the project, ensure you have the following installed:

- **Android Studio (latest version)**
- **JDK 11+**
- **Firebase** configuration (Google Services JSON file)
- **Google Maps API Key**
- **Git** installed locally

---

## Setup Instructions

1. **Clone the Repository**

   Open your terminal or command prompt and run the following command:

   ```bash
   git clone https://github.com/ST10090394/Car-Spotter-OPSC7312.git
   cd Car-Spotter-OPSC7312

# App Features:
## SSO (Single Sign-On) Registration and Login:
•	Users can register and login securely using an SSO method.
•	Your account allows you to keep track of your car spotting and access your saved data.
![Alt text](https://i.imgur.com/MVH12hN.png)

## 	Interactive Map:
•	CARSPOTTER integrates a dynamic map feature that enhances your carspotter adventures.  
•	With your permission, the app retrieves your location, so you can explore car hotspots nearby.
![Alt text](https://i.imgur.com/OKuUhJY.png)

## 	Discover CAR Hotspots:
•	Easily locate carspotting hotspots on the map.  
•	Explore popular car areas or discover hidden gems for car spottings.

##	Save Car Spottings:
•	CARSPOTTER lets you record your car spotting with a few simple taps.  
•	Capture car names, and even add photos to create a personal carspotting journal.
![Alt text](https://i.imgur.com/ifUVgRv.png)

## 	View Your Carspotting History:
•	Access your car spotting history at any time.  
•	Review past spottings, share them with fellow spotters, and track your progress as you continue your carspotting journey.
## Why CARSPOTTER?
•	Connect with Cars: CARSPOTTER brings you closer to the wonders of the car world. Explore the avian diversity in your area and beyond.  
•	User-Friendly Interface: The app is designed for all levels of carspotters, from beginners to experts. Its intuitive design ensures a seamless and enjoyable experience.  
•	Community Sharing: Connect with a community of fellow spotters, share your spottings, and discover new car based on shared experiences.  
•	Educational Resource: CARSPOTTER is a valuable educational resource. Learn more about cars, their parts, and engines through our integrated database.

## Download CARSPOTTER today and embark on a journey of discovery as you observe, record, and share your carspotting experiences.

# Error features:
- The team faced struggles trying to implement user navigation as we have attempted to extensively include it as we have added the code functionality to the project.
- We also provided the action of adding a car hotspot to the map display, it works correctly in adding it, however it does not operate cohesively as we intended.
- The team initially had issues for the settings page, however the functionality works as intended.

# Google Play Dashboard link to Carspotter App:

## Documentation:

# The App's Objective:
# The CarSpotter app seeks to:
- Provide a forum for auto enthusiasts to exchange research results.
- Make it possible to monitor vehicles using sightings submitted by users.
- Improve interaction with offline assistance and real-time alerts.
- Use biometric verification and single sign-on to guarantee ease and security.
- Encourage accessibility by offering a variety of languages, including South African ones.

## Design Factors:
-  User Interface: A simple, intuitive UI that follows Material Design guidelines and is responsive on all devices.
- Biometric Authentication: Used to provide safe access, this system supports facial and fingerprint recognition.
- Multi-Language Support: To improve accessibility for local users, the software provides a minimum of one South African language in addition to English.
- Offline Syncing: When connectivity is restored, the app will automatically sync data entered offline using RoomDB.
- Push Alerts: Use Firebase Cloud Messaging to get alerts and updates in real time.
- REST API Integration: To manage backend data storage as well as retrieval, the application communicates with a hosted REST API guaranteeing a dependable connection to a NoSQL database.
- Error Handling: Applied throughout the application to eliminate crashes caused by incorrect inputs, giving users immediate feedback.

## Features:
- User Registration and Login: Many well-known suppliers provide single sign-on (SSO).
- Biometric Authentication: Safe login with face recognition or fingerprints.
- Real-Time Notifications: Push alerts for modifications to the models of cars you've saved.
- Support for Multiple Languages: English as well as South African languages are available.
- Offline Mode with Sync: Information kept offline and synchronized automatically.
- Settings: An in-app settings menu allows users to personalize their experience.
- GitHub Version Control: Consistent updates, commits, and release labeling.

## GitHub and GitHub Actions:
# Using GitHub:
- Regular Commits: Regular commits that record developments and modifications.
- README Documentation: Comprehensive details on the design, setup, and operation of the application.
- Version Tagging: For convenience, the final release is marked.

# GitHub Actions:
- Automated Testing: To guarantee code stability, tests are run automatically with every push.
- Build Verification: The app's compilation and successful completion of all tests in various environments are verified by the GitHub Actions build process.
- Deployment Readiness: Verifies that the application passes all tests and builds without errors, ensuring it is production-ready.

## Instructions for Setup:
-  Make a clone of the repository
- Set up Firebase: To integrate Firebase, include the google-services.json file.
- Launch the App: Create and launch the application on an Android smartphone (final submission is not advised to use an emulator).
- Enable Database and API: Establish a connection with your provided REST API to store data.

# References:
•	Mapbox. (n.d.). Android Turn-by-Turn Navigation. Retrieved October 18, 2023, from https://docs.mapbox.com/android/navigation/guides/turn-by-turn-navigation/  
•	iFresHD. (2016, May 3). Android Studio Tutorial - Google Maps Directions API [Video]. YouTube. https://www.youtube.com/watch?v=iEpX-pkepKU  
•	Code City. (2019, May 26). Android Google Maps - Drawing Route Between Two Points [Video]. YouTube. https://www.youtube.com/watch?v=lAckLFH7mIE Simplified Coding. (2018, January 24). Android Google Maps Drawing Route | Fetching Distance and Duration [Video]. YouTube. https://www.youtube.com/watch?v=DDEBhPVKuRY  
•	EDMT Dev. (2017, July 28). Android Google Maps Direction API - Google Maps Nearby Places [Video]. YouTube. https://www.youtube.com/watch?v=kMrsk4tbZ7Q  
•	Mapbox. (n.d.). Mapbox GL Directions Example. Retrieved October 18, 2023, from https://docs.mapbox.com/mapbox-gl-js/example/mapbox-gl-directions/  
•	Gupta, R. (2018, October 22). Haversine Formula to Calculate Distance between Two Points in Haversine Formula - Calculate Geographic Distance on Earth. iGIS Map. https://www.igismap.com/haversine-formula-calculate-geographic-distance-earth/  
•	Mapbox. (n.d.). Android Fetch a Route Example. Retrieved October 18, 2023, from https://docs.mapbox.com/android/navigation/examples/fetch-a-route/  
•	Raja, S. (2017, October 12). Android Kotlin Tutorial - Google Maps [Video]. YouTube. https://www.youtube.com/watch?v=FKDyAdYVQ2c  
•	Garg, A. (2021, January 23). Login and Registration in Android using Firebase in Kotlin. GeeksforGeeks. https://www.geeksforgeeks.org/login-and-registration-in-android-using-firebase-in-kotlin/  
•	Raja, S. (2017, October 16). Android Kotlin Tutorial - Get Current Location | Android Studio [Video]. YouTube. https://www.youtube.com/watch?v=hurcmk_4QCM  
•	Agarwal, P. (2020, May 4). Get Current Location in Android Studio using Kotlin. Techpassmaster. https://techpassmaster.com/get-current-location-in-android-studio-using-kotlin/  
•	Smith, J. (2022). Amazing Nature Documentary. Retrieved from https://youtu.be/p0nhM5irW7Y?si=EZxkt8ta74oLfOfI. Accessed on October 18, 2023.  
•	Save Data in Firebase Realtime Database using Kotlin | Realtime Database | Kotlin | Android Studio. 2021. YouTube video, added by Foxandroid. [Online]. Available at: https://www.youtube.com/watch?v=MFcMw9jJA9o [Accessed 13 November 2023]  
•	How to Retrieve Data from Firebase Database using Kotlin | Realtime Database | Kotlin. 2021. YouTube video, added by Foxandroid. [Online]. Available at: https://www.youtube.com/watch?v=EMM_3Wld2jU [Accessed 13 November 2023]  
•	Mapbox docs. Display the user’s location. [Online]. Available at: https://docs.mapbox.com/android/maps/examples/location-tracking/ [Accessed 13 November 2023]  
•	Web API Android Studio Kotlin Tutorial | REST. 2022. YouTube video, added by Code With Cal. [Online]. Available at: https://www.youtube.com/watch?v=hurcmk_4QCM [Accessed 13 November 2023]  
•	W3<a/>. Android Intents. [Online]. Available at: https://www.w3adda.com/android-tutorial/android-intents [Accessed 13 November 2023]  
•	GeeksforGeeks. How to Send Data From One Activity to Second Activity in Android?. [Online]. Available at: https://www.geeksforgeeks.org/how-to-send-data-from-one-activity-to-second-activity-in-android/ [Accessed 13 November 2023]  
•	AbhiAndroid. Retrofit Tutorial With Example In Android Studio [Step by Step]. [Online]. Available at: https://abhiandroid.com/programming/retrofit#gsc.tab=0 [Accessed 13 November 2023]  
•	Wisodewo. D. Fetch data from API in Android Studio (Kotlin) using Retrofit with MVVM Architecture, Medium. [Blog]. Available at: https://medium.com/@dimaswisodewo98/fetch-data-from-api-in-android-studio-kotlin-using-retrofit-with-mvvm-architecture-4f6b673f6a28 [Accessed 13 November 2023]  
•	Mapbox Docs. Route generation. [Online]. Available at: https://docs.mapbox.com/android/navigation/guides/turn-by-turn-navigation/route-generation/ [Accessed 13 November 2023]  
•	Mapbox Docs. Turn-by-Turn Navigation. [Online]. Available at: https://www.mapbox.com/use-cases/turn-by-turn-navigation [Accessed 13 November 2023]
•	Mapbox Docs. Display navigation directions. [Online]. Available at: https://docs.mapbox.com/mapbox-gl-js/example/mapbox-gl-directions/ [Accessed 13 November 2023]
•	Sharma, A. 2023. How to upload an app to google play store, appinventiv, 13 June 2023. [Blog]. Available at: https://appinventiv.com/blog/how-to-submit-app-to-google-play-store/ [Accessed: 14 November 2023].
•   Google (2019). Firebase Authentication  |  Firebase. [online] Firebase. Available at: https://firebase.google.com/docs/auth [Accessed 28 Sep. 2024].
•   Android Developers. (2024). Identity. [online] Available at: https://developer.android.com/identity [Accessed 28 Sep. 2024].
•   Webdamn (2017). Create Material Design Login and Register Form | WD. [online] WD | Web Developer Blog. Available at: https://webdamn.com/create-material-design-login-and-register-form/ [Accessed 28 Sep. 2024].
•   Anumshafiq (2023). Retrofit for API Calls with Hilt Dependency Injection. [online] Medium. Available at: https://medium.com/@anumshafiq89/retrofit-for-api-calls-with-hilt-dependency-injection-5c470228ba94 [Accessed 28 Sep. 2024].
•   Android Developers. (2024b). Save key-value data. [online] Available at: https://developer.android.com/training/data-storage/shared-preferences [Accessed 28 Sep. 2024].
•   Android Developers. (2019). Espresso  |  Android Developers. [online] Available at: https://developer.android.com/training/testing/espresso [Accessed 28 Sep. 2024].
