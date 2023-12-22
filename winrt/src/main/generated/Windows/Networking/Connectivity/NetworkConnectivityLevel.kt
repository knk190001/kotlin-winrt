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

@ABIMarker(NetworkConnectivityLevel.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.NetworkConnectivityLevel;i4)")
@WinRTByReference(brClass = NetworkConnectivityLevel.ByReference::class)
public enum class NetworkConnectivityLevel(
  public val value: Int
) : NativeMapped {
  None(0),
  LocalAccess(1),
  ConstrainedInternetAccess(2),
  InternetAccess(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkConnectivityLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LocalAccess
      2 -> ConstrainedInternetAccess
      3 -> InternetAccess
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NetworkConnectivityLevel>
      {
    public fun setValue(newValue: NetworkConnectivityLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkConnectivityLevel =
        NetworkConnectivityLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkConnectivityLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkConnectivityLevel =
        NetworkConnectivityLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkConnectivityLevel): Int = obj.value
  }
}
