package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpMediaTypeWithQualityHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpMediaTypeWithQualityHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue;{188d5e32-76be-44a0-b1cd-2074bded2dde})")
@WinRTByReference(brClass = HttpMediaTypeWithQualityHeaderValue.ByReference::class)
public class HttpMediaTypeWithQualityHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpMediaTypeWithQualityHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __126554685_Interface: IHttpMediaTypeWithQualityHeaderValue.WithDefault by lazy {
    as_126554685()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __126554685_Ptr: JNAPointer? by lazy {
    __126554685_Interface.__126554685_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__126554685_Interface, __328683030_Interface)

  public constructor(mediaType: String) : this(ABI.activate(mediaType))

  public constructor(mediaType: String, quality: Double) : this(ABI.activate(mediaType, quality))

  private fun as_126554685(): IHttpMediaTypeWithQualityHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpMediaTypeWithQualityHeaderValue.ABI.makeIHttpMediaTypeWithQualityHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMediaTypeWithQualityHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMediaTypeWithQualityHeaderValue.ABI.makeIHttpMediaTypeWithQualityHeaderValue(ref.value))
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
      IByReference<HttpMediaTypeWithQualityHeaderValue> {
    public override fun getValue() = HttpMediaTypeWithQualityHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpMediaTypeWithQualityHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMediaTypeWithQualityHeaderValue, MemoryAddress> {
    public val IHttpMediaTypeWithQualityHeaderValueStatics_Instance:
        IHttpMediaTypeWithQualityHeaderValueStatics by lazy {
      createIHttpMediaTypeWithQualityHeaderValueStatics()
    }


    public val IHttpMediaTypeWithQualityHeaderValueFactory_Instance:
        IHttpMediaTypeWithQualityHeaderValueFactory by lazy {
      createIHttpMediaTypeWithQualityHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpMediaTypeWithQualityHeaderValueStatics():
        IHttpMediaTypeWithQualityHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpMediaTypeWithQualityHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpMediaTypeWithQualityHeaderValueStatics.ABI.makeIHttpMediaTypeWithQualityHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpMediaTypeWithQualityHeaderValueFactory():
        IHttpMediaTypeWithQualityHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpMediaTypeWithQualityHeaderValueFactory.ABI.makeIHttpMediaTypeWithQualityHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(mediaType: String): JNAPointer? =
        IHttpMediaTypeWithQualityHeaderValueFactory_Instance.CreateFromMediaType(mediaType)?.pointer

    public fun activate(mediaType: String, quality: Double): JNAPointer? =
        IHttpMediaTypeWithQualityHeaderValueFactory_Instance.CreateFromMediaTypeWithQuality(mediaType,
        quality)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpMediaTypeWithQualityHeaderValue {
      val address = segment.toRawLongValue()
      return HttpMediaTypeWithQualityHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpMediaTypeWithQualityHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpMediaTypeWithQualityHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, mediaTypeWithQualityHeaderValue: ByReference) =
        ABI.IHttpMediaTypeWithQualityHeaderValueStatics_Instance.TryParse(input,
        mediaTypeWithQualityHeaderValue)
  }
}
