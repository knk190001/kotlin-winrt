package Windows.Networking.NetworkOperators

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandModem2.ABI::class)
@Signature("{12862b28-b9eb-4ee2-bbe3-711f53eea373}")
@Guid("12862b28b9eb4ee2bbe3711f53eea373")
@WinRTInterface("12862b28b9eb4ee2bbe3711f53eea373")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModem2.ByReference::class)
public interface IMobileBroadbandModem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetIsPassthroughEnabledAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun SetIsPassthroughEnabledAsync(value: Boolean):
      IAsyncOperation<MobileBroadbandModemStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModem2> {
    public override fun getValue() = ABI.makeIMobileBroadbandModem2(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModem2 {
    public val __1123440764_Ptr: Pointer?

    public val _1123440764_VtblPtr: Pointer?
      get() = __1123440764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetIsPassthroughEnabledAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1123440764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1123440764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetIsPassthroughEnabledAsync(value: Boolean):
        IAsyncOperation<MobileBroadbandModemStatus?>? {
      val fnPtr = _1123440764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandModemStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1123440764_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandModemStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1123440764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12862b28b9eb4ee2bbe3711f53eea373")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModem2(ptr: Pointer?): WithDefault =
        IMobileBroadbandModem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModem2 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModem2(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1123440764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModem2): Array<IMobileBroadbandModem2?> =
        (elements as
        Array<IMobileBroadbandModem2?>).castToImpl<IMobileBroadbandModem2,IMobileBroadbandModem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModem2?> =
        arrayOfNulls<IMobileBroadbandModem2_Impl>(size) as Array<IMobileBroadbandModem2?>
  }
}
