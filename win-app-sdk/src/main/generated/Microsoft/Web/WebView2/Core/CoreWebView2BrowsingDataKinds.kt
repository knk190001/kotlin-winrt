package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2BrowsingDataKinds.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2BrowsingDataKinds;u4)")
@WinRTByReference(brClass = CoreWebView2BrowsingDataKinds.ByReference::class)
public enum class CoreWebView2BrowsingDataKinds(
  public val value: Int
) : NativeMapped {
  FileSystems(1),
  IndexedDb(2),
  LocalStorage(4),
  WebSql(8),
  CacheStorage(16),
  AllDomStorage(32),
  Cookies(64),
  AllSite(128),
  DiskCache(256),
  DownloadHistory(512),
  GeneralAutofill(1024),
  PasswordAutosave(2048),
  BrowsingHistory(4096),
  Settings(8192),
  AllProfile(16384),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2BrowsingDataKinds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> FileSystems
      2 -> IndexedDb
      4 -> LocalStorage
      8 -> WebSql
      16 -> CacheStorage
      32 -> AllDomStorage
      64 -> Cookies
      128 -> AllSite
      256 -> DiskCache
      512 -> DownloadHistory
      1024 -> GeneralAutofill
      2048 -> PasswordAutosave
      4096 -> BrowsingHistory
      8192 -> Settings
      16384 -> AllProfile
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2BrowsingDataKinds> {
    public fun setValue(newValue: CoreWebView2BrowsingDataKinds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2BrowsingDataKinds =
        CoreWebView2BrowsingDataKinds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2BrowsingDataKinds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2BrowsingDataKinds =
        CoreWebView2BrowsingDataKinds.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2BrowsingDataKinds): Int = obj.value
  }
}
