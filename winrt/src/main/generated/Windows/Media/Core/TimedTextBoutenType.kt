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

@ABIMarker(TimedTextBoutenType.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextBoutenType;i4)")
@WinRTByReference(brClass = TimedTextBoutenType.ByReference::class)
public enum class TimedTextBoutenType(
  public val value: Int
) : NativeMapped {
  None(0),
  Auto(1),
  FilledCircle(2),
  OpenCircle(3),
  FilledDot(4),
  OpenDot(5),
  FilledSesame(6),
  OpenSesame(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextBoutenType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Auto
      2 -> FilledCircle
      3 -> OpenCircle
      4 -> FilledDot
      5 -> OpenDot
      6 -> FilledSesame
      7 -> OpenSesame
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextBoutenType> {
    public fun setValue(newValue: TimedTextBoutenType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextBoutenType =
        TimedTextBoutenType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextBoutenType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextBoutenType =
        TimedTextBoutenType.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextBoutenType): Int = obj.value
  }
}
