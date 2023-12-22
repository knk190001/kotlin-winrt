package Windows.Media.Audio

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

@ABIMarker(QuantumSizeSelectionMode.ABI::class)
@Signature("enum(Windows.Media.Audio.QuantumSizeSelectionMode;i4)")
@WinRTByReference(brClass = QuantumSizeSelectionMode.ByReference::class)
public enum class QuantumSizeSelectionMode(
  public val value: Int
) : NativeMapped {
  SystemDefault(0),
  LowestLatency(1),
  ClosestToDesired(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      QuantumSizeSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SystemDefault
      1 -> LowestLatency
      2 -> ClosestToDesired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<QuantumSizeSelectionMode>
      {
    public fun setValue(newValue: QuantumSizeSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): QuantumSizeSelectionMode =
        QuantumSizeSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<QuantumSizeSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): QuantumSizeSelectionMode =
        QuantumSizeSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: QuantumSizeSelectionMode): Int = obj.value
  }
}
