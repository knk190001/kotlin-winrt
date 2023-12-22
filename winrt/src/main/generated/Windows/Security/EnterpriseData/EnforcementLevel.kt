package Windows.Security.EnterpriseData

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

@ABIMarker(EnforcementLevel.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.EnforcementLevel;i4)")
@WinRTByReference(brClass = EnforcementLevel.ByReference::class)
public enum class EnforcementLevel(
  public val value: Int
) : NativeMapped {
  NoProtection(0),
  Silent(1),
  Override(2),
  Block(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EnforcementLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoProtection
      1 -> Silent
      2 -> Override
      3 -> Block
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EnforcementLevel> {
    public fun setValue(newValue: EnforcementLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EnforcementLevel =
        EnforcementLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EnforcementLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EnforcementLevel =
        EnforcementLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: EnforcementLevel): Int = obj.value
  }
}
