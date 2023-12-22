package Windows.Devices.PointOfService

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

@ABIMarker(PosConnectionTypes.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosConnectionTypes;u4)")
@WinRTByReference(brClass = PosConnectionTypes.ByReference::class)
public enum class PosConnectionTypes(
  public val value: Int
) : NativeMapped {
  Local(1),
  IP(2),
  Bluetooth(4),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosConnectionTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Local
      2 -> IP
      4 -> Bluetooth
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosConnectionTypes> {
    public fun setValue(newValue: PosConnectionTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosConnectionTypes =
        PosConnectionTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosConnectionTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosConnectionTypes =
        PosConnectionTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosConnectionTypes): Int = obj.value
  }
}
