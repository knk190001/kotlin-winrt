package Windows.Web.Http.Filters

import Windows.Foundation.IClosable
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.reflect.typeOf

@ABIMarker(HttpBaseProtocolFilter.ABI::class)
@Signature("rc(Windows.Web.Http.Filters.HttpBaseProtocolFilter;{71c89b09-e131-4b54-a53c-eb43ff37e9bb})")
@WinRTByReference(brClass = HttpBaseProtocolFilter.ByReference::class)
public class HttpBaseProtocolFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpBaseProtocolFilter.WithDefault, IHttpBaseProtocolFilter2.WithDefault,
    IHttpBaseProtocolFilter3.WithDefault, IHttpBaseProtocolFilter4.WithDefault,
    IHttpBaseProtocolFilter5.WithDefault, IHttpFilter.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __905293112_Interface: IHttpBaseProtocolFilter.WithDefault by lazy {
    as_905293112()
  }


  private val __2000684550_Interface: IHttpBaseProtocolFilter2.WithDefault by lazy {
    as_2000684550()
  }


  private val __2000684549_Interface: IHttpBaseProtocolFilter3.WithDefault by lazy {
    as_2000684549()
  }


  private val __2000684548_Interface: IHttpBaseProtocolFilter4.WithDefault by lazy {
    as_2000684548()
  }


  private val __2000684547_Interface: IHttpBaseProtocolFilter5.WithDefault by lazy {
    as_2000684547()
  }


  private val __143311409_Interface: IHttpFilter.WithDefault by lazy {
    as_143311409()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __905293112_Ptr: JNAPointer? by lazy {
    __905293112_Interface.__905293112_Ptr
  }


  public override val __2000684550_Ptr: JNAPointer? by lazy {
    __2000684550_Interface.__2000684550_Ptr
  }


  public override val __2000684549_Ptr: JNAPointer? by lazy {
    __2000684549_Interface.__2000684549_Ptr
  }


  public override val __2000684548_Ptr: JNAPointer? by lazy {
    __2000684548_Interface.__2000684548_Ptr
  }


  public override val __2000684547_Ptr: JNAPointer? by lazy {
    __2000684547_Interface.__2000684547_Ptr
  }


  public override val __143311409_Ptr: JNAPointer? by lazy {
    __143311409_Interface.__143311409_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__905293112_Interface, __2000684550_Interface, __2000684549_Interface,
        __2000684548_Interface, __2000684547_Interface, __143311409_Interface,
        __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_905293112(): IHttpBaseProtocolFilter.WithDefault {
    if(pointer == NULL) {
      return(IHttpBaseProtocolFilter.ABI.makeIHttpBaseProtocolFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpBaseProtocolFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpBaseProtocolFilter.ABI.makeIHttpBaseProtocolFilter(ref.value))
  }

  private fun as_2000684550(): IHttpBaseProtocolFilter2.WithDefault {
    if(pointer == NULL) {
      return(IHttpBaseProtocolFilter2.ABI.makeIHttpBaseProtocolFilter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpBaseProtocolFilter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpBaseProtocolFilter2.ABI.makeIHttpBaseProtocolFilter2(ref.value))
  }

  private fun as_2000684549(): IHttpBaseProtocolFilter3.WithDefault {
    if(pointer == NULL) {
      return(IHttpBaseProtocolFilter3.ABI.makeIHttpBaseProtocolFilter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpBaseProtocolFilter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpBaseProtocolFilter3.ABI.makeIHttpBaseProtocolFilter3(ref.value))
  }

  private fun as_2000684548(): IHttpBaseProtocolFilter4.WithDefault {
    if(pointer == NULL) {
      return(IHttpBaseProtocolFilter4.ABI.makeIHttpBaseProtocolFilter4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpBaseProtocolFilter4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpBaseProtocolFilter4.ABI.makeIHttpBaseProtocolFilter4(ref.value))
  }

  private fun as_2000684547(): IHttpBaseProtocolFilter5.WithDefault {
    if(pointer == NULL) {
      return(IHttpBaseProtocolFilter5.ABI.makeIHttpBaseProtocolFilter5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpBaseProtocolFilter5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpBaseProtocolFilter5.ABI.makeIHttpBaseProtocolFilter5(ref.value))
  }

  private fun as_143311409(): IHttpFilter.WithDefault {
    if(pointer == NULL) {
      return(IHttpFilter.ABI.makeIHttpFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpFilter.ABI.makeIHttpFilter(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpBaseProtocolFilter> {
    public override fun getValue() = HttpBaseProtocolFilter(pointer.getPointer(0))

    public fun setValue(value: HttpBaseProtocolFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpBaseProtocolFilter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IHttpBaseProtocolFilterStatics_Instance: IHttpBaseProtocolFilterStatics by lazy {
      createIHttpBaseProtocolFilterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Filters.HttpBaseProtocolFilter".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIHttpBaseProtocolFilterStatics(): IHttpBaseProtocolFilterStatics {
      val refiid = Guid.REFIID(IHttpBaseProtocolFilterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Filters.HttpBaseProtocolFilter".toHandle(),refiid,interfacePtr)
      val result =
          IHttpBaseProtocolFilterStatics.ABI.makeIHttpBaseProtocolFilterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HttpBaseProtocolFilter {
      val address = segment.toRawLongValue()
      return HttpBaseProtocolFilter(Pointer(address))
    }

    public override fun toNative(obj: HttpBaseProtocolFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForUser(user: User) =
        ABI.IHttpBaseProtocolFilterStatics_Instance.CreateForUser(user)
  }
}
