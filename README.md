# API WhatsApp Update Feature


[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MarceloDesignCreate/application15-v1.0.1/blob/master/license)

# application15


# Sobre o projeto


# Layout  mobile

Answer machine

![Deck Funtions Meta Developer menu extendido na video conferencia](https://user-images.githubusercontent.com/11893173/229387878-86606cf7-54c8-4071-892f-1d8383ebde98.png)


Extended  menu

![Deck Funtions Meta Developer - menu extendido na  Call](https://user-images.githubusercontent.com/11893173/229388682-b4655a8a-410f-4d40-86af-1c92a7295276.png)



Built with AndroidX Support

Requires Android Studio Arctic Fox | 2020.3.1 or higher.

Current Kotlin Version 1.5.30


### SDK Versions

compileSdkVersion 31

buildToolsVersion "30.0.1"

minSdkVersion 23

targetSdkVersion 31


### Libraries

1. Retrofit- REST API Call
https://square.github.io/retrofit/
2. Glide - Image Loading and caching.
https://github.com/bumptech/glide
3. Material Design Components - Google's latest Material Components.
https://material.io/develop/android
4. koin - Dependency Injection
https://insert-koin.io/

### Figma design guideline for better accuracy

Read our guidelines to increase the accuracy of design conversion to code by optimizing Figma designs. 
https://docs.dhiwise.com/knowledgehub/reference-guide-and-tools/figma.

### App Navigation

Check your app\'s UI from the AppNavigation screens of your app.

### Package Structure


```
├── appcomponents       
│ ├── di                 - Dependency Injection Components 
│ │ └── MyApp.kt
│ ├── network            - REST API Call setup
│ │ ├── ResponseCode.kt
│ │ └── RetrofitProvider.kt
│ └── ui                 - Data Binding Utilities
│     └── CustomBindingAdapter.kt
├── constants            - Constant Files
│ ├── IntegerConstants.kt
│ └── StringConstants.kt
├── extensions           - Kotlin Extension Function Files
│ └── Strings.kt
├── modules              - Application Specific code
│ └── example            - A module of Application 
│  ├── ui                - UI handling classes
│  └── data              - Data Handling classes
│    ├── viewmodel       - ViewModels for the UI
│    └── model           - Model for the UI
└── network              - REST API setup
  ├── models             - Request/Response Models
  ├── repository         - Network repository
  ├── resources          - Common classes for API
  └── RetrofitService.kt
```
