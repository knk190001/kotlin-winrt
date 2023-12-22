package Windows.Media.Protection

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

@ABIMarker(IMediaProtectionServiceRequest.ABI::class)
@Signature("{b1de0ea6-2094-478d-87a4-8b95200f85c6}")
@Guid("b1de0ea62094478d87a48b95200f85c6")
@WinRTInterface("b1de0ea62094478d87a48b95200f85c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaProtectionServiceRequest.ByReference::class)
public interface IMediaProtectionServiceRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProtectionSystem(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Type(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaProtectionServiceRequest> {
    public override fun getValue() = ABI.makeIMediaProtectionServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IMediaProtectionServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaProtectionServiceRequest {
    public val __454607004_Ptr: Pointer?

    public val _454607004_VtblPtr: Pointer?
      get() = __454607004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtectionSystem(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _454607004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__454607004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Type(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _454607004_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__454607004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IMediaProtectionServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __454607004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaProtectionServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1de0ea62094478d87a48b95200f85c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaProtectionServiceRequest(ptr: Pointer?): WithDefault =
        IMediaProtectionServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaProtectionServiceRequest {
      val address = segment.toRawLongValue()
      return makeIMediaProtectionServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IMediaProtectionServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__454607004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaProtectionServiceRequest):
        Array<IMediaProtectionServiceRequest?> = (elements as
        Array<IMediaProtectionServiceRequest?>).castToImpl<IMediaProtectionServiceRequest,IMediaProtectionServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaProtectionServiceRequest?> =
        arrayOfNulls<IMediaProtectionServiceRequest_Impl>(size) as
        Array<IMediaProtectionServiceRequest?>
  }
}
