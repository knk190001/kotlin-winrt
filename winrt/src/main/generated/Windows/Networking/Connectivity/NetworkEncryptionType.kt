package Windows.Networking.Connectivity

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

@ABIMarker(NetworkEncryptionType.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.NetworkEncryptionType;i4)")
@WinRTByReference(brClass = NetworkEncryptionType.ByReference::class)
public enum class NetworkEncryptionType(
  public val value: Int
) : NativeMapped {
  None(0),
  Unknown(1),
  Wep(2),
  Wep40(3),
  Wep104(4),
  Tkip(5),
  Ccmp(6),
  WpaUseGroup(7),
  RsnUseGroup(8),
  Ihv(9),
  Gcmp(10),
  Gcmp256(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkEncryptionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Unknown
      2 -> Wep
      3 -> Wep40
      4 -> Wep104
      5 -> Tkip
      6 -> Ccmp
      7 -> WpaUseGroup
      8 -> RsnUseGroup
      9 -> Ihv
      10 -> Gcmp
      11 -> Gcmp256
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NetworkEncryptionType> {
    public fun setValue(newValue: NetworkEncryptionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkEncryptionType =
        NetworkEncryptionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkEncryptionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkEncryptionType =
        NetworkEncryptionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkEncryptionType): Int = obj.value
  }
}
