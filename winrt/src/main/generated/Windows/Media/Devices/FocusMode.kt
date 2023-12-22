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

@ABIMarker(FocusMode.ABI::class)
@Signature("enum(Windows.Media.Devices.FocusMode;i4)")
@WinRTByReference(brClass = FocusMode.ByReference::class)
public enum class FocusMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Single(1),
  Continuous(2),
  Manual(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): FocusMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Single
      2 -> Continuous
      3 -> Manual
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusMode> {
    public fun setValue(newValue: FocusMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusMode =
        FocusMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusMode =
        FocusMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusMode): Int = obj.value
  }
}
