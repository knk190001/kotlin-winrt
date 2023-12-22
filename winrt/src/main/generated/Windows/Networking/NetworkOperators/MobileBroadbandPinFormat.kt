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

@ABIMarker(MobileBroadbandPinFormat.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandPinFormat;i4)")
@WinRTByReference(brClass = MobileBroadbandPinFormat.ByReference::class)
public enum class MobileBroadbandPinFormat(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Numeric(1),
  Alphanumeric(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandPinFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Numeric
      2 -> Alphanumeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MobileBroadbandPinFormat>
      {
    public fun setValue(newValue: MobileBroadbandPinFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandPinFormat =
        MobileBroadbandPinFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandPinFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandPinFormat =
        MobileBroadbandPinFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandPinFormat): Int = obj.value
  }
}
