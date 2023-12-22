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

@ABIMarker(CoreWebView2DownloadOperation.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2DownloadOperation;{afe73e6b-e760-5a06-9bf6-1e743c13cd2d})")
@WinRTByReference(brClass = CoreWebView2DownloadOperation.ByReference::class)
public class CoreWebView2DownloadOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2DownloadOperation.WithDefault, IWinRTObject {
  private val __1199417800_Interface: ICoreWebView2DownloadOperation.WithDefault by lazy {
    as_1199417800()
  }


  public override val __1199417800_Ptr: JNAPointer? by lazy {
    __1199417800_Interface.__1199417800_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1199417800_Interface)

  private fun as_1199417800(): ICoreWebView2DownloadOperation.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2DownloadOperation.ABI.makeICoreWebView2DownloadOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2DownloadOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2DownloadOperation.ABI.makeICoreWebView2DownloadOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2DownloadOperation> {
    public override fun getValue() = CoreWebView2DownloadOperation(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2DownloadOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2DownloadOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2DownloadOperation {
      val address = segment.toRawLongValue()
      return CoreWebView2DownloadOperation(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2DownloadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
