package Windows.Gaming.Input

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

@ABIMarker(RacingWheelButtons.ABI::class)
@Signature("enum(Windows.Gaming.Input.RacingWheelButtons;u4)")
@WinRTByReference(brClass = RacingWheelButtons.ByReference::class)
public enum class RacingWheelButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  PreviousGear(1),
  NextGear(2),
  DPadUp(4),
  DPadDown(8),
  DPadLeft(16),
  DPadRight(32),
  Button1(64),
  Button2(128),
  Button3(256),
  Button4(512),
  Button5(1024),
  Button6(2048),
  Button7(4096),
  Button8(8192),
  Button9(16384),
  Button10(32768),
  Button11(65536),
  Button12(131072),
  Button13(262144),
  Button14(524288),
  Button15(1048576),
  Button16(2097152),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RacingWheelButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> PreviousGear
      2 -> NextGear
      4 -> DPadUp
      8 -> DPadDown
      16 -> DPadLeft
      32 -> DPadRight
      64 -> Button1
      128 -> Button2
      256 -> Button3
      512 -> Button4
      1024 -> Button5
      2048 -> Button6
      4096 -> Button7
      8192 -> Button8
      16384 -> Button9
      32768 -> Button10
      65536 -> Button11
      131072 -> Button12
      262144 -> Button13
      524288 -> Button14
      1048576 -> Button15
      2097152 -> Button16
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RacingWheelButtons> {
    public fun setValue(newValue: RacingWheelButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RacingWheelButtons =
        RacingWheelButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RacingWheelButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RacingWheelButtons =
        RacingWheelButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: RacingWheelButtons): Int = obj.value
  }
}
