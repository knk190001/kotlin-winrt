package Windows.System.Profile

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

@ABIMarker(UnsupportedAppRequirementReasons.ABI::class)
@Signature("enum(Windows.System.Profile.UnsupportedAppRequirementReasons;u4)")
@WinRTByReference(brClass = UnsupportedAppRequirementReasons.ByReference::class)
public enum class UnsupportedAppRequirementReasons(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  DeniedBySystem(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnsupportedAppRequirementReasons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> DeniedBySystem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UnsupportedAppRequirementReasons> {
    public fun setValue(newValue: UnsupportedAppRequirementReasons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnsupportedAppRequirementReasons =
        UnsupportedAppRequirementReasons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnsupportedAppRequirementReasons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnsupportedAppRequirementReasons =
        UnsupportedAppRequirementReasons.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnsupportedAppRequirementReasons): Int = obj.value
  }
}
