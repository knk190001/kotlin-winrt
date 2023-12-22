package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.IStringable
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

@ABIMarker(HttpRequestHeaderCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpRequestHeaderCollection;{af40329b-b544-469b-86b9-ac3d466fea36})")
@WinRTByReference(brClass = HttpRequestHeaderCollection.ByReference::class)
public class HttpRequestHeaderCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpRequestHeaderCollection.WithDefault, IMap<String?, String?>,
    IIterable<IKeyValuePair<String?, String?>?>, IStringable.WithDefault, IWinRTObject {
  private val __954884786_Interface: IHttpRequestHeaderCollection.WithDefault by lazy {
    as_954884786()
  }


  private val __8028824_Interface: IMap<String?, String?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, String?>?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, String?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      String?>?>>()

  public override val __954884786_Ptr: JNAPointer? by lazy {
    __954884786_Interface.__954884786_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__954884786_Interface, __8028824_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_954884786(): IHttpRequestHeaderCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpRequestHeaderCollection.ABI.makeIHttpRequestHeaderCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpRequestHeaderCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpRequestHeaderCollection.ABI.makeIHttpRequestHeaderCollection(ref.value))
  }

  private fun as_8028824(): IMap<String?, String?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, String?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, String?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, String?>(ref.value))
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

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpRequestHeaderCollection> {
    public override fun getValue() = HttpRequestHeaderCollection(pointer.getPointer(0))

    public fun setValue(value: HttpRequestHeaderCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpRequestHeaderCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpRequestHeaderCollection {
      val address = segment.toRawLongValue()
      return HttpRequestHeaderCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpRequestHeaderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
