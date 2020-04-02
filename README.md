# animated-bottom-navigation-bar

## How to import

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
implementation 'com.github.mohammadidiab:animated-bottom-navigation-bar:0.0.1'

```


## How to use

```
<com.md.animatedbottomnavigationbarlib.ABottomNavigation
                    android:id="@+id/bottomNavigation"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom"
                    android:layout_alignParentBottom="true"
                    app:abn_backgroundBottomColor="#ffffff"
                    app:abn_selectedItemBackgroundColor="#8549A8"
                    app:abn_countBackgroundColor="#F07035"
                    app:abn_countTextColor="#ffffff"
                    app:abn_heightCell="80dp"
                    app:abn_titleTextColor="#393939"
                    app:abn_defaultIconColor="#8890A6"
                    app:abn_selectedIconColor="#ffffff"
                    app:abn_shadowColor="#8890A6" />

```
