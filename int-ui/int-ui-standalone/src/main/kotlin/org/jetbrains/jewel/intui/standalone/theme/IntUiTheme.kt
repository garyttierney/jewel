package org.jetbrains.jewel.intui.standalone.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.LocaleList
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import org.jetbrains.jewel.foundation.GlobalColors
import org.jetbrains.jewel.foundation.GlobalMetrics
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.foundation.theme.ThemeColorPalette
import org.jetbrains.jewel.foundation.theme.ThemeDefinition
import org.jetbrains.jewel.foundation.theme.ThemeIconData
import org.jetbrains.jewel.intui.core.theme.IntUiDarkTheme
import org.jetbrains.jewel.intui.core.theme.IntUiLightTheme
import org.jetbrains.jewel.intui.standalone.Inter
import org.jetbrains.jewel.intui.standalone.StandalonePainterHintsProvider
import org.jetbrains.jewel.intui.standalone.styling.Default
import org.jetbrains.jewel.intui.standalone.styling.Editor
import org.jetbrains.jewel.intui.standalone.styling.Outlined
import org.jetbrains.jewel.intui.standalone.styling.Undecorated
import org.jetbrains.jewel.intui.standalone.styling.dark
import org.jetbrains.jewel.intui.standalone.styling.light
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.ui.DefaultComponentStyling
import org.jetbrains.jewel.ui.component.styling.ButtonStyle
import org.jetbrains.jewel.ui.component.styling.CheckboxStyle
import org.jetbrains.jewel.ui.component.styling.ChipStyle
import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle
import org.jetbrains.jewel.ui.component.styling.DividerStyle
import org.jetbrains.jewel.ui.component.styling.DropdownStyle
import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle
import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle
import org.jetbrains.jewel.ui.component.styling.IconButtonStyle
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle
import org.jetbrains.jewel.ui.component.styling.LinkStyle
import org.jetbrains.jewel.ui.component.styling.MenuStyle
import org.jetbrains.jewel.ui.component.styling.RadioButtonStyle
import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle
import org.jetbrains.jewel.ui.component.styling.SliderStyle
import org.jetbrains.jewel.ui.component.styling.TabStyle
import org.jetbrains.jewel.ui.component.styling.TextAreaStyle
import org.jetbrains.jewel.ui.component.styling.TextFieldStyle
import org.jetbrains.jewel.ui.component.styling.TooltipStyle
import org.jetbrains.jewel.ui.painter.LocalPainterHintsProvider
import org.jetbrains.jewel.ui.theme.BaseJewelTheme

public fun JewelTheme.Companion.createDefaultTextStyle(
    color: Color = Color.Unspecified,
    fontSize: TextUnit = 13.sp,
    fontWeight: FontWeight? = FontWeight.Normal,
    fontStyle: FontStyle? = FontStyle.Normal,
    fontSynthesis: FontSynthesis? = null,
    fontFamily: FontFamily? = FontFamily.Inter,
    fontFeatureSettings: String? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    baselineShift: BaselineShift? = null,
    textGeometricTransform: TextGeometricTransform? = null,
    localeList: LocaleList? = null,
    background: Color = Color.Unspecified,
    textDecoration: TextDecoration? = null,
    shadow: Shadow? = null,
    drawStyle: DrawStyle? = null,
    textAlign: TextAlign = TextAlign.Unspecified,
    textDirection: TextDirection = TextDirection.Unspecified,
    lineHeight: TextUnit = TextUnit.Unspecified,
    textIndent: TextIndent? = null,
    platformStyle: PlatformTextStyle? = null,
    lineHeightStyle: LineHeightStyle? = null,
    lineBreak: LineBreak = LineBreak.Unspecified,
    hyphens: Hyphens = Hyphens.Unspecified,
    textMotion: TextMotion? = null,
): TextStyle =
    TextStyle.Default.copy(
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontSynthesis = fontSynthesis,
        fontFamily = fontFamily,
        fontFeatureSettings = fontFeatureSettings,
        letterSpacing = letterSpacing,
        baselineShift = baselineShift,
        textGeometricTransform = textGeometricTransform,
        localeList = localeList,
        background = background,
        textDecoration = textDecoration,
        shadow = shadow,
        drawStyle = drawStyle,
        textAlign = textAlign,
        textDirection = textDirection,
        lineHeight = lineHeight,
        textIndent = textIndent,
        platformStyle = platformStyle,
        lineHeightStyle = lineHeightStyle,
        lineBreak = lineBreak,
        hyphens = hyphens,
        textMotion = textMotion,
    )

