package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothLEDevice
import Windows.Devices.Bluetooth.GenericAttributeProfile.IGattDeviceService.ABI.IID
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IClosable
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

@ABIMarker(IGattDeviceService2.ABI::class)
@Signature("{fc54520b-0b0d-4708-bae0-9ffd9489bc59}")
@Guid("fc54520b0b0d4708bae09ffd9489bc59")
@WinRTInterface("fc54520b0b0d4708bae09ffd9489bc59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceService2.ByReference::class)
public interface IGattDeviceService2 : NativeMapped, IWinRTInterface, IGattDeviceService, IClosable
    {
  @InterfaceMethod(0)
  public fun get_Device(): BluetoothLEDevice?

  @InterfaceMethod(1)
  public fun get_ParentServices(): IVectorView<GattDeviceService?>?

  @InterfaceMethod(2)
  public fun GetAllCharacteristics(): IVectorView<GattCharacteristic?>?

  @InterfaceMethod(3)
  public fun GetAllIncludedServices(): IVectorView<GattDeviceService?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceService2> {
    public override fun getValue() = ABI.makeIGattDeviceService2(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceService2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceService2, IGattDeviceService.WithDefault,
      IClosable.WithDefault {
    public val __918531570_Ptr: Pointer?

    public val _918531570_VtblPtr: Pointer?
      get() = __918531570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Device(): BluetoothLEDevice? {
      val fnPtr = _918531570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEDevice>()
      val hr = fn.invokeHR(arrayOf(__918531570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParentServices(): IVectorView<GattDeviceService?>? {
      val fnPtr = _918531570_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__918531570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAllCharacteristics(): IVectorView<GattCharacteristic?>? {
      val fnPtr = _918531570_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattCharacteristic?>>()
      val hr = fn.invokeHR(arrayOf(__918531570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattCharacteristic?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAllIncludedServices(): IVectorView<GattDeviceService?>? {
      val fnPtr = _918531570_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__918531570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDeviceService?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDeviceService2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGattDeviceService, IClosable {
    public override val __247464612_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_918531570_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_918531570_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __918531570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceService2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc54520b0b0d4708bae09ffd9489bc59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceService2(ptr: Pointer?): WithDefault = IGattDeviceService2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceService2 {
      val address = segment.toRawLongValue()
      return makeIGattDeviceService2(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceService2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918531570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceService2): Array<IGattDeviceService2?> =
        (elements as
        Array<IGattDeviceService2?>).castToImpl<IGattDeviceService2,IGattDeviceService2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceService2?> =
        arrayOfNulls<IGattDeviceService2_Impl>(size) as Array<IGattDeviceService2?>
  }
}
