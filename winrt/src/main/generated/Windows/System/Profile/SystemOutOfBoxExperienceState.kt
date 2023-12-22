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

@ABIMarker(SystemOutOfBoxExperienceState.ABI::class)
@Signature("enum(Windows.System.Profile.SystemOutOfBoxExperienceState;i4)")
@WinRTByReference(brClass = SystemOutOfBoxExperienceState.ByReference::class)
public enum class SystemOutOfBoxExperienceState(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  InProgress(1),
  Completed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemOutOfBoxExperienceState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> InProgress
      2 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SystemOutOfBoxExperienceState> {
    public fun setValue(newValue: SystemOutOfBoxExperienceState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemOutOfBoxExperienceState =
        SystemOutOfBoxExperienceState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemOutOfBoxExperienceState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemOutOfBoxExperienceState =
        SystemOutOfBoxExperienceState.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemOutOfBoxExperienceState): Int = obj.value
  }
}
