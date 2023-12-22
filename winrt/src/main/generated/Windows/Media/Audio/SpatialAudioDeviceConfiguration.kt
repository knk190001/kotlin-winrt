package Windows.Media.Audio

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

@ABIMarker(SpatialAudioDeviceConfiguration.ABI::class)
@Signature("rc(Windows.Media.Audio.SpatialAudioDeviceConfiguration;{ee830034-61cf-5749-9da4-10f0fe028199})")
@WinRTByReference(brClass = SpatialAudioDeviceConfiguration.ByReference::class)
public class SpatialAudioDeviceConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAudioDeviceConfiguration.WithDefault, IWinRTObject {
  private val __1222118438_Interface: ISpatialAudioDeviceConfiguration.WithDefault by lazy {
    as_1222118438()
  }


  public override val __1222118438_Ptr: JNAPointer? by lazy {
    __1222118438_Interface.__1222118438_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1222118438_Interface)

  private fun as_1222118438(): ISpatialAudioDeviceConfiguration.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAudioDeviceConfiguration.ABI.makeISpatialAudioDeviceConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAudioDeviceConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAudioDeviceConfiguration.ABI.makeISpatialAudioDeviceConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAudioDeviceConfiguration> {
    public override fun getValue() = SpatialAudioDeviceConfiguration(pointer.getPointer(0))

    public fun setValue(value: SpatialAudioDeviceConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAudioDeviceConfiguration, MemoryAddress> {
    public val ISpatialAudioDeviceConfigurationStatics_Instance:
        ISpatialAudioDeviceConfigurationStatics by lazy {
      createISpatialAudioDeviceConfigurationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAudioDeviceConfigurationStatics():
        ISpatialAudioDeviceConfigurationStatics {
      val refiid = Guid.REFIID(ISpatialAudioDeviceConfigurationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.SpatialAudioDeviceConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAudioDeviceConfigurationStatics.ABI.makeISpatialAudioDeviceConfigurationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAudioDeviceConfiguration {
      val address = segment.toRawLongValue()
      return SpatialAudioDeviceConfiguration(Pointer(address))
    }

    public override fun toNative(obj: SpatialAudioDeviceConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForDeviceId(deviceId: String) =
        ABI.ISpatialAudioDeviceConfigurationStatics_Instance.GetForDeviceId(deviceId)
  }
}
