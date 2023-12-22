package Microsoft.Windows.ApplicationModel.Resources

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
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceLoader;{bc3f76bf-da46-54cd-8715-8b8aaf16eaac})")
@WinRTByReference(brClass = ResourceLoader.ByReference::class)
public class ResourceLoader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceLoader.WithDefault, IWinRTObject {
  private val __686181553_Interface: IResourceLoader.WithDefault by lazy {
    as_686181553()
  }


  public override val __686181553_Ptr: JNAPointer? by lazy {
    __686181553_Interface.__686181553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__686181553_Interface)

  public constructor() : this(ABI.activate())

  public constructor(fileName: String) : this(ABI.activate(fileName))

  public constructor(fileName: String, resourceMap: String) : this(ABI.activate(fileName,
      resourceMap))

  private fun as_686181553(): IResourceLoader.WithDefault {
    if(pointer == NULL) {
      return(IResourceLoader.ABI.makeIResourceLoader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceLoader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceLoader.ABI.makeIResourceLoader(ref.value))
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


    public val IResourceLoaderStatics_Instance: IResourceLoaderStatics by lazy {
      createIResourceLoaderStatics()
    }


    public val IResourceLoaderFactory_Instance: IResourceLoaderFactory by lazy {
      createIResourceLoaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),
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

    public fun createIResourceLoaderStatics(): IResourceLoaderStatics {
      val refiid = Guid.REFIID(IResourceLoaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,interfacePtr)
      val result = IResourceLoaderStatics.ABI.makeIResourceLoaderStatics(interfacePtr.value)
      return result
    }

    public fun createIResourceLoaderFactory(): IResourceLoaderFactory {
      val refiid = Guid.REFIID(IResourceLoaderFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceLoader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceLoaderFactory.ABI.makeIResourceLoaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(fileName: String): JNAPointer? =
        IResourceLoaderFactory_Instance.CreateInstance(fileName)?.pointer

    public fun activate(fileName: String, resourceMap: String): JNAPointer? =
        IResourceLoaderFactory_Instance.CreateInstance2(fileName, resourceMap)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceLoader {
      val address = segment.toRawLongValue()
      return ResourceLoader(Pointer(address))
    }

    public override fun toNative(obj: ResourceLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultResourceFilePath() =
        ABI.IResourceLoaderStatics_Instance.GetDefaultResourceFilePath()
  }
}
