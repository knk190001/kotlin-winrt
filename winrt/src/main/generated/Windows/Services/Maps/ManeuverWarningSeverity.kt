package Windows.Services.Maps

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

@ABIMarker(ManeuverWarningSeverity.ABI::class)
@Signature("enum(Windows.Services.Maps.ManeuverWarningSeverity;i4)")
@WinRTByReference(brClass = ManeuverWarningSeverity.ByReference::class)
public enum class ManeuverWarningSeverity(
  public val value: Int
) : NativeMapped {
  None(0),
  LowImpact(1),
  Minor(2),
  Moderate(3),
  Serious(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ManeuverWarningSeverity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LowImpact
      2 -> Minor
      3 -> Moderate
      4 -> Serious
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ManeuverWarningSeverity> {
    public fun setValue(newValue: ManeuverWarningSeverity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ManeuverWarningSeverity =
        ManeuverWarningSeverity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ManeuverWarningSeverity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ManeuverWarningSeverity =
        ManeuverWarningSeverity.values()[0].fromNative(value, null)

    public override fun toNative(obj: ManeuverWarningSeverity): Int = obj.value
  }
}
