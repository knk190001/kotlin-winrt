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

@ABIMarker(CoreWebView2NavigationStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2NavigationStartingEventArgs;{d7a3824e-7654-5c4b-b069-e6501634d84c})")
@WinRTByReference(brClass = CoreWebView2NavigationStartingEventArgs.ByReference::class)
public class CoreWebView2NavigationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2NavigationStartingEventArgs2.WithDefault,
    ICoreWebView2NavigationStartingEventArgs.WithDefault, IWinRTObject {
  private val __1219172362_Interface: ICoreWebView2NavigationStartingEventArgs2.WithDefault by
      lazy {
    as_1219172362()
  }


  private val __1840443460_Interface: ICoreWebView2NavigationStartingEventArgs.WithDefault by lazy {
    as_1840443460()
  }


  public override val __1219172362_Ptr: JNAPointer? by lazy {
    __1219172362_Interface.__1219172362_Ptr
  }


  public override val __1840443460_Ptr: JNAPointer? by lazy {
    __1840443460_Interface.__1840443460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1219172362_Interface, __1840443460_Interface)

  private fun as_1219172362(): ICoreWebView2NavigationStartingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NavigationStartingEventArgs2.ABI.makeICoreWebView2NavigationStartingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NavigationStartingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NavigationStartingEventArgs2.ABI.makeICoreWebView2NavigationStartingEventArgs2(ref.value))
  }

  private fun as_1840443460(): ICoreWebView2NavigationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2NavigationStartingEventArgs.ABI.makeICoreWebView2NavigationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2NavigationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2NavigationStartingEventArgs.ABI.makeICoreWebView2NavigationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2NavigationStartingEventArgs> {
    public override fun getValue() = CoreWebView2NavigationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2NavigationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2NavigationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2NavigationStartingEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2NavigationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2NavigationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
