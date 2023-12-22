package Windows.Networking.Proximity

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPeerInformationWithHostAndService.ABI::class)
@Signature("{ecc7ccad-1b70-4e8b-92db-bbe781419308}")
@Guid("ecc7ccad1b704e8b92dbbbe781419308")
@WinRTInterface("ecc7ccad1b704e8b92dbbbe781419308")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerInformationWithHostAndService.ByReference::class)
public interface IPeerInformationWithHostAndService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HostName(): HostName?

  @InterfaceMethod(1)
  public fun get_ServiceName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeerInformationWithHostAndService> {
    public override fun getValue() =
        ABI.makeIPeerInformationWithHostAndService(pointer.getPointer(0))

    public fun setValue(value: IPeerInformationWithHostAndService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerInformationWithHostAndService {
    public val __219046787_Ptr: Pointer?

    public val _219046787_VtblPtr: Pointer?
      get() = __219046787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HostName(): HostName? {
      val fnPtr = _219046787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__219046787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceName(): String? {
      val fnPtr = _219046787_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__219046787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPeerInformationWithHostAndService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219046787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerInformationWithHostAndService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ecc7ccad1b704e8b92dbbbe781419308")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerInformationWithHostAndService(ptr: Pointer?): WithDefault =
        IPeerInformationWithHostAndService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerInformationWithHostAndService {
      val address = segment.toRawLongValue()
      return makeIPeerInformationWithHostAndService(Pointer(address))
    }

    public override fun toNative(obj: IPeerInformationWithHostAndService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__219046787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerInformationWithHostAndService):
        Array<IPeerInformationWithHostAndService?> = (elements as
        Array<IPeerInformationWithHostAndService?>).castToImpl<IPeerInformationWithHostAndService,IPeerInformationWithHostAndService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerInformationWithHostAndService?> =
        arrayOfNulls<IPeerInformationWithHostAndService_Impl>(size) as
        Array<IPeerInformationWithHostAndService?>
  }
}
