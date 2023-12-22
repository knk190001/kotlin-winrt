package Windows.ApplicationModel.UserDataAccounts.Provider

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

@ABIMarker(UserDataAccountProviderOperationKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataAccounts.Provider.UserDataAccountProviderOperationKind;i4)")
@WinRTByReference(brClass = UserDataAccountProviderOperationKind.ByReference::class)
public enum class UserDataAccountProviderOperationKind(
  public val value: Int
) : NativeMapped {
  AddAccount(0),
  Settings(1),
  ResolveErrors(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataAccountProviderOperationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AddAccount
      1 -> Settings
      2 -> ResolveErrors
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataAccountProviderOperationKind> {
    public fun setValue(newValue: UserDataAccountProviderOperationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataAccountProviderOperationKind =
        UserDataAccountProviderOperationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataAccountProviderOperationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataAccountProviderOperationKind =
        UserDataAccountProviderOperationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataAccountProviderOperationKind): Int = obj.value
  }
}
