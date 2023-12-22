package Windows.Devices.Geolocation

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

@ABIMarker(PositionSource.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.PositionSource;i4)")
@WinRTByReference(brClass = PositionSource.ByReference::class)
public enum class PositionSource(
  public val value: Int
) : NativeMapped {
  Cellular(0),
  Satellite(1),
  WiFi(2),
  IPAddress(3),
  Unknown(4),
  Default(5),
  Obfuscated(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PositionSource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Cellular
      1 -> Satellite
      2 -> WiFi
      3 -> IPAddress
      4 -> Unknown
      5 -> Default
      6 -> Obfuscated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PositionSource> {
    public fun setValue(newValue: PositionSource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PositionSource =
        PositionSource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PositionSource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PositionSource =
        PositionSource.values()[0].fromNative(value, null)

    public override fun toNative(obj: PositionSource): Int = obj.value
  }
}
