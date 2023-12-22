package Windows.ApplicationModel.VoiceCommands

import Windows.ApplicationModel.AppService.AppServiceTriggerDetails
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

@ABIMarker(VoiceCommandServiceConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection;{d894bb9f-21da-44a4-98a2-fb131920a9cc})")
@WinRTByReference(brClass = VoiceCommandServiceConnection.ByReference::class)
public class VoiceCommandServiceConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandServiceConnection.WithDefault, IWinRTObject {
  private val __257863615_Interface: IVoiceCommandServiceConnection.WithDefault by lazy {
    as_257863615()
  }


  public override val __257863615_Ptr: JNAPointer? by lazy {
    __257863615_Interface.__257863615_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257863615_Interface)

  private fun as_257863615(): IVoiceCommandServiceConnection.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandServiceConnection.ABI.makeIVoiceCommandServiceConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandServiceConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandServiceConnection.ABI.makeIVoiceCommandServiceConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandServiceConnection> {
    public override fun getValue() = VoiceCommandServiceConnection(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandServiceConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandServiceConnection, MemoryAddress> {
    public val IVoiceCommandServiceConnectionStatics_Instance: IVoiceCommandServiceConnectionStatics
        by lazy {
      createIVoiceCommandServiceConnectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVoiceCommandServiceConnectionStatics():
        IVoiceCommandServiceConnectionStatics {
      val refiid = Guid.REFIID(IVoiceCommandServiceConnectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection".toHandle(),refiid,interfacePtr)
      val result =
          IVoiceCommandServiceConnectionStatics.ABI.makeIVoiceCommandServiceConnectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VoiceCommandServiceConnection {
      val address = segment.toRawLongValue()
      return VoiceCommandServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails) =
        ABI.IVoiceCommandServiceConnectionStatics_Instance.FromAppServiceTriggerDetails(triggerDetails)
  }
}
