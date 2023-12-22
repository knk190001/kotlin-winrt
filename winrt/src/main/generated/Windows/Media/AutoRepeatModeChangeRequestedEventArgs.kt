package Windows.Media

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

@ABIMarker(AutoRepeatModeChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.AutoRepeatModeChangeRequestedEventArgs;{ea137efa-d852-438e-882b-c990109a78f4})")
@WinRTByReference(brClass = AutoRepeatModeChangeRequestedEventArgs.ByReference::class)
public class AutoRepeatModeChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutoRepeatModeChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1983416246_Interface: IAutoRepeatModeChangeRequestedEventArgs.WithDefault by lazy {
    as_1983416246()
  }


  public override val __1983416246_Ptr: JNAPointer? by lazy {
    __1983416246_Interface.__1983416246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1983416246_Interface)

  private fun as_1983416246(): IAutoRepeatModeChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAutoRepeatModeChangeRequestedEventArgs.ABI.makeIAutoRepeatModeChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoRepeatModeChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoRepeatModeChangeRequestedEventArgs.ABI.makeIAutoRepeatModeChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutoRepeatModeChangeRequestedEventArgs> {
    public override fun getValue() = AutoRepeatModeChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AutoRepeatModeChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoRepeatModeChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutoRepeatModeChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AutoRepeatModeChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AutoRepeatModeChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
