package Windows.ApplicationModel.Resources.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ResourceManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceManager;{f744d97b-9988-44fb-abd6-5378844cfa8b})")
@WinRTByReference(brClass = ResourceManager.ByReference::class)
public class ResourceManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceManager.WithDefault, IResourceManager2.WithDefault, IWinRTObject {
  private val __1279705448_Interface: IResourceManager.WithDefault by lazy {
    as_1279705448()
  }


  private val __1016163274_Interface: IResourceManager2.WithDefault by lazy {
    as_1016163274()
  }


  public override val __1279705448_Ptr: JNAPointer? by lazy {
    __1279705448_Interface.__1279705448_Ptr
  }


  public override val __1016163274_Ptr: JNAPointer? by lazy {
    __1016163274_Interface.__1016163274_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1279705448_Interface, __1016163274_Interface)

  private fun as_1279705448(): IResourceManager.WithDefault {
    if(pointer == NULL) {
      return(IResourceManager.ABI.makeIResourceManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceManager.ABI.makeIResourceManager(ref.value))
  }

  private fun as_1016163274(): IResourceManager2.WithDefault {
    if(pointer == NULL) {
      return(IResourceManager2.ABI.makeIResourceManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceManager2.ABI.makeIResourceManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceManager> {
    public override fun getValue() = ResourceManager(pointer.getPointer(0))

    public fun setValue(value: ResourceManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceManager, MemoryAddress> {
    public val IResourceManagerStatics_Instance: IResourceManagerStatics by lazy {
      createIResourceManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIResourceManagerStatics(): IResourceManagerStatics {
      val refiid = Guid.REFIID(IResourceManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceManager".toHandle(),refiid,interfacePtr)
      val result = IResourceManagerStatics.ABI.makeIResourceManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ResourceManager {
      val address = segment.toRawLongValue()
      return ResourceManager(Pointer(address))
    }

    public override fun toNative(obj: ResourceManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IResourceManagerStatics_Instance.get_Current()

    public fun IsResourceReference(resourceReference: String) =
        ABI.IResourceManagerStatics_Instance.IsResourceReference(resourceReference)
  }
}
