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

@ABIMarker(TimedTextLineAlignment.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextLineAlignment;i4)")
@WinRTByReference(brClass = TimedTextLineAlignment.ByReference::class)
public enum class TimedTextLineAlignment(
  public val value: Int
) : NativeMapped {
  Start(0),
  End(1),
  Center(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextLineAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Start
      1 -> End
      2 -> Center
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextLineAlignment> {
    public fun setValue(newValue: TimedTextLineAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextLineAlignment =
        TimedTextLineAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextLineAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextLineAlignment =
        TimedTextLineAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextLineAlignment): Int = obj.value
  }
}
