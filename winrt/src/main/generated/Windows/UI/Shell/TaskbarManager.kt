package Windows.UI.Shell

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

@ABIMarker(TaskbarManager.ABI::class)
@Signature("rc(Windows.UI.Shell.TaskbarManager;{87490a19-1ad9-49f4-b2e8-86738dc5ac40})")
@WinRTByReference(brClass = TaskbarManager.ByReference::class)
public class TaskbarManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITaskbarManager.WithDefault, ITaskbarManager2.WithDefault, IWinRTObject {
  private val __1857322873_Interface: ITaskbarManager.WithDefault by lazy {
    as_1857322873()
  }


  private val __1742434165_Interface: ITaskbarManager2.WithDefault by lazy {
    as_1742434165()
  }


  public override val __1857322873_Ptr: JNAPointer? by lazy {
    __1857322873_Interface.__1857322873_Ptr
  }


  public override val __1742434165_Ptr: JNAPointer? by lazy {
    __1742434165_Interface.__1742434165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1857322873_Interface, __1742434165_Interface)

  private fun as_1857322873(): ITaskbarManager.WithDefault {
    if(pointer == NULL) {
      return(ITaskbarManager.ABI.makeITaskbarManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITaskbarManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITaskbarManager.ABI.makeITaskbarManager(ref.value))
  }

  private fun as_1742434165(): ITaskbarManager2.WithDefault {
    if(pointer == NULL) {
      return(ITaskbarManager2.ABI.makeITaskbarManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITaskbarManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITaskbarManager2.ABI.makeITaskbarManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TaskbarManager>
      {
    public override fun getValue() = TaskbarManager(pointer.getPointer(0))

    public fun setValue(value: TaskbarManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TaskbarManager, MemoryAddress> {
    public val ITaskbarManagerStatics_Instance: ITaskbarManagerStatics by lazy {
      createITaskbarManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITaskbarManagerStatics(): ITaskbarManagerStatics {
      val refiid = Guid.REFIID(ITaskbarManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Shell.TaskbarManager".toHandle(),refiid,interfacePtr)
      val result = ITaskbarManagerStatics.ABI.makeITaskbarManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TaskbarManager {
      val address = segment.toRawLongValue()
      return TaskbarManager(Pointer(address))
    }

    public override fun toNative(obj: TaskbarManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ITaskbarManagerStatics_Instance.GetDefault()
  }
}
