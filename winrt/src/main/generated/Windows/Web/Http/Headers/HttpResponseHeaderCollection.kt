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

@ABIMarker(HttpResponseHeaderCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpResponseHeaderCollection;{7a990969-fa3f-41ed-aac6-bf957975c16b})")
@WinRTByReference(brClass = HttpResponseHeaderCollection.ByReference::class)
public class HttpResponseHeaderCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpResponseHeaderCollection.WithDefault, IMap<String?, String?>,
    IIterable<IKeyValuePair<String?, String?>?>, IStringable.WithDefault, IWinRTObject {
  private val __1122859432_Interface: IHttpResponseHeaderCollection.WithDefault by lazy {
    as_1122859432()
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

  public override val __1122859432_Ptr: JNAPointer? by lazy {
    __1122859432_Interface.__1122859432_Ptr
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
    get() = arrayOf(__1122859432_Interface, __8028824_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1122859432(): IHttpResponseHeaderCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpResponseHeaderCollection.ABI.makeIHttpResponseHeaderCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpResponseHeaderCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpResponseHeaderCollection.ABI.makeIHttpResponseHeaderCollection(ref.value))
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
      IByReference<HttpResponseHeaderCollection> {
    public override fun getValue() = HttpResponseHeaderCollection(pointer.getPointer(0))

    public fun setValue(value: HttpResponseHeaderCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpResponseHeaderCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpResponseHeaderCollection {
      val address = segment.toRawLongValue()
      return HttpResponseHeaderCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpResponseHeaderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
