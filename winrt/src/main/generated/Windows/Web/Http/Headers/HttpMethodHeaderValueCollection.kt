package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IStringable
import Windows.Web.Http.HttpMethod
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(HttpMethodHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpMethodHeaderValueCollection;{43bc3ff4-6119-4adf-938c-34bfffcf92ed})")
@WinRTByReference(brClass = HttpMethodHeaderValueCollection.ByReference::class)
public class HttpMethodHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpMethodHeaderValueCollection.WithDefault, IVector<HttpMethod?>,
    IIterable<HttpMethod?>, IStringable.WithDefault, IWinRTObject {
  private val __1301294037_Interface: IHttpMethodHeaderValueCollection.WithDefault by lazy {
    as_1301294037()
  }


  private val __1070388601_Interface: IVector<HttpMethod?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpMethod?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpMethod?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpMethod?>>()

  public override val __1301294037_Ptr: JNAPointer? by lazy {
    __1301294037_Interface.__1301294037_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1301294037_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1301294037(): IHttpMethodHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpMethodHeaderValueCollection.ABI.makeIHttpMethodHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMethodHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMethodHeaderValueCollection.ABI.makeIHttpMethodHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpMethod?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpMethod?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpMethod?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpMethod?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpMethod?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpMethod?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpMethod?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpMethod?>(ref.value))
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
      IByReference<HttpMethodHeaderValueCollection> {
    public override fun getValue() = HttpMethodHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpMethodHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMethodHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpMethodHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpMethodHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpMethodHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
