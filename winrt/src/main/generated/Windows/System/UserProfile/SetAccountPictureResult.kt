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

@ABIMarker(SetAccountPictureResult.ABI::class)
@Signature("enum(Windows.System.UserProfile.SetAccountPictureResult;i4)")
@WinRTByReference(brClass = SetAccountPictureResult.ByReference::class)
public enum class SetAccountPictureResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  ChangeDisabled(1),
  LargeOrDynamicError(2),
  VideoFrameSizeError(3),
  FileSizeError(4),
  Failure(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SetAccountPictureResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> ChangeDisabled
      2 -> LargeOrDynamicError
      3 -> VideoFrameSizeError
      4 -> FileSizeError
      5 -> Failure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SetAccountPictureResult> {
    public fun setValue(newValue: SetAccountPictureResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SetAccountPictureResult =
        SetAccountPictureResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SetAccountPictureResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SetAccountPictureResult =
        SetAccountPictureResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: SetAccountPictureResult): Int = obj.value
  }
}
