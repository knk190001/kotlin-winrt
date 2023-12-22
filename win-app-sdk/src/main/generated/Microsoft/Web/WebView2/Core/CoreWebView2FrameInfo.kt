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

@ABIMarker(CoreWebView2FrameInfo.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2FrameInfo;{f9b82e06-73f3-513b-bc2c-445ddedba976})")
@WinRTByReference(brClass = CoreWebView2FrameInfo.ByReference::class)
public class CoreWebView2FrameInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2FrameInfo.WithDefault, IWinRTObject {
  private val __13329100_Interface: ICoreWebView2FrameInfo.WithDefault by lazy {
    as_13329100()
  }


  public override val __13329100_Ptr: JNAPointer? by lazy {
    __13329100_Interface.__13329100_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13329100_Interface)

  private fun as_13329100(): ICoreWebView2FrameInfo.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2FrameInfo.ABI.makeICoreWebView2FrameInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2FrameInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2FrameInfo.ABI.makeICoreWebView2FrameInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2FrameInfo> {
    public override fun getValue() = CoreWebView2FrameInfo(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2FrameInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2FrameInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2FrameInfo {
      val address = segment.toRawLongValue()
      return CoreWebView2FrameInfo(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2FrameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
