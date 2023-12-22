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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandNetwork3.ABI::class)
@Signature("{33670a8a-c7ef-444c-ab6c-df7ef7a390fe}")
@Guid("33670a8ac7ef444cab6cdf7ef7a390fe")
@WinRTInterface("33670a8ac7ef444cab6cdf7ef7a390fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandNetwork3.ByReference::class)
public interface IMobileBroadbandNetwork3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCellsInfoAsync(): IAsyncOperation<MobileBroadbandCellsInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandNetwork3> {
    public override fun getValue() = ABI.makeIMobileBroadbandNetwork3(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandNetwork3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandNetwork3 {
    public val __342739457_Ptr: Pointer?

    public val _342739457_VtblPtr: Pointer?
      get() = __342739457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCellsInfoAsync(): IAsyncOperation<MobileBroadbandCellsInfo?>? {
      val fnPtr = _342739457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandCellsInfo?>>()
      val hr = fn.invokeHR(arrayOf(__342739457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandCellsInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandNetwork3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __342739457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandNetwork3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33670a8ac7ef444cab6cdf7ef7a390fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandNetwork3(ptr: Pointer?): WithDefault =
        IMobileBroadbandNetwork3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandNetwork3 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandNetwork3(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandNetwork3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__342739457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandNetwork3):
        Array<IMobileBroadbandNetwork3?> = (elements as
        Array<IMobileBroadbandNetwork3?>).castToImpl<IMobileBroadbandNetwork3,IMobileBroadbandNetwork3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandNetwork3?> =
        arrayOfNulls<IMobileBroadbandNetwork3_Impl>(size) as Array<IMobileBroadbandNetwork3?>
  }
}
