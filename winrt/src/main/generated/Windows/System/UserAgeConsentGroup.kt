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

@ABIMarker(UserAgeConsentGroup.ABI::class)
@Signature("enum(Windows.System.UserAgeConsentGroup;i4)")
@WinRTByReference(brClass = UserAgeConsentGroup.ByReference::class)
public enum class UserAgeConsentGroup(
  public val value: Int
) : NativeMapped {
  Child(0),
  Minor(1),
  Adult(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserAgeConsentGroup {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Child
      1 -> Minor
      2 -> Adult
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserAgeConsentGroup> {
    public fun setValue(newValue: UserAgeConsentGroup): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserAgeConsentGroup =
        UserAgeConsentGroup.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserAgeConsentGroup, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserAgeConsentGroup =
        UserAgeConsentGroup.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserAgeConsentGroup): Int = obj.value
  }
}
