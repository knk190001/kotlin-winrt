package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneLineNetworkOperatorDisplayTextLocation.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneLineNetworkOperatorDisplayTextLocation;i4)")
@WinRTByReference(brClass = PhoneLineNetworkOperatorDisplayTextLocation.ByReference::class)
public enum class PhoneLineNetworkOperatorDisplayTextLocation(
  public val value: Int
) : NativeMapped {
  Default(0),
  Tile(1),
  Dialer(2),
  InCallUI(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineNetworkOperatorDisplayTextLocation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Tile
      2 -> Dialer
      3 -> InCallUI
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneLineNetworkOperatorDisplayTextLocation> {
    public fun setValue(newValue: PhoneLineNetworkOperatorDisplayTextLocation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineNetworkOperatorDisplayTextLocation =
        PhoneLineNetworkOperatorDisplayTextLocation.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<PhoneLineNetworkOperatorDisplayTextLocation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineNetworkOperatorDisplayTextLocation =
        PhoneLineNetworkOperatorDisplayTextLocation.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineNetworkOperatorDisplayTextLocation): Int = obj.value
  }
}
