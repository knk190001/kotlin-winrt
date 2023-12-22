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

@ABIMarker(CoreWebView2BasicAuthenticationRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2BasicAuthenticationRequestedEventArgs;{4b16330c-4ca5-555e-af21-164334405f63})")
@WinRTByReference(brClass = CoreWebView2BasicAuthenticationRequestedEventArgs.ByReference::class)
public class CoreWebView2BasicAuthenticationRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2BasicAuthenticationRequestedEventArgs.WithDefault, IWinRTObject {
  private val __921204312_Interface: ICoreWebView2BasicAuthenticationRequestedEventArgs.WithDefault
      by lazy {
    as_921204312()
  }


  public override val __921204312_Ptr: JNAPointer? by lazy {
    __921204312_Interface.__921204312_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921204312_Interface)

  private fun as_921204312(): ICoreWebView2BasicAuthenticationRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2BasicAuthenticationRequestedEventArgs.ABI.makeICoreWebView2BasicAuthenticationRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2BasicAuthenticationRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2BasicAuthenticationRequestedEventArgs.ABI.makeICoreWebView2BasicAuthenticationRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2BasicAuthenticationRequestedEventArgs> {
    public override fun getValue() =
        CoreWebView2BasicAuthenticationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2BasicAuthenticationRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2BasicAuthenticationRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2BasicAuthenticationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2BasicAuthenticationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2BasicAuthenticationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
