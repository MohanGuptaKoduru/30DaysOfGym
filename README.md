# 30 Days of Gym Workouts

<!-- TODO: Add App Icon here -->
<p align="center">
  <img src="app/src/main/ic_launcher-playstore.png" alt="App Icon" width="150"/>
</p>

This Android application provides a 30-day gym workout plan. It's designed to guide users through a month-long fitness journey by suggesting a different exercise focus each day.

## Features

*   **30-Day Workout Plan:** Displays a curated list of exercises for a 30-day period.
*   **Daily Exercise Details:** Each day includes a specific exercise with:
    *   A descriptive title/heading.
    *   An illustrative image.
*   **Expandable Cards:** Users can tap on any day's card to view:
    *   A larger version of the exercise image.
    *   A detailed description of the workout.
*   **User-Friendly Interface:** Simple and intuitive design for easy navigation.

## Screenshots

Some of the glimses of the App

|OverAll App |   Day 1 | Day 9 | Day 30 Final Day  |
|------------------|------------------|------------------|----------------------|
|![overall app](https://github.com/user-attachments/assets/fc5fbb50-5904-4f0b-886c-9a5a0adeb469) | ![day2](https://github.com/user-attachments/assets/bd769d0d-8346-4285-ae8f-692fe02d5f35) | ![day 9](https://github.com/user-attachments/assets/0a21285e-5731-434e-9f33-4fed2bceeea1)|![final day](https://github.com/user-attachments/assets/c328e7a1-210e-4ece-8858-33754881de72)

## Technologies Used

*   **Kotlin:** The primary programming language for Android development.
*   **Jetpack Compose:** Android's modern toolkit for building native UI. Used for creating the app's user interface.

## Project Structure

The project follows a standard Android application structure:

*   `app/src/main/java/com/example/a30daysgym/`: Contains the core source code.
    *   `MainActivity.kt`: The main entry point of the application. It sets up the UI using Jetpack Compose and displays the list of daily gym workouts.
    *   `gym.kt`: Defines the `gym` data class (model for each workout day) and provides the `gymList` which is a predefined list of 30 workout entries, including titles, day numbers, image references, and description references.
    *   `ui/theme/`: Contains files related to the Jetpack Compose theme (colors, typography, etc.).
*   `app/src/main/res/`: Contains all non-code resources.
    *   `drawable/`: Image assets used for each workout.
    *   `values/strings.xml`: String resources for exercise titles, descriptions, and other text in the app.
*   `build.gradle.kts` (Project & App level): Gradle build scripts for managing dependencies and build configurations.

## Installation

To get a local copy up and running, follow these steps:

1.  **Prerequisites:**
    *   Ensure you have [Android Studio](https://developer.android.com/studio) installed.
    *   Git for cloning the repository.

2.  **Clone the repository:**
    ```bash
    git clone https://github.com/MohanGuptaKoduru/30DaysOfGym.git 
    ```
    (If you are working locally and don't have a remote URL yet, you can state: "Clone this repository to your local machine.")

3.  **Open in Android Studio:**
    *   Launch Android Studio.
    *   Select "Open" (or "File" > "Open...").
    *   Navigate to the directory where you cloned the repository and select it.

4.  **Sync Gradle:**
    *   Android Studio will typically start syncing the project with Gradle automatically once opened.
    *   If prompted, or if dependencies are not resolving, click on "Sync Project with Gradle Files" (this option is usually found in the "File" menu or as an icon in the toolbar, often resembling an elephant with a refresh symbol).

5.  **Set up an Emulator or Connect a Device:**
    *   To run the app, you'll need either an Android Virtual Device (AVD) or a physical Android device.
    *   You can create an AVD through Android Studio's AVD Manager (Tools > AVD Manager).
    *   If using a physical device, enable USB debugging and connect it to your computer.

6.  **Run the Application:**
    *   Once Gradle sync is complete and you have a target device/emulator selected, click the "Run 'app'" button (usually a green play icon) in the Android Studio toolbar.

## Usage

Once the app is installed and running:

1.  **Browse Workouts:** You will see a list of 30 daily workout suggestions.
2.  **View Details:** Each item in the list displays the day number, a title for the workout, and a small preview image.
3.  **Expand Card:** Tap on any workout item in the list. The card will expand to show:
    *   A larger, more detailed image of the exercise.
    *   A textual description of how to perform the workout or the focus for the day.
4.  **Collapse Card:** Tap the expanded card again (or the expand/collapse icon) to return to the compact view.
5.  **Scroll:** Scroll through the list to view all 30 days of the workout plan.

## Contributing

Contributions are welcome! If you have suggestions for improvements or want to contribute to the project, please follow these general guidelines:

1.  **Fork the Project:** Create your own fork of the repository.
2.  **Create your Feature Branch:** (`git checkout -b feature/AmazingFeature`)
3.  **Commit your Changes:** (`git commit -m 'Add some AmazingFeature'`)
4.  **Push to the Branch:** (`git push origin feature/AmazingFeature`)
5.  **Open a Pull Request:** Submit a pull request against the main repository's `main` or `master` branch.


### Resources 

* Images Generated using ai At  https://freeai.aihub.ren/.
* Fonts By Google


