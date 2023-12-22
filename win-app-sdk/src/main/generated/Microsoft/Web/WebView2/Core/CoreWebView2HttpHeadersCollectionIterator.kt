package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IIterator
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

@ABIMarker(CoreWebView2HttpHeadersCollectionIterator.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2HttpHeadersCollectionIterator;{adf264ee-d980-5f48-a60e-8705de046608})")
@WinRTByReference(brClass = CoreWebView2HttpHeadersCollectionIterator.ByReference::class)
public class CoreWebView2HttpHeadersCollectionIterator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2HttpHeadersCollectionIterator.WithDefault,
    IIterator<IKeyValuePair<String?, String?>?>, IWinRTObject {
  private val __1466619555_Interface: ICoreWebView2HttpHeadersCollectionIterator.WithDefault by
      lazy {
    as_1466619555()
  }


  private val __1449660594_Interface: IIterator<IKeyValuePair<String?, String?>?> by lazy {
    as_1449660594()
  }


  public override val __1449660594_Type: KType = typeOf<IIterator<IKeyValuePair<String?,
      String?>?>>()

  public override val __1466619555_Ptr: JNAPointer? by lazy {
    __1466619555_Interface.__1466619555_Ptr
  }


  public override val __1449660594_Ptr: JNAPointer? by lazy {
    __1449660594_Interface.__1449660594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1466619555_Interface, __1449660594_Interface)

  private fun as_1466619555(): ICoreWebView2HttpHeadersCollectionIterator.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2HttpHeadersCollectionIterator.ABI.makeICoreWebView2HttpHeadersCollectionIterator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2HttpHeadersCollectionIterator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2HttpHeadersCollectionIterator.ABI.makeICoreWebView2HttpHeadersCollectionIterator(ref.value))
  }

  private fun as_1449660594(): IIterator<IKeyValuePair<String?, String?>?> {
    if(pointer == NULL) {
      return(IIterator.ABI.makeIIterator<IKeyValuePair<String?, String?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterator<IKeyValuePair<String?, String?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterator.ABI.makeIIterator<IKeyValuePair<String?, String?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2HttpHeadersCollectionIterator> {
    public override fun getValue() =
        CoreWebView2HttpHeadersCollectionIterator(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2HttpHeadersCollectionIterator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2HttpHeadersCollectionIterator, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2HttpHeadersCollectionIterator {
      val address = segment.toRawLongValue()
      return CoreWebView2HttpHeadersCollectionIterator(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2HttpHeadersCollectionIterator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
