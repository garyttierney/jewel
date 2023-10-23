package org.jetbrains.jewel.bridge.theme

import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.foundation.BorderColors
import org.jetbrains.jewel.foundation.GlobalColors
import org.jetbrains.jewel.foundation.OutlineColors

fun GlobalColors.Companion.readFromLaF() =
    GlobalColors(
        borders = BorderColors.readFromLaF(),
        outlines = OutlineColors.readFromLaF(),
        infoContent = retrieveColorOrUnspecified("*.infoForeground"),
        paneBackground = retrieveColorOrUnspecified("Panel.background"),
    )

fun BorderColors.Companion.readFromLaF() =
    BorderColors(
        normal = retrieveColorOrUnspecified("Component.borderColor"),
        focused = retrieveColorOrUnspecified("Component.focusedBorderColor"),
        disabled = retrieveColorOrUnspecified("*.disabledBorderColor"),
    )

fun OutlineColors.Companion.readFromLaF() =
    OutlineColors(
        focused = retrieveColorOrUnspecified("*.focusColor"),
        focusedWarning = retrieveColorOrUnspecified("Component.warningFocusColor"),
        focusedError = retrieveColorOrUnspecified("Component.errorFocusColor"),
        warning = retrieveColorOrUnspecified("Component.inactiveWarningFocusColor"),
        error = retrieveColorOrUnspecified("Component.inactiveErrorFocusColor"),
    )