package Windows.Foundation.Metadata

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

@ABIMarker(GCPressureAmount.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.GCPressureAmount;i4)")
@WinRTByReference(brClass = GCPressureAmount.ByReference::class)
public enum class GCPressureAmount(
  public val value: Int
) : NativeMapped {
  Low(0),
  Medium(1),
  High(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GCPressureAmount {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Low
      1 -> Medium
      2 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GCPressureAmount> {
    public fun setValue(newValue: GCPressureAmount): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GCPressureAmount =
        GCPressureAmount.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GCPressureAmount, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GCPressureAmount =
        GCPressureAmount.values()[0].fromNative(value, null)

    public override fun toNative(obj: GCPressureAmount): Int = obj.value
  }
}
