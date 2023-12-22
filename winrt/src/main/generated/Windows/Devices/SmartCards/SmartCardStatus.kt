package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardStatus.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardStatus;i4)")
@WinRTByReference(brClass = SmartCardStatus.ByReference::class)
public enum class SmartCardStatus(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Ready(1),
  Shared(2),
  Exclusive(3),
  Unresponsive(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Ready
      2 -> Shared
      3 -> Exclusive
      4 -> Unresponsive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmartCardStatus> {
    public fun setValue(newValue: SmartCardStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardStatus =
        SmartCardStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardStatus =
        SmartCardStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardStatus): Int = obj.value
  }
}
