package Windows.System

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

@ABIMarker(AppResourceGroupExecutionState.ABI::class)
@Signature("enum(Windows.System.AppResourceGroupExecutionState;i4)")
@WinRTByReference(brClass = AppResourceGroupExecutionState.ByReference::class)
public enum class AppResourceGroupExecutionState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Running(1),
  Suspending(2),
  Suspended(3),
  NotRunning(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppResourceGroupExecutionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Running
      2 -> Suspending
      3 -> Suspended
      4 -> NotRunning
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppResourceGroupExecutionState> {
    public fun setValue(newValue: AppResourceGroupExecutionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppResourceGroupExecutionState =
        AppResourceGroupExecutionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppResourceGroupExecutionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppResourceGroupExecutionState =
        AppResourceGroupExecutionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppResourceGroupExecutionState): Int = obj.value
  }
}
