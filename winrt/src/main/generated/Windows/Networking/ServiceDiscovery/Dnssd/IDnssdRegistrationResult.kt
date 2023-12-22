package Windows.Networking.ServiceDiscovery.Dnssd

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDnssdRegistrationResult.ABI::class)
@Signature("{3d786ad2-e606-5350-73ea-7e97f066162f}")
@Guid("3d786ad2e606535073ea7e97f066162f")
@WinRTInterface("3d786ad2e606535073ea7e97f066162f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDnssdRegistrationResult.ByReference::class)
public interface IDnssdRegistrationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DnssdRegistrationStatus?

  @InterfaceMethod(1)
  public fun get_IPAddress(): HostName?

  @InterfaceMethod(2)
  public fun get_HasInstanceNameChanged(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDnssdRegistrationResult> {
    public override fun getValue() = ABI.makeIDnssdRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: IDnssdRegistrationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDnssdRegistrationResult {
    public val __2052503587_Ptr: Pointer?

    public val _2052503587_VtblPtr: Pointer?
      get() = __2052503587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DnssdRegistrationStatus? {
      val fnPtr = _2052503587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DnssdRegistrationStatus>()
      val hr = fn.invokeHR(arrayOf(__2052503587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DnssdRegistrationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IPAddress(): HostName? {
      val fnPtr = _2052503587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__2052503587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasInstanceNameChanged(): Boolean {
      val fnPtr = _2052503587_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2052503587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDnssdRegistrationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2052503587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDnssdRegistrationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d786ad2e606535073ea7e97f066162f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDnssdRegistrationResult(ptr: Pointer?): WithDefault =
        IDnssdRegistrationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDnssdRegistrationResult {
      val address = segment.toRawLongValue()
      return makeIDnssdRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: IDnssdRegistrationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2052503587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDnssdRegistrationResult):
        Array<IDnssdRegistrationResult?> = (elements as
        Array<IDnssdRegistrationResult?>).castToImpl<IDnssdRegistrationResult,IDnssdRegistrationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDnssdRegistrationResult?> =
        arrayOfNulls<IDnssdRegistrationResult_Impl>(size) as Array<IDnssdRegistrationResult?>
  }
}
