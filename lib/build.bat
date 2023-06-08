@echo off
setlocal
set GOOS=android
set CGO_ENABLED=1
set ANDROID_NDK_HOME=D:/Android/android-sdk/ndk/25.2.9519653

REM Build the AAR file for all architectures
gomobile bind -androidapi 28 -target=android -o libnrg.aar nrg
copy libnrg.aar E:\SourceCode\nrg\app\libs
