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

@ABIMarker(CoreWebView2NavigationCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2NavigationCompletedEventArgs;{6e4d3c33-a6e2-5896-90c5-68b4b5e55b40})")
@WinRTByReference(brClass = CoreWebView2NavigationCompletedEventArgs.ByReference::class)
public class CoreWebView2NavigationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2NavigationCompletedEventArgs2.WithDefault,
    ICoreWebView2NavigationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1177520491_Interface: ICoreWebView2NavigationCompletedEventArgs2.WithDefault by
      lazy {
    as_1177520491()
  }


  private val __730721191_Interface: ICoreWebView2NavigationCompletedEventArgs.WithDefault by lazy {
    as_730721191()
  }


  public override val __1177520491_Ptr: JNAPointer? by lazy {
    __1177520491_Interface.__1177520491_Ptr
  }


  public override val __730721191_Ptr: JNAPointer? by lazy {
    __730721191_Interface.__730721191_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1177520491_Interface, __730721191_Interface)

  private fun as_1177520491(): ICoreWebView2NavigationCompletedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NavigationCompletedEventArgs2.ABI.makeICoreWebView2NavigationCompletedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NavigationCompletedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NavigationCompletedEventArgs2.ABI.makeICoreWebView2NavigationCompletedEventArgs2(ref.value))
  }

  private fun as_730721191(): ICoreWebView2NavigationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NavigationCompletedEventArgs.ABI.makeICoreWebView2NavigationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NavigationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NavigationCompletedEventArgs.ABI.makeICoreWebView2NavigationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2NavigationCompletedEventArgs> {
    public override fun getValue() = CoreWebView2NavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2NavigationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2NavigationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2NavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2NavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2NavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
