package Windows.UI.Xaml.Input

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

@ABIMarker(XYFocusKeyboardNavigationMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.XYFocusKeyboardNavigationMode;i4)")
@WinRTByReference(brClass = XYFocusKeyboardNavigationMode.ByReference::class)
public enum class XYFocusKeyboardNavigationMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Enabled(1),
  Disabled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XYFocusKeyboardNavigationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Enabled
      2 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XYFocusKeyboardNavigationMode> {
    public fun setValue(newValue: XYFocusKeyboardNavigationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XYFocusKeyboardNavigationMode =
        XYFocusKeyboardNavigationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XYFocusKeyboardNavigationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XYFocusKeyboardNavigationMode =
        XYFocusKeyboardNavigationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: XYFocusKeyboardNavigationMode): Int = obj.value
  }
}
