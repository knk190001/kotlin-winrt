package Windows.ApplicationModel.Resources.Management

import Windows.ApplicationModel.Resources.Management.IResourceIndexerFactory2.ABI.IID
import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ResourceIndexer.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Management.ResourceIndexer;{2d4cf9a5-e32f-4ab2-8748-96350a016da3})")
@WinRTByReference(brClass = ResourceIndexer.ByReference::class)
public class ResourceIndexer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceIndexer.WithDefault, IWinRTObject {
  private val __396377826_Interface: IResourceIndexer.WithDefault by lazy {
    as_396377826()
  }


  public override val __396377826_Ptr: JNAPointer? by lazy {
    __396377826_Interface.__396377826_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__396377826_Interface)

  public constructor(projectRoot: Uri, extensionDllPath: Uri) : this(ABI.activate(projectRoot,
      extensionDllPath))

  public constructor(projectRoot: Uri) : this(ABI.activate(projectRoot))

  private fun as_396377826(): IResourceIndexer.WithDefault {
    if(pointer == NULL) {
      return(IResourceIndexer.ABI.makeIResourceIndexer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceIndexer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceIndexer.ABI.makeIResourceIndexer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceIndexer> {
    public override fun getValue() = ResourceIndexer(pointer.getPointer(0))

    public fun setValue(value: ResourceIndexer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceIndexer, MemoryAddress> {
    public val IResourceIndexerFactory2_Instance: IResourceIndexerFactory2 by lazy {
      createIResourceIndexerFactory2()
    }


    public val IResourceIndexerFactory_Instance: IResourceIndexerFactory by lazy {
      createIResourceIndexerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIResourceIndexerFactory2(): IResourceIndexerFactory2 {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Management.ResourceIndexer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceIndexerFactory2.ABI.makeIResourceIndexerFactory2(factoryActivatorPtr.value))
    }

    public fun createIResourceIndexerFactory(): IResourceIndexerFactory {
      val refiid = Guid.REFIID(IResourceIndexerFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Management.ResourceIndexer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceIndexerFactory.ABI.makeIResourceIndexerFactory(factoryActivatorPtr.value))
    }

    public fun activate(projectRoot: Uri, extensionDllPath: Uri): JNAPointer? =
        IResourceIndexerFactory2_Instance.CreateResourceIndexerWithExtension(projectRoot,
        extensionDllPath)?.pointer

    public fun activate(projectRoot: Uri): JNAPointer? =
        IResourceIndexerFactory_Instance.CreateResourceIndexer(projectRoot)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceIndexer {
      val address = segment.toRawLongValue()
      return ResourceIndexer(Pointer(address))
    }

    public override fun toNative(obj: ResourceIndexer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
