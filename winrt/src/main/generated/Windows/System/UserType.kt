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

@ABIMarker(UserType.ABI::class)
@Signature("enum(Windows.System.UserType;i4)")
@WinRTByReference(brClass = UserType.ByReference::class)
public enum class UserType(
  public val value: Int
) : NativeMapped {
  LocalUser(0),
  RemoteUser(1),
  LocalGuest(2),
  RemoteGuest(3),
  SystemManaged(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): UserType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LocalUser
      1 -> RemoteUser
      2 -> LocalGuest
      3 -> RemoteGuest
      4 -> SystemManaged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserType> {
    public fun setValue(newValue: UserType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserType =
        UserType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserType =
        UserType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserType): Int = obj.value
  }
}
