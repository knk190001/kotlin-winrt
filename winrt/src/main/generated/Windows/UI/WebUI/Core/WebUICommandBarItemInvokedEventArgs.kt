package Windows.UI.WebUI.Core

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

@ABIMarker(WebUICommandBarItemInvokedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBarItemInvokedEventArgs;{304edbdd-e741-41ef-bdc4-a45cea2a4f70})")
@WinRTByReference(brClass = WebUICommandBarItemInvokedEventArgs.ByReference::class)
public class WebUICommandBarItemInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBarItemInvokedEventArgs.WithDefault, IWinRTObject {
  private val __508081255_Interface: IWebUICommandBarItemInvokedEventArgs.WithDefault by lazy {
    as_508081255()
  }


  public override val __508081255_Ptr: JNAPointer? by lazy {
    __508081255_Interface.__508081255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__508081255_Interface)

  private fun as_508081255(): IWebUICommandBarItemInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarItemInvokedEventArgs.ABI.makeIWebUICommandBarItemInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarItemInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarItemInvokedEventArgs.ABI.makeIWebUICommandBarItemInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUICommandBarItemInvokedEventArgs> {
    public override fun getValue() = WebUICommandBarItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBarItemInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBarItemInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUICommandBarItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return WebUICommandBarItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBarItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
