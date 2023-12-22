package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattRequestState.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattRequestState;i4)")
@WinRTByReference(brClass = GattRequestState.ByReference::class)
public enum class GattRequestState(
  public val value: Int
) : NativeMapped {
  Pending(0),
  Completed(1),
  Canceled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattRequestState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pending
      1 -> Completed
      2 -> Canceled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattRequestState> {
    public fun setValue(newValue: GattRequestState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattRequestState =
        GattRequestState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattRequestState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattRequestState =
        GattRequestState.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattRequestState): Int = obj.value
  }
}
