package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardEmulatorConnectionDeactivatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardEmulatorConnectionDeactivatedEventArgs;{2186d8d3-c5eb-5262-43df-62a0a1b55557})")
@WinRTByReference(brClass = SmartCardEmulatorConnectionDeactivatedEventArgs.ByReference::class)
public class SmartCardEmulatorConnectionDeactivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardEmulatorConnectionDeactivatedEventArgs.WithDefault, IWinRTObject {
  private val __43581632_Interface: ISmartCardEmulatorConnectionDeactivatedEventArgs.WithDefault by
      lazy {
    as_43581632()
  }


  public override val __43581632_Ptr: JNAPointer? by lazy {
    __43581632_Interface.__43581632_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__43581632_Interface)

  private fun as_43581632(): ISmartCardEmulatorConnectionDeactivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulatorConnectionDeactivatedEventArgs.ABI.makeISmartCardEmulatorConnectionDeactivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulatorConnectionDeactivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulatorConnectionDeactivatedEventArgs.ABI.makeISmartCardEmulatorConnectionDeactivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardEmulatorConnectionDeactivatedEventArgs> {
    public override fun getValue() =
        SmartCardEmulatorConnectionDeactivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SmartCardEmulatorConnectionDeactivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardEmulatorConnectionDeactivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SmartCardEmulatorConnectionDeactivatedEventArgs {
      val address = segment.toRawLongValue()
      return SmartCardEmulatorConnectionDeactivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SmartCardEmulatorConnectionDeactivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
