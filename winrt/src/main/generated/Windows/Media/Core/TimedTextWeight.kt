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

@ABIMarker(TimedTextWeight.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextWeight;i4)")
@WinRTByReference(brClass = TimedTextWeight.ByReference::class)
public enum class TimedTextWeight(
  public val value: Int
) : NativeMapped {
  Normal(400),
  Bold(700),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextWeight {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      400 -> Normal
      700 -> Bold
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextWeight> {
    public fun setValue(newValue: TimedTextWeight): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextWeight =
        TimedTextWeight.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextWeight, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextWeight =
        TimedTextWeight.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextWeight): Int = obj.value
  }
}
