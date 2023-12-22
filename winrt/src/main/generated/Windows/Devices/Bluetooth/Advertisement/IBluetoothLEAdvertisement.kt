package Windows.Devices.Bluetooth.Advertisement

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisement.ABI::class)
@Signature("{066fb2b7-33d1-4e7d-8367-cf81d0f79653}")
@Guid("066fb2b733d14e7d8367cf81d0f79653")
@WinRTInterface("066fb2b733d14e7d8367cf81d0f79653")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisement.ByReference::class)
public interface IBluetoothLEAdvertisement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flags(): IReference<BluetoothLEAdvertisementFlags?>?

  @InterfaceMethod(1)
  public fun put_Flags(value: IReference<BluetoothLEAdvertisementFlags?>?): Unit

  @InterfaceMethod(2)
  public fun get_LocalName(): String?

  @InterfaceMethod(3)
  public fun put_LocalName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ServiceUuids(): IVector<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(5)
  public fun get_ManufacturerData(): IVector<BluetoothLEManufacturerData?>?

  @InterfaceMethod(6)
  public fun get_DataSections(): IVector<BluetoothLEAdvertisementDataSection?>?

  @InterfaceMethod(7)
  public fun GetManufacturerDataByCompanyId(companyId: WinDef.USHORT):
      IVectorView<BluetoothLEManufacturerData?>?

  @InterfaceMethod(8)
  public fun GetSectionsByType(type: Byte): IVectorView<BluetoothLEAdvertisementDataSection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisement> {
    public override fun getValue() = ABI.makeIBluetoothLEAdvertisement(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisement {
    public val __1265676962_Ptr: Pointer?

    public val _1265676962_VtblPtr: Pointer?
      get() = __1265676962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flags(): IReference<BluetoothLEAdvertisementFlags?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<BluetoothLEAdvertisementFlags?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<BluetoothLEAdvertisementFlags?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Flags(value: IReference<BluetoothLEAdvertisementFlags?>?): Unit {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LocalName(): String? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LocalName(value: String?): Unit {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ServiceUuids(): IVector<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ManufacturerData(): IVector<BluetoothLEManufacturerData?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<BluetoothLEManufacturerData?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<BluetoothLEManufacturerData?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DataSections(): IVector<BluetoothLEAdvertisementDataSection?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<BluetoothLEAdvertisementDataSection?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<BluetoothLEAdvertisementDataSection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetManufacturerDataByCompanyId(companyId: WinDef.USHORT):
        IVectorView<BluetoothLEManufacturerData?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BluetoothLEManufacturerData?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr, companyId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<BluetoothLEManufacturerData?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetSectionsByType(type: Byte):
        IVectorView<BluetoothLEAdvertisementDataSection?>? {
      val fnPtr = _1265676962_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BluetoothLEAdvertisementDataSection?>>()
      val hr = fn.invokeHR(arrayOf(__1265676962_Ptr, type, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<BluetoothLEAdvertisementDataSection?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1265676962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("066fb2b733d14e7d8367cf81d0f79653")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisement(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisement {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisement(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265676962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisement):
        Array<IBluetoothLEAdvertisement?> = (elements as
        Array<IBluetoothLEAdvertisement?>).castToImpl<IBluetoothLEAdvertisement,IBluetoothLEAdvertisement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisement?> =
        arrayOfNulls<IBluetoothLEAdvertisement_Impl>(size) as Array<IBluetoothLEAdvertisement?>
  }
}
