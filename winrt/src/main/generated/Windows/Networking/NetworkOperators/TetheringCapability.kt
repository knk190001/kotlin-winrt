package Windows.Networking.NetworkOperators

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

@ABIMarker(TetheringCapability.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.TetheringCapability;i4)")
@WinRTByReference(brClass = TetheringCapability.ByReference::class)
public enum class TetheringCapability(
  public val value: Int
) : NativeMapped {
  Enabled(0),
  DisabledByGroupPolicy(1),
  DisabledByHardwareLimitation(2),
  DisabledByOperator(3),
  DisabledBySku(4),
  DisabledByRequiredAppNotInstalled(5),
  DisabledDueToUnknownCause(6),
  DisabledBySystemCapability(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TetheringCapability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Enabled
      1 -> DisabledByGroupPolicy
      2 -> DisabledByHardwareLimitation
      3 -> DisabledByOperator
      4 -> DisabledBySku
      5 -> DisabledByRequiredAppNotInstalled
      6 -> DisabledDueToUnknownCause
      7 -> DisabledBySystemCapability
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TetheringCapability> {
    public fun setValue(newValue: TetheringCapability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TetheringCapability =
        TetheringCapability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TetheringCapability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TetheringCapability =
        TetheringCapability.values()[0].fromNative(value, null)

    public override fun toNative(obj: TetheringCapability): Int = obj.value
  }
}
