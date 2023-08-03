# API WhatsApp Update Feature


[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MarceloDesignCreate/application15-v1.0.1/blob/master/license)

#  Pitch Deck WhatsApp Update Feature


# Sobre o projeto

The application consists of improvements and updates of functions of the WhatsApp platform
among which we can highlight:

- . New functions in Call Rejected
- . New functions in the extended call duration menu
- . New functions in the extended menu during a group or individual video call
- . Answering machine
- . Push Notification
- . 3D Touch contact
- . 3D TouchHome
- . E-commerce
- . Event creation



# Layout  mobile

New functions in the extended call duration menu

![Deck Funtions Meta Developer menu extendido na video conferencia](https://user-images.githubusercontent.com/11893173/229387878-86606cf7-54c8-4071-892f-1d8383ebde98.png)


Extended  menu

![Deck Funtions Meta Developer - menu extendido na  Call](https://user-images.githubusercontent.com/11893173/229388682-b4655a8a-410f-4d40-86af-1c92a7295276.png)


New functions in Call Rejected

![Deck Funtions Meta Developer Ligação rejeitada](https://github.com/MarceloDesignCreate/application15-v1.0.1/assets/11893173/a873d01e-9b19-4db5-b196-3cbc971c193e)


Push Notification

![Deck Funtions Meta Developer notificação extendida](https://github.com/MarceloDesignCreate/application15-v1.0.1/assets/11893173/4ee7ec09-0a9a-42d1-8c86-07aa95255466)


Answering machine

![Deck Funtions Meta Developer - ansewer machine](https://github.com/MarceloDesignCreate/application15-v1.0.1/assets/11893173/efdd95d8-0492-43db-a673-252a872484c1)


More....



# Tecnologias utilizadas

## Back end
- Java
- Flutter

## Front end
- Figma
- Adobe illustrator

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


# Autor

Agência Marcelo Design Create
Marcelo Victor da Silva Nascimento

https://www.linkedin.com/in/marcelovictornascimento/

https://www.facebook.com/AgenciaMarceloDesignCreate

https://victormvsn23@gmail.com
