# animated-bottom-navigation-bar

![](https://github.com/mohammadidiab/animated-bottom-navigation-bar/blob/master/GIF-200406_233531.gif)
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


        bottomNavigation.add(ABottomNavigation.Model(1, R.drawable.ic_home, "HOME"))
        bottomNavigation.add(ABottomNavigation.Model(2, R.drawable.ic_explore, "EXPLORE"))
        bottomNavigation.add(ABottomNavigation.Model(3, R.drawable.ic_message, "MESSAGE"))
        bottomNavigation.add(ABottomNavigation.Model(4,R.drawable.ic_notification,"Notafications"))
        bottomNavigation.add(ABottomNavigation.Model(5, R.drawable.ic_account, "ACCOUNT"))


        bottomNavigation.setCount(4, "5")


         bottomNavigation.setOnClickMenuListener {
                    var id = it.id
         }
        bottomNavigation.show(1, true)

```
