package Windows.Devices.Lights

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

@ABIMarker(ILampStatics.ABI::class)
@Signature("{a822416c-8885-401e-b821-8e8b38a8e8ec}")
@Guid("a822416c8885401eb8218e8b38a8e8ec")
@WinRTInterface("a822416c8885401eb8218e8b38a8e8ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampStatics.ByReference::class)
public interface ILampStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Lamp?>?

  @InterfaceMethod(2)
  public fun GetDefaultAsync(): IAsyncOperation<Lamp?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILampStatics> {
    public override fun getValue() = ABI.makeILampStatics(pointer.getPointer(0))

    public fun setValue(value: ILampStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampStatics {
    public val __184947523_Ptr: Pointer?

    public val _184947523_VtblPtr: Pointer?
      get() = __184947523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _184947523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184947523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Lamp?>? {
      val fnPtr = _184947523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Lamp?>>()
      val hr = fn.invokeHR(arrayOf(__184947523_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Lamp?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDefaultAsync(): IAsyncOperation<Lamp?>? {
      val fnPtr = _184947523_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Lamp?>>()
      val hr = fn.invokeHR(arrayOf(__184947523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Lamp?>>(result.getValue())
      return resultValue
    }
  }

  public class ILampStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184947523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a822416c8885401eb8218e8b38a8e8ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampStatics(ptr: Pointer?): WithDefault = ILampStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampStatics {
      val address = segment.toRawLongValue()
      return makeILampStatics(Pointer(address))
    }

    public override fun toNative(obj: ILampStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__184947523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampStatics): Array<ILampStatics?> = (elements as
        Array<ILampStatics?>).castToImpl<ILampStatics,ILampStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampStatics?> =
        arrayOfNulls<ILampStatics_Impl>(size) as Array<ILampStatics?>
  }
}
