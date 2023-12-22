package Windows.Storage

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

@ABIMarker(FileAttributes.ABI::class)
@Signature("enum(Windows.Storage.FileAttributes;u4)")
@WinRTByReference(brClass = FileAttributes.ByReference::class)
public enum class FileAttributes(
  public val value: Int
) : NativeMapped {
  Normal(0),
  ReadOnly(1),
  Directory(16),
  Archive(32),
  Temporary(256),
  LocallyIncomplete(512),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FileAttributes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> ReadOnly
      16 -> Directory
      32 -> Archive
      256 -> Temporary
      512 -> LocallyIncomplete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FileAttributes> {
    public fun setValue(newValue: FileAttributes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FileAttributes =
        FileAttributes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FileAttributes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FileAttributes =
        FileAttributes.values()[0].fromNative(value, null)

    public override fun toNative(obj: FileAttributes): Int = obj.value
  }
}
