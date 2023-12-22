package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandDeviceType.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandDeviceType;i4)")
@WinRTByReference(brClass = MobileBroadbandDeviceType.ByReference::class)
public enum class MobileBroadbandDeviceType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Embedded(1),
  Removable(2),
  Remote(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandDeviceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Embedded
      2 -> Removable
      3 -> Remote
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MobileBroadbandDeviceType>
      {
    public fun setValue(newValue: MobileBroadbandDeviceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandDeviceType =
        MobileBroadbandDeviceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandDeviceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandDeviceType =
        MobileBroadbandDeviceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandDeviceType): Int = obj.value
  }
}
