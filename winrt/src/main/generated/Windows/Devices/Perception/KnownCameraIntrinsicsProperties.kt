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

@ABIMarker(KnownCameraIntrinsicsProperties.ABI::class)
@WinRTByReference(brClass = KnownCameraIntrinsicsProperties.ByReference::class)
public class KnownCameraIntrinsicsProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownCameraIntrinsicsProperties> {
    public override fun getValue() = KnownCameraIntrinsicsProperties(pointer.getPointer(0))

    public fun setValue(value: KnownCameraIntrinsicsProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownCameraIntrinsicsProperties, MemoryAddress> {
    public val IKnownCameraIntrinsicsPropertiesStatics_Instance:
        IKnownCameraIntrinsicsPropertiesStatics by lazy {
      createIKnownCameraIntrinsicsPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownCameraIntrinsicsPropertiesStatics():
        IKnownCameraIntrinsicsPropertiesStatics {
      val refiid = Guid.REFIID(IKnownCameraIntrinsicsPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownCameraIntrinsicsProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownCameraIntrinsicsPropertiesStatics.ABI.makeIKnownCameraIntrinsicsPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownCameraIntrinsicsProperties {
      val address = segment.toRawLongValue()
      return KnownCameraIntrinsicsProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownCameraIntrinsicsProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FocalLength() =
        ABI.IKnownCameraIntrinsicsPropertiesStatics_Instance.get_FocalLength()

    public fun get_PrincipalPoint() =
        ABI.IKnownCameraIntrinsicsPropertiesStatics_Instance.get_PrincipalPoint()

    public fun get_RadialDistortion() =
        ABI.IKnownCameraIntrinsicsPropertiesStatics_Instance.get_RadialDistortion()

    public fun get_TangentialDistortion() =
        ABI.IKnownCameraIntrinsicsPropertiesStatics_Instance.get_TangentialDistortion()
  }
}
