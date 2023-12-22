package Windows.Security.Credentials

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

@ABIMarker(KeyCredentialStatus.ABI::class)
@Signature("enum(Windows.Security.Credentials.KeyCredentialStatus;i4)")
@WinRTByReference(brClass = KeyCredentialStatus.ByReference::class)
public enum class KeyCredentialStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownError(1),
  NotFound(2),
  UserCanceled(3),
  UserPrefersPassword(4),
  CredentialAlreadyExists(5),
  SecurityDeviceLocked(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KeyCredentialStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownError
      2 -> NotFound
      3 -> UserCanceled
      4 -> UserPrefersPassword
      5 -> CredentialAlreadyExists
      6 -> SecurityDeviceLocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KeyCredentialStatus> {
    public fun setValue(newValue: KeyCredentialStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KeyCredentialStatus =
        KeyCredentialStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KeyCredentialStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KeyCredentialStatus =
        KeyCredentialStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: KeyCredentialStatus): Int = obj.value
  }
}
