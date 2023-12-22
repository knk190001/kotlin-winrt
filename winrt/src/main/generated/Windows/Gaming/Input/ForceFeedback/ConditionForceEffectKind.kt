package Windows.Gaming.Input.ForceFeedback

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

@ABIMarker(ConditionForceEffectKind.ABI::class)
@Signature("enum(Windows.Gaming.Input.ForceFeedback.ConditionForceEffectKind;i4)")
@WinRTByReference(brClass = ConditionForceEffectKind.ByReference::class)
public enum class ConditionForceEffectKind(
  public val value: Int
) : NativeMapped {
  Spring(0),
  Damper(1),
  Inertia(2),
  Friction(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ConditionForceEffectKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Spring
      1 -> Damper
      2 -> Inertia
      3 -> Friction
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ConditionForceEffectKind>
      {
    public fun setValue(newValue: ConditionForceEffectKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ConditionForceEffectKind =
        ConditionForceEffectKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ConditionForceEffectKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ConditionForceEffectKind =
        ConditionForceEffectKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ConditionForceEffectKind): Int = obj.value
  }
}
