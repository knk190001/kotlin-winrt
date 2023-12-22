package Windows.Devices.Perception

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

@ABIMarker(KnownPerceptionVideoProfileProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionVideoProfileProperties.ByReference::class)
public class KnownPerceptionVideoProfileProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionVideoProfileProperties> {
    public override fun getValue() = KnownPerceptionVideoProfileProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionVideoProfileProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionVideoProfileProperties, MemoryAddress> {
    public val IKnownPerceptionVideoProfilePropertiesStatics_Instance:
        IKnownPerceptionVideoProfilePropertiesStatics by lazy {
      createIKnownPerceptionVideoProfilePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionVideoProfilePropertiesStatics():
        IKnownPerceptionVideoProfilePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionVideoProfilePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionVideoProfilePropertiesStatics.ABI.makeIKnownPerceptionVideoProfilePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownPerceptionVideoProfileProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionVideoProfileProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionVideoProfileProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BitmapPixelFormat() =
        ABI.IKnownPerceptionVideoProfilePropertiesStatics_Instance.get_BitmapPixelFormat()

    public fun get_BitmapAlphaMode() =
        ABI.IKnownPerceptionVideoProfilePropertiesStatics_Instance.get_BitmapAlphaMode()

    public fun get_Width() = ABI.IKnownPerceptionVideoProfilePropertiesStatics_Instance.get_Width()

    public fun get_Height() =
        ABI.IKnownPerceptionVideoProfilePropertiesStatics_Instance.get_Height()

    public fun get_FrameDuration() =
        ABI.IKnownPerceptionVideoProfilePropertiesStatics_Instance.get_FrameDuration()
  }
}
