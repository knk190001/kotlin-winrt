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

@ABIMarker(TimedTextWritingMode.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextWritingMode;i4)")
@WinRTByReference(brClass = TimedTextWritingMode.ByReference::class)
public enum class TimedTextWritingMode(
  public val value: Int
) : NativeMapped {
  LeftRightTopBottom(0),
  RightLeftTopBottom(1),
  TopBottomRightLeft(2),
  TopBottomLeftRight(3),
  LeftRight(4),
  RightLeft(5),
  TopBottom(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextWritingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LeftRightTopBottom
      1 -> RightLeftTopBottom
      2 -> TopBottomRightLeft
      3 -> TopBottomLeftRight
      4 -> LeftRight
      5 -> RightLeft
      6 -> TopBottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextWritingMode> {
    public fun setValue(newValue: TimedTextWritingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextWritingMode =
        TimedTextWritingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextWritingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextWritingMode =
        TimedTextWritingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextWritingMode): Int = obj.value
  }
}
