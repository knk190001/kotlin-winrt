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

@ABIMarker(CoreWebView2DevToolsProtocolEventReceivedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2DevToolsProtocolEventReceivedEventArgs;{221728ba-635e-50d2-bd3c-fd22f4113978})")
@WinRTByReference(brClass = CoreWebView2DevToolsProtocolEventReceivedEventArgs.ByReference::class)
public class CoreWebView2DevToolsProtocolEventReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.WithDefault,
    ICoreWebView2DevToolsProtocolEventReceivedEventArgs.WithDefault, IWinRTObject {
  private val __722536495_Interface:
      ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.WithDefault by lazy {
    as_722536495()
  }


  private val __577496959_Interface: ICoreWebView2DevToolsProtocolEventReceivedEventArgs.WithDefault
      by lazy {
    as_577496959()
  }


  public override val __722536495_Ptr: JNAPointer? by lazy {
    __722536495_Interface.__722536495_Ptr
  }


  public override val __577496959_Ptr: JNAPointer? by lazy {
    __577496959_Interface.__577496959_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__722536495_Interface, __577496959_Interface)

  private fun as_722536495(): ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs2(ref.value))
  }

  private fun as_577496959(): ICoreWebView2DevToolsProtocolEventReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2DevToolsProtocolEventReceivedEventArgs.ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2DevToolsProtocolEventReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2DevToolsProtocolEventReceivedEventArgs.ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2DevToolsProtocolEventReceivedEventArgs> {
    public override fun getValue() =
        CoreWebView2DevToolsProtocolEventReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2DevToolsProtocolEventReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2DevToolsProtocolEventReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2DevToolsProtocolEventReceivedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2DevToolsProtocolEventReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2DevToolsProtocolEventReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
