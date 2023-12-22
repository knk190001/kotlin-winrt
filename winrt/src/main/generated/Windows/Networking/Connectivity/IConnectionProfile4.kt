package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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

@ABIMarker(IConnectionProfile4.ABI::class)
@Signature("{7a2d42cd-81e0-4ae6-abed-ab9ca13eb714}")
@Guid("7a2d42cd81e04ae6abedab9ca13eb714")
@WinRTInterface("7a2d42cd81e04ae6abedab9ca13eb714")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfile4.ByReference::class)
public interface IConnectionProfile4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetProviderNetworkUsageAsync(
    startTime: DateTime?,
    endTime: DateTime?,
    states: NetworkUsageStates?
  ): IAsyncOperation<IVectorView<ProviderNetworkUsage?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfile4> {
    public override fun getValue() = ABI.makeIConnectionProfile4(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfile4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfile4 {
    public val __2102938836_Ptr: Pointer?

    public val _2102938836_VtblPtr: Pointer?
      get() = __2102938836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetProviderNetworkUsageAsync(
      startTime: DateTime?,
      endTime: DateTime?,
      states: NetworkUsageStates?
    ): IAsyncOperation<IVectorView<ProviderNetworkUsage?>?>? {
      val fnPtr = _2102938836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ProviderNetworkUsage?>?>>()
      val hr = fn.invokeHR(arrayOf(__2102938836_Ptr, marshalToNative(startTime),
          marshalToNative(endTime), marshalToNative(states), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ProviderNetworkUsage?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfile4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2102938836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfile4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a2d42cd81e04ae6abedab9ca13eb714")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfile4(ptr: Pointer?): WithDefault = IConnectionProfile4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfile4 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfile4(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfile4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102938836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfile4): Array<IConnectionProfile4?> =
        (elements as
        Array<IConnectionProfile4?>).castToImpl<IConnectionProfile4,IConnectionProfile4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfile4?> =
        arrayOfNulls<IConnectionProfile4_Impl>(size) as Array<IConnectionProfile4?>
  }
}
