# Design reference and guidelines for theAsianParent (TAP) apps.

- This project is intended to apply and demonstrate the usage of proper color palette, typography and shapes as per the latest [material design guidelines](https://material.io/design/introduction "material design guidelines").
- Uses both app wide and app leve theming.
- Min SDK support is API 16
- This app will respond and auto switch to day/ night mode depending on the system settings.
- Use [color paletter generator tool](https://material.io/resources/color "generator tool") for preparing a new color scheme, export to the Android format (color.xml) and use the color variables to replace the existing set in the project.
- If you wish to try different new schemes - only replace the colors under "Base Color Scheme" and above "Other colors" in color.xml. You may leave the 'Other colors' constant since they are neutral.
- Concept: ![Alt text](/screens/concept.png?raw=true "Concept")
- Concept applied: ![Alt text](/screens/demo.png?raw=true "Concept applied"))

## Caveats
- For unclear reasons, colorPrimaryVariant does NOT reflect on the status bar color despite the official material design guidelines - https://material.io/design/color/the-color-system.html#color-theme-creation. However, colorPrimaryDark DOES work as per [Github issue](https://github.com/material-components/material-components-android/issues/468 "Github issue"). So it's important to maintain both variables even though they point to the exact same colors.


### References
- Color guide: https://material.io/design/color/the-color-system.html
- Color palette generator tool: https://material.io/resources/color
- Key lines and grids reference - https://www.youtube.com/watch?v=ESJuU2gp-P8
- Githhub issue: https://github.com/material-components/material-components-android/issues/468