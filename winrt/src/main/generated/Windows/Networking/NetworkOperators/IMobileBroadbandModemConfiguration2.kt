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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandModemConfiguration2.ABI::class)
@Signature("{320ff5c5-e460-42ae-aa51-69621e7a4477}")
@Guid("320ff5c5e46042aeaa5169621e7a4477")
@WinRTInterface("320ff5c5e46042aeaa5169621e7a4477")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModemConfiguration2.ByReference::class)
public interface IMobileBroadbandModemConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SarManager(): MobileBroadbandSarManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModemConfiguration2> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandModemConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModemConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModemConfiguration2 {
    public val __950682634_Ptr: Pointer?

    public val _950682634_VtblPtr: Pointer?
      get() = __950682634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SarManager(): MobileBroadbandSarManager? {
      val fnPtr = _950682634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandSarManager>()
      val hr = fn.invokeHR(arrayOf(__950682634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandSarManager>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModemConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __950682634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModemConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("320ff5c5e46042aeaa5169621e7a4477")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModemConfiguration2(ptr: Pointer?): WithDefault =
        IMobileBroadbandModemConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModemConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModemConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModemConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__950682634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModemConfiguration2):
        Array<IMobileBroadbandModemConfiguration2?> = (elements as
        Array<IMobileBroadbandModemConfiguration2?>).castToImpl<IMobileBroadbandModemConfiguration2,IMobileBroadbandModemConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModemConfiguration2?> =
        arrayOfNulls<IMobileBroadbandModemConfiguration2_Impl>(size) as
        Array<IMobileBroadbandModemConfiguration2?>
  }
}
