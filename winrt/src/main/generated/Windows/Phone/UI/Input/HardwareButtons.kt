package Windows.Phone.UI.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(HardwareButtons.ABI::class)
@WinRTByReference(brClass = HardwareButtons.ByReference::class)
public class HardwareButtons(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HardwareButtons> {
    public override fun getValue() = HardwareButtons(pointer.getPointer(0))

    public fun setValue(value: HardwareButtons): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HardwareButtons, MemoryAddress> {
    public val IHardwareButtonsStatics_Instance: IHardwareButtonsStatics by lazy {
      createIHardwareButtonsStatics()
    }


    public val IHardwareButtonsStatics2_Instance: IHardwareButtonsStatics2 by lazy {
      createIHardwareButtonsStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHardwareButtonsStatics(): IHardwareButtonsStatics {
      val refiid = Guid.REFIID(IHardwareButtonsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.UI.Input.HardwareButtons".toHandle(),refiid,interfacePtr)
      val result = IHardwareButtonsStatics.ABI.makeIHardwareButtonsStatics(interfacePtr.value)
      return result
    }

    public fun createIHardwareButtonsStatics2(): IHardwareButtonsStatics2 {
      val refiid = Guid.REFIID(IHardwareButtonsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.UI.Input.HardwareButtons".toHandle(),refiid,interfacePtr)
      val result = IHardwareButtonsStatics2.ABI.makeIHardwareButtonsStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HardwareButtons {
      val address = segment.toRawLongValue()
      return HardwareButtons(Pointer(address))
    }

    public override fun toNative(obj: HardwareButtons): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_BackPressed(handler: EventHandler<BackPressedEventArgs?>) =
        ABI.IHardwareButtonsStatics_Instance.add_BackPressed(handler)

    public fun remove_BackPressed(token: EventRegistrationToken) =
        ABI.IHardwareButtonsStatics_Instance.remove_BackPressed(token)

    public fun add_CameraHalfPressed(handler: EventHandler<CameraEventArgs?>) =
        ABI.IHardwareButtonsStatics2_Instance.add_CameraHalfPressed(handler)

    public fun remove_CameraHalfPressed(token: EventRegistrationToken) =
        ABI.IHardwareButtonsStatics2_Instance.remove_CameraHalfPressed(token)

    public fun add_CameraPressed(handler: EventHandler<CameraEventArgs?>) =
        ABI.IHardwareButtonsStatics2_Instance.add_CameraPressed(handler)

    public fun remove_CameraPressed(token: EventRegistrationToken) =
        ABI.IHardwareButtonsStatics2_Instance.remove_CameraPressed(token)

    public fun add_CameraReleased(handler: EventHandler<CameraEventArgs?>) =
        ABI.IHardwareButtonsStatics2_Instance.add_CameraReleased(handler)

    public fun remove_CameraReleased(token: EventRegistrationToken) =
        ABI.IHardwareButtonsStatics2_Instance.remove_CameraReleased(token)
  }
}
