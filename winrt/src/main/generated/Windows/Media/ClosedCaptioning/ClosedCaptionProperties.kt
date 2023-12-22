package Windows.Media.ClosedCaptioning

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

@ABIMarker(ClosedCaptionProperties.ABI::class)
@WinRTByReference(brClass = ClosedCaptionProperties.ByReference::class)
public class ClosedCaptionProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClosedCaptionProperties> {
    public override fun getValue() = ClosedCaptionProperties(pointer.getPointer(0))

    public fun setValue(value: ClosedCaptionProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClosedCaptionProperties, MemoryAddress> {
    public val IClosedCaptionPropertiesStatics_Instance: IClosedCaptionPropertiesStatics by lazy {
      createIClosedCaptionPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIClosedCaptionPropertiesStatics(): IClosedCaptionPropertiesStatics {
      val refiid = Guid.REFIID(IClosedCaptionPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.ClosedCaptioning.ClosedCaptionProperties".toHandle(),refiid,interfacePtr)
      val result =
          IClosedCaptionPropertiesStatics.ABI.makeIClosedCaptionPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ClosedCaptionProperties {
      val address = segment.toRawLongValue()
      return ClosedCaptionProperties(Pointer(address))
    }

    public override fun toNative(obj: ClosedCaptionProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FontColor() = ABI.IClosedCaptionPropertiesStatics_Instance.get_FontColor()

    public fun get_ComputedFontColor() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_ComputedFontColor()

    public fun get_FontOpacity() = ABI.IClosedCaptionPropertiesStatics_Instance.get_FontOpacity()

    public fun get_FontSize() = ABI.IClosedCaptionPropertiesStatics_Instance.get_FontSize()

    public fun get_FontStyle() = ABI.IClosedCaptionPropertiesStatics_Instance.get_FontStyle()

    public fun get_FontEffect() = ABI.IClosedCaptionPropertiesStatics_Instance.get_FontEffect()

    public fun get_BackgroundColor() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_BackgroundColor()

    public fun get_ComputedBackgroundColor() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_ComputedBackgroundColor()

    public fun get_BackgroundOpacity() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_BackgroundOpacity()

    public fun get_RegionColor() = ABI.IClosedCaptionPropertiesStatics_Instance.get_RegionColor()

    public fun get_ComputedRegionColor() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_ComputedRegionColor()

    public fun get_RegionOpacity() =
        ABI.IClosedCaptionPropertiesStatics_Instance.get_RegionOpacity()
  }
}
