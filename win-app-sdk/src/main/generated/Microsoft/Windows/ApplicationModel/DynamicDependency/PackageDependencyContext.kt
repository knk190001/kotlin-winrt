package Microsoft.Windows.ApplicationModel.DynamicDependency

import Microsoft.Windows.ApplicationModel.DynamicDependency.IPackageDependencyContextFactory.ABI.IID
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

@ABIMarker(PackageDependencyContext.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependencyContext;{9902c35a-a3f5-5645-af0f-cdf9fca00d5e})")
@WinRTByReference(brClass = PackageDependencyContext.ByReference::class)
public class PackageDependencyContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageDependencyContext.WithDefault, IWinRTObject {
  private val __1610627879_Interface: IPackageDependencyContext.WithDefault by lazy {
    as_1610627879()
  }


  public override val __1610627879_Ptr: JNAPointer? by lazy {
    __1610627879_Interface.__1610627879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1610627879_Interface)

  public constructor(contextId: PackageDependencyContextId) : this(ABI.activate(contextId))

  private fun as_1610627879(): IPackageDependencyContext.WithDefault {
    if(pointer == NULL) {
      return(IPackageDependencyContext.ABI.makeIPackageDependencyContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageDependencyContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageDependencyContext.ABI.makeIPackageDependencyContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageDependencyContext> {
    public override fun getValue() = PackageDependencyContext(pointer.getPointer(0))

    public fun setValue(value: PackageDependencyContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageDependencyContext, MemoryAddress> {
    public val IPackageDependencyContextFactory_Instance: IPackageDependencyContextFactory by lazy {
      createIPackageDependencyContextFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPackageDependencyContextFactory(): IPackageDependencyContextFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependencyContext".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPackageDependencyContextFactory.ABI.makeIPackageDependencyContextFactory(factoryActivatorPtr.value))
    }

    public fun activate(contextId: PackageDependencyContextId): JNAPointer? =
        IPackageDependencyContextFactory_Instance.CreateInstance(contextId)?.pointer

    public override fun fromNative(segment: MemoryAddress): PackageDependencyContext {
      val address = segment.toRawLongValue()
      return PackageDependencyContext(Pointer(address))
    }

    public override fun toNative(obj: PackageDependencyContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
