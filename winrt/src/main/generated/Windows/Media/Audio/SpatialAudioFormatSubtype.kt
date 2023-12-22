package Windows.Media.Audio

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(SpatialAudioFormatSubtype.ABI::class)
@WinRTByReference(brClass = SpatialAudioFormatSubtype.ByReference::class)
public class SpatialAudioFormatSubtype(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAudioFormatSubtype> {
    public override fun getValue() = SpatialAudioFormatSubtype(pointer.getPointer(0))

    public fun setValue(value: SpatialAudioFormatSubtype): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAudioFormatSubtype, MemoryAddress> {
    public val ISpatialAudioFormatSubtypeStatics_Instance: ISpatialAudioFormatSubtypeStatics by
        lazy {
      createISpatialAudioFormatSubtypeStatics()
    }


    public val ISpatialAudioFormatSubtypeStatics2_Instance: ISpatialAudioFormatSubtypeStatics2 by
        lazy {
      createISpatialAudioFormatSubtypeStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAudioFormatSubtypeStatics(): ISpatialAudioFormatSubtypeStatics {
      val refiid = Guid.REFIID(ISpatialAudioFormatSubtypeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.SpatialAudioFormatSubtype".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAudioFormatSubtypeStatics.ABI.makeISpatialAudioFormatSubtypeStatics(interfacePtr.value)
      return result
    }

    public fun createISpatialAudioFormatSubtypeStatics2(): ISpatialAudioFormatSubtypeStatics2 {
      val refiid = Guid.REFIID(ISpatialAudioFormatSubtypeStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.SpatialAudioFormatSubtype".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAudioFormatSubtypeStatics2.ABI.makeISpatialAudioFormatSubtypeStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAudioFormatSubtype {
      val address = segment.toRawLongValue()
      return SpatialAudioFormatSubtype(Pointer(address))
    }

    public override fun toNative(obj: SpatialAudioFormatSubtype): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_WindowsSonic() =
        ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_WindowsSonic()

    public fun get_DolbyAtmosForHeadphones() =
        ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_DolbyAtmosForHeadphones()

    public fun get_DolbyAtmosForHomeTheater() =
        ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_DolbyAtmosForHomeTheater()

    public fun get_DolbyAtmosForSpeakers() =
        ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_DolbyAtmosForSpeakers()

    public fun get_DTSHeadphoneX() =
        ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_DTSHeadphoneX()

    public fun get_DTSXUltra() = ABI.ISpatialAudioFormatSubtypeStatics_Instance.get_DTSXUltra()

    public fun get_DTSXForHomeTheater() =
        ABI.ISpatialAudioFormatSubtypeStatics2_Instance.get_DTSXForHomeTheater()
  }
}
