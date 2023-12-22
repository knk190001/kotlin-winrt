package Windows.ApplicationModel.UserDataAccounts

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

@ABIMarker(UserDataAccountOtherAppReadAccess.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess;i4)")
@WinRTByReference(brClass = UserDataAccountOtherAppReadAccess.ByReference::class)
public enum class UserDataAccountOtherAppReadAccess(
  public val value: Int
) : NativeMapped {
  SystemOnly(0),
  Full(1),
  None(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataAccountOtherAppReadAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SystemOnly
      1 -> Full
      2 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataAccountOtherAppReadAccess> {
    public fun setValue(newValue: UserDataAccountOtherAppReadAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataAccountOtherAppReadAccess =
        UserDataAccountOtherAppReadAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataAccountOtherAppReadAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataAccountOtherAppReadAccess =
        UserDataAccountOtherAppReadAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataAccountOtherAppReadAccess): Int = obj.value
  }
}
