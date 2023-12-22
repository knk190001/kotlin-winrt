package Windows.System.Threading.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(SignalNotifier.ABI::class)
@Signature("rc(Windows.System.Threading.Core.SignalNotifier;{14285e06-63a7-4713-b6d9-62f64b56fb8b})")
@WinRTByReference(brClass = SignalNotifier.ByReference::class)
public class SignalNotifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISignalNotifier.WithDefault, IWinRTObject {
  private val __1318114482_Interface: ISignalNotifier.WithDefault by lazy {
    as_1318114482()
  }


  public override val __1318114482_Ptr: JNAPointer? by lazy {
    __1318114482_Interface.__1318114482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1318114482_Interface)

  private fun as_1318114482(): ISignalNotifier.WithDefault {
    if(pointer == NULL) {
      return(ISignalNotifier.ABI.makeISignalNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISignalNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISignalNotifier.ABI.makeISignalNotifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SignalNotifier>
      {
    public override fun getValue() = SignalNotifier(pointer.getPointer(0))

    public fun setValue(value: SignalNotifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SignalNotifier, MemoryAddress> {
    public val ISignalNotifierStatics_Instance: ISignalNotifierStatics by lazy {
      createISignalNotifierStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISignalNotifierStatics(): ISignalNotifierStatics {
      val refiid = Guid.REFIID(ISignalNotifierStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Threading.Core.SignalNotifier".toHandle(),refiid,interfacePtr)
      val result = ISignalNotifierStatics.ABI.makeISignalNotifierStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SignalNotifier {
      val address = segment.toRawLongValue()
      return SignalNotifier(Pointer(address))
    }

    public override fun toNative(obj: SignalNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AttachToEvent(name: String, handler: SignalHandler) =
        ABI.ISignalNotifierStatics_Instance.AttachToEvent(name, handler)

    public fun AttachToEvent(
      name: String,
      handler: SignalHandler,
      timeout: TimeSpan
    ) = ABI.ISignalNotifierStatics_Instance.AttachToEvent(name, handler, timeout)

    public fun AttachToSemaphore(name: String, handler: SignalHandler) =
        ABI.ISignalNotifierStatics_Instance.AttachToSemaphore(name, handler)

    public fun AttachToSemaphore(
      name: String,
      handler: SignalHandler,
      timeout: TimeSpan
    ) = ABI.ISignalNotifierStatics_Instance.AttachToSemaphore(name, handler, timeout)
  }
}
