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

@ABIMarker(IsolatedWindowsEnvironmentOwnerRegistrationStatus.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentOwnerRegistrationStatus;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentOwnerRegistrationStatus.ByReference::class)
public enum class IsolatedWindowsEnvironmentOwnerRegistrationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  InvalidArgument(1),
  AccessDenied(2),
  InsufficientMemory(3),
  UnknownFailure(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentOwnerRegistrationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> InvalidArgument
      2 -> AccessDenied
      3 -> InsufficientMemory
      4 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentOwnerRegistrationStatus> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentOwnerRegistrationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentOwnerRegistrationStatus =
        IsolatedWindowsEnvironmentOwnerRegistrationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentOwnerRegistrationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentOwnerRegistrationStatus =
        IsolatedWindowsEnvironmentOwnerRegistrationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentOwnerRegistrationStatus): Int =
        obj.value
  }
}
