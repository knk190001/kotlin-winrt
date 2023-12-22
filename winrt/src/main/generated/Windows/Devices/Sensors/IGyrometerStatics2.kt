package Windows.Devices.Sensors

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

@ABIMarker(IGyrometerStatics2.ABI::class)
@Signature("{ef83f7a1-d700-4204-9613-79c6b161df4e}")
@Guid("ef83f7a1d7004204961379c6b161df4e")
@WinRTInterface("ef83f7a1d7004204961379c6b161df4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometerStatics2.ByReference::class)
public interface IGyrometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Gyrometer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGyrometerStatics2> {
    public override fun getValue() = ABI.makeIGyrometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IGyrometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometerStatics2 {
    public val __661430523_Ptr: Pointer?

    public val _661430523_VtblPtr: Pointer?
      get() = __661430523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _661430523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__661430523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Gyrometer?>? {
      val fnPtr = _661430523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Gyrometer?>>()
      val hr = fn.invokeHR(arrayOf(__661430523_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Gyrometer?>>(result.getValue())
      return resultValue
    }
  }

  public class IGyrometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661430523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef83f7a1d7004204961379c6b161df4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometerStatics2(ptr: Pointer?): WithDefault = IGyrometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIGyrometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGyrometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661430523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometerStatics2): Array<IGyrometerStatics2?> =
        (elements as
        Array<IGyrometerStatics2?>).castToImpl<IGyrometerStatics2,IGyrometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometerStatics2?> =
        arrayOfNulls<IGyrometerStatics2_Impl>(size) as Array<IGyrometerStatics2?>
  }
}
