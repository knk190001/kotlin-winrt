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

@ABIMarker(PhotoImportSubfolderCreationMode.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportSubfolderCreationMode;i4)")
@WinRTByReference(brClass = PhotoImportSubfolderCreationMode.ByReference::class)
public enum class PhotoImportSubfolderCreationMode(
  public val value: Int
) : NativeMapped {
  DoNotCreateSubfolders(0),
  CreateSubfoldersFromFileDate(1),
  CreateSubfoldersFromExifDate(2),
  KeepOriginalFolderStructure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportSubfolderCreationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DoNotCreateSubfolders
      1 -> CreateSubfoldersFromFileDate
      2 -> CreateSubfoldersFromExifDate
      3 -> KeepOriginalFolderStructure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhotoImportSubfolderCreationMode> {
    public fun setValue(newValue: PhotoImportSubfolderCreationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportSubfolderCreationMode =
        PhotoImportSubfolderCreationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportSubfolderCreationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportSubfolderCreationMode =
        PhotoImportSubfolderCreationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportSubfolderCreationMode): Int = obj.value
  }
}
