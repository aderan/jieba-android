Releasing
=========

Cutting a Release
-----------------

1. Update `CHANGELOG.md`.
   > Fix: some bugs
   > New: new api, feature, etc.
   > Update: bump dependencies
2. Set versions:

    ```
    export RELEASE_VERSION=X.Y.Z
    ```
3. Update versions:
   ```shell
   sed -i "" \
   "s/\"com.github.aderan:\([^\:]*\):[^\"]*\"/\"com.github.aderan:\1:$RELEASE_VERSION\"/g" \
   "app/build.gradle"
   
   sed -i "" \
   "s/VERSION = \".*\"/VERSION = \"$RELEASE_VERSION\"/g" \
   "library/src/main/java/io/github/jieba/JiebaSegmenter.java"
   
   sed -i "" \
   "s/\"com.github.aderan:\([^\:]*\):[^\"]*\"/\"com.github.aderan:\1:$RELEASE_VERSION\"/g" \
   README.md
    ```
4. Tag the release and push to GitHub.
   ```
   git commit -am "Prepare for release $RELEASE_VERSION"
   git tag -a $RELEASE_VERSION -m "Version $RELEASE_VERSION"
   git push -v origin refs/heads/main:refs/heads/main
   git push origin $RELEASE_VERSION
   ```

5. Trigger jitpack build
   ```shell
   curl https://jitpack.io/api/builds/com.github.aderan/jieba-android/$RELEASE_VERSION
   ```