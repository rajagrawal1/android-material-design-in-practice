# Material Design in Practice.

## Purpose
- Intended to be simple - A project to demonstrate the usage of color palette, typography and shapes as per the [material design guidelines](https://material.io/design/introduction "material design guidelines").

## Configuration
- Uses both app wide and view level theming.
- Min SDK support is API 16.

## Usage
- **themes.xml** - Does the job of referring the appropriate styling templates on runtime - whether on day or night mode.

- **styles.xml** - The view specific styles are nearly declared under styles.xml.

- **Scaling typography** - This section contains 4 sizing variants for the text - sp, ssp, dp, sdp.
	- "sp and sdp" are good alternatives over sp and dp if you do not wish to manually manage multiple dimens.xml for different screens sizes. The library handles it for you. Be aware that while developing for tablets, this may not be the best idea.
	- The main difference you can see is that sp and ssp respond when user changes the font size from system settings. However, sp and sdp do not. Run the MDIP app, switch to typography tab and test it out yourself.

- **Easy color management** - Use [color palette generator tool](https://material.io/resources/color "generator tool") for preparing a new color scheme, export to the Android format (color.xml) and use the color variables to replace the existing set in the project.
- 	For applying app-wide default colors, you will be largely dealing with:

		* colorPrimary
		* colorPrimaryDark/ colorPrimaryVariant
		* colorSecondary
		* colorSecondaryVariant
		* android:textColorPrimary
		* android:textColorSecondary
		* android:colorBackground

- If you wish to try different new schemes - simply replace the colors under "Base Color Scheme" and above "Other colors" in color.xml. You can leave 'Other colors' as it is, since they can be suitable for most cases.
- Take advantage of a new feature in the latest material design library that allows app-wide application of common styling for views from a single place - Refer to the base theme for an example.
- Concept: ![Alt text](/screens/concept.png?raw=true "Concept") <em>Slightly modified and sourced from: https://speakerdeck.com/anitas3791/styles-themes-material-theming-oh-my/em>.
- Concept applied (For reference only. The demo app in the project is different): ![Alt text](/screens/demo.png?raw=true "Concept applied").
- App screenshots:
<br>
<p float="left">
  <img src="/screens/1.png" width="100" />
  <img src="/screens/2.png" width="100" />
  <img src="/screens/3.png" width="100" />
  <img src="/screens/4.png" width="100" />
  <img src="/screens/5.png" width="100" />
  <img src="/screens/6.png" width="100" />
  <img src="/screens/7.png" width="100" />
  <img src="/screens/8.png" width="100" />
  <img src="/screens/9.png" width="100" />
</p>


## Caveats
- For unclear reasons, *colorPrimaryVariant* does NOT reflect on the status bar color despite the official material design guidelines - https://material.io/design/color/the-color-system.html#color-theme-creation. However, *colorPrimaryDark* DOES work [(Issue tracker)](https://github.com/material-components/material-components-android/issues/468 "(Issue tracker)").
 So it's useful to maintain both variables even though they point to the exact same colors.

## What's coming soon
- Material motion.

## Try the demo app

Visit the [releases](https://github.com/sabergeek/android-material-design-in-practice/releases "releases") section to download the latest iterations of the app.

### References
- Color guide: https://material.io/design/color/the-color-system.html
- Color palette generator tool: https://material.io/resources/color
- Key lines and grids reference - https://www.youtube.com/watch?v=ESJuU2gp-P8
- Issue tracker : https://github.com/material-components/material-components-android/issues/468