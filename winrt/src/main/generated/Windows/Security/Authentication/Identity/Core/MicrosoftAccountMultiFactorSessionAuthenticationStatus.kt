package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorSessionAuthenticationStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorSessionAuthenticationStatus;i4)")
@WinRTByReference(brClass =
    MicrosoftAccountMultiFactorSessionAuthenticationStatus.ByReference::class)
public enum class MicrosoftAccountMultiFactorSessionAuthenticationStatus(
  public val value: Int
) : NativeMapped {
  Authenticated(0),
  Unauthenticated(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MicrosoftAccountMultiFactorSessionAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Authenticated
      1 -> Unauthenticated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MicrosoftAccountMultiFactorSessionAuthenticationStatus> {
    public fun setValue(newValue: MicrosoftAccountMultiFactorSessionAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MicrosoftAccountMultiFactorSessionAuthenticationStatus =
        MicrosoftAccountMultiFactorSessionAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorSessionAuthenticationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        MicrosoftAccountMultiFactorSessionAuthenticationStatus =
        MicrosoftAccountMultiFactorSessionAuthenticationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MicrosoftAccountMultiFactorSessionAuthenticationStatus): Int =
        obj.value
  }
}
