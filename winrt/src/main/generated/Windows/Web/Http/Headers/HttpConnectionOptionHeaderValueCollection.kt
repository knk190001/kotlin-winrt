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

@ABIMarker(HttpConnectionOptionHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpConnectionOptionHeaderValueCollection;{e4f56c1d-5142-4e00-8e0f-019509337629})")
@WinRTByReference(brClass = HttpConnectionOptionHeaderValueCollection.ByReference::class)
public class HttpConnectionOptionHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpConnectionOptionHeaderValueCollection.WithDefault,
    IVector<HttpConnectionOptionHeaderValue?>, IIterable<HttpConnectionOptionHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __852566525_Interface: IHttpConnectionOptionHeaderValueCollection.WithDefault by
      lazy {
    as_852566525()
  }


  private val __1070388601_Interface: IVector<HttpConnectionOptionHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpConnectionOptionHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpConnectionOptionHeaderValue?>>()

  public override val __1449643190_Type: KType =
      typeOf<IIterable<HttpConnectionOptionHeaderValue?>>()

  public override val __852566525_Ptr: JNAPointer? by lazy {
    __852566525_Interface.__852566525_Ptr
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
    get() = arrayOf(__852566525_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_852566525(): IHttpConnectionOptionHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpConnectionOptionHeaderValueCollection.ABI.makeIHttpConnectionOptionHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpConnectionOptionHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpConnectionOptionHeaderValueCollection.ABI.makeIHttpConnectionOptionHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpConnectionOptionHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpConnectionOptionHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpConnectionOptionHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpConnectionOptionHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpConnectionOptionHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpConnectionOptionHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpConnectionOptionHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpConnectionOptionHeaderValue?>(ref.value))
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
      IByReference<HttpConnectionOptionHeaderValueCollection> {
    public override fun getValue() =
        HttpConnectionOptionHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpConnectionOptionHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpConnectionOptionHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpConnectionOptionHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpConnectionOptionHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpConnectionOptionHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
