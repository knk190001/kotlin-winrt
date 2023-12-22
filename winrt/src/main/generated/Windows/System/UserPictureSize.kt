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

@ABIMarker(UserPictureSize.ABI::class)
@Signature("enum(Windows.System.UserPictureSize;i4)")
@WinRTByReference(brClass = UserPictureSize.ByReference::class)
public enum class UserPictureSize(
  public val value: Int
) : NativeMapped {
  Size64x64(0),
  Size208x208(1),
  Size424x424(2),
  Size1080x1080(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserPictureSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Size64x64
      1 -> Size208x208
      2 -> Size424x424
      3 -> Size1080x1080
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserPictureSize> {
    public fun setValue(newValue: UserPictureSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserPictureSize =
        UserPictureSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserPictureSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserPictureSize =
        UserPictureSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserPictureSize): Int = obj.value
  }
}
