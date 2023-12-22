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

@ABIMarker(PhotoImportContentTypeFilter.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportContentTypeFilter;i4)")
@WinRTByReference(brClass = PhotoImportContentTypeFilter.ByReference::class)
public enum class PhotoImportContentTypeFilter(
  public val value: Int
) : NativeMapped {
  OnlyImages(0),
  OnlyVideos(1),
  ImagesAndVideos(2),
  ImagesAndVideosFromCameraRoll(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportContentTypeFilter {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OnlyImages
      1 -> OnlyVideos
      2 -> ImagesAndVideos
      3 -> ImagesAndVideosFromCameraRoll
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhotoImportContentTypeFilter> {
    public fun setValue(newValue: PhotoImportContentTypeFilter): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportContentTypeFilter =
        PhotoImportContentTypeFilter.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportContentTypeFilter, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportContentTypeFilter =
        PhotoImportContentTypeFilter.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportContentTypeFilter): Int = obj.value
  }
}
