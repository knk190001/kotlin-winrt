package Windows.UI.Xaml.Media

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

@ABIMarker(LoadedImageSourceLoadStatus.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.LoadedImageSourceLoadStatus;i4)")
@WinRTByReference(brClass = LoadedImageSourceLoadStatus.ByReference::class)
public enum class LoadedImageSourceLoadStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NetworkError(1),
  InvalidFormat(2),
  Other(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LoadedImageSourceLoadStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NetworkError
      2 -> InvalidFormat
      3 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<LoadedImageSourceLoadStatus> {
    public fun setValue(newValue: LoadedImageSourceLoadStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LoadedImageSourceLoadStatus =
        LoadedImageSourceLoadStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LoadedImageSourceLoadStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LoadedImageSourceLoadStatus =
        LoadedImageSourceLoadStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LoadedImageSourceLoadStatus): Int = obj.value
  }
}
