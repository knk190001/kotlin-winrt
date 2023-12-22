package Windows.ApplicationModel

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

@ABIMarker(StartupTaskState.ABI::class)
@Signature("enum(Windows.ApplicationModel.StartupTaskState;i4)")
@WinRTByReference(brClass = StartupTaskState.ByReference::class)
public enum class StartupTaskState(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  DisabledByUser(1),
  Enabled(2),
  DisabledByPolicy(3),
  EnabledByPolicy(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StartupTaskState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> DisabledByUser
      2 -> Enabled
      3 -> DisabledByPolicy
      4 -> EnabledByPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StartupTaskState> {
    public fun setValue(newValue: StartupTaskState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StartupTaskState =
        StartupTaskState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StartupTaskState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StartupTaskState =
        StartupTaskState.values()[0].fromNative(value, null)

    public override fun toNative(obj: StartupTaskState): Int = obj.value
  }
}
