package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(StreetsidePanorama.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.StreetsidePanorama;{6fe00fd8-ad60-4664-b539-b1069f16c5af})")
@WinRTByReference(brClass = StreetsidePanorama.ByReference::class)
public class StreetsidePanorama(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IStreetsidePanorama.WithDefault, IWinRTObject {
  private val __649068416_Interface: IStreetsidePanorama.WithDefault by lazy {
    as_649068416()
  }


  public override val __649068416_Ptr: JNAPointer? by lazy {
    __649068416_Interface.__649068416_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__649068416_Interface)

  private fun as_649068416(): IStreetsidePanorama.WithDefault {
    if(pointer == NULL) {
      return(IStreetsidePanorama.ABI.makeIStreetsidePanorama(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreetsidePanorama>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreetsidePanorama.ABI.makeIStreetsidePanorama(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreetsidePanorama> {
    public override fun getValue() = StreetsidePanorama(pointer.getPointer(0))

    public fun setValue(value: StreetsidePanorama): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreetsidePanorama, MemoryAddress> {
    public val IStreetsidePanoramaStatics_Instance: IStreetsidePanoramaStatics by lazy {
      createIStreetsidePanoramaStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStreetsidePanoramaStatics(): IStreetsidePanoramaStatics {
      val refiid = Guid.REFIID(IStreetsidePanoramaStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.StreetsidePanorama".toHandle(),refiid,interfacePtr)
      val result = IStreetsidePanoramaStatics.ABI.makeIStreetsidePanoramaStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StreetsidePanorama {
      val address = segment.toRawLongValue()
      return StreetsidePanorama(Pointer(address))
    }

    public override fun toNative(obj: StreetsidePanorama): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindNearbyAsync(location: Geopoint) =
        ABI.IStreetsidePanoramaStatics_Instance.FindNearbyAsync(location)

    public fun FindNearbyAsync(location: Geopoint, radiusInMeters: Double) =
        ABI.IStreetsidePanoramaStatics_Instance.FindNearbyAsync(location, radiusInMeters)
  }
}
