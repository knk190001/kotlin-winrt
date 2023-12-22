package Windows.UI.Xaml.Controls

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

@ABIMarker(WebViewUnviewableContentIdentifiedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewUnviewableContentIdentifiedEventArgs;{37bc16e1-6062-4678-b20b-6c36ac9c59ac})")
@WinRTByReference(brClass = WebViewUnviewableContentIdentifiedEventArgs.ByReference::class)
public class WebViewUnviewableContentIdentifiedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewUnviewableContentIdentifiedEventArgs.WithDefault,
    IWebViewUnviewableContentIdentifiedEventArgs2.WithDefault, IWinRTObject {
  private val __1972728408_Interface: IWebViewUnviewableContentIdentifiedEventArgs.WithDefault by
      lazy {
    as_1972728408()
  }


  private val __1025038554_Interface: IWebViewUnviewableContentIdentifiedEventArgs2.WithDefault by
      lazy {
    as_1025038554()
  }


  public override val __1972728408_Ptr: JNAPointer? by lazy {
    __1972728408_Interface.__1972728408_Ptr
  }


  public override val __1025038554_Ptr: JNAPointer? by lazy {
    __1025038554_Interface.__1025038554_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1972728408_Interface, __1025038554_Interface)

  private fun as_1972728408(): IWebViewUnviewableContentIdentifiedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewUnviewableContentIdentifiedEventArgs.ABI.makeIWebViewUnviewableContentIdentifiedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewUnviewableContentIdentifiedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewUnviewableContentIdentifiedEventArgs.ABI.makeIWebViewUnviewableContentIdentifiedEventArgs(ref.value))
  }

  private fun as_1025038554(): IWebViewUnviewableContentIdentifiedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IWebViewUnviewableContentIdentifiedEventArgs2.ABI.makeIWebViewUnviewableContentIdentifiedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewUnviewableContentIdentifiedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewUnviewableContentIdentifiedEventArgs2.ABI.makeIWebViewUnviewableContentIdentifiedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewUnviewableContentIdentifiedEventArgs> {
    public override fun getValue() =
        WebViewUnviewableContentIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewUnviewableContentIdentifiedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewUnviewableContentIdentifiedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewUnviewableContentIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewUnviewableContentIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewUnviewableContentIdentifiedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
