package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattCharacteristicNotificationTrigger.ABI::class)
@Signature("{e25f8fc8-0696-474f-a732-f292b0cebc5d}")
@Guid("e25f8fc80696474fa732f292b0cebc5d")
@WinRTInterface("e25f8fc80696474fa732f292b0cebc5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTrigger.ByReference::class)
public interface IGattCharacteristicNotificationTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_Characteristic(): GattCharacteristic?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTrigger> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTrigger,
      IBackgroundTrigger.WithDefault {
    public val __707103655_Ptr: Pointer?

    public val _707103655_VtblPtr: Pointer?
      get() = __707103655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Characteristic(): GattCharacteristic? {
      val fnPtr = _707103655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristic>()
      val hr = fn.invokeHR(arrayOf(__707103655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristic>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_707103655_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __707103655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e25f8fc80696474fa732f292b0cebc5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTrigger(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristicNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__707103655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTrigger):
        Array<IGattCharacteristicNotificationTrigger?> = (elements as
        Array<IGattCharacteristicNotificationTrigger?>).castToImpl<IGattCharacteristicNotificationTrigger,IGattCharacteristicNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTrigger?> =
        arrayOfNulls<IGattCharacteristicNotificationTrigger_Impl>(size) as
        Array<IGattCharacteristicNotificationTrigger?>
  }
}
