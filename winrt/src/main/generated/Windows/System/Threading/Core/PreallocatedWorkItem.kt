package Windows.System.Threading.Core

import Windows.System.Threading.Core.IPreallocatedWorkItemFactory.ABI.IID
import Windows.System.Threading.WorkItemHandler
import Windows.System.Threading.WorkItemOptions
import Windows.System.Threading.WorkItemPriority
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

@ABIMarker(PreallocatedWorkItem.ABI::class)
@Signature("rc(Windows.System.Threading.Core.PreallocatedWorkItem;{b6daa9fc-bc5b-401a-a8b2-6e754d14daa6})")
@WinRTByReference(brClass = PreallocatedWorkItem.ByReference::class)
public class PreallocatedWorkItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPreallocatedWorkItem.WithDefault, IWinRTObject {
  private val __1692725832_Interface: IPreallocatedWorkItem.WithDefault by lazy {
    as_1692725832()
  }


  public override val __1692725832_Ptr: JNAPointer? by lazy {
    __1692725832_Interface.__1692725832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1692725832_Interface)

  public constructor(handler: WorkItemHandler) : this(ABI.activate(handler))

  public constructor(handler: WorkItemHandler, priority: WorkItemPriority) :
      this(ABI.activate(handler, priority))

  public constructor(
    handler: WorkItemHandler,
    priority: WorkItemPriority,
    options: WorkItemOptions
  ) : this(ABI.activate(handler, priority, options))

  private fun as_1692725832(): IPreallocatedWorkItem.WithDefault {
    if(pointer == NULL) {
      return(IPreallocatedWorkItem.ABI.makeIPreallocatedWorkItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPreallocatedWorkItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPreallocatedWorkItem.ABI.makeIPreallocatedWorkItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PreallocatedWorkItem> {
    public override fun getValue() = PreallocatedWorkItem(pointer.getPointer(0))

    public fun setValue(value: PreallocatedWorkItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PreallocatedWorkItem, MemoryAddress> {
    public val IPreallocatedWorkItemFactory_Instance: IPreallocatedWorkItemFactory by lazy {
      createIPreallocatedWorkItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPreallocatedWorkItemFactory(): IPreallocatedWorkItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Threading.Core.PreallocatedWorkItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPreallocatedWorkItemFactory.ABI.makeIPreallocatedWorkItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(handler: WorkItemHandler): JNAPointer? =
        IPreallocatedWorkItemFactory_Instance.CreateWorkItem(handler)?.pointer

    public fun activate(handler: WorkItemHandler, priority: WorkItemPriority): JNAPointer? =
        IPreallocatedWorkItemFactory_Instance.CreateWorkItemWithPriority(handler, priority)?.pointer

    public fun activate(
      handler: WorkItemHandler,
      priority: WorkItemPriority,
      options: WorkItemOptions
    ): JNAPointer? =
        IPreallocatedWorkItemFactory_Instance.CreateWorkItemWithPriorityAndOptions(handler,
        priority, options)?.pointer

    public override fun fromNative(segment: MemoryAddress): PreallocatedWorkItem {
      val address = segment.toRawLongValue()
      return PreallocatedWorkItem(Pointer(address))
    }

    public override fun toNative(obj: PreallocatedWorkItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
