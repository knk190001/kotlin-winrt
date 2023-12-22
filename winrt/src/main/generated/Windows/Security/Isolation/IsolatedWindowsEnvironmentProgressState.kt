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

@ABIMarker(IsolatedWindowsEnvironmentProgressState.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentProgressState;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentProgressState.ByReference::class)
public enum class IsolatedWindowsEnvironmentProgressState(
  public val value: Int
) : NativeMapped {
  Queued(0),
  Processing(1),
  Completed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentProgressState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Queued
      1 -> Processing
      2 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentProgressState> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentProgressState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentProgressState =
        IsolatedWindowsEnvironmentProgressState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentProgressState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentProgressState =
        IsolatedWindowsEnvironmentProgressState.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentProgressState): Int = obj.value
  }
}
