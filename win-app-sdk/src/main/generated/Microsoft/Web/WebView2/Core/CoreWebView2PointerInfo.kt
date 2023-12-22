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

@ABIMarker(CoreWebView2PointerInfo.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2PointerInfo;{c3860e0d-c018-5a84-bc06-9f8f7b275dff})")
@WinRTByReference(brClass = CoreWebView2PointerInfo.ByReference::class)
public class CoreWebView2PointerInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2PointerInfo.WithDefault, IWinRTObject {
  private val __1275711428_Interface: ICoreWebView2PointerInfo.WithDefault by lazy {
    as_1275711428()
  }


  public override val __1275711428_Ptr: JNAPointer? by lazy {
    __1275711428_Interface.__1275711428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1275711428_Interface)

  private fun as_1275711428(): ICoreWebView2PointerInfo.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PointerInfo.ABI.makeICoreWebView2PointerInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PointerInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PointerInfo.ABI.makeICoreWebView2PointerInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2PointerInfo> {
    public override fun getValue() = CoreWebView2PointerInfo(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2PointerInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2PointerInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2PointerInfo {
      val address = segment.toRawLongValue()
      return CoreWebView2PointerInfo(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2PointerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
