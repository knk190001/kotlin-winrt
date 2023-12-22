package Windows.Devices.Gpio.Provider

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

@ABIMarker(ProviderGpioPinDriveMode.ABI::class)
@Signature("enum(Windows.Devices.Gpio.Provider.ProviderGpioPinDriveMode;i4)")
@WinRTByReference(brClass = ProviderGpioPinDriveMode.ByReference::class)
public enum class ProviderGpioPinDriveMode(
  public val value: Int
) : NativeMapped {
  Input(0),
  Output(1),
  InputPullUp(2),
  InputPullDown(3),
  OutputOpenDrain(4),
  OutputOpenDrainPullUp(5),
  OutputOpenSource(6),
  OutputOpenSourcePullDown(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProviderGpioPinDriveMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Input
      1 -> Output
      2 -> InputPullUp
      3 -> InputPullDown
      4 -> OutputOpenDrain
      5 -> OutputOpenDrainPullUp
      6 -> OutputOpenSource
      7 -> OutputOpenSourcePullDown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProviderGpioPinDriveMode>
      {
    public fun setValue(newValue: ProviderGpioPinDriveMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProviderGpioPinDriveMode =
        ProviderGpioPinDriveMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProviderGpioPinDriveMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProviderGpioPinDriveMode =
        ProviderGpioPinDriveMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProviderGpioPinDriveMode): Int = obj.value
  }
}
