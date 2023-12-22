package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2HttpRequestHeaders.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2HttpRequestHeaders;{dc2226c7-3515-55bb-bcb2-57b78f86b91d})")
@WinRTByReference(brClass = CoreWebView2HttpRequestHeaders.ByReference::class)
public class CoreWebView2HttpRequestHeaders(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2HttpRequestHeaders.WithDefault, IIterable<IKeyValuePair<String?,
    String?>?>, IWinRTObject {
  private val __1381378886_Interface: ICoreWebView2HttpRequestHeaders.WithDefault by lazy {
    as_1381378886()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, String?>?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      String?>?>>()

  public override val __1381378886_Ptr: JNAPointer? by lazy {
    __1381378886_Interface.__1381378886_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1381378886_Interface, __1449643190_Interface)

  private fun as_1381378886(): ICoreWebView2HttpRequestHeaders.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2HttpRequestHeaders.ABI.makeICoreWebView2HttpRequestHeaders(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2HttpRequestHeaders>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2HttpRequestHeaders.ABI.makeICoreWebView2HttpRequestHeaders(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, String?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, String?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, String?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, String?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2HttpRequestHeaders> {
    public override fun getValue() = CoreWebView2HttpRequestHeaders(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2HttpRequestHeaders): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2HttpRequestHeaders, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2HttpRequestHeaders {
      val address = segment.toRawLongValue()
      return CoreWebView2HttpRequestHeaders(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2HttpRequestHeaders): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
