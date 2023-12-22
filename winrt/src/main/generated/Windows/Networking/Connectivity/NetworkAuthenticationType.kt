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

@ABIMarker(NetworkAuthenticationType.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.NetworkAuthenticationType;i4)")
@WinRTByReference(brClass = NetworkAuthenticationType.ByReference::class)
public enum class NetworkAuthenticationType(
  public val value: Int
) : NativeMapped {
  None(0),
  Unknown(1),
  Open80211(2),
  SharedKey80211(3),
  Wpa(4),
  WpaPsk(5),
  WpaNone(6),
  Rsna(7),
  RsnaPsk(8),
  Ihv(9),
  Wpa3(10),
  Wpa3Enterprise192Bits(10),
  Wpa3Sae(11),
  Owe(12),
  Wpa3Enterprise(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkAuthenticationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Unknown
      2 -> Open80211
      3 -> SharedKey80211
      4 -> Wpa
      5 -> WpaPsk
      6 -> WpaNone
      7 -> Rsna
      8 -> RsnaPsk
      9 -> Ihv
      10 -> Wpa3
      10 -> Wpa3Enterprise192Bits
      11 -> Wpa3Sae
      12 -> Owe
      13 -> Wpa3Enterprise
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NetworkAuthenticationType>
      {
    public fun setValue(newValue: NetworkAuthenticationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkAuthenticationType =
        NetworkAuthenticationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkAuthenticationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkAuthenticationType =
        NetworkAuthenticationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkAuthenticationType): Int = obj.value
  }
}
