package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(DisplayProperties.ABI::class)
@WinRTByReference(brClass = DisplayProperties.ByReference::class)
public class DisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayProperties> {
    public override fun getValue() = DisplayProperties(pointer.getPointer(0))

    public fun setValue(value: DisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayProperties, MemoryAddress> {
    public val IDisplayPropertiesStatics_Instance: IDisplayPropertiesStatics by lazy {
      createIDisplayPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayPropertiesStatics(): IDisplayPropertiesStatics {
      val refiid = Guid.REFIID(IDisplayPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.DisplayProperties".toHandle(),refiid,interfacePtr)
      val result = IDisplayPropertiesStatics.ABI.makeIDisplayPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayProperties {
      val address = segment.toRawLongValue()
      return DisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: DisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CurrentOrientation() =
        ABI.IDisplayPropertiesStatics_Instance.get_CurrentOrientation()

    public fun get_NativeOrientation() =
        ABI.IDisplayPropertiesStatics_Instance.get_NativeOrientation()

    public fun get_AutoRotationPreferences() =
        ABI.IDisplayPropertiesStatics_Instance.get_AutoRotationPreferences()

    public fun put_AutoRotationPreferences(value: DisplayOrientations) =
        ABI.IDisplayPropertiesStatics_Instance.put_AutoRotationPreferences(value)

    public fun add_OrientationChanged(handler: DisplayPropertiesEventHandler) =
        ABI.IDisplayPropertiesStatics_Instance.add_OrientationChanged(handler)

    public fun remove_OrientationChanged(token: EventRegistrationToken) =
        ABI.IDisplayPropertiesStatics_Instance.remove_OrientationChanged(token)

    public fun get_ResolutionScale() = ABI.IDisplayPropertiesStatics_Instance.get_ResolutionScale()

    public fun get_LogicalDpi() = ABI.IDisplayPropertiesStatics_Instance.get_LogicalDpi()

    public fun add_LogicalDpiChanged(handler: DisplayPropertiesEventHandler) =
        ABI.IDisplayPropertiesStatics_Instance.add_LogicalDpiChanged(handler)

    public fun remove_LogicalDpiChanged(token: EventRegistrationToken) =
        ABI.IDisplayPropertiesStatics_Instance.remove_LogicalDpiChanged(token)

    public fun get_StereoEnabled() = ABI.IDisplayPropertiesStatics_Instance.get_StereoEnabled()

    public fun add_StereoEnabledChanged(handler: DisplayPropertiesEventHandler) =
        ABI.IDisplayPropertiesStatics_Instance.add_StereoEnabledChanged(handler)

    public fun remove_StereoEnabledChanged(token: EventRegistrationToken) =
        ABI.IDisplayPropertiesStatics_Instance.remove_StereoEnabledChanged(token)

    public fun GetColorProfileAsync() =
        ABI.IDisplayPropertiesStatics_Instance.GetColorProfileAsync()

    public fun add_ColorProfileChanged(handler: DisplayPropertiesEventHandler) =
        ABI.IDisplayPropertiesStatics_Instance.add_ColorProfileChanged(handler)

    public fun remove_ColorProfileChanged(token: EventRegistrationToken) =
        ABI.IDisplayPropertiesStatics_Instance.remove_ColorProfileChanged(token)

    public fun add_DisplayContentsInvalidated(handler: DisplayPropertiesEventHandler) =
        ABI.IDisplayPropertiesStatics_Instance.add_DisplayContentsInvalidated(handler)

    public fun remove_DisplayContentsInvalidated(token: EventRegistrationToken) =
        ABI.IDisplayPropertiesStatics_Instance.remove_DisplayContentsInvalidated(token)
  }
}
