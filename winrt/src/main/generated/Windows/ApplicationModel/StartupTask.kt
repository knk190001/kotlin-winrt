package Windows.ApplicationModel

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

@ABIMarker(StartupTask.ABI::class)
@Signature("rc(Windows.ApplicationModel.StartupTask;{f75c23c8-b5f2-4f6c-88dd-36cb1d599d17})")
@WinRTByReference(brClass = StartupTask.ByReference::class)
public class StartupTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStartupTask.WithDefault, IWinRTObject {
  private val __243320733_Interface: IStartupTask.WithDefault by lazy {
    as_243320733()
  }


  public override val __243320733_Ptr: JNAPointer? by lazy {
    __243320733_Interface.__243320733_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__243320733_Interface)

  private fun as_243320733(): IStartupTask.WithDefault {
    if(pointer == NULL) {
      return(IStartupTask.ABI.makeIStartupTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStartupTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStartupTask.ABI.makeIStartupTask(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StartupTask> {
    public override fun getValue() = StartupTask(pointer.getPointer(0))

    public fun setValue(value: StartupTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StartupTask, MemoryAddress> {
    public val IStartupTaskStatics_Instance: IStartupTaskStatics by lazy {
      createIStartupTaskStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStartupTaskStatics(): IStartupTaskStatics {
      val refiid = Guid.REFIID(IStartupTaskStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.StartupTask".toHandle(),refiid,interfacePtr)
      val result = IStartupTaskStatics.ABI.makeIStartupTaskStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StartupTask {
      val address = segment.toRawLongValue()
      return StartupTask(Pointer(address))
    }

    public override fun toNative(obj: StartupTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentPackageAsync() =
        ABI.IStartupTaskStatics_Instance.GetForCurrentPackageAsync()

    public fun GetAsync(taskId: String) = ABI.IStartupTaskStatics_Instance.GetAsync(taskId)
  }
}
