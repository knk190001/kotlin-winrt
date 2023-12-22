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

@ABIMarker(IConnectionProfile3.ABI::class)
@Signature("{578c2528-4cd9-4161-8045-201cfd5b115c}")
@Guid("578c25284cd941618045201cfd5b115c")
@WinRTInterface("578c25284cd941618045201cfd5b115c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfile3.ByReference::class)
public interface IConnectionProfile3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAttributedNetworkUsageAsync(
    startTime: DateTime?,
    endTime: DateTime?,
    states: NetworkUsageStates?
  ): IAsyncOperation<IVectorView<AttributedNetworkUsage?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfile3> {
    public override fun getValue() = ABI.makeIConnectionProfile3(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfile3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfile3 {
    public val __2102938837_Ptr: Pointer?

    public val _2102938837_VtblPtr: Pointer?
      get() = __2102938837_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAttributedNetworkUsageAsync(
      startTime: DateTime?,
      endTime: DateTime?,
      states: NetworkUsageStates?
    ): IAsyncOperation<IVectorView<AttributedNetworkUsage?>?>? {
      val fnPtr = _2102938837_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AttributedNetworkUsage?>?>>()
      val hr = fn.invokeHR(arrayOf(__2102938837_Ptr, marshalToNative(startTime),
          marshalToNative(endTime), marshalToNative(states), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AttributedNetworkUsage?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfile3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2102938837_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfile3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("578c25284cd941618045201cfd5b115c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfile3(ptr: Pointer?): WithDefault = IConnectionProfile3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfile3 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfile3(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfile3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102938837_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfile3): Array<IConnectionProfile3?> =
        (elements as
        Array<IConnectionProfile3?>).castToImpl<IConnectionProfile3,IConnectionProfile3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfile3?> =
        arrayOfNulls<IConnectionProfile3_Impl>(size) as Array<IConnectionProfile3?>
  }
}
