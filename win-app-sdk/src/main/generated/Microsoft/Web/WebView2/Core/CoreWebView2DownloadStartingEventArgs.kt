package Microsoft.Web.WebView2.Core

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2DownloadStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2DownloadStartingEventArgs;{45d982ba-9256-5b35-b023-26a438599110})")
@WinRTByReference(brClass = CoreWebView2DownloadStartingEventArgs.ByReference::class)
public class CoreWebView2DownloadStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2DownloadStartingEventArgs.WithDefault, IWinRTObject {
  private val __1298825736_Interface: ICoreWebView2DownloadStartingEventArgs.WithDefault by lazy {
    as_1298825736()
  }


  public override val __1298825736_Ptr: JNAPointer? by lazy {
    __1298825736_Interface.__1298825736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1298825736_Interface)

  private fun as_1298825736(): ICoreWebView2DownloadStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2DownloadStartingEventArgs.ABI.makeICoreWebView2DownloadStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2DownloadStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2DownloadStartingEventArgs.ABI.makeICoreWebView2DownloadStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2DownloadStartingEventArgs> {
    public override fun getValue() = CoreWebView2DownloadStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2DownloadStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2DownloadStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2DownloadStartingEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2DownloadStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2DownloadStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
