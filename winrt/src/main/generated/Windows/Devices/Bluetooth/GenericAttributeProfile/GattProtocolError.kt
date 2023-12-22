package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattProtocolError.ABI::class)
@WinRTByReference(brClass = GattProtocolError.ByReference::class)
public class GattProtocolError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattProtocolError> {
    public override fun getValue() = GattProtocolError(pointer.getPointer(0))

    public fun setValue(value: GattProtocolError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattProtocolError, MemoryAddress> {
    public val IGattProtocolErrorStatics_Instance: IGattProtocolErrorStatics by lazy {
      createIGattProtocolErrorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattProtocolErrorStatics(): IGattProtocolErrorStatics {
      val refiid = Guid.REFIID(IGattProtocolErrorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtocolError".toHandle(),refiid,interfacePtr)
      val result = IGattProtocolErrorStatics.ABI.makeIGattProtocolErrorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattProtocolError {
      val address = segment.toRawLongValue()
      return GattProtocolError(Pointer(address))
    }

    public override fun toNative(obj: GattProtocolError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_InvalidHandle() = ABI.IGattProtocolErrorStatics_Instance.get_InvalidHandle()

    public fun get_ReadNotPermitted() =
        ABI.IGattProtocolErrorStatics_Instance.get_ReadNotPermitted()

    public fun get_WriteNotPermitted() =
        ABI.IGattProtocolErrorStatics_Instance.get_WriteNotPermitted()

    public fun get_InvalidPdu() = ABI.IGattProtocolErrorStatics_Instance.get_InvalidPdu()

    public fun get_InsufficientAuthentication() =
        ABI.IGattProtocolErrorStatics_Instance.get_InsufficientAuthentication()

    public fun get_RequestNotSupported() =
        ABI.IGattProtocolErrorStatics_Instance.get_RequestNotSupported()

    public fun get_InvalidOffset() = ABI.IGattProtocolErrorStatics_Instance.get_InvalidOffset()

    public fun get_InsufficientAuthorization() =
        ABI.IGattProtocolErrorStatics_Instance.get_InsufficientAuthorization()

    public fun get_PrepareQueueFull() =
        ABI.IGattProtocolErrorStatics_Instance.get_PrepareQueueFull()

    public fun get_AttributeNotFound() =
        ABI.IGattProtocolErrorStatics_Instance.get_AttributeNotFound()

    public fun get_AttributeNotLong() =
        ABI.IGattProtocolErrorStatics_Instance.get_AttributeNotLong()

    public fun get_InsufficientEncryptionKeySize() =
        ABI.IGattProtocolErrorStatics_Instance.get_InsufficientEncryptionKeySize()

    public fun get_InvalidAttributeValueLength() =
        ABI.IGattProtocolErrorStatics_Instance.get_InvalidAttributeValueLength()

    public fun get_UnlikelyError() = ABI.IGattProtocolErrorStatics_Instance.get_UnlikelyError()

    public fun get_InsufficientEncryption() =
        ABI.IGattProtocolErrorStatics_Instance.get_InsufficientEncryption()

    public fun get_UnsupportedGroupType() =
        ABI.IGattProtocolErrorStatics_Instance.get_UnsupportedGroupType()

    public fun get_InsufficientResources() =
        ABI.IGattProtocolErrorStatics_Instance.get_InsufficientResources()
  }
}
