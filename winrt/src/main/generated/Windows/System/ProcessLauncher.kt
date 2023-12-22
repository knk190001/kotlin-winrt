package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(ProcessLauncher.ABI::class)
@WinRTByReference(brClass = ProcessLauncher.ByReference::class)
public class ProcessLauncher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessLauncher> {
    public override fun getValue() = ProcessLauncher(pointer.getPointer(0))

    public fun setValue(value: ProcessLauncher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessLauncher, MemoryAddress> {
    public val IProcessLauncherStatics_Instance: IProcessLauncherStatics by lazy {
      createIProcessLauncherStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProcessLauncherStatics(): IProcessLauncherStatics {
      val refiid = Guid.REFIID(IProcessLauncherStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.ProcessLauncher".toHandle(),refiid,interfacePtr)
      val result = IProcessLauncherStatics.ABI.makeIProcessLauncherStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProcessLauncher {
      val address = segment.toRawLongValue()
      return ProcessLauncher(Pointer(address))
    }

    public override fun toNative(obj: ProcessLauncher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RunToCompletionAsync(fileName: String, args: String) =
        ABI.IProcessLauncherStatics_Instance.RunToCompletionAsync(fileName, args)

    public fun RunToCompletionAsync(
      fileName: String,
      args: String,
      options: ProcessLauncherOptions
    ) = ABI.IProcessLauncherStatics_Instance.RunToCompletionAsync(fileName, args, options)
  }
}
