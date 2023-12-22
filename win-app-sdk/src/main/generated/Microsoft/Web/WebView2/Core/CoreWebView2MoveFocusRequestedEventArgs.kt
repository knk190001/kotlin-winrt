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

@ABIMarker(CoreWebView2MoveFocusRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2MoveFocusRequestedEventArgs;{2e29103b-ecdd-5c1d-b288-3f066d608919})")
@WinRTByReference(brClass = CoreWebView2MoveFocusRequestedEventArgs.ByReference::class)
public class CoreWebView2MoveFocusRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2MoveFocusRequestedEventArgs.WithDefault, IWinRTObject {
  private val __348399639_Interface: ICoreWebView2MoveFocusRequestedEventArgs.WithDefault by lazy {
    as_348399639()
  }


  public override val __348399639_Ptr: JNAPointer? by lazy {
    __348399639_Interface.__348399639_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__348399639_Interface)

  private fun as_348399639(): ICoreWebView2MoveFocusRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2MoveFocusRequestedEventArgs.ABI.makeICoreWebView2MoveFocusRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2MoveFocusRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2MoveFocusRequestedEventArgs.ABI.makeICoreWebView2MoveFocusRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2MoveFocusRequestedEventArgs> {
    public override fun getValue() = CoreWebView2MoveFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2MoveFocusRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2MoveFocusRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2MoveFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2MoveFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2MoveFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
