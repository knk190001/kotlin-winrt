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

@ABIMarker(CoreWebView2ContextMenuItem.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ContextMenuItem;{2a65706f-941a-52cd-8651-a165586b0abf})")
@WinRTByReference(brClass = CoreWebView2ContextMenuItem.ByReference::class)
public class CoreWebView2ContextMenuItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ContextMenuItem.WithDefault, IWinRTObject {
  private val __940151450_Interface: ICoreWebView2ContextMenuItem.WithDefault by lazy {
    as_940151450()
  }


  public override val __940151450_Ptr: JNAPointer? by lazy {
    __940151450_Interface.__940151450_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__940151450_Interface)

  private fun as_940151450(): ICoreWebView2ContextMenuItem.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ContextMenuItem.ABI.makeICoreWebView2ContextMenuItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ContextMenuItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ContextMenuItem.ABI.makeICoreWebView2ContextMenuItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ContextMenuItem> {
    public override fun getValue() = CoreWebView2ContextMenuItem(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ContextMenuItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ContextMenuItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2ContextMenuItem {
      val address = segment.toRawLongValue()
      return CoreWebView2ContextMenuItem(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ContextMenuItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
