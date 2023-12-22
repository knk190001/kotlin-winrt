package Windows.Media.Core

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

@ABIMarker(TimedTextScrollMode.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextScrollMode;i4)")
@WinRTByReference(brClass = TimedTextScrollMode.ByReference::class)
public enum class TimedTextScrollMode(
  public val value: Int
) : NativeMapped {
  Popon(0),
  Rollup(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextScrollMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Popon
      1 -> Rollup
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextScrollMode> {
    public fun setValue(newValue: TimedTextScrollMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextScrollMode =
        TimedTextScrollMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextScrollMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextScrollMode =
        TimedTextScrollMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextScrollMode): Int = obj.value
  }
}
