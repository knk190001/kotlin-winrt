package Windows.Storage

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISetVersionRequest.ABI::class)
@Signature("{b9c76b9b-1056-4e69-8330-162619956f9b}")
@Guid("b9c76b9b10564e698330162619956f9b")
@WinRTInterface("b9c76b9b10564e698330162619956f9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetVersionRequest.ByReference::class)
public interface ISetVersionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentVersion(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_DesiredVersion(): WinDef.UINT

  @InterfaceMethod(2)
  public fun GetDeferral(): SetVersionDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISetVersionRequest> {
    public override fun getValue() = ABI.makeISetVersionRequest(pointer.getPointer(0))

    public fun setValue(value: ISetVersionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetVersionRequest {
    public val __39188512_Ptr: Pointer?

    public val _39188512_VtblPtr: Pointer?
      get() = __39188512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentVersion(): WinDef.UINT {
      val fnPtr = _39188512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__39188512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DesiredVersion(): WinDef.UINT {
      val fnPtr = _39188512_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__39188512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): SetVersionDeferral? {
      val fnPtr = _39188512_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SetVersionDeferral>()
      val hr = fn.invokeHR(arrayOf(__39188512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SetVersionDeferral>(result.getValue())
      return resultValue
    }
  }

  public class ISetVersionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39188512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetVersionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c76b9b10564e698330162619956f9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetVersionRequest(ptr: Pointer?): WithDefault = ISetVersionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetVersionRequest {
      val address = segment.toRawLongValue()
      return makeISetVersionRequest(Pointer(address))
    }

    public override fun toNative(obj: ISetVersionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__39188512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetVersionRequest): Array<ISetVersionRequest?> =
        (elements as
        Array<ISetVersionRequest?>).castToImpl<ISetVersionRequest,ISetVersionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetVersionRequest?> =
        arrayOfNulls<ISetVersionRequest_Impl>(size) as Array<ISetVersionRequest?>
  }
}
