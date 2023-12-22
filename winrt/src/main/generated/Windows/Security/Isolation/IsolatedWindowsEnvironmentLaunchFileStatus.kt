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

@ABIMarker(IsolatedWindowsEnvironmentLaunchFileStatus.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentLaunchFileStatus;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentLaunchFileStatus.ByReference::class)
public enum class IsolatedWindowsEnvironmentLaunchFileStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  EnvironmentUnavailable(2),
  FileNotFound(3),
  TimedOut(4),
  AlreadySharedWithConflictingOptions(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentLaunchFileStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> EnvironmentUnavailable
      3 -> FileNotFound
      4 -> TimedOut
      5 -> AlreadySharedWithConflictingOptions
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentLaunchFileStatus> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentLaunchFileStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentLaunchFileStatus =
        IsolatedWindowsEnvironmentLaunchFileStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentLaunchFileStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentLaunchFileStatus =
        IsolatedWindowsEnvironmentLaunchFileStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentLaunchFileStatus): Int = obj.value
  }
}
