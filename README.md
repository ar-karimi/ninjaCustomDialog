# ninjaCustomDialog
ninjaCustomDialog is an easy to use library for making beautiful and flexible Alert dialog.

## add library to project
clone this project and add ninjaAlertDialog module to your application

## Usage
### Basic dialog
A basic dialog will show the provided title (optional) and description, using your primary color as the header background. You have access to methods such as ```setTitle()```,```setContent()```,```setIcon()```,```setCancelable()```, ```dismiss()``` , etc. Customizations are explained below.

```java
NinjaAlertDialog dialog = new NinjaAlertDialog.Builder()
                .setTitle("test title")
                .setSubtitle("test subtitle")
                .setCancelable(true)
                .build();
```

to show dialog you have to use this code

```java
dialog.show(getSupportFragmentManager(), null);
```
this method give a fragmentManager or FragmentTransaction and a tag (tag can be null)

## You want more customization?
#### use this methods in builder
you can change text colors using set...TextColor() like example below:

```java
.setTitleTextColor(getResources().getColor(R.color.orange600))
```

you can set background for every view in this dialog
```java
.setNegativeBackground(R.drawable.negative_background)
```

and you can add image with this method
```java
.setImage()
```
to add positive or negative button and clickListeners use this methods
```java
.setPositiveText("positive text")
                .setPositiveButtonClickListener(new OnClickListener.OnPositiveButtonClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "positive button clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeText("negative text")
                .setNegativeButtonClickListener(new OnClickListener.OnNegativeButtonClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "negative button clicked", Toast.LENGTH_SHORT).show();
                    }
                })```

i will complete this section later...
