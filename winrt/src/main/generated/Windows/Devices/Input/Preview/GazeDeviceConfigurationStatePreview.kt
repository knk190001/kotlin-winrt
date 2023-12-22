package Windows.Devices.Input.Preview

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

@ABIMarker(GazeDeviceConfigurationStatePreview.ABI::class)
@Signature("enum(Windows.Devices.Input.Preview.GazeDeviceConfigurationStatePreview;i4)")
@WinRTByReference(brClass = GazeDeviceConfigurationStatePreview.ByReference::class)
public enum class GazeDeviceConfigurationStatePreview(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Ready(1),
  Configuring(2),
  ScreenSetupNeeded(3),
  UserCalibrationNeeded(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GazeDeviceConfigurationStatePreview {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Ready
      2 -> Configuring
      3 -> ScreenSetupNeeded
      4 -> UserCalibrationNeeded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GazeDeviceConfigurationStatePreview> {
    public fun setValue(newValue: GazeDeviceConfigurationStatePreview): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GazeDeviceConfigurationStatePreview =
        GazeDeviceConfigurationStatePreview.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GazeDeviceConfigurationStatePreview, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GazeDeviceConfigurationStatePreview =
        GazeDeviceConfigurationStatePreview.values()[0].fromNative(value, null)

    public override fun toNative(obj: GazeDeviceConfigurationStatePreview): Int = obj.value
  }
}
