package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IPropertyMetadataFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(PropertyMetadata.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.PropertyMetadata;{b3644425-9464-5434-b0ae-aff8d3159fe1})")
@WinRTByReference(brClass = PropertyMetadata.ByReference::class)
public open class PropertyMetadata(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPropertyMetadata.WithDefault, IWinRTObject {
  private val __347103851_Interface: IPropertyMetadata.WithDefault by lazy {
    as_347103851()
  }


  public override val __347103851_Ptr: JNAPointer? by lazy {
    __347103851_Interface.__347103851_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__347103851_Interface)

  public constructor(defaultValue: IUnknown) : this(ABI.activate(defaultValue))

  public constructor(defaultValue: IUnknown, propertyChangedCallback: PropertyChangedCallback) :
      this(ABI.activate(defaultValue, propertyChangedCallback))

  private fun as_347103851(): IPropertyMetadata.WithDefault {
    if(pointer == NULL) {
      return(IPropertyMetadata.ABI.makeIPropertyMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPropertyMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertyMetadata.ABI.makeIPropertyMetadata(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PropertyMetadata> {
    public override fun getValue() = PropertyMetadata(pointer.getPointer(0))

    public fun setValue(value: PropertyMetadata): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PropertyMetadata, MemoryAddress> {
    public val IPropertyMetadataStatics_Instance: IPropertyMetadataStatics by lazy {
      createIPropertyMetadataStatics()
    }


    public val IPropertyMetadataFactory_Instance: IPropertyMetadataFactory by lazy {
      createIPropertyMetadataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPropertyMetadataStatics(): IPropertyMetadataStatics {
      val refiid = Guid.REFIID(IPropertyMetadataStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.PropertyMetadata".toHandle(),refiid,interfacePtr)
      val result = IPropertyMetadataStatics.ABI.makeIPropertyMetadataStatics(interfacePtr.value)
      return result
    }

    public fun createIPropertyMetadataFactory(): IPropertyMetadataFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.PropertyMetadata".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPropertyMetadataFactory.ABI.makeIPropertyMetadataFactory(factoryActivatorPtr.value))
    }

    public fun activate(defaultValue: IUnknown): JNAPointer? =
        IPropertyMetadataFactory_Instance.CreateInstanceWithDefaultValue(defaultValue, null,
        null)?.pointer

    public fun activate(defaultValue: IUnknown, propertyChangedCallback: PropertyChangedCallback):
        JNAPointer? =
        IPropertyMetadataFactory_Instance.CreateInstanceWithDefaultValueAndCallback(defaultValue,
        propertyChangedCallback, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PropertyMetadata {
      val address = segment.toRawLongValue()
      return PropertyMetadata(Pointer(address))
    }

    public override fun toNative(obj: PropertyMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(defaultValue: IUnknown) =
        ABI.IPropertyMetadataStatics_Instance.Create(defaultValue)

    public fun Create(defaultValue: IUnknown, propertyChangedCallback: PropertyChangedCallback) =
        ABI.IPropertyMetadataStatics_Instance.Create(defaultValue, propertyChangedCallback)

    public fun Create(createDefaultValueCallback: CreateDefaultValueCallback) =
        ABI.IPropertyMetadataStatics_Instance.Create(createDefaultValueCallback)

    public fun Create(createDefaultValueCallback: CreateDefaultValueCallback,
        propertyChangedCallback: PropertyChangedCallback) =
        ABI.IPropertyMetadataStatics_Instance.Create(createDefaultValueCallback,
        propertyChangedCallback)
  }
}
