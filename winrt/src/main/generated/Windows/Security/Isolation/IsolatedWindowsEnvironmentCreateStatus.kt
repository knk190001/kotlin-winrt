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

@ABIMarker(IsolatedWindowsEnvironmentCreateStatus.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentCreateStatus;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentCreateStatus.ByReference::class)
public enum class IsolatedWindowsEnvironmentCreateStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  FailureByPolicy(1),
  UnknownFailure(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentCreateStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> FailureByPolicy
      2 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentCreateStatus> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentCreateStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentCreateStatus =
        IsolatedWindowsEnvironmentCreateStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentCreateStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentCreateStatus =
        IsolatedWindowsEnvironmentCreateStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentCreateStatus): Int = obj.value
  }
}
