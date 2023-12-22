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

@ABIMarker(TimedTextRubyAlign.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextRubyAlign;i4)")
@WinRTByReference(brClass = TimedTextRubyAlign.ByReference::class)
public enum class TimedTextRubyAlign(
  public val value: Int
) : NativeMapped {
  Center(0),
  Start(1),
  End(2),
  SpaceAround(3),
  SpaceBetween(4),
  WithBase(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextRubyAlign {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Center
      1 -> Start
      2 -> End
      3 -> SpaceAround
      4 -> SpaceBetween
      5 -> WithBase
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextRubyAlign> {
    public fun setValue(newValue: TimedTextRubyAlign): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextRubyAlign =
        TimedTextRubyAlign.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextRubyAlign, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextRubyAlign =
        TimedTextRubyAlign.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextRubyAlign): Int = obj.value
  }
}
