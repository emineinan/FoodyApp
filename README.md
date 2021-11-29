# FoodyApp
FoodyApp is an application where you can filter and list recipes and save your favorite recipes.

## API
I preferred [spoonacular API](https://spoonacular.com/food-api) for retrieving data.
You can visit [spoonacular API Doc](https://spoonacular.com/food-api/docs) and create your own api key. 

## Setup
You should update api key in build.gradle file if you want to filter and list recipes and save your favorite recipes in this application.

## Architecture
This application is developed MVVM clean archirecture.

## Libraries Used
- [Hilt](https://dagger.dev/hilt/gradle-setup) for dependency Injection
- [Retrofit](https://square.github.io/retrofit/)
- [Room](https://developer.android.com/training/data-storage/room)
- [Flow](https://developer.android.com/kotlin/flow)
- [Coil](https://github.com/coil-kt/coil)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) for managing background threads with simplified code and reducing needs for callbacks
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) and [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [Navigation](https://developer.android.com/guide/navigation)
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore)

## Features
- Recipes and Detail
- Favorite Recipes
- Food Jokes
- Searching Recipes
- Applying Filter to Recipes

## Preview
<table>
  <tr>
    <td> <b> Listing Recipes </b> </td>
  </tr>
  <tr>
    <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143836189-e00a25db-3709-4127-be44-d20c640b7a8b.png  height="480" width="270"></td>
  </tr>
 </table>
 
 <table>
  <tr>
    <td> <b> Recipe Detail & Overview </b> </td>
    <td> <b> Recipe Detail & Ingredients </b> </td>
    <td> <b> Recipe Detail & Instructions </b> </td>
  </tr>
  <tr>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143836446-b42ef961-66cb-4c0c-8091-da4d6aa1e24f.png height="480" width="270"<br>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143836449-5a14b65c-f65a-4c71-9d4d-bfe331426030.png height="480" width="270"<br>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143836453-3e209bda-060c-4081-bf61-18d2c5616ac3.png height="480" width="270"></td>
  </tr>
 </table>
 
  <table>
  <tr>
    <td> <b> Favorites </b> </td>
    <td> <b> Food Jokes </b> </td>
  </tr>
  <tr>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143839033-3f23f714-536a-4804-9cc3-7e2161938af2.png height="480" width="270"<br>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143839038-ee351eda-54e7-4250-81e6-4aeb00de9aed.png height="480" width="270"</td>
  </tr>
 </table>
 
  <table>
  <tr>
    <td> <b> Searching Recipes </b> </td>
    <td> <b> Applying Filter to Recipes </b> </td>
  </tr>
  <tr>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143839628-6f3d10d7-b8f6-4111-a45e-7fc780255896.png height="480" width="270"<br>
     <td valign="top"><img src=https://user-images.githubusercontent.com/56589369/143839633-c87ed06e-fe26-4acc-8fa5-2512017289c8.png height="480" width="270"</td>
  </tr>
 </table>
