package Windows.System.Profile

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

@ABIMarker(KnownRetailInfoProperties.ABI::class)
@WinRTByReference(brClass = KnownRetailInfoProperties.ByReference::class)
public class KnownRetailInfoProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownRetailInfoProperties> {
    public override fun getValue() = KnownRetailInfoProperties(pointer.getPointer(0))

    public fun setValue(value: KnownRetailInfoProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownRetailInfoProperties, MemoryAddress> {
    public val IKnownRetailInfoPropertiesStatics_Instance: IKnownRetailInfoPropertiesStatics by
        lazy {
      createIKnownRetailInfoPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownRetailInfoPropertiesStatics(): IKnownRetailInfoPropertiesStatics {
      val refiid = Guid.REFIID(IKnownRetailInfoPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.KnownRetailInfoProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownRetailInfoPropertiesStatics.ABI.makeIKnownRetailInfoPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownRetailInfoProperties {
      val address = segment.toRawLongValue()
      return KnownRetailInfoProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownRetailInfoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RetailAccessCode() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_RetailAccessCode()

    public fun get_ManufacturerName() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_ManufacturerName()

    public fun get_ModelName() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_ModelName()

    public fun get_DisplayModelName() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_DisplayModelName()

    public fun get_Price() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_Price()

    public fun get_IsFeatured() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_IsFeatured()

    public fun get_FormFactor() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_FormFactor()

    public fun get_ScreenSize() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_ScreenSize()

    public fun get_Weight() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_Weight()

    public fun get_DisplayDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_DisplayDescription()

    public fun get_BatteryLifeDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_BatteryLifeDescription()

    public fun get_ProcessorDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_ProcessorDescription()

    public fun get_Memory() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_Memory()

    public fun get_StorageDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_StorageDescription()

    public fun get_GraphicsDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_GraphicsDescription()

    public fun get_FrontCameraDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_FrontCameraDescription()

    public fun get_RearCameraDescription() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_RearCameraDescription()

    public fun get_HasNfc() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_HasNfc()

    public fun get_HasSdSlot() = ABI.IKnownRetailInfoPropertiesStatics_Instance.get_HasSdSlot()

    public fun get_HasOpticalDrive() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_HasOpticalDrive()

    public fun get_IsOfficeInstalled() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_IsOfficeInstalled()

    public fun get_WindowsEdition() =
        ABI.IKnownRetailInfoPropertiesStatics_Instance.get_WindowsEdition()
  }
}
