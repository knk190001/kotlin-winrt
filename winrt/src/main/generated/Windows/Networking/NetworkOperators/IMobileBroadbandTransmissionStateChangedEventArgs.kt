package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandTransmissionStateChangedEventArgs.ABI::class)
@Signature("{612e3875-040a-4f99-a4f9-61d7c32da129}")
@Guid("612e3875040a4f99a4f961d7c32da129")
@WinRTInterface("612e3875040a4f99a4f961d7c32da129")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandTransmissionStateChangedEventArgs.ByReference::class)
public interface IMobileBroadbandTransmissionStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTransmitting(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandTransmissionStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandTransmissionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandTransmissionStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandTransmissionStateChangedEventArgs {
    public val __2045045428_Ptr: Pointer?

    public val _2045045428_VtblPtr: Pointer?
      get() = __2045045428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTransmitting(): Boolean {
      val fnPtr = _2045045428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2045045428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMobileBroadbandTransmissionStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2045045428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandTransmissionStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("612e3875040a4f99a4f961d7c32da129")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandTransmissionStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandTransmissionStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandTransmissionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandTransmissionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandTransmissionStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2045045428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandTransmissionStateChangedEventArgs):
        Array<IMobileBroadbandTransmissionStateChangedEventArgs?> = (elements as
        Array<IMobileBroadbandTransmissionStateChangedEventArgs?>).castToImpl<IMobileBroadbandTransmissionStateChangedEventArgs,IMobileBroadbandTransmissionStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMobileBroadbandTransmissionStateChangedEventArgs?> =
        arrayOfNulls<IMobileBroadbandTransmissionStateChangedEventArgs_Impl>(size) as
        Array<IMobileBroadbandTransmissionStateChangedEventArgs?>
  }
}
