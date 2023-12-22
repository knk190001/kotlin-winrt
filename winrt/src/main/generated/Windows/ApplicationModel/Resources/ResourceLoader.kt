package Windows.ApplicationModel.Resources

import Windows.Foundation.Uri
import Windows.UI.UIContext
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

@ABIMarker(ResourceLoader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.ResourceLoader;{08524908-16ef-45ad-a602-293637d7e61a})")
@WinRTByReference(brClass = ResourceLoader.ByReference::class)
public class ResourceLoader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceLoader.WithDefault, IResourceLoader2.WithDefault, IWinRTObject {
  private val __1031038865_Interface: IResourceLoader.WithDefault by lazy {
    as_1031038865()
  }


  private val __1897433693_Interface: IResourceLoader2.WithDefault by lazy {
    as_1897433693()
  }


  public override val __1031038865_Ptr: JNAPointer? by lazy {
    __1031038865_Interface.__1031038865_Ptr
  }


  public override val __1897433693_Ptr: JNAPointer? by lazy {
    __1897433693_Interface.__1897433693_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1031038865_Interface, __1897433693_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_1031038865(): IResourceLoader.WithDefault {
    if(pointer == NULL) {
      return(IResourceLoader.ABI.makeIResourceLoader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceLoader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceLoader.ABI.makeIResourceLoader(ref.value))
  }

  private fun as_1897433693(): IResourceLoader2.WithDefault {
    if(pointer == NULL) {
      return(IResourceLoader2.ABI.makeIResourceLoader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceLoader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceLoader2.ABI.makeIResourceLoader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ResourceLoader>
      {
    public override fun getValue() = ResourceLoader(pointer.getPointer(0))

    public fun setValue(value: ResourceLoader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceLoader, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IResourceLoaderStatics4_Instance: IResourceLoaderStatics4 by lazy {
      createIResourceLoaderStatics4()
    }


    public val IResourceLoaderStatics3_Instance: IResourceLoaderStatics3 by lazy {
      createIResourceLoaderStatics3()
    }


    public val IResourceLoaderStatics_Instance: IResourceLoaderStatics by lazy {
      createIResourceLoaderStatics()
    }


    public val IResourceLoaderStatics2_Instance: IResourceLoaderStatics2 by lazy {
      createIResourceLoaderStatics2()
    }


    public val IResourceLoaderFactory_Instance: IResourceLoaderFactory by lazy {
      createIResourceLoaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),
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

    public fun createIResourceLoaderStatics4(): IResourceLoaderStatics4 {
      val refiid = Guid.REFIID(IResourceLoaderStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,interfacePtr)
      val result = IResourceLoaderStatics4.ABI.makeIResourceLoaderStatics4(interfacePtr.value)
      return result
    }

    public fun createIResourceLoaderStatics3(): IResourceLoaderStatics3 {
      val refiid = Guid.REFIID(IResourceLoaderStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,interfacePtr)
      val result = IResourceLoaderStatics3.ABI.makeIResourceLoaderStatics3(interfacePtr.value)
      return result
    }

    public fun createIResourceLoaderStatics(): IResourceLoaderStatics {
      val refiid = Guid.REFIID(IResourceLoaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,interfacePtr)
      val result = IResourceLoaderStatics.ABI.makeIResourceLoaderStatics(interfacePtr.value)
      return result
    }

    public fun createIResourceLoaderStatics2(): IResourceLoaderStatics2 {
      val refiid = Guid.REFIID(IResourceLoaderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,interfacePtr)
      val result = IResourceLoaderStatics2.ABI.makeIResourceLoaderStatics2(interfacePtr.value)
      return result
    }

    public fun createIResourceLoaderFactory(): IResourceLoaderFactory {
      val refiid = Guid.REFIID(IResourceLoaderFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceLoaderFactory.ABI.makeIResourceLoaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IResourceLoaderFactory_Instance.CreateResourceLoaderByName(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceLoader {
      val address = segment.toRawLongValue()
      return ResourceLoader(Pointer(address))
    }

    public override fun toNative(obj: ResourceLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultPriPath(packageFullName: String) =
        ABI.IResourceLoaderStatics4_Instance.GetDefaultPriPath(packageFullName)

    public fun GetForUIContext(context: UIContext) =
        ABI.IResourceLoaderStatics3_Instance.GetForUIContext(context)

    public fun GetStringForReference(uri: Uri) =
        ABI.IResourceLoaderStatics_Instance.GetStringForReference(uri)

    public fun GetForCurrentView() = ABI.IResourceLoaderStatics2_Instance.GetForCurrentView()

    public fun GetForCurrentView(name: String) =
        ABI.IResourceLoaderStatics2_Instance.GetForCurrentView(name)

    public fun GetForViewIndependentUse() =
        ABI.IResourceLoaderStatics2_Instance.GetForViewIndependentUse()

    public fun GetForViewIndependentUse(name: String) =
        ABI.IResourceLoaderStatics2_Instance.GetForViewIndependentUse(name)
  }
}
