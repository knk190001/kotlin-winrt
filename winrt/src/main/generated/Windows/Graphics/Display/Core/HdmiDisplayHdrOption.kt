package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayHdrOption.ABI::class)
@Signature("enum(Windows.Graphics.Display.Core.HdmiDisplayHdrOption;i4)")
@WinRTByReference(brClass = HdmiDisplayHdrOption.ByReference::class)
public enum class HdmiDisplayHdrOption(
  public val value: Int
) : NativeMapped {
  None(0),
  EotfSdr(1),
  Eotf2084(2),
  DolbyVisionLowLatency(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HdmiDisplayHdrOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> EotfSdr
      2 -> Eotf2084
      3 -> DolbyVisionLowLatency
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HdmiDisplayHdrOption> {
    public fun setValue(newValue: HdmiDisplayHdrOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HdmiDisplayHdrOption =
        HdmiDisplayHdrOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HdmiDisplayHdrOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HdmiDisplayHdrOption =
        HdmiDisplayHdrOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: HdmiDisplayHdrOption): Int = obj.value
  }
}
