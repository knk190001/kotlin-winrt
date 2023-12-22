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

@ABIMarker(UIColorType.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.UIColorType;i4)")
@WinRTByReference(brClass = UIColorType.ByReference::class)
public enum class UIColorType(
  public val value: Int
) : NativeMapped {
  Background(0),
  Foreground(1),
  AccentDark3(2),
  AccentDark2(3),
  AccentDark1(4),
  Accent(5),
  AccentLight1(6),
  AccentLight2(7),
  AccentLight3(8),
  Complement(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UIColorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Background
      1 -> Foreground
      2 -> AccentDark3
      3 -> AccentDark2
      4 -> AccentDark1
      5 -> Accent
      6 -> AccentLight1
      7 -> AccentLight2
      8 -> AccentLight3
      9 -> Complement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UIColorType> {
    public fun setValue(newValue: UIColorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UIColorType =
        UIColorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UIColorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UIColorType =
        UIColorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UIColorType): Int = obj.value
  }
}
