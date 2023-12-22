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

@ABIMarker(UserAgeConsentResult.ABI::class)
@Signature("enum(Windows.System.UserAgeConsentResult;i4)")
@WinRTByReference(brClass = UserAgeConsentResult.ByReference::class)
public enum class UserAgeConsentResult(
  public val value: Int
) : NativeMapped {
  NotEnforced(0),
  Included(1),
  NotIncluded(2),
  Unknown(3),
  Ambiguous(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserAgeConsentResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEnforced
      1 -> Included
      2 -> NotIncluded
      3 -> Unknown
      4 -> Ambiguous
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserAgeConsentResult> {
    public fun setValue(newValue: UserAgeConsentResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserAgeConsentResult =
        UserAgeConsentResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserAgeConsentResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserAgeConsentResult =
        UserAgeConsentResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserAgeConsentResult): Int = obj.value
  }
}
