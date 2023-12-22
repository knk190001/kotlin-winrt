package Windows.ApplicationModel.VoiceCommands

import Windows.Storage.StorageFile
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(VoiceCommandDefinitionManager.ABI::class)
@WinRTByReference(brClass = VoiceCommandDefinitionManager.ByReference::class)
public class VoiceCommandDefinitionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandDefinitionManager> {
    public override fun getValue() = VoiceCommandDefinitionManager(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandDefinitionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandDefinitionManager, MemoryAddress> {
    public val IVoiceCommandDefinitionManagerStatics_Instance: IVoiceCommandDefinitionManagerStatics
        by lazy {
      createIVoiceCommandDefinitionManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVoiceCommandDefinitionManagerStatics():
        IVoiceCommandDefinitionManagerStatics {
      val refiid = Guid.REFIID(IVoiceCommandDefinitionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinitionManager".toHandle(),refiid,interfacePtr)
      val result =
          IVoiceCommandDefinitionManagerStatics.ABI.makeIVoiceCommandDefinitionManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VoiceCommandDefinitionManager {
      val address = segment.toRawLongValue()
      return VoiceCommandDefinitionManager(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandDefinitionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun InstallCommandDefinitionsFromStorageFileAsync(`file`: StorageFile) =
        ABI.IVoiceCommandDefinitionManagerStatics_Instance.InstallCommandDefinitionsFromStorageFileAsync(file)

    public fun get_InstalledCommandDefinitions() =
        ABI.IVoiceCommandDefinitionManagerStatics_Instance.get_InstalledCommandDefinitions()
  }
}
