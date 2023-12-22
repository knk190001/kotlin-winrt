package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(UserDataTaskQueryKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskQueryKind;i4)")
@WinRTByReference(brClass = UserDataTaskQueryKind.ByReference::class)
public enum class UserDataTaskQueryKind(
  public val value: Int
) : NativeMapped {
  All(0),
  Incomplete(1),
  Complete(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskQueryKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> Incomplete
      2 -> Complete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserDataTaskQueryKind> {
    public fun setValue(newValue: UserDataTaskQueryKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskQueryKind =
        UserDataTaskQueryKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskQueryKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskQueryKind =
        UserDataTaskQueryKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskQueryKind): Int = obj.value
  }
}
