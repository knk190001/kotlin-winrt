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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SpatialAudioFormatConfiguration.ABI::class)
@Signature("rc(Windows.Media.Audio.SpatialAudioFormatConfiguration;{32df09a8-50f0-5395-9923-7d44ca71ed6d})")
@WinRTByReference(brClass = SpatialAudioFormatConfiguration.ByReference::class)
public class SpatialAudioFormatConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAudioFormatConfiguration.WithDefault, IWinRTObject {
  private val __1573363749_Interface: ISpatialAudioFormatConfiguration.WithDefault by lazy {
    as_1573363749()
  }


  public override val __1573363749_Ptr: JNAPointer? by lazy {
    __1573363749_Interface.__1573363749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1573363749_Interface)

  private fun as_1573363749(): ISpatialAudioFormatConfiguration.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAudioFormatConfiguration.ABI.makeISpatialAudioFormatConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAudioFormatConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAudioFormatConfiguration.ABI.makeISpatialAudioFormatConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAudioFormatConfiguration> {
    public override fun getValue() = SpatialAudioFormatConfiguration(pointer.getPointer(0))

    public fun setValue(value: SpatialAudioFormatConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAudioFormatConfiguration, MemoryAddress> {
    public val ISpatialAudioFormatConfigurationStatics_Instance:
        ISpatialAudioFormatConfigurationStatics by lazy {
      createISpatialAudioFormatConfigurationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAudioFormatConfigurationStatics():
        ISpatialAudioFormatConfigurationStatics {
      val refiid = Guid.REFIID(ISpatialAudioFormatConfigurationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.SpatialAudioFormatConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAudioFormatConfigurationStatics.ABI.makeISpatialAudioFormatConfigurationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAudioFormatConfiguration {
      val address = segment.toRawLongValue()
      return SpatialAudioFormatConfiguration(Pointer(address))
    }

    public override fun toNative(obj: SpatialAudioFormatConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ISpatialAudioFormatConfigurationStatics_Instance.GetDefault()
  }
}
