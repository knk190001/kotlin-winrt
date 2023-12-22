package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IStringable
import Windows.Globalization.Language
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

@ABIMarker(HttpLanguageHeaderValueCollection.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpLanguageHeaderValueCollection;{9ebd7ca3-8219-44f6-9902-8c56dfd3340c})")
@WinRTByReference(brClass = HttpLanguageHeaderValueCollection.ByReference::class)
public class HttpLanguageHeaderValueCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpLanguageHeaderValueCollection.WithDefault, IVector<Language?>,
    IIterable<Language?>, IStringable.WithDefault, IWinRTObject {
  private val __2100974782_Interface: IHttpLanguageHeaderValueCollection.WithDefault by lazy {
    as_2100974782()
  }


  private val __1070388601_Interface: IVector<Language?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<Language?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<Language?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<Language?>>()

  public override val __2100974782_Ptr: JNAPointer? by lazy {
    __2100974782_Interface.__2100974782_Ptr
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
    get() = arrayOf(__2100974782_Interface, __1070388601_Interface, __1449643190_Interface,
        __328683030_Interface)

  private fun as_2100974782(): IHttpLanguageHeaderValueCollection.WithDefault {
    if(pointer == NULL) {
      return(IHttpLanguageHeaderValueCollection.ABI.makeIHttpLanguageHeaderValueCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpLanguageHeaderValueCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpLanguageHeaderValueCollection.ABI.makeIHttpLanguageHeaderValueCollection(ref.value))
  }

  private fun as_1070388601(): IVector<Language?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<Language?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<Language?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<Language?>(ref.value))
  }

  private fun as_1449643190(): IIterable<Language?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<Language?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<Language?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<Language?>(ref.value))
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
      IByReference<HttpLanguageHeaderValueCollection> {
    public override fun getValue() = HttpLanguageHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: HttpLanguageHeaderValueCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpLanguageHeaderValueCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpLanguageHeaderValueCollection {
      val address = segment.toRawLongValue()
      return HttpLanguageHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: HttpLanguageHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
