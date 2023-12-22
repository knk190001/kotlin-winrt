package Windows.System.UserProfile

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

@ABIMarker(AccountPictureKind.ABI::class)
@Signature("enum(Windows.System.UserProfile.AccountPictureKind;i4)")
@WinRTByReference(brClass = AccountPictureKind.ByReference::class)
public enum class AccountPictureKind(
  public val value: Int
) : NativeMapped {
  SmallImage(0),
  LargeImage(1),
  Video(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AccountPictureKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SmallImage
      1 -> LargeImage
      2 -> Video
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AccountPictureKind> {
    public fun setValue(newValue: AccountPictureKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AccountPictureKind =
        AccountPictureKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AccountPictureKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AccountPictureKind =
        AccountPictureKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: AccountPictureKind): Int = obj.value
  }
}
