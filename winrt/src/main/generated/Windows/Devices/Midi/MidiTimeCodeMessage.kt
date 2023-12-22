package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiTimeCodeMessageFactory.ABI.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MidiTimeCodeMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiTimeCodeMessage;{0bf7087d-fa63-4a1c-8deb-c0e87796a6d7})")
@WinRTByReference(brClass = MidiTimeCodeMessage.ByReference::class)
public class MidiTimeCodeMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiTimeCodeMessage.WithDefault, IMidiMessage.WithDefault, IWinRTObject {
  private val __1953075936_Interface: IMidiTimeCodeMessage.WithDefault by lazy {
    as_1953075936()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __1953075936_Ptr: JNAPointer? by lazy {
    __1953075936_Interface.__1953075936_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1953075936_Interface, __450265702_Interface)

  public constructor(frameType: Byte, values: Byte) : this(ABI.activate(frameType, values))

  private fun as_1953075936(): IMidiTimeCodeMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiTimeCodeMessage.ABI.makeIMidiTimeCodeMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiTimeCodeMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiTimeCodeMessage.ABI.makeIMidiTimeCodeMessage(ref.value))
  }

  private fun as_450265702(): IMidiMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiMessage.ABI.makeIMidiMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiMessage.ABI.makeIMidiMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MidiTimeCodeMessage> {
    public override fun getValue() = MidiTimeCodeMessage(pointer.getPointer(0))

    public fun setValue(value: MidiTimeCodeMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiTimeCodeMessage, MemoryAddress> {
    public val IMidiTimeCodeMessageFactory_Instance: IMidiTimeCodeMessageFactory by lazy {
      createIMidiTimeCodeMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiTimeCodeMessageFactory(): IMidiTimeCodeMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiTimeCodeMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiTimeCodeMessageFactory.ABI.makeIMidiTimeCodeMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(frameType: Byte, values: Byte): JNAPointer? =
        IMidiTimeCodeMessageFactory_Instance.CreateMidiTimeCodeMessage(frameType, values)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiTimeCodeMessage {
      val address = segment.toRawLongValue()
      return MidiTimeCodeMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiTimeCodeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
