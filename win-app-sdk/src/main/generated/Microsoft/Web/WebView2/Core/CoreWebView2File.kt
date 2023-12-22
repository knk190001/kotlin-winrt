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

@ABIMarker(CoreWebView2File.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2File;{cab45512-9594-50f1-ac3c-9cc103b574a3})")
@WinRTByReference(brClass = CoreWebView2File.ByReference::class)
public class CoreWebView2File(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2File.WithDefault, IWinRTObject {
  private val __384396189_Interface: ICoreWebView2File.WithDefault by lazy {
    as_384396189()
  }


  public override val __384396189_Ptr: JNAPointer? by lazy {
    __384396189_Interface.__384396189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__384396189_Interface)

  private fun as_384396189(): ICoreWebView2File.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2File.ABI.makeICoreWebView2File(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2File>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2File.ABI.makeICoreWebView2File(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2File> {
    public override fun getValue() = CoreWebView2File(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2File): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2File, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2File {
      val address = segment.toRawLongValue()
      return CoreWebView2File(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2File): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
