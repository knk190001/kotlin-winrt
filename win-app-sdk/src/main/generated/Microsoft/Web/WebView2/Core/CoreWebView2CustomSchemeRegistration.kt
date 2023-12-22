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

@ABIMarker(CoreWebView2CustomSchemeRegistration.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2CustomSchemeRegistration;{16dc60d9-ddec-5c3d-bc1f-4408d1875af1})")
@WinRTByReference(brClass = CoreWebView2CustomSchemeRegistration.ByReference::class)
public class CoreWebView2CustomSchemeRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2CustomSchemeRegistration.WithDefault, IWinRTObject {
  private val __1022364234_Interface: ICoreWebView2CustomSchemeRegistration.WithDefault by lazy {
    as_1022364234()
  }


  public override val __1022364234_Ptr: JNAPointer? by lazy {
    __1022364234_Interface.__1022364234_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022364234_Interface)

  private fun as_1022364234(): ICoreWebView2CustomSchemeRegistration.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CustomSchemeRegistration.ABI.makeICoreWebView2CustomSchemeRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CustomSchemeRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CustomSchemeRegistration.ABI.makeICoreWebView2CustomSchemeRegistration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2CustomSchemeRegistration> {
    public override fun getValue() = CoreWebView2CustomSchemeRegistration(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2CustomSchemeRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2CustomSchemeRegistration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2CustomSchemeRegistration {
      val address = segment.toRawLongValue()
      return CoreWebView2CustomSchemeRegistration(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2CustomSchemeRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
