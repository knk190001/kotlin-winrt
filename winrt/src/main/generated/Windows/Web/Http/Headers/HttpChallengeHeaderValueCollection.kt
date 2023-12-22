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

@ABIMarker(HttpChallengeHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpChallengeHeaderValueCollection;{ca9e5f81-aee0-4353-a10b-e625babd64c2})")
@WinRTByReference(brClass = HttpChallengeHeaderValueCollection.ByReference::class)
public class HttpChallengeHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpChallengeHeaderValueCollection.WithDefault,
    IVector<HttpChallengeHeaderValue?>, IIterable<HttpChallengeHeaderValue?>,
    IStringable.WithDefault, IWinRTObject {
  private val __122709525_Interface: IHttpChallengeHeaderValueCollection.WithDefault by lazy {
    as_122709525()
  }


  private val __1070388601_Interface: IVector<HttpChallengeHeaderValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<HttpChallengeHeaderValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<HttpChallengeHeaderValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<HttpChallengeHeaderValue?>>()

  public override val __122709525_Ptr: JNAPointer? by lazy {
    __122709525_Interface.__122709525_Ptr
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
    get() = arrayOf(__122709525_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_122709525(): IHttpChallengeHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpChallengeHeaderValueCollection.ABI.makeIHttpChallengeHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpChallengeHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpChallengeHeaderValueCollection.ABI.makeIHttpChallengeHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<HttpChallengeHeaderValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<HttpChallengeHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<HttpChallengeHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<HttpChallengeHeaderValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<HttpChallengeHeaderValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<HttpChallengeHeaderValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<HttpChallengeHeaderValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<HttpChallengeHeaderValue?>(ref.value))
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
      IByReference<HttpChallengeHeaderValueCollection> {
    public override fun getValue() = HttpChallengeHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpChallengeHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpChallengeHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpChallengeHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpChallengeHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpChallengeHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
