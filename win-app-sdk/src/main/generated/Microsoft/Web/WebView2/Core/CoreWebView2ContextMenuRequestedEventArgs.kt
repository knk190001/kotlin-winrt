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

@ABIMarker(CoreWebView2ContextMenuRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ContextMenuRequestedEventArgs;{d77bdd8c-9b3e-596e-ae80-320c0df4ecbc})")
@WinRTByReference(brClass = CoreWebView2ContextMenuRequestedEventArgs.ByReference::class)
public class CoreWebView2ContextMenuRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ContextMenuRequestedEventArgs.WithDefault, IWinRTObject {
  private val __399359504_Interface: ICoreWebView2ContextMenuRequestedEventArgs.WithDefault by
      lazy {
    as_399359504()
  }


  public override val __399359504_Ptr: JNAPointer? by lazy {
    __399359504_Interface.__399359504_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__399359504_Interface)

  private fun as_399359504(): ICoreWebView2ContextMenuRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ContextMenuRequestedEventArgs.ABI.makeICoreWebView2ContextMenuRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ContextMenuRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ContextMenuRequestedEventArgs.ABI.makeICoreWebView2ContextMenuRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ContextMenuRequestedEventArgs> {
    public override fun getValue() =
        CoreWebView2ContextMenuRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ContextMenuRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ContextMenuRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2ContextMenuRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2ContextMenuRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ContextMenuRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
