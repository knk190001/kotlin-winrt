package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentProcessState.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentProcessState;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentProcessState.ByReference::class)
public enum class IsolatedWindowsEnvironmentProcessState(
  public val value: Int
) : NativeMapped {
  Running(1),
  Aborted(2),
  Completed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentProcessState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Running
      2 -> Aborted
      3 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentProcessState> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentProcessState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentProcessState =
        IsolatedWindowsEnvironmentProcessState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentProcessState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentProcessState =
        IsolatedWindowsEnvironmentProcessState.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentProcessState): Int = obj.value
  }
}
