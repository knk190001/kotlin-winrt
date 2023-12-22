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

@ABIMarker(MseAppendMode.ABI::class)
@Signature("enum(Windows.Media.Core.MseAppendMode;i4)")
@WinRTByReference(brClass = MseAppendMode.ByReference::class)
public enum class MseAppendMode(
  public val value: Int
) : NativeMapped {
  Segments(0),
  Sequence(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MseAppendMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Segments
      1 -> Sequence
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MseAppendMode> {
    public fun setValue(newValue: MseAppendMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MseAppendMode =
        MseAppendMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MseAppendMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MseAppendMode =
        MseAppendMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: MseAppendMode): Int = obj.value
  }
}
