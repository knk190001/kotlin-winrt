package Windows.Devices.Haptics

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

@ABIMarker(VibrationAccessStatus.ABI::class)
@Signature("enum(Windows.Devices.Haptics.VibrationAccessStatus;i4)")
@WinRTByReference(brClass = VibrationAccessStatus.ByReference::class)
public enum class VibrationAccessStatus(
  public val value: Int
) : NativeMapped {
  Allowed(0),
  DeniedByUser(1),
  DeniedBySystem(2),
  DeniedByEnergySaver(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VibrationAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> DeniedByUser
      2 -> DeniedBySystem
      3 -> DeniedByEnergySaver
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VibrationAccessStatus> {
    public fun setValue(newValue: VibrationAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VibrationAccessStatus =
        VibrationAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VibrationAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VibrationAccessStatus =
        VibrationAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: VibrationAccessStatus): Int = obj.value
  }
}
