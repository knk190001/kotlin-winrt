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

@ABIMarker(UserDataTaskRegenerationUnit.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskRegenerationUnit;i4)")
@WinRTByReference(brClass = UserDataTaskRegenerationUnit.ByReference::class)
public enum class UserDataTaskRegenerationUnit(
  public val value: Int
) : NativeMapped {
  Daily(0),
  Weekly(1),
  Monthly(2),
  Yearly(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskRegenerationUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Daily
      1 -> Weekly
      2 -> Monthly
      4 -> Yearly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataTaskRegenerationUnit> {
    public fun setValue(newValue: UserDataTaskRegenerationUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskRegenerationUnit =
        UserDataTaskRegenerationUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskRegenerationUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskRegenerationUnit =
        UserDataTaskRegenerationUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskRegenerationUnit): Int = obj.value
  }
}
