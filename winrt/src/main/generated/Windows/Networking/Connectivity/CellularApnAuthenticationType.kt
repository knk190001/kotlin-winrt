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

@ABIMarker(CellularApnAuthenticationType.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.CellularApnAuthenticationType;i4)")
@WinRTByReference(brClass = CellularApnAuthenticationType.ByReference::class)
public enum class CellularApnAuthenticationType(
  public val value: Int
) : NativeMapped {
  None(0),
  Pap(1),
  Chap(2),
  Mschapv2(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CellularApnAuthenticationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Pap
      2 -> Chap
      3 -> Mschapv2
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CellularApnAuthenticationType> {
    public fun setValue(newValue: CellularApnAuthenticationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CellularApnAuthenticationType =
        CellularApnAuthenticationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CellularApnAuthenticationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CellularApnAuthenticationType =
        CellularApnAuthenticationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CellularApnAuthenticationType): Int = obj.value
  }
}
