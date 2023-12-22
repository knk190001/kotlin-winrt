package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncAction
import Windows.Networking.HostName
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

@ABIMarker(IMobileBroadbandModemIsolation.ABI::class)
@Signature("{b5618fec-e661-4330-9bb4-3480212ec354}")
@Guid("b5618fece66143309bb43480212ec354")
@WinRTInterface("b5618fece66143309bb43480212ec354")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModemIsolation.ByReference::class)
public interface IMobileBroadbandModemIsolation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAllowedHost(host: HostName?): Unit

  @InterfaceMethod(1)
  public fun AddAllowedHostRange(first: HostName?, last: HostName?): Unit

  @InterfaceMethod(2)
  public fun ApplyConfigurationAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ClearConfigurationAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModemIsolation> {
    public override fun getValue() = ABI.makeIMobileBroadbandModemIsolation(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModemIsolation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModemIsolation {
    public val __1706382336_Ptr: Pointer?

    public val _1706382336_VtblPtr: Pointer?
      get() = __1706382336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddAllowedHost(host: HostName?): Unit {
      val fnPtr = _1706382336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1706382336_Ptr, marshalToNative(host),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AddAllowedHostRange(first: HostName?, last: HostName?): Unit {
      val fnPtr = _1706382336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1706382336_Ptr, marshalToNative(first),
          marshalToNative(last),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ApplyConfigurationAsync(): IAsyncAction? {
      val fnPtr = _1706382336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1706382336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ClearConfigurationAsync(): IAsyncAction? {
      val fnPtr = _1706382336_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1706382336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModemIsolation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1706382336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModemIsolation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5618fece66143309bb43480212ec354")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModemIsolation(ptr: Pointer?): WithDefault =
        IMobileBroadbandModemIsolation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModemIsolation {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModemIsolation(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModemIsolation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1706382336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModemIsolation):
        Array<IMobileBroadbandModemIsolation?> = (elements as
        Array<IMobileBroadbandModemIsolation?>).castToImpl<IMobileBroadbandModemIsolation,IMobileBroadbandModemIsolation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModemIsolation?> =
        arrayOfNulls<IMobileBroadbandModemIsolation_Impl>(size) as
        Array<IMobileBroadbandModemIsolation?>
  }
}
