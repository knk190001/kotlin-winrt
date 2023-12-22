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

@ABIMarker(HttpExpectationHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpExpectationHeaderValueCollection;{e78521b3-a0e2-4ac4-9e66-79706cb9fd58})")
@WinRTByReference(brClass = HttpExpectationHeaderValueCollection.ByReference::class)
public class HttpExpectationHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpExpectationHeaderValueCollection.WithDefault,
    IVector<HttpExpectationHeaderValue?>, IIterable<HttpExpectationHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __966721870_Interface: IHttpExpectationHeaderValueCollection.WithDefault by lazy {
    as_966721870()
  }


  private val __1070388601_Interface: IVector<HttpExpectationHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpExpectationHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpExpectationHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpExpectationHeaderValue?>>()

  public override val __966721870_Ptr: JNAPointer? by lazy {
    __966721870_Interface.__966721870_Ptr
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
    get() = arrayOf(__966721870_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_966721870(): IHttpExpectationHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpExpectationHeaderValueCollection.ABI.makeIHttpExpectationHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpExpectationHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpExpectationHeaderValueCollection.ABI.makeIHttpExpectationHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpExpectationHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpExpectationHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpExpectationHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpExpectationHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpExpectationHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpExpectationHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpExpectationHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpExpectationHeaderValue?>(ref.value))
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
      IByReference<HttpExpectationHeaderValueCollection> {
    public override fun getValue() = HttpExpectationHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpExpectationHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpExpectationHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpExpectationHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpExpectationHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpExpectationHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
