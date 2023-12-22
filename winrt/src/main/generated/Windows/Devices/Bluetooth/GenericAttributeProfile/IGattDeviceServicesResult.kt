package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattDeviceServicesResult.ABI::class)
@Signature("{171dd3ee-016d-419d-838a-576cf475a3d8}")
@Guid("171dd3ee016d419d838a576cf475a3d8")
@WinRTInterface("171dd3ee016d419d838a576cf475a3d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceServicesResult.ByReference::class)
public interface IGattDeviceServicesResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GattCommunicationStatus?

  @InterfaceMethod(1)
  public fun get_ProtocolError(): IReference<Byte>?

  @InterfaceMethod(2)
  public fun get_Services(): IVectorView<GattDeviceService?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceServicesResult> {
    public override fun getValue() = ABI.makeIGattDeviceServicesResult(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceServicesResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceServicesResult {
    public val __2096746316_Ptr: Pointer?

    public val _2096746316_VtblPtr: Pointer?
      get() = __2096746316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GattCommunicationStatus? {
      val fnPtr = _2096746316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCommunicationStatus>()
      val hr = fn.invokeHR(arrayOf(__2096746316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCommunicationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtocolError(): IReference<Byte>? {
      val fnPtr = _2096746316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__2096746316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Services(): IVectorView<GattDeviceService?>? {
      val fnPtr = _2096746316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__2096746316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDeviceService?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDeviceServicesResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2096746316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceServicesResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("171dd3ee016d419d838a576cf475a3d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceServicesResult(ptr: Pointer?): WithDefault =
        IGattDeviceServicesResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceServicesResult {
      val address = segment.toRawLongValue()
      return makeIGattDeviceServicesResult(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceServicesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2096746316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceServicesResult):
        Array<IGattDeviceServicesResult?> = (elements as
        Array<IGattDeviceServicesResult?>).castToImpl<IGattDeviceServicesResult,IGattDeviceServicesResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceServicesResult?> =
        arrayOfNulls<IGattDeviceServicesResult_Impl>(size) as Array<IGattDeviceServicesResult?>
  }
}
