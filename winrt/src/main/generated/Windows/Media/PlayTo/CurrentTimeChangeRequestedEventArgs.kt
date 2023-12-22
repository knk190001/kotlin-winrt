package Windows.Media.PlayTo

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

@ABIMarker(CurrentTimeChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs;{99711324-edc7-4bf5-91f6-3c8627db59e5})")
@WinRTByReference(brClass = CurrentTimeChangeRequestedEventArgs.ByReference::class)
public class CurrentTimeChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrentTimeChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1284263322_Interface: ICurrentTimeChangeRequestedEventArgs.WithDefault by lazy {
    as_1284263322()
  }


  public override val __1284263322_Ptr: JNAPointer? by lazy {
    __1284263322_Interface.__1284263322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1284263322_Interface)

  private fun as_1284263322(): ICurrentTimeChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICurrentTimeChangeRequestedEventArgs.ABI.makeICurrentTimeChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrentTimeChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrentTimeChangeRequestedEventArgs.ABI.makeICurrentTimeChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrentTimeChangeRequestedEventArgs> {
    public override fun getValue() = CurrentTimeChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CurrentTimeChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentTimeChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CurrentTimeChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CurrentTimeChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CurrentTimeChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
