# TugasAkhirKelompok5MC

Java Android project (Android Gradle Plugin 9.2.1, Gradle 9.4.1).

## Language

- **Java 11** source/target — not Kotlin. All source under `app/src/main/java/`.
- Toolchain is JDK 21 (see `gradle/gradle-daemon-jvm.properties`).

## Build

- Single module `:app` at `app/build.gradle.kts`
- Dependencies declared in `gradle/libs.versions.toml` (version catalog)
- Min SDK 24, target SDK 36, namespace `com.example.tugasakhirkelompok5mc`
- Configuration cache enabled in `gradle.properties`
- `local.properties` (SDK path) not committed

```powershell
./gradlew build                   # full build
./gradlew assembleDebug           # debug APK
./gradlew test                    # unit tests only
./gradlew connectedAndroidTest    # instrumented tests on device/emulator
```

## App flow

`SplashActivity` (launcher) → 2.2s fade animation → `MainActivity` → `DeveloperDetailActivity`

## Resource naming convention

`DeveloperDetailActivity` uses `getResources().getIdentifier()` with dynamic prefix `dev{1|2|3}_` for strings and drawables. To add a developer, add all `devN_*` strings and a `devN.png` drawable.

Prefix patterns (in `strings.xml`):
`dev1_name`, `dev1_alamat`, `dev1_bio`, `dev1_sd`, `dev1_smp`, `dev1_sma`, `dev1_kuliah`, `dev1_aktivitas`, `dev1_ig`, `dev1_tiktok`, `dev1_github`

Drawable lookup: `R.drawable.dev1` (single resource name, no prefix). Only dev1 has a GitHub string; dev2 and dev3 gracefully skip it.

## Tests

Both `ExampleUnitTest.java` and `ExampleInstrumentedTest.java` are placeholder stubs — no real tests exist.

## Structure

```
app/src/
  main/java/              — app code (3 activities)
  main/res/               — layouts, drawables, strings, themes
  test/java/              — JUnit 4 unit tests (stub)
  androidTest/            — AndroidX test + Espresso (stub)
```

No CI, no lint/formatter config, no code generation.
