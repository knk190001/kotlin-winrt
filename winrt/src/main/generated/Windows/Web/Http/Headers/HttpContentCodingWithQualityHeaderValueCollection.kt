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

@ABIMarker(HttpContentCodingWithQualityHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValueCollection;{7c0d753e-e899-4378-b5c8-412d820711cc})")
@WinRTByReference(brClass = HttpContentCodingWithQualityHeaderValueCollection.ByReference::class)
public class HttpContentCodingWithQualityHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentCodingWithQualityHeaderValueCollection.WithDefault,
    IVector<HttpContentCodingWithQualityHeaderValue?>,
    IIterable<HttpContentCodingWithQualityHeaderValue?>, IStringable.WithDefault, IWinRTObject {
  private val __1857632960_Interface: IHttpContentCodingWithQualityHeaderValueCollection.WithDefault
      by lazy {
    as_1857632960()
  }


  private val __1070388601_Interface: IVector<HttpContentCodingWithQualityHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpContentCodingWithQualityHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType =
      typeOf<IVector<HttpContentCodingWithQualityHeaderValue?>>()

  public override val __1449643190_Type: KType =
      typeOf<IIterable<HttpContentCodingWithQualityHeaderValue?>>()

  public override val __1857632960_Ptr: JNAPointer? by lazy {
    __1857632960_Interface.__1857632960_Ptr
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
    get() = arrayOf(__1857632960_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1857632960(): IHttpContentCodingWithQualityHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentCodingWithQualityHeaderValueCollection.ABI.makeIHttpContentCodingWithQualityHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentCodingWithQualityHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentCodingWithQualityHeaderValueCollection.ABI.makeIHttpContentCodingWithQualityHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpContentCodingWithQualityHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpContentCodingWithQualityHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpContentCodingWithQualityHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpContentCodingWithQualityHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpContentCodingWithQualityHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpContentCodingWithQualityHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpContentCodingWithQualityHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpContentCodingWithQualityHeaderValue?>(ref.value))
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
      IByReference<HttpContentCodingWithQualityHeaderValueCollection> {
    public override fun getValue() =
        HttpContentCodingWithQualityHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpContentCodingWithQualityHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentCodingWithQualityHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpContentCodingWithQualityHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpContentCodingWithQualityHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpContentCodingWithQualityHeaderValueCollection):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
