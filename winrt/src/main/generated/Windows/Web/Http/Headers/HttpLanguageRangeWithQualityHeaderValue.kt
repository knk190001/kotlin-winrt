package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpLanguageRangeWithQualityHeaderValueFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpLanguageRangeWithQualityHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue;{7256e102-0080-4db4-a083-7de7b2e5ba4c})")
@WinRTByReference(brClass = HttpLanguageRangeWithQualityHeaderValue.ByReference::class)
public class HttpLanguageRangeWithQualityHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpLanguageRangeWithQualityHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1879120764_Interface: IHttpLanguageRangeWithQualityHeaderValue.WithDefault by lazy {
    as_1879120764()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1879120764_Ptr: JNAPointer? by lazy {
    __1879120764_Interface.__1879120764_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1879120764_Interface, __328683030_Interface)

  public constructor(languageRange: String) : this(ABI.activate(languageRange))

  public constructor(languageRange: String, quality: Double) : this(ABI.activate(languageRange,
      quality))

  private fun as_1879120764(): IHttpLanguageRangeWithQualityHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpLanguageRangeWithQualityHeaderValue.ABI.makeIHttpLanguageRangeWithQualityHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpLanguageRangeWithQualityHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpLanguageRangeWithQualityHeaderValue.ABI.makeIHttpLanguageRangeWithQualityHeaderValue(ref.value))
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
      IByReference<HttpLanguageRangeWithQualityHeaderValue> {
    public override fun getValue() = HttpLanguageRangeWithQualityHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpLanguageRangeWithQualityHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpLanguageRangeWithQualityHeaderValue, MemoryAddress> {
    public val IHttpLanguageRangeWithQualityHeaderValueStatics_Instance:
        IHttpLanguageRangeWithQualityHeaderValueStatics by lazy {
      createIHttpLanguageRangeWithQualityHeaderValueStatics()
    }


    public val IHttpLanguageRangeWithQualityHeaderValueFactory_Instance:
        IHttpLanguageRangeWithQualityHeaderValueFactory by lazy {
      createIHttpLanguageRangeWithQualityHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpLanguageRangeWithQualityHeaderValueStatics():
        IHttpLanguageRangeWithQualityHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpLanguageRangeWithQualityHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpLanguageRangeWithQualityHeaderValueStatics.ABI.makeIHttpLanguageRangeWithQualityHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpLanguageRangeWithQualityHeaderValueFactory():
        IHttpLanguageRangeWithQualityHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpLanguageRangeWithQualityHeaderValueFactory.ABI.makeIHttpLanguageRangeWithQualityHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageRange: String): JNAPointer? =
        IHttpLanguageRangeWithQualityHeaderValueFactory_Instance.CreateFromLanguageRange(languageRange)?.pointer

    public fun activate(languageRange: String, quality: Double): JNAPointer? =
        IHttpLanguageRangeWithQualityHeaderValueFactory_Instance.CreateFromLanguageRangeWithQuality(languageRange,
        quality)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        HttpLanguageRangeWithQualityHeaderValue {
      val address = segment.toRawLongValue()
      return HttpLanguageRangeWithQualityHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpLanguageRangeWithQualityHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpLanguageRangeWithQualityHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, languageRangeWithQualityHeaderValue: ByReference) =
        ABI.IHttpLanguageRangeWithQualityHeaderValueStatics_Instance.TryParse(input,
        languageRangeWithQualityHeaderValue)
  }
}
