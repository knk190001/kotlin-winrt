package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IStreetsideExperienceFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StreetsideExperience.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.StreetsideExperience;{a558aec9-e30c-46c8-8116-484691675558})")
@WinRTByReference(brClass = StreetsideExperience.ByReference::class)
public class StreetsideExperience(
  ptr: JNAPointer? = NULL
) : MapCustomExperience(ptr), IStreetsideExperience.WithDefault, IWinRTObject {
  private val __857891915_Interface: IStreetsideExperience.WithDefault by lazy {
    as_857891915()
  }


  public override val __857891915_Ptr: JNAPointer? by lazy {
    __857891915_Interface.__857891915_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__857891915_Interface)

  public constructor(panorama: StreetsidePanorama) : this(ABI.activate(panorama))

  public constructor(
    panorama: StreetsidePanorama,
    headingInDegrees: Double,
    pitchInDegrees: Double,
    fieldOfViewInDegrees: Double
  ) : this(ABI.activate(panorama, headingInDegrees, pitchInDegrees, fieldOfViewInDegrees))

  private fun as_857891915(): IStreetsideExperience.WithDefault {
    if(pointer == NULL) {
      return(IStreetsideExperience.ABI.makeIStreetsideExperience(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreetsideExperience>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreetsideExperience.ABI.makeIStreetsideExperience(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreetsideExperience> {
    public override fun getValue() = StreetsideExperience(pointer.getPointer(0))

    public fun setValue(value: StreetsideExperience): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreetsideExperience, MemoryAddress> {
    public val IStreetsideExperienceFactory_Instance: IStreetsideExperienceFactory by lazy {
      createIStreetsideExperienceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStreetsideExperienceFactory(): IStreetsideExperienceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.StreetsideExperience".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStreetsideExperienceFactory.ABI.makeIStreetsideExperienceFactory(factoryActivatorPtr.value))
    }

    public fun activate(panorama: StreetsidePanorama): JNAPointer? =
        IStreetsideExperienceFactory_Instance.CreateInstanceWithPanorama(panorama)?.pointer

    public fun activate(
      panorama: StreetsidePanorama,
      headingInDegrees: Double,
      pitchInDegrees: Double,
      fieldOfViewInDegrees: Double
    ): JNAPointer? =
        IStreetsideExperienceFactory_Instance.CreateInstanceWithPanoramaHeadingPitchAndFieldOfView(panorama,
        headingInDegrees, pitchInDegrees, fieldOfViewInDegrees)?.pointer

    public override fun fromNative(segment: MemoryAddress): StreetsideExperience {
      val address = segment.toRawLongValue()
      return StreetsideExperience(Pointer(address))
    }

    public override fun toNative(obj: StreetsideExperience): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
