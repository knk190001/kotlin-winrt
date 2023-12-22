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

@ABIMarker(CoreWebView2WindowFeatures.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WindowFeatures;{ee8686d6-056f-5e06-824f-4e2a24c1c1d6})")
@WinRTByReference(brClass = CoreWebView2WindowFeatures.ByReference::class)
public class CoreWebView2WindowFeatures(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WindowFeatures.WithDefault, IWinRTObject {
  private val __365338228_Interface: ICoreWebView2WindowFeatures.WithDefault by lazy {
    as_365338228()
  }


  public override val __365338228_Ptr: JNAPointer? by lazy {
    __365338228_Interface.__365338228_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__365338228_Interface)

  private fun as_365338228(): ICoreWebView2WindowFeatures.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WindowFeatures.ABI.makeICoreWebView2WindowFeatures(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WindowFeatures>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WindowFeatures.ABI.makeICoreWebView2WindowFeatures(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WindowFeatures> {
    public override fun getValue() = CoreWebView2WindowFeatures(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WindowFeatures): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WindowFeatures, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2WindowFeatures {
      val address = segment.toRawLongValue()
      return CoreWebView2WindowFeatures(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WindowFeatures): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