public fun JewelTheme.Companion.createDefaultTextStyle(
    brush: Brush?,
    alpha: Float = Float.NaN,
    fontSize: TextUnit = 13.sp,
    fontWeight: FontWeight? = FontWeight.Normal,
    fontStyle: FontStyle? = FontStyle.Normal,
    fontSynthesis: FontSynthesis? = null,
    fontFamily: FontFamily? = FontFamily.Inter,
    fontFeatureSettings: String? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    baselineShift: BaselineShift? = null,
    textGeometricTransform: TextGeometricTransform? = null,
    localeList: LocaleList? = null,
    background: Color = Color.Unspecified,
    textDecoration: TextDecoration? = null,
    shadow: Shadow? = null,
    drawStyle: DrawStyle? = null,
    textAlign: TextAlign = TextAlign.Unspecified,
    textDirection: TextDirection = TextDirection.Unspecified,
    lineHeight: TextUnit = TextUnit.Unspecified,
    textIndent: TextIndent? = null,
    platformStyle: PlatformTextStyle? = null,
    lineHeightStyle: LineHeightStyle? = null,
    lineBreak: LineBreak = LineBreak.Unspecified,
    hyphens: Hyphens = Hyphens.Unspecified,
    textMotion: TextMotion? = null,
): TextStyle =
    TextStyle.Default.copy(
        brush = brush,
        alpha = alpha,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontSynthesis = fontSynthesis,
        fontFamily = fontFamily,
        fontFeatureSettings = fontFeatureSettings,
        letterSpacing = letterSpacing,
        baselineShift = baselineShift,
        textGeometricTransform = textGeometricTransform,
        localeList = localeList,
        background = background,
        textDecoration = textDecoration,
        shadow = shadow,
        drawStyle = drawStyle,
        textAlign = textAlign,
        textDirection = textDirection,
        lineHeight = lineHeight,
        textIndent = textIndent,
        platformStyle = platformStyle,
        lineHeightStyle = lineHeightStyle,
        lineBreak = lineBreak,
        hyphens = hyphens,
        textMotion = textMotion,
    )

@Composable
public fun JewelTheme.Companion.lightThemeDefinition(
    colors: GlobalColors = GlobalColors.light(),
    metrics: GlobalMetrics = GlobalMetrics.defaults(),
    palette: ThemeColorPalette = IntUiLightTheme.colors,
    iconData: ThemeIconData = IntUiLightTheme.iconData,
    defaultTextStyle: TextStyle = JewelTheme.createDefaultTextStyle(),
    contentColor: Color = IntUiLightTheme.colors.grey(1),
): ThemeDefinition =
    ThemeDefinition(
        name = "IntUI Light",
        isDark = false,
        colors,
        metrics,
        defaultTextStyle,
        contentColor,
        palette,
        iconData,
    )

@Composable
public fun JewelTheme.Companion.darkThemeDefinition(
    colors: GlobalColors = GlobalColors.dark(),
    metrics: GlobalMetrics = GlobalMetrics.defaults(),
    palette: ThemeColorPalette = IntUiDarkTheme.colors,
    iconData: ThemeIconData = IntUiDarkTheme.iconData,
    defaultTextStyle: TextStyle = JewelTheme.createDefaultTextStyle(),
    contentColor: Color = IntUiDarkTheme.colors.grey(12),
): ThemeDefinition =
    ThemeDefinition(
        name = "IntUI Dark",
        isDark = true,
        colors,
        metrics,
        defaultTextStyle,
        contentColor,
        palette,
        iconData,
    )

@Composable
public fun ComponentStyling.default(): ComponentStyling = with {
    val isDark = JewelTheme.isDark
    if (isDark) dark() else light()
}

@Composable
public fun ComponentStyling.dark(
    checkboxStyle: CheckboxStyle = CheckboxStyle.dark(),
    chipStyle: ChipStyle = ChipStyle.dark(),
    circularProgressStyle: CircularProgressStyle = CircularProgressStyle.dark(),
    defaultButtonStyle: ButtonStyle = ButtonStyle.Default.dark(),
    defaultTabStyle: TabStyle = TabStyle.Default.dark(),
    dividerStyle: DividerStyle = DividerStyle.dark(),
    dropdownStyle: DropdownStyle = DropdownStyle.Default.dark(),
    editorTabStyle: TabStyle = TabStyle.Editor.dark(),
    groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.dark(),
    horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.dark(),
    iconButtonStyle: IconButtonStyle = IconButtonStyle.dark(),
    lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.dark(),
    linkStyle: LinkStyle = LinkStyle.dark(),
    menuStyle: MenuStyle = MenuStyle.dark(),
    outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.dark(),
    radioButtonStyle: RadioButtonStyle = RadioButtonStyle.dark(),
    scrollbarStyle: ScrollbarStyle = ScrollbarStyle.dark(),
    sliderStyle: SliderStyle = SliderStyle.dark(),
    textAreaStyle: TextAreaStyle = TextAreaStyle.dark(),
    textFieldStyle: TextFieldStyle = TextFieldStyle.dark(),
    tooltipStyle: TooltipStyle = TooltipStyle.dark(),
    undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.dark(),
): ComponentStyling =
    with(
        DefaultComponentStyling(
            checkboxStyle = checkboxStyle,
            chipStyle = chipStyle,
            circularProgressStyle = circularProgressStyle,
            defaultButtonStyle = defaultButtonStyle,
            defaultDropdownStyle = dropdownStyle,
            defaultTabStyle = defaultTabStyle,
            dividerStyle = dividerStyle,
            editorTabStyle = editorTabStyle,
            groupHeaderStyle = groupHeaderStyle,
            horizontalProgressBarStyle = horizontalProgressBarStyle,
            iconButtonStyle = iconButtonStyle,
            lazyTreeStyle = lazyTreeStyle,
            linkStyle = linkStyle,
            menuStyle = menuStyle,
            outlinedButtonStyle = outlinedButtonStyle,
            radioButtonStyle = radioButtonStyle,
            scrollbarStyle = scrollbarStyle,
            sliderStyle = sliderStyle,
            textAreaStyle = textAreaStyle,
            textFieldStyle = textFieldStyle,
            tooltipStyle = tooltipStyle,
            undecoratedDropdownStyle = undecoratedDropdownStyle,
        ),
    )

