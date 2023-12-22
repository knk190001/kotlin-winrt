package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpDateOrDeltaHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue;{eafcaa6a-c4dc-49e2-a27d-043adf5867a3})")
@WinRTByReference(brClass = HttpDateOrDeltaHeaderValue.ByReference::class)
public class HttpDateOrDeltaHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDateOrDeltaHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject
    {
  private val __1548486071_Interface: IHttpDateOrDeltaHeaderValue.WithDefault by lazy {
    as_1548486071()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1548486071_Ptr: JNAPointer? by lazy {
    __1548486071_Interface.__1548486071_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1548486071_Interface, __328683030_Interface)

  private fun as_1548486071(): IHttpDateOrDeltaHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpDateOrDeltaHeaderValue.ABI.makeIHttpDateOrDeltaHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDateOrDeltaHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDateOrDeltaHeaderValue.ABI.makeIHttpDateOrDeltaHeaderValue(ref.value))
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
      IByReference<HttpDateOrDeltaHeaderValue> {
    public override fun getValue() = HttpDateOrDeltaHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpDateOrDeltaHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDateOrDeltaHeaderValue, MemoryAddress> {
    public val IHttpDateOrDeltaHeaderValueStatics_Instance: IHttpDateOrDeltaHeaderValueStatics by
        lazy {
      createIHttpDateOrDeltaHeaderValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpDateOrDeltaHeaderValueStatics(): IHttpDateOrDeltaHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpDateOrDeltaHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpDateOrDeltaHeaderValueStatics.ABI.makeIHttpDateOrDeltaHeaderValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HttpDateOrDeltaHeaderValue {
      val address = segment.toRawLongValue()
      return HttpDateOrDeltaHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpDateOrDeltaHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpDateOrDeltaHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, dateOrDeltaHeaderValue: ByReference) =
        ABI.IHttpDateOrDeltaHeaderValueStatics_Instance.TryParse(input, dateOrDeltaHeaderValue)
  }
}
