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

@ABIMarker(TimedTextWrapping.ABI::class)
@Signature("enum(Windows.Media.Core.TimedTextWrapping;i4)")
@WinRTByReference(brClass = TimedTextWrapping.ByReference::class)
public enum class TimedTextWrapping(
  public val value: Int
) : NativeMapped {
  NoWrap(0),
  Wrap(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedTextWrapping {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoWrap
      1 -> Wrap
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedTextWrapping> {
    public fun setValue(newValue: TimedTextWrapping): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedTextWrapping =
        TimedTextWrapping.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedTextWrapping, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedTextWrapping =
        TimedTextWrapping.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedTextWrapping): Int = obj.value
  }
}
