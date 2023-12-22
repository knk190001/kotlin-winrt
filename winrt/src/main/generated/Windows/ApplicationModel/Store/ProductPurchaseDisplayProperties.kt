package Windows.ApplicationModel.Store

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

@ABIMarker(ProductPurchaseDisplayProperties.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.ProductPurchaseDisplayProperties;{d70b7420-bc92-401b-a809-c9b2e5dbbdaf})")
@WinRTByReference(brClass = ProductPurchaseDisplayProperties.ByReference::class)
public class ProductPurchaseDisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProductPurchaseDisplayProperties.WithDefault, IWinRTObject {
  private val __500862807_Interface: IProductPurchaseDisplayProperties.WithDefault by lazy {
    as_500862807()
  }


  public override val __500862807_Ptr: JNAPointer? by lazy {
    __500862807_Interface.__500862807_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__500862807_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_500862807(): IProductPurchaseDisplayProperties.WithDefault {
    if(pointer == NULL) {
      return(IProductPurchaseDisplayProperties.ABI.makeIProductPurchaseDisplayProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductPurchaseDisplayProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductPurchaseDisplayProperties.ABI.makeIProductPurchaseDisplayProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProductPurchaseDisplayProperties> {
    public override fun getValue() = ProductPurchaseDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: ProductPurchaseDisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProductPurchaseDisplayProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IProductPurchaseDisplayPropertiesFactory_Instance:
        IProductPurchaseDisplayPropertiesFactory by lazy {
      createIProductPurchaseDisplayPropertiesFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.ProductPurchaseDisplayProperties".toHandle(),
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

    public fun createIProductPurchaseDisplayPropertiesFactory():
        IProductPurchaseDisplayPropertiesFactory {
      val refiid = Guid.REFIID(IProductPurchaseDisplayPropertiesFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.ProductPurchaseDisplayProperties".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProductPurchaseDisplayPropertiesFactory.ABI.makeIProductPurchaseDisplayPropertiesFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IProductPurchaseDisplayPropertiesFactory_Instance.CreateProductPurchaseDisplayProperties(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProductPurchaseDisplayProperties {
      val address = segment.toRawLongValue()
      return ProductPurchaseDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: ProductPurchaseDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
