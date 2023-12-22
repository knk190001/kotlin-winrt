package Windows.Security.DataProtection

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

@ABIMarker(UserDataAvailability.ABI::class)
@Signature("enum(Windows.Security.DataProtection.UserDataAvailability;i4)")
@WinRTByReference(brClass = UserDataAvailability.ByReference::class)
public enum class UserDataAvailability(
  public val value: Int
) : NativeMapped {
  Always(0),
  AfterFirstUnlock(1),
  WhileUnlocked(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataAvailability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Always
      1 -> AfterFirstUnlock
      2 -> WhileUnlocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserDataAvailability> {
    public fun setValue(newValue: UserDataAvailability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataAvailability =
        UserDataAvailability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataAvailability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataAvailability =
        UserDataAvailability.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataAvailability): Int = obj.value
  }
}
