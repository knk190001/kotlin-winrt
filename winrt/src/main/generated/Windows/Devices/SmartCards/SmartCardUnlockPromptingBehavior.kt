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

@ABIMarker(SmartCardUnlockPromptingBehavior.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardUnlockPromptingBehavior;i4)")
@WinRTByReference(brClass = SmartCardUnlockPromptingBehavior.ByReference::class)
public enum class SmartCardUnlockPromptingBehavior(
  public val value: Int
) : NativeMapped {
  AllowUnlockPrompt(0),
  RequireUnlockPrompt(1),
  PreventUnlockPrompt(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardUnlockPromptingBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AllowUnlockPrompt
      1 -> RequireUnlockPrompt
      2 -> PreventUnlockPrompt
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardUnlockPromptingBehavior> {
    public fun setValue(newValue: SmartCardUnlockPromptingBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardUnlockPromptingBehavior =
        SmartCardUnlockPromptingBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardUnlockPromptingBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardUnlockPromptingBehavior =
        SmartCardUnlockPromptingBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardUnlockPromptingBehavior): Int = obj.value
  }
}
