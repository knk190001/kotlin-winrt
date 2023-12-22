package Windows.Services.Store

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StorePurchaseProperties.ABI::class)
@Signature("rc(Windows.Services.Store.StorePurchaseProperties;{836278f3-ff87-4364-a5b4-fd2153ebe43b})")
@WinRTByReference(brClass = StorePurchaseProperties.ByReference::class)
public class StorePurchaseProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePurchaseProperties.WithDefault, IWinRTObject {
  private val __378871688_Interface: IStorePurchaseProperties.WithDefault by lazy {
    as_378871688()
  }


  public override val __378871688_Ptr: JNAPointer? by lazy {
    __378871688_Interface.__378871688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__378871688_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_378871688(): IStorePurchaseProperties.WithDefault {
    if(pointer == NULL) {
      return(IStorePurchaseProperties.ABI.makeIStorePurchaseProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePurchaseProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePurchaseProperties.ABI.makeIStorePurchaseProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePurchaseProperties> {
    public override fun getValue() = StorePurchaseProperties(pointer.getPointer(0))

    public fun setValue(value: StorePurchaseProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePurchaseProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IStorePurchasePropertiesFactory_Instance: IStorePurchasePropertiesFactory by lazy {
      createIStorePurchasePropertiesFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Store.StorePurchaseProperties".toHandle(),
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

    public fun createIStorePurchasePropertiesFactory(): IStorePurchasePropertiesFactory {
      val refiid = Guid.REFIID(IStorePurchasePropertiesFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Store.StorePurchaseProperties".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStorePurchasePropertiesFactory.ABI.makeIStorePurchasePropertiesFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IStorePurchasePropertiesFactory_Instance.Create(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): StorePurchaseProperties {
      val address = segment.toRawLongValue()
      return StorePurchaseProperties(Pointer(address))
    }

    public override fun toNative(obj: StorePurchaseProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
