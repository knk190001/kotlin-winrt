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

@ABIMarker(HttpContentCodingHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentCodingHeaderValueCollection;{7d221721-a6db-436e-8e83-91596192819c})")
@WinRTByReference(brClass = HttpContentCodingHeaderValueCollection.ByReference::class)
public class HttpContentCodingHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentCodingHeaderValueCollection.WithDefault,
    IVector<HttpContentCodingHeaderValue?>, IIterable<HttpContentCodingHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __559716597_Interface: IHttpContentCodingHeaderValueCollection.WithDefault by lazy {
    as_559716597()
  }


  private val __1070388601_Interface: IVector<HttpContentCodingHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpContentCodingHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpContentCodingHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpContentCodingHeaderValue?>>()

  public override val __559716597_Ptr: JNAPointer? by lazy {
    __559716597_Interface.__559716597_Ptr
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
    get() = arrayOf(__559716597_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_559716597(): IHttpContentCodingHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentCodingHeaderValueCollection.ABI.makeIHttpContentCodingHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentCodingHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentCodingHeaderValueCollection.ABI.makeIHttpContentCodingHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpContentCodingHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpContentCodingHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpContentCodingHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpContentCodingHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpContentCodingHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpContentCodingHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpContentCodingHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpContentCodingHeaderValue?>(ref.value))
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
      IByReference<HttpContentCodingHeaderValueCollection> {
    public override fun getValue() = HttpContentCodingHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpContentCodingHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentCodingHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpContentCodingHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpContentCodingHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpContentCodingHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
