# Shuffle String Generator

## Project Introduction

Shuffle String Generator is a random string generator application that helps users quickly generate various types of random strings. The app supports multiple modes, including lowercase letters only, uppercase letters only, mixed case, numbers only, and alphanumeric mixed modes, and allows users to customize the length of generated strings.

## Main Features

- 🎲 Multiple generation modes:
  - Lowercase letters
  - Uppercase letters
  - Mixed case
  - Numbers only
  - Alphanumeric mixed
- 📏 Custom string length
- 📋 One-click copy of generated results
- ❤️ Favorite your preferred strings
- 💾 Persistent data storage
- 🌍 Multi-language support (Simplified Chinese)

## Technical Highlights

### Development Technologies

- **Kotlin** - Primary development language
- **Jetpack Compose** - Modern Android UI toolkit
- **Material 3** - Google's latest design system
- **Android Architecture Components**

### Core Components

- **DataStore** - Used for persistent storage of favorite strings
- **Compose Runtime** - State management (`mutableStateOf`, `mutableStateListOf`)
- **Material Icons** - Using official icon library
- **Clipboard Manager** - Implementation of copy functionality

### Architecture Patterns

- **Declarative UI** - Building interfaces with Compose
- **Unidirectional Data Flow** - State management and UI updates
- **Functional Programming** - Composable function design

### Internationalization Support

- **Multi-language Resources** - Support for multi-language string resource management
- **Resource References** - Using `stringResource` to reference string resources

## Use Cases

- Generating random passwords
- Creating unique identifiers
- Test data generation
- Random name generation in games

## Screenshots

(Add application interface screenshots here)

## Installation Instructions

1. Clone the project to your local machine
2. Open the project with Android Studio
3. Sync Gradle dependencies
4. Build and run the application

## Dependencies

```gradle
// Compose related
implementation "androidx.compose.ui:ui:$compose_version"
implementation "androidx.compose.material3:material3:$compose_version"
implementation "androidx.compose.material:material-icons-extended:$compose_version"

// DataStore
implementation "androidx.datastore:datastore-preferences:1.0.0"

// Lifecycle
implementation "androidx.lifecycle:lifecycle-runtime-compose:2.6.1"
```