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

@ABIMarker(SmartCardAppletIdGroupActivationPolicy.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardAppletIdGroupActivationPolicy;i4)")
@WinRTByReference(brClass = SmartCardAppletIdGroupActivationPolicy.ByReference::class)
public enum class SmartCardAppletIdGroupActivationPolicy(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  ForegroundOverride(1),
  Enabled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardAppletIdGroupActivationPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> ForegroundOverride
      2 -> Enabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardAppletIdGroupActivationPolicy> {
    public fun setValue(newValue: SmartCardAppletIdGroupActivationPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardAppletIdGroupActivationPolicy =
        SmartCardAppletIdGroupActivationPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardAppletIdGroupActivationPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardAppletIdGroupActivationPolicy =
        SmartCardAppletIdGroupActivationPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardAppletIdGroupActivationPolicy): Int = obj.value
  }
}
