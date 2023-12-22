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

@ABIMarker(UserAuthenticationStatus.ABI::class)
@Signature("enum(Windows.System.UserAuthenticationStatus;i4)")
@WinRTByReference(brClass = UserAuthenticationStatus.ByReference::class)
public enum class UserAuthenticationStatus(
  public val value: Int
) : NativeMapped {
  Unauthenticated(0),
  LocallyAuthenticated(1),
  RemotelyAuthenticated(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unauthenticated
      1 -> LocallyAuthenticated
      2 -> RemotelyAuthenticated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserAuthenticationStatus>
      {
    public fun setValue(newValue: UserAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserAuthenticationStatus =
        UserAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserAuthenticationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserAuthenticationStatus =
        UserAuthenticationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserAuthenticationStatus): Int = obj.value
  }
}
