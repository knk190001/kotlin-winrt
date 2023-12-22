package Windows.UI.ViewManagement

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(UIElementType.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.UIElementType;i4)")
@WinRTByReference(brClass = UIElementType.ByReference::class)
public enum class UIElementType(
  public val value: Int
) : NativeMapped {
  ActiveCaption(0),
  Background(1),
  ButtonFace(2),
  ButtonText(3),
  CaptionText(4),
  GrayText(5),
  Highlight(6),
  HighlightText(7),
  Hotlight(8),
  InactiveCaption(9),
  InactiveCaptionText(10),
  Window(11),
  WindowText(12),
  AccentColor(1000),
  TextHigh(1001),
  TextMedium(1002),
  TextLow(1003),
  TextContrastWithHigh(1004),
  NonTextHigh(1005),
  NonTextMediumHigh(1006),
  NonTextMedium(1007),
  NonTextMediumLow(1008),
  NonTextLow(1009),
  PageBackground(1010),
  PopupBackground(1011),
  OverlayOutsidePopup(1012),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UIElementType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ActiveCaption
      1 -> Background
      2 -> ButtonFace
      3 -> ButtonText
      4 -> CaptionText
      5 -> GrayText
      6 -> Highlight
      7 -> HighlightText
      8 -> Hotlight
      9 -> InactiveCaption
      10 -> InactiveCaptionText
      11 -> Window
      12 -> WindowText
      1000 -> AccentColor
      1001 -> TextHigh
      1002 -> TextMedium
      1003 -> TextLow
      1004 -> TextContrastWithHigh
      1005 -> NonTextHigh
      1006 -> NonTextMediumHigh
      1007 -> NonTextMedium
      1008 -> NonTextMediumLow
      1009 -> NonTextLow
      1010 -> PageBackground
      1011 -> PopupBackground
      1012 -> OverlayOutsidePopup
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UIElementType> {
    public fun setValue(newValue: UIElementType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UIElementType =
        UIElementType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UIElementType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UIElementType =
        UIElementType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UIElementType): Int = obj.value
  }
}
