package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IGattLocalService.ABI::class)
@Signature("{f513e258-f7f7-4902-b803-57fcc7d6fe83}")
@Guid("f513e258f7f74902b80357fcc7d6fe83")
@WinRTInterface("f513e258f7f74902b80357fcc7d6fe83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalService.ByReference::class)
public interface IGattLocalService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun CreateCharacteristicAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?,
      parameters: GattLocalCharacteristicParameters?):
      IAsyncOperation<GattLocalCharacteristicResult?>?

  @InterfaceMethod(2)
  public fun get_Characteristics(): IVectorView<GattLocalCharacteristic?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalService> {
    public override fun getValue() = ABI.makeIGattLocalService(pointer.getPointer(0))

    public fun setValue(value: IGattLocalService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalService {
    public val __255260933_Ptr: Pointer?

    public val _255260933_VtblPtr: Pointer?
      get() = __255260933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _255260933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__255260933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun CreateCharacteristicAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?,
        parameters: GattLocalCharacteristicParameters?):
        IAsyncOperation<GattLocalCharacteristicResult?>? {
      val fnPtr = _255260933_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattLocalCharacteristicResult?>>()
      val hr = fn.invokeHR(arrayOf(__255260933_Ptr, marshalToNative(characteristicUuid),
          marshalToNative(parameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattLocalCharacteristicResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Characteristics(): IVectorView<GattLocalCharacteristic?>? {
      val fnPtr = _255260933_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattLocalCharacteristic?>>()
      val hr = fn.invokeHR(arrayOf(__255260933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattLocalCharacteristic?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __255260933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f513e258f7f74902b80357fcc7d6fe83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalService(ptr: Pointer?): WithDefault = IGattLocalService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalService {
      val address = segment.toRawLongValue()
      return makeIGattLocalService(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__255260933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalService): Array<IGattLocalService?> = (elements
        as Array<IGattLocalService?>).castToImpl<IGattLocalService,IGattLocalService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalService?> =
        arrayOfNulls<IGattLocalService_Impl>(size) as Array<IGattLocalService?>
  }
}
