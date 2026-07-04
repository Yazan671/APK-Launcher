# APK Launcher

APK Launcher is an Android application with multi-language support and a beautiful splash screen.

## Features

- **Splash Screen**: Beautiful intro with smooth animations
- **Multi-Language Support**: Support for all device languages
- **Language Selection**: Search and select your preferred language
- **Automatic Language Application**: UI updates automatically
- **Built with GitHub Actions**: Automatic APK generation

## Build Instructions

### Prerequisites
- Android Studio
- Java 11 or higher
- Gradle

### Building Locally
1. Clone the repository
2. Open in Android Studio
3. Click "Build" > "Build APK"

### Automatic Build with GitHub Actions
- Push to main branch
- GitHub Actions builds automatically
- Download APK from Actions tab

## How to Get Your APK

1. Go to: https://github.com/Yazan671/APK-Launcher
2. Click on "Actions" tab
3. Click the latest workflow run
4. Scroll down to "Artifacts"
5. Download "app-release-apk"
6. Extract and install on your device

## Project Structure

```
APK-Launcher/
├── app/
│   ├── src/main/java/com/yours/launcher/
│   ├── src/main/res/
│   └── build.gradle
├── .github/workflows/build.yml
└── README.md
```

## License

MIT License - Open Source

---

**Last Updated:** 2026-07-04
