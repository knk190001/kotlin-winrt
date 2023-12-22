package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceInformationStatics.ABI::class)
@Signature("{c17f100e-3a46-4a78-8013-769dc9b97390}")
@Guid("c17f100e3a464a788013769dc9b97390")
@WinRTInterface("c17f100e3a464a788013769dc9b97390")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationStatics.ByReference::class)
public interface IDeviceInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromIdAsync(deviceId: String?): IAsyncOperation<DeviceInformation?>?

  @InterfaceMethod(1)
  public fun CreateFromIdAsync(deviceId: String?, additionalProperties: IIterable<String?>?):
      IAsyncOperation<DeviceInformation?>?

  @InterfaceMethod(2)
  public fun FindAllAsync(): IAsyncOperation<DeviceInformationCollection?>?

  @InterfaceMethod(3)
  public fun FindAllAsync(deviceClass: DeviceClass?): IAsyncOperation<DeviceInformationCollection?>?

  @InterfaceMethod(4)
  public fun FindAllAsync(aqsFilter: String?): IAsyncOperation<DeviceInformationCollection?>?

  @InterfaceMethod(5)
  public fun FindAllAsync(aqsFilter: String?, additionalProperties: IIterable<String?>?):
      IAsyncOperation<DeviceInformationCollection?>?

  @InterfaceMethod(6)
  public fun CreateWatcher(): DeviceWatcher?

  @InterfaceMethod(7)
  public fun CreateWatcher(deviceClass: DeviceClass?): DeviceWatcher?

  @InterfaceMethod(8)
  public fun CreateWatcher(aqsFilter: String?): DeviceWatcher?

  @InterfaceMethod(9)
  public fun CreateWatcher(aqsFilter: String?, additionalProperties: IIterable<String?>?):
      DeviceWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationStatics> {
    public override fun getValue() = ABI.makeIDeviceInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationStatics {
    public val __1411950771_Ptr: Pointer?

    public val _1411950771_VtblPtr: Pointer?
      get() = __1411950771_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromIdAsync(deviceId: String?): IAsyncOperation<DeviceInformation?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromIdAsync(deviceId: String?,
        additionalProperties: IIterable<String?>?): IAsyncOperation<DeviceInformation?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(deviceId),
          marshalToNative(additionalProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAllAsync(): IAsyncOperation<DeviceInformationCollection?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformationCollection?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceInformationCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAllAsync(deviceClass: DeviceClass?):
        IAsyncOperation<DeviceInformationCollection?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformationCollection?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(deviceClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceInformationCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindAllAsync(aqsFilter: String?):
        IAsyncOperation<DeviceInformationCollection?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformationCollection?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(aqsFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceInformationCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindAllAsync(aqsFilter: String?, additionalProperties: IIterable<String?>?):
        IAsyncOperation<DeviceInformationCollection?>? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformationCollection?>>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(aqsFilter),
          marshalToNative(additionalProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceInformationCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateWatcher(): DeviceWatcher? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateWatcher(deviceClass: DeviceClass?): DeviceWatcher? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(deviceClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateWatcher(aqsFilter: String?): DeviceWatcher? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(aqsFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateWatcher(aqsFilter: String?,
        additionalProperties: IIterable<String?>?): DeviceWatcher? {
      val fnPtr = _1411950771_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1411950771_Ptr, marshalToNative(aqsFilter),
          marshalToNative(additionalProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1411950771_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c17f100e3a464a788013769dc9b97390")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationStatics(ptr: Pointer?): WithDefault =
        IDeviceInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationStatics {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1411950771_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationStatics):
        Array<IDeviceInformationStatics?> = (elements as
        Array<IDeviceInformationStatics?>).castToImpl<IDeviceInformationStatics,IDeviceInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationStatics?> =
        arrayOfNulls<IDeviceInformationStatics_Impl>(size) as Array<IDeviceInformationStatics?>
  }
}
