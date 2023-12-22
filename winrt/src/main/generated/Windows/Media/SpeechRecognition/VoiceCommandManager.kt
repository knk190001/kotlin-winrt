package Windows.Media.SpeechRecognition

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

@ABIMarker(VoiceCommandManager.ABI::class)
@WinRTByReference(brClass = VoiceCommandManager.ByReference::class)
public class VoiceCommandManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandManager> {
    public override fun getValue() = VoiceCommandManager(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandManager, MemoryAddress> {
    public val IVoiceCommandManager_Instance: IVoiceCommandManager by lazy {
      createIVoiceCommandManager()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVoiceCommandManager(): IVoiceCommandManager {
      val refiid = Guid.REFIID(IVoiceCommandManager.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.VoiceCommandManager".toHandle(),refiid,interfacePtr)
      val result = IVoiceCommandManager.ABI.makeIVoiceCommandManager(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VoiceCommandManager {
      val address = segment.toRawLongValue()
      return VoiceCommandManager(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun InstallCommandSetsFromStorageFileAsync(`file`: StorageFile) =
        ABI.IVoiceCommandManager_Instance.InstallCommandSetsFromStorageFileAsync(file)

    public fun get_InstalledCommandSets() =
        ABI.IVoiceCommandManager_Instance.get_InstalledCommandSets()
  }
}
