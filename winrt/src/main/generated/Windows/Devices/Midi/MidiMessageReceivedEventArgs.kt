package Windows.Devices.Midi

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

@ABIMarker(MidiMessageReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiMessageReceivedEventArgs;{76566e56-f328-4b51-907d-b3a8ce96bf80})")
@WinRTByReference(brClass = MidiMessageReceivedEventArgs.ByReference::class)
public class MidiMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiMessageReceivedEventArgs.WithDefault, IWinRTObject {
  private val __575014716_Interface: IMidiMessageReceivedEventArgs.WithDefault by lazy {
    as_575014716()
  }


  public override val __575014716_Ptr: JNAPointer? by lazy {
    __575014716_Interface.__575014716_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__575014716_Interface)

  private fun as_575014716(): IMidiMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMidiMessageReceivedEventArgs.ABI.makeIMidiMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiMessageReceivedEventArgs.ABI.makeIMidiMessageReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MidiMessageReceivedEventArgs> {
    public override fun getValue() = MidiMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MidiMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MidiMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MidiMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MidiMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
