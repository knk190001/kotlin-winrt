package Windows.ApplicationModel.Background

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

@ABIMarker(DeviceTriggerResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.DeviceTriggerResult;i4)")
@WinRTByReference(brClass = DeviceTriggerResult.ByReference::class)
public enum class DeviceTriggerResult(
  public val value: Int
) : NativeMapped {
  Allowed(0),
  DeniedByUser(1),
  DeniedBySystem(2),
  LowBattery(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceTriggerResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> DeniedByUser
      2 -> DeniedBySystem
      3 -> LowBattery
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeviceTriggerResult> {
    public fun setValue(newValue: DeviceTriggerResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceTriggerResult =
        DeviceTriggerResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceTriggerResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceTriggerResult =
        DeviceTriggerResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceTriggerResult): Int = obj.value
  }
}
