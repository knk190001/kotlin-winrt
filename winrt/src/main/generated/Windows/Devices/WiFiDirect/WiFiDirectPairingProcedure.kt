package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectPairingProcedure.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure;i4)")
@WinRTByReference(brClass = WiFiDirectPairingProcedure.ByReference::class)
public enum class WiFiDirectPairingProcedure(
  public val value: Int
) : NativeMapped {
  GroupOwnerNegotiation(0),
  Invitation(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectPairingProcedure {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> GroupOwnerNegotiation
      1 -> Invitation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectPairingProcedure> {
    public fun setValue(newValue: WiFiDirectPairingProcedure): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectPairingProcedure =
        WiFiDirectPairingProcedure.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectPairingProcedure, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectPairingProcedure =
        WiFiDirectPairingProcedure.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectPairingProcedure): Int = obj.value
  }
}
