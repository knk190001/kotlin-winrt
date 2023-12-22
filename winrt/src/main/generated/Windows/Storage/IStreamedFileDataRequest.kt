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

@ABIMarker(IStreamedFileDataRequest.ABI::class)
@Signature("{1673fcce-dabd-4d50-beee-180b8a8191b6}")
@Guid("1673fccedabd4d50beee180b8a8191b6")
@WinRTInterface("1673fccedabd4d50beee180b8a8191b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamedFileDataRequest.ByReference::class)
public interface IStreamedFileDataRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FailAndClose(failureMode: StreamedFileFailureMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamedFileDataRequest> {
    public override fun getValue() = ABI.makeIStreamedFileDataRequest(pointer.getPointer(0))

    public fun setValue(value: IStreamedFileDataRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamedFileDataRequest {
    public val __1987836527_Ptr: Pointer?

    public val _1987836527_VtblPtr: Pointer?
      get() = __1987836527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FailAndClose(failureMode: StreamedFileFailureMode?): Unit {
      val fnPtr = _1987836527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1987836527_Ptr, marshalToNative(failureMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamedFileDataRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1987836527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamedFileDataRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1673fccedabd4d50beee180b8a8191b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamedFileDataRequest(ptr: Pointer?): WithDefault =
        IStreamedFileDataRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamedFileDataRequest {
      val address = segment.toRawLongValue()
      return makeIStreamedFileDataRequest(Pointer(address))
    }

    public override fun toNative(obj: IStreamedFileDataRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987836527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamedFileDataRequest):
        Array<IStreamedFileDataRequest?> = (elements as
        Array<IStreamedFileDataRequest?>).castToImpl<IStreamedFileDataRequest,IStreamedFileDataRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamedFileDataRequest?> =
        arrayOfNulls<IStreamedFileDataRequest_Impl>(size) as Array<IStreamedFileDataRequest?>
  }
}
