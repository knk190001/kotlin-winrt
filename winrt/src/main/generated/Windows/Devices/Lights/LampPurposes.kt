package Windows.Devices.Lights

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

@ABIMarker(LampPurposes.ABI::class)
@Signature("enum(Windows.Devices.Lights.LampPurposes;u4)")
@WinRTByReference(brClass = LampPurposes.ByReference::class)
public enum class LampPurposes(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Control(1),
  Accent(2),
  Branding(4),
  Status(8),
  Illumination(16),
  Presentation(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LampPurposes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Control
      2 -> Accent
      4 -> Branding
      8 -> Status
      16 -> Illumination
      32 -> Presentation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LampPurposes> {
    public fun setValue(newValue: LampPurposes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LampPurposes =
        LampPurposes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LampPurposes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LampPurposes =
        LampPurposes.values()[0].fromNative(value, null)

    public override fun toNative(obj: LampPurposes): Int = obj.value
  }
}
