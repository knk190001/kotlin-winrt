package Windows.Media.Import

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

@ABIMarker(PhotoImportSourceType.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportSourceType;i4)")
@WinRTByReference(brClass = PhotoImportSourceType.ByReference::class)
public enum class PhotoImportSourceType(
  public val value: Int
) : NativeMapped {
  Generic(0),
  Camera(1),
  MediaPlayer(2),
  Phone(3),
  Video(4),
  PersonalInfoManager(5),
  AudioRecorder(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportSourceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Generic
      1 -> Camera
      2 -> MediaPlayer
      3 -> Phone
      4 -> Video
      5 -> PersonalInfoManager
      6 -> AudioRecorder
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportSourceType> {
    public fun setValue(newValue: PhotoImportSourceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportSourceType =
        PhotoImportSourceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportSourceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportSourceType =
        PhotoImportSourceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportSourceType): Int = obj.value
  }
}
