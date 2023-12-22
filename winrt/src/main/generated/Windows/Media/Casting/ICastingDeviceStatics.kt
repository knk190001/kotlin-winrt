package Windows.Media.Casting

import Windows.Devices.Enumeration.DeviceInformation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICastingDeviceStatics.ABI::class)
@Signature("{e7d958d7-4d13-4237-a365-4c4f6a4cfd2f}")
@Guid("e7d958d74d134237a3654c4f6a4cfd2f")
@WinRTInterface("e7d958d74d134237a3654c4f6a4cfd2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICastingDeviceStatics.ByReference::class)
public interface ICastingDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(type: CastingPlaybackTypes?): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorFromCastingSourceAsync(castingSource: CastingSource?):
      IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun FromIdAsync(value: String?): IAsyncOperation<CastingDevice?>?

  @InterfaceMethod(3)
  public fun DeviceInfoSupportsCastingAsync(device: DeviceInformation?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICastingDeviceStatics> {
    public override fun getValue() = ABI.makeICastingDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: ICastingDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICastingDeviceStatics {
    public val __46448633_Ptr: Pointer?

    public val _46448633_VtblPtr: Pointer?
      get() = __46448633_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(type: CastingPlaybackTypes?): String? {
      val fnPtr = _46448633_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__46448633_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelectorFromCastingSourceAsync(castingSource: CastingSource?):
        IAsyncOperation<String?>? {
      val fnPtr = _46448633_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__46448633_Ptr, marshalToNative(castingSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(value: String?): IAsyncOperation<CastingDevice?>? {
      val fnPtr = _46448633_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CastingDevice?>>()
      val hr = fn.invokeHR(arrayOf(__46448633_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CastingDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DeviceInfoSupportsCastingAsync(device: DeviceInformation?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _46448633_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__46448633_Ptr, marshalToNative(device), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ICastingDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __46448633_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICastingDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7d958d74d134237a3654c4f6a4cfd2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICastingDeviceStatics(ptr: Pointer?): WithDefault =
        ICastingDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICastingDeviceStatics {
      val address = segment.toRawLongValue()
      return makeICastingDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: ICastingDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__46448633_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICastingDeviceStatics): Array<ICastingDeviceStatics?> =
        (elements as
        Array<ICastingDeviceStatics?>).castToImpl<ICastingDeviceStatics,ICastingDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICastingDeviceStatics?> =
        arrayOfNulls<ICastingDeviceStatics_Impl>(size) as Array<ICastingDeviceStatics?>
  }
}
