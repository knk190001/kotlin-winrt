package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(HttpTransferCodingHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpTransferCodingHeaderValueCollection;{202c8c34-2c03-49b8-9665-73e27cb2fc79})")
@WinRTByReference(brClass = HttpTransferCodingHeaderValueCollection.ByReference::class)
public class HttpTransferCodingHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpTransferCodingHeaderValueCollection.WithDefault,
    IVector<HttpTransferCodingHeaderValue?>, IIterable<HttpTransferCodingHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __78456319_Interface: IHttpTransferCodingHeaderValueCollection.WithDefault by lazy {
    as_78456319()
  }


  private val __1070388601_Interface: IVector<HttpTransferCodingHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpTransferCodingHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpTransferCodingHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpTransferCodingHeaderValue?>>()

  public override val __78456319_Ptr: JNAPointer? by lazy {
    __78456319_Interface.__78456319_Ptr
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
    get() = arrayOf(__78456319_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_78456319(): IHttpTransferCodingHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpTransferCodingHeaderValueCollection.ABI.makeIHttpTransferCodingHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpTransferCodingHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpTransferCodingHeaderValueCollection.ABI.makeIHttpTransferCodingHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpTransferCodingHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpTransferCodingHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpTransferCodingHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpTransferCodingHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpTransferCodingHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpTransferCodingHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpTransferCodingHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpTransferCodingHeaderValue?>(ref.value))
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
      IByReference<HttpTransferCodingHeaderValueCollection> {
    public override fun getValue() = HttpTransferCodingHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpTransferCodingHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpTransferCodingHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpTransferCodingHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpTransferCodingHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpTransferCodingHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
