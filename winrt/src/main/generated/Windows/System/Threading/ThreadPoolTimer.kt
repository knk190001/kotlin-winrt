package Windows.System.Threading

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ThreadPoolTimer.ABI::class)
@Signature("rc(Windows.System.Threading.ThreadPoolTimer;{594ebe78-55ea-4a88-a50d-3402ae1f9cf2})")
@WinRTByReference(brClass = ThreadPoolTimer.ByReference::class)
public class ThreadPoolTimer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IThreadPoolTimer.WithDefault, IWinRTObject {
  private val __1155232038_Interface: IThreadPoolTimer.WithDefault by lazy {
    as_1155232038()
  }


  public override val __1155232038_Ptr: JNAPointer? by lazy {
    __1155232038_Interface.__1155232038_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1155232038_Interface)

  private fun as_1155232038(): IThreadPoolTimer.WithDefault {
    if(pointer == NULL) {
      return(IThreadPoolTimer.ABI.makeIThreadPoolTimer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThreadPoolTimer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThreadPoolTimer.ABI.makeIThreadPoolTimer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ThreadPoolTimer> {
    public override fun getValue() = ThreadPoolTimer(pointer.getPointer(0))

    public fun setValue(value: ThreadPoolTimer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThreadPoolTimer, MemoryAddress> {
    public val IThreadPoolTimerStatics_Instance: IThreadPoolTimerStatics by lazy {
      createIThreadPoolTimerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIThreadPoolTimerStatics(): IThreadPoolTimerStatics {
      val refiid = Guid.REFIID(IThreadPoolTimerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Threading.ThreadPoolTimer".toHandle(),refiid,interfacePtr)
      val result = IThreadPoolTimerStatics.ABI.makeIThreadPoolTimerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ThreadPoolTimer {
      val address = segment.toRawLongValue()
      return ThreadPoolTimer(Pointer(address))
    }

    public override fun toNative(obj: ThreadPoolTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreatePeriodicTimer(handler: TimerElapsedHandler, period: TimeSpan) =
        ABI.IThreadPoolTimerStatics_Instance.CreatePeriodicTimer(handler, period)

    public fun CreateTimer(handler: TimerElapsedHandler, delay: TimeSpan) =
        ABI.IThreadPoolTimerStatics_Instance.CreateTimer(handler, delay)

    public fun CreatePeriodicTimer(
      handler: TimerElapsedHandler,
      period: TimeSpan,
      destroyed: TimerDestroyedHandler
    ) = ABI.IThreadPoolTimerStatics_Instance.CreatePeriodicTimer(handler, period, destroyed)

    public fun CreateTimer(
      handler: TimerElapsedHandler,
      delay: TimeSpan,
      destroyed: TimerDestroyedHandler
    ) = ABI.IThreadPoolTimerStatics_Instance.CreateTimer(handler, delay, destroyed)
  }
}
