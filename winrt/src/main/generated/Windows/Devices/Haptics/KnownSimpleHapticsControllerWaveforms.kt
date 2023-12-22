package Windows.Devices.Haptics

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

@ABIMarker(KnownSimpleHapticsControllerWaveforms.ABI::class)
@WinRTByReference(brClass = KnownSimpleHapticsControllerWaveforms.ByReference::class)
public class KnownSimpleHapticsControllerWaveforms(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownSimpleHapticsControllerWaveforms> {
    public override fun getValue() = KnownSimpleHapticsControllerWaveforms(pointer.getPointer(0))

    public fun setValue(value: KnownSimpleHapticsControllerWaveforms): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownSimpleHapticsControllerWaveforms, MemoryAddress> {
    public val IKnownSimpleHapticsControllerWaveformsStatics_Instance:
        IKnownSimpleHapticsControllerWaveformsStatics by lazy {
      createIKnownSimpleHapticsControllerWaveformsStatics()
    }


    public val IKnownSimpleHapticsControllerWaveformsStatics2_Instance:
        IKnownSimpleHapticsControllerWaveformsStatics2 by lazy {
      createIKnownSimpleHapticsControllerWaveformsStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownSimpleHapticsControllerWaveformsStatics():
        IKnownSimpleHapticsControllerWaveformsStatics {
      val refiid = Guid.REFIID(IKnownSimpleHapticsControllerWaveformsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Haptics.KnownSimpleHapticsControllerWaveforms".toHandle(),refiid,interfacePtr)
      val result =
          IKnownSimpleHapticsControllerWaveformsStatics.ABI.makeIKnownSimpleHapticsControllerWaveformsStatics(interfacePtr.value)
      return result
    }

    public fun createIKnownSimpleHapticsControllerWaveformsStatics2():
        IKnownSimpleHapticsControllerWaveformsStatics2 {
      val refiid = Guid.REFIID(IKnownSimpleHapticsControllerWaveformsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Haptics.KnownSimpleHapticsControllerWaveforms".toHandle(),refiid,interfacePtr)
      val result =
          IKnownSimpleHapticsControllerWaveformsStatics2.ABI.makeIKnownSimpleHapticsControllerWaveformsStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownSimpleHapticsControllerWaveforms {
      val address = segment.toRawLongValue()
      return KnownSimpleHapticsControllerWaveforms(Pointer(address))
    }

    public override fun toNative(obj: KnownSimpleHapticsControllerWaveforms): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Click() = ABI.IKnownSimpleHapticsControllerWaveformsStatics_Instance.get_Click()

    public fun get_BuzzContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics_Instance.get_BuzzContinuous()

    public fun get_RumbleContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics_Instance.get_RumbleContinuous()

    public fun get_Press() = ABI.IKnownSimpleHapticsControllerWaveformsStatics_Instance.get_Press()

    public fun get_Release() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics_Instance.get_Release()

    public fun get_BrushContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_BrushContinuous()

    public fun get_ChiselMarkerContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_ChiselMarkerContinuous()

    public fun get_EraserContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_EraserContinuous()

    public fun get_Error() = ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_Error()

    public fun get_GalaxyPenContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_GalaxyPenContinuous()

    public fun get_Hover() = ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_Hover()

    public fun get_InkContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_InkContinuous()

    public fun get_MarkerContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_MarkerContinuous()

    public fun get_PencilContinuous() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_PencilContinuous()

    public fun get_Success() =
        ABI.IKnownSimpleHapticsControllerWaveformsStatics2_Instance.get_Success()
  }
}
