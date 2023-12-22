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

@ABIMarker(CoreWebView2ProcessFailedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ProcessFailedEventArgs;{c5d9c952-b456-5dc7-9f76-fde967484af5})")
@WinRTByReference(brClass = CoreWebView2ProcessFailedEventArgs.ByReference::class)
public class CoreWebView2ProcessFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ProcessFailedEventArgs2.WithDefault,
    ICoreWebView2ProcessFailedEventArgs.WithDefault, IWinRTObject {
  private val __1955580192_Interface: ICoreWebView2ProcessFailedEventArgs2.WithDefault by lazy {
    as_1955580192()
  }


  private val __478725230_Interface: ICoreWebView2ProcessFailedEventArgs.WithDefault by lazy {
    as_478725230()
  }


  public override val __1955580192_Ptr: JNAPointer? by lazy {
    __1955580192_Interface.__1955580192_Ptr
  }


  public override val __478725230_Ptr: JNAPointer? by lazy {
    __478725230_Interface.__478725230_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1955580192_Interface, __478725230_Interface)

  private fun as_1955580192(): ICoreWebView2ProcessFailedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ProcessFailedEventArgs2.ABI.makeICoreWebView2ProcessFailedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ProcessFailedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ProcessFailedEventArgs2.ABI.makeICoreWebView2ProcessFailedEventArgs2(ref.value))
  }

  private fun as_478725230(): ICoreWebView2ProcessFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ProcessFailedEventArgs.ABI.makeICoreWebView2ProcessFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ProcessFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ProcessFailedEventArgs.ABI.makeICoreWebView2ProcessFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ProcessFailedEventArgs> {
    public override fun getValue() = CoreWebView2ProcessFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ProcessFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ProcessFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2ProcessFailedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2ProcessFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ProcessFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
