package Windows.Media.Devices

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

@ABIMarker(AutoFocusRange.ABI::class)
@Signature("enum(Windows.Media.Devices.AutoFocusRange;i4)")
@WinRTByReference(brClass = AutoFocusRange.ByReference::class)
public enum class AutoFocusRange(
  public val value: Int
) : NativeMapped {
  FullRange(0),
  Macro(1),
  Normal(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutoFocusRange {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FullRange
      1 -> Macro
      2 -> Normal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutoFocusRange> {
    public fun setValue(newValue: AutoFocusRange): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutoFocusRange =
        AutoFocusRange.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutoFocusRange, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutoFocusRange =
        AutoFocusRange.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutoFocusRange): Int = obj.value
  }
}
