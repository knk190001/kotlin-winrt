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

@ABIMarker(ResourceManager.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.Resources.ResourceManager;{7ec10160-a154-5c42-8268-30e306b1f585})")
@WinRTByReference(brClass = ResourceManager.ByReference::class)
public class ResourceManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceManager2.WithDefault, IResourceManager.WithDefault, IWinRTObject {
  private val __281643617_Interface: IResourceManager2.WithDefault by lazy {
    as_281643617()
  }


  private val __701821937_Interface: IResourceManager.WithDefault by lazy {
    as_701821937()
  }


  public override val __281643617_Ptr: JNAPointer? by lazy {
    __281643617_Interface.__281643617_Ptr
  }


  public override val __701821937_Ptr: JNAPointer? by lazy {
    __701821937_Interface.__701821937_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__281643617_Interface, __701821937_Interface)

  public constructor() : this(ABI.activate())

  public constructor(fileName: String) : this(ABI.activate(fileName))

  private fun as_281643617(): IResourceManager2.WithDefault {
    if(pointer == NULL) {
      return(IResourceManager2.ABI.makeIResourceManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceManager2.ABI.makeIResourceManager2(ref.value))
  }

  private fun as_701821937(): IResourceManager.WithDefault {
    if(pointer == NULL) {
      return(IResourceManager.ABI.makeIResourceManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceManager.ABI.makeIResourceManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceManager> {
    public override fun getValue() = ResourceManager(pointer.getPointer(0))

    public fun setValue(value: ResourceManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IResourceManagerFactory_Instance: IResourceManagerFactory by lazy {
      createIResourceManagerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceManager".toHandle(),
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

    public fun createIResourceManagerFactory(): IResourceManagerFactory {
      val refiid = Guid.REFIID(IResourceManagerFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.ResourceManager".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceManagerFactory.ABI.makeIResourceManagerFactory(factoryActivatorPtr.value))
    }

    public fun activate(fileName: String): JNAPointer? =
        IResourceManagerFactory_Instance.CreateInstance(fileName)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceManager {
      val address = segment.toRawLongValue()
      return ResourceManager(Pointer(address))
    }

    public override fun toNative(obj: ResourceManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
