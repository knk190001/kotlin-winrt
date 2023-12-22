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

@ABIMarker(HttpCacheDirectiveHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpCacheDirectiveHeaderValueCollection;{9a586b89-d5d0-4fbe-bd9d-b5b3636811b4})")
@WinRTByReference(brClass = HttpCacheDirectiveHeaderValueCollection.ByReference::class)
public class HttpCacheDirectiveHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCacheDirectiveHeaderValueCollection.WithDefault,
    IVector<HttpNameValueHeaderValue?>, IIterable<HttpNameValueHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __1511021897_Interface: IHttpCacheDirectiveHeaderValueCollection.WithDefault by lazy {
    as_1511021897()
  }


  private val __1070388601_Interface: IVector<HttpNameValueHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpNameValueHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpNameValueHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpNameValueHeaderValue?>>()

  public override val __1511021897_Ptr: JNAPointer? by lazy {
    __1511021897_Interface.__1511021897_Ptr
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
    get() = arrayOf(__1511021897_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_1511021897(): IHttpCacheDirectiveHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpCacheDirectiveHeaderValueCollection.ABI.makeIHttpCacheDirectiveHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCacheDirectiveHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCacheDirectiveHeaderValueCollection.ABI.makeIHttpCacheDirectiveHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpNameValueHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpNameValueHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpNameValueHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpNameValueHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpNameValueHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpNameValueHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpNameValueHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpNameValueHeaderValue?>(ref.value))
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
      IByReference<HttpCacheDirectiveHeaderValueCollection> {
    public override fun getValue() = HttpCacheDirectiveHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpCacheDirectiveHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCacheDirectiveHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpCacheDirectiveHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpCacheDirectiveHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpCacheDirectiveHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
