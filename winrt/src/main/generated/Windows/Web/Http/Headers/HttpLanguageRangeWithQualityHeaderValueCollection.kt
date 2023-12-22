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

@ABIMarker(HttpLanguageRangeWithQualityHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValueCollection;{885d5abd-4b4f-480a-89ce-8aedcee6e3a0})")
@WinRTByReference(brClass = HttpLanguageRangeWithQualityHeaderValueCollection.ByReference::class)
public class HttpLanguageRangeWithQualityHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpLanguageRangeWithQualityHeaderValueCollection.WithDefault,
    IVector<HttpLanguageRangeWithQualityHeaderValue?>,
    IIterable<HttpLanguageRangeWithQualityHeaderValue?>, IStringable.WithDefault, IWinRTObject {
  private val __1364878782_Interface: IHttpLanguageRangeWithQualityHeaderValueCollection.WithDefault
      by lazy {
    as_1364878782()
  }


  private val __1070388601_Interface: IVector<HttpLanguageRangeWithQualityHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpLanguageRangeWithQualityHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType =
      typeOf<IVector<HttpLanguageRangeWithQualityHeaderValue?>>()

  public override val __1449643190_Type: KType =
      typeOf<IIterable<HttpLanguageRangeWithQualityHeaderValue?>>()

  public override val __1364878782_Ptr: JNAPointer? by lazy {
    __1364878782_Interface.__1364878782_Ptr
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
    get() = arrayOf(__1364878782_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1364878782(): IHttpLanguageRangeWithQualityHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpLanguageRangeWithQualityHeaderValueCollection.ABI.makeIHttpLanguageRangeWithQualityHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpLanguageRangeWithQualityHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpLanguageRangeWithQualityHeaderValueCollection.ABI.makeIHttpLanguageRangeWithQualityHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpLanguageRangeWithQualityHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpLanguageRangeWithQualityHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpLanguageRangeWithQualityHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpLanguageRangeWithQualityHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpLanguageRangeWithQualityHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpLanguageRangeWithQualityHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpLanguageRangeWithQualityHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpLanguageRangeWithQualityHeaderValue?>(ref.value))
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
      IByReference<HttpLanguageRangeWithQualityHeaderValueCollection> {
    public override fun getValue() =
        HttpLanguageRangeWithQualityHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpLanguageRangeWithQualityHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpLanguageRangeWithQualityHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpLanguageRangeWithQualityHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpLanguageRangeWithQualityHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpLanguageRangeWithQualityHeaderValueCollection):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
