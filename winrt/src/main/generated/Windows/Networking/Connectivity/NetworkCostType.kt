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

@ABIMarker(NetworkCostType.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.NetworkCostType;i4)")
@WinRTByReference(brClass = NetworkCostType.ByReference::class)
public enum class NetworkCostType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Unrestricted(1),
  Fixed(2),
  Variable(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkCostType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Unrestricted
      2 -> Fixed
      3 -> Variable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NetworkCostType> {
    public fun setValue(newValue: NetworkCostType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkCostType =
        NetworkCostType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkCostType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkCostType =
        NetworkCostType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkCostType): Int = obj.value
  }
}
