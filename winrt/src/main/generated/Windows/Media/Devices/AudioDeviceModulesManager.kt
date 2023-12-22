package Windows.Media.Devices

import Windows.Media.Devices.IAudioDeviceModulesManagerFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioDeviceModulesManager.ABI::class)
@Signature("rc(Windows.Media.Devices.AudioDeviceModulesManager;{6aa40c4d-960a-4d1c-b318-0022604547ed})")
@WinRTByReference(brClass = AudioDeviceModulesManager.ByReference::class)
public class AudioDeviceModulesManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioDeviceModulesManager.WithDefault, IWinRTObject {
  private val __1515623697_Interface: IAudioDeviceModulesManager.WithDefault by lazy {
    as_1515623697()
  }


  public override val __1515623697_Ptr: JNAPointer? by lazy {
    __1515623697_Interface.__1515623697_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1515623697_Interface)

  public constructor(deviceId: String) : this(ABI.activate(deviceId))

  private fun as_1515623697(): IAudioDeviceModulesManager.WithDefault {
    if(pointer == NULL) {
      return(IAudioDeviceModulesManager.ABI.makeIAudioDeviceModulesManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioDeviceModulesManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioDeviceModulesManager.ABI.makeIAudioDeviceModulesManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioDeviceModulesManager> {
    public override fun getValue() = AudioDeviceModulesManager(pointer.getPointer(0))

    public fun setValue(value: AudioDeviceModulesManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioDeviceModulesManager, MemoryAddress> {
    public val IAudioDeviceModulesManagerFactory_Instance: IAudioDeviceModulesManagerFactory by
        lazy {
      createIAudioDeviceModulesManagerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioDeviceModulesManagerFactory(): IAudioDeviceModulesManagerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.AudioDeviceModulesManager".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioDeviceModulesManagerFactory.ABI.makeIAudioDeviceModulesManagerFactory(factoryActivatorPtr.value))
    }

    public fun activate(deviceId: String): JNAPointer? =
        IAudioDeviceModulesManagerFactory_Instance.Create(deviceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioDeviceModulesManager {
      val address = segment.toRawLongValue()
      return AudioDeviceModulesManager(Pointer(address))
    }

    public override fun toNative(obj: AudioDeviceModulesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
