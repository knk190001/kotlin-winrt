package Windows.Security.Credentials.UI

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

@ABIMarker(AuthenticationProtocol.ABI::class)
@Signature("enum(Windows.Security.Credentials.UI.AuthenticationProtocol;i4)")
@WinRTByReference(brClass = AuthenticationProtocol.ByReference::class)
public enum class AuthenticationProtocol(
  public val value: Int
) : NativeMapped {
  Basic(0),
  Digest(1),
  Ntlm(2),
  Kerberos(3),
  Negotiate(4),
  CredSsp(5),
  Custom(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AuthenticationProtocol {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Basic
      1 -> Digest
      2 -> Ntlm
      3 -> Kerberos
      4 -> Negotiate
      5 -> CredSsp
      6 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AuthenticationProtocol> {
    public fun setValue(newValue: AuthenticationProtocol): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AuthenticationProtocol =
        AuthenticationProtocol.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AuthenticationProtocol, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AuthenticationProtocol =
        AuthenticationProtocol.values()[0].fromNative(value, null)

    public override fun toNative(obj: AuthenticationProtocol): Int = obj.value
  }
}
