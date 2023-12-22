package Windows.UI.Xaml.Hosting

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

@ABIMarker(XamlSourceFocusNavigationReason.ABI::class)
@Signature("enum(Windows.UI.Xaml.Hosting.XamlSourceFocusNavigationReason;i4)")
@WinRTByReference(brClass = XamlSourceFocusNavigationReason.ByReference::class)
public enum class XamlSourceFocusNavigationReason(
  public val value: Int
) : NativeMapped {
  Programmatic(0),
  Restore(1),
  First(3),
  Last(4),
  Left(7),
  Up(8),
  Right(9),
  Down(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XamlSourceFocusNavigationReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Programmatic
      1 -> Restore
      3 -> First
      4 -> Last
      7 -> Left
      8 -> Up
      9 -> Right
      10 -> Down
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XamlSourceFocusNavigationReason> {
    public fun setValue(newValue: XamlSourceFocusNavigationReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XamlSourceFocusNavigationReason =
        XamlSourceFocusNavigationReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XamlSourceFocusNavigationReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XamlSourceFocusNavigationReason =
        XamlSourceFocusNavigationReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: XamlSourceFocusNavigationReason): Int = obj.value
  }
}