@Composable
public fun ComponentStyling.light(
    checkboxStyle: CheckboxStyle = CheckboxStyle.light(),
    chipStyle: ChipStyle = ChipStyle.light(),
    circularProgressStyle: CircularProgressStyle = CircularProgressStyle.light(),
    defaultButtonStyle: ButtonStyle = ButtonStyle.Default.light(),
    defaultTabStyle: TabStyle = TabStyle.Default.light(),
    dividerStyle: DividerStyle = DividerStyle.light(),
    dropdownStyle: DropdownStyle = DropdownStyle.Default.light(),
    editorTabStyle: TabStyle = TabStyle.Editor.light(),
    groupHeaderStyle: GroupHeaderStyle = GroupHeaderStyle.light(),
    horizontalProgressBarStyle: HorizontalProgressBarStyle = HorizontalProgressBarStyle.light(),
    iconButtonStyle: IconButtonStyle = IconButtonStyle.light(),
    lazyTreeStyle: LazyTreeStyle = LazyTreeStyle.light(),
    linkStyle: LinkStyle = LinkStyle.light(),
    menuStyle: MenuStyle = MenuStyle.light(),
    outlinedButtonStyle: ButtonStyle = ButtonStyle.Outlined.light(),
    radioButtonStyle: RadioButtonStyle = RadioButtonStyle.light(),
    scrollbarStyle: ScrollbarStyle = ScrollbarStyle.light(),
    sliderStyle: SliderStyle = SliderStyle.light(),
    textAreaStyle: TextAreaStyle = TextAreaStyle.light(),
    textFieldStyle: TextFieldStyle = TextFieldStyle.light(),
    tooltipStyle: TooltipStyle = TooltipStyle.light(),
    undecoratedDropdownStyle: DropdownStyle = DropdownStyle.Undecorated.light(),
): ComponentStyling =
    with(
        DefaultComponentStyling(
            checkboxStyle = checkboxStyle,
            chipStyle = chipStyle,
            circularProgressStyle = circularProgressStyle,
            defaultButtonStyle = defaultButtonStyle,
            defaultDropdownStyle = dropdownStyle,
            defaultTabStyle = defaultTabStyle,
            dividerStyle = dividerStyle,
            editorTabStyle = editorTabStyle,
            groupHeaderStyle = groupHeaderStyle,
            horizontalProgressBarStyle = horizontalProgressBarStyle,
            iconButtonStyle = iconButtonStyle,
            lazyTreeStyle = lazyTreeStyle,
            linkStyle = linkStyle,
            menuStyle = menuStyle,
            outlinedButtonStyle = outlinedButtonStyle,
            radioButtonStyle = radioButtonStyle,
            scrollbarStyle = scrollbarStyle,
            sliderStyle = sliderStyle,
            textAreaStyle = textAreaStyle,
            textFieldStyle = textFieldStyle,
            tooltipStyle = tooltipStyle,
            undecoratedDropdownStyle = undecoratedDropdownStyle,
        ),
    )

@Composable
public fun IntUiTheme(
    isDark: Boolean = false,
    swingCompatMode: Boolean = false,
    content: @Composable () -> Unit,
) {
    val themeDefinition =
        if (isDark) JewelTheme.darkThemeDefinition() else JewelTheme.lightThemeDefinition()

    IntUiTheme(
        theme = themeDefinition,
        styling = ComponentStyling,
        swingCompatMode = swingCompatMode,
        content = content,
    )
}

@Composable
public fun IntUiTheme(
    theme: ThemeDefinition,
    styling: ComponentStyling,
    swingCompatMode: Boolean = false,
    content: @Composable () -> Unit,
) {
    BaseJewelTheme(
        theme,
        ComponentStyling.default().with(styling),
        swingCompatMode,
    ) {
        CompositionLocalProvider(
            LocalPainterHintsProvider provides StandalonePainterHintsProvider(theme),
        ) {
            content()
        }
    }
}
