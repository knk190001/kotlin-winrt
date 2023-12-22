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

@ABIMarker(HttpProductInfoHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpProductInfoHeaderValueCollection;{877df74a-d69b-44f8-ad4f-453af9c42ed0})")
@WinRTByReference(brClass = HttpProductInfoHeaderValueCollection.ByReference::class)
public class HttpProductInfoHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpProductInfoHeaderValueCollection.WithDefault,
    IVector<HttpProductInfoHeaderValue?>, IIterable<HttpProductInfoHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __551141039_Interface: IHttpProductInfoHeaderValueCollection.WithDefault by lazy {
    as_551141039()
  }


  private val __1070388601_Interface: IVector<HttpProductInfoHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpProductInfoHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpProductInfoHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpProductInfoHeaderValue?>>()

  public override val __551141039_Ptr: JNAPointer? by lazy {
    __551141039_Interface.__551141039_Ptr
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
    get() = arrayOf(__551141039_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_551141039(): IHttpProductInfoHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpProductInfoHeaderValueCollection.ABI.makeIHttpProductInfoHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpProductInfoHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpProductInfoHeaderValueCollection.ABI.makeIHttpProductInfoHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpProductInfoHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpProductInfoHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpProductInfoHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpProductInfoHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpProductInfoHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpProductInfoHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpProductInfoHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpProductInfoHeaderValue?>(ref.value))
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
      IByReference<HttpProductInfoHeaderValueCollection> {
    public override fun getValue() = HttpProductInfoHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpProductInfoHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpProductInfoHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpProductInfoHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpProductInfoHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpProductInfoHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
