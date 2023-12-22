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

@ABIMarker(KnownLibraryId.ABI::class)
@Signature("enum(Windows.Storage.KnownLibraryId;i4)")
@WinRTByReference(brClass = KnownLibraryId.ByReference::class)
public enum class KnownLibraryId(
  public val value: Int
) : NativeMapped {
  Music(0),
  Pictures(1),
  Videos(2),
  Documents(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KnownLibraryId {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Music
      1 -> Pictures
      2 -> Videos
      3 -> Documents
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KnownLibraryId> {
    public fun setValue(newValue: KnownLibraryId): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KnownLibraryId =
        KnownLibraryId.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KnownLibraryId, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KnownLibraryId =
        KnownLibraryId.values()[0].fromNative(value, null)

    public override fun toNative(obj: KnownLibraryId): Int = obj.value
  }
}
