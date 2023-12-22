package Windows.ApplicationModel.VoiceCommands

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(VoiceCommandUserMessage.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage;{674eb3c0-44f6-4f07-b979-4c723fc08597})")
@WinRTByReference(brClass = VoiceCommandUserMessage.ByReference::class)
public class VoiceCommandUserMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandUserMessage.WithDefault, IWinRTObject {
  private val __1917427446_Interface: IVoiceCommandUserMessage.WithDefault by lazy {
    as_1917427446()
  }


  public override val __1917427446_Ptr: JNAPointer? by lazy {
    __1917427446_Interface.__1917427446_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1917427446_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1917427446(): IVoiceCommandUserMessage.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandUserMessage.ABI.makeIVoiceCommandUserMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandUserMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandUserMessage.ABI.makeIVoiceCommandUserMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandUserMessage> {
    public override fun getValue() = VoiceCommandUserMessage(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandUserMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandUserMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.VoiceCommands.VoiceCommandUserMessage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): VoiceCommandUserMessage {
      val address = segment.toRawLongValue()
      return VoiceCommandUserMessage(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandUserMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
