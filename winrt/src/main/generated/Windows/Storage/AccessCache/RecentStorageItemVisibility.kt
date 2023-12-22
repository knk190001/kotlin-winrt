package Windows.Storage.AccessCache

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

@ABIMarker(RecentStorageItemVisibility.ABI::class)
@Signature("enum(Windows.Storage.AccessCache.RecentStorageItemVisibility;i4)")
@WinRTByReference(brClass = RecentStorageItemVisibility.ByReference::class)
public enum class RecentStorageItemVisibility(
  public val value: Int
) : NativeMapped {
  AppOnly(0),
  AppAndSystem(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RecentStorageItemVisibility {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AppOnly
      1 -> AppAndSystem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RecentStorageItemVisibility> {
    public fun setValue(newValue: RecentStorageItemVisibility): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RecentStorageItemVisibility =
        RecentStorageItemVisibility.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RecentStorageItemVisibility, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RecentStorageItemVisibility =
        RecentStorageItemVisibility.values()[0].fromNative(value, null)

    public override fun toNative(obj: RecentStorageItemVisibility): Int = obj.value
  }
}
