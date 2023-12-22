package Windows.Media.Audio

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

@ABIMarker(FrameInputNodeQuantumStartedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs;{3d9bd498-a306-4f06-bd9f-e9efc8226304})")
@WinRTByReference(brClass = FrameInputNodeQuantumStartedEventArgs.ByReference::class)
public class FrameInputNodeQuantumStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameInputNodeQuantumStartedEventArgs.WithDefault, IWinRTObject {
  private val __1863394870_Interface: IFrameInputNodeQuantumStartedEventArgs.WithDefault by lazy {
    as_1863394870()
  }


  public override val __1863394870_Ptr: JNAPointer? by lazy {
    __1863394870_Interface.__1863394870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1863394870_Interface)

  private fun as_1863394870(): IFrameInputNodeQuantumStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFrameInputNodeQuantumStartedEventArgs.ABI.makeIFrameInputNodeQuantumStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameInputNodeQuantumStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameInputNodeQuantumStartedEventArgs.ABI.makeIFrameInputNodeQuantumStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameInputNodeQuantumStartedEventArgs> {
    public override fun getValue() = FrameInputNodeQuantumStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: FrameInputNodeQuantumStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameInputNodeQuantumStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameInputNodeQuantumStartedEventArgs {
      val address = segment.toRawLongValue()
      return FrameInputNodeQuantumStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FrameInputNodeQuantumStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
