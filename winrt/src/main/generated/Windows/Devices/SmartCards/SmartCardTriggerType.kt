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

@ABIMarker(SmartCardTriggerType.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardTriggerType;i4)")
@WinRTByReference(brClass = SmartCardTriggerType.ByReference::class)
public enum class SmartCardTriggerType(
  public val value: Int
) : NativeMapped {
  EmulatorTransaction(0),
  EmulatorNearFieldEntry(1),
  EmulatorNearFieldExit(2),
  EmulatorHostApplicationActivated(3),
  EmulatorAppletIdGroupRegistrationChanged(4),
  ReaderCardAdded(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardTriggerType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> EmulatorTransaction
      1 -> EmulatorNearFieldEntry
      2 -> EmulatorNearFieldExit
      3 -> EmulatorHostApplicationActivated
      4 -> EmulatorAppletIdGroupRegistrationChanged
      5 -> ReaderCardAdded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmartCardTriggerType> {
    public fun setValue(newValue: SmartCardTriggerType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardTriggerType =
        SmartCardTriggerType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardTriggerType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardTriggerType =
        SmartCardTriggerType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardTriggerType): Int = obj.value
  }
}
