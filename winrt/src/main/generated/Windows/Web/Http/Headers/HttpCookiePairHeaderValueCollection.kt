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

@ABIMarker(HttpCookiePairHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpCookiePairHeaderValueCollection;{f3f44350-581e-4ecc-9f59-e507d04f06e6})")
@WinRTByReference(brClass = HttpCookiePairHeaderValueCollection.ByReference::class)
public class HttpCookiePairHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCookiePairHeaderValueCollection.WithDefault,
    IVector<HttpCookiePairHeaderValue?>, IIterable<HttpCookiePairHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __1233919112_Interface: IHttpCookiePairHeaderValueCollection.WithDefault by lazy {
    as_1233919112()
  }


  private val __1070388601_Interface: IVector<HttpCookiePairHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpCookiePairHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpCookiePairHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpCookiePairHeaderValue?>>()

  public override val __1233919112_Ptr: JNAPointer? by lazy {
    __1233919112_Interface.__1233919112_Ptr
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
    get() = arrayOf(__1233919112_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1233919112(): IHttpCookiePairHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpCookiePairHeaderValueCollection.ABI.makeIHttpCookiePairHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCookiePairHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCookiePairHeaderValueCollection.ABI.makeIHttpCookiePairHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpCookiePairHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpCookiePairHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpCookiePairHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpCookiePairHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpCookiePairHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpCookiePairHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpCookiePairHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpCookiePairHeaderValue?>(ref.value))
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
      IByReference<HttpCookiePairHeaderValueCollection> {
    public override fun getValue() = HttpCookiePairHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpCookiePairHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCookiePairHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpCookiePairHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpCookiePairHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpCookiePairHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
