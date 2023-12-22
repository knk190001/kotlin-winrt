package Windows.Storage.Pickers.Provider

import Windows.Storage.IStorageFile
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

@ABIMarker(ITargetFileRequest.ABI::class)
@Signature("{42bd3355-7f88-478b-8e81-690b20340678}")
@Guid("42bd33557f88478b8e81690b20340678")
@WinRTInterface("42bd33557f88478b8e81690b20340678")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetFileRequest.ByReference::class)
public interface ITargetFileRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetFile(): IStorageFile?

  @InterfaceMethod(1)
  public fun put_TargetFile(value: IStorageFile?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): TargetFileRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetFileRequest> {
    public override fun getValue() = ABI.makeITargetFileRequest(pointer.getPointer(0))

    public fun setValue(value: ITargetFileRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetFileRequest {
    public val __157170833_Ptr: Pointer?

    public val _157170833_VtblPtr: Pointer?
      get() = __157170833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetFile(): IStorageFile? {
      val fnPtr = _157170833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__157170833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetFile(value: IStorageFile?): Unit {
      val fnPtr = _157170833_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__157170833_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): TargetFileRequestDeferral? {
      val fnPtr = _157170833_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetFileRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__157170833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetFileRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class ITargetFileRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157170833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetFileRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42bd33557f88478b8e81690b20340678")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetFileRequest(ptr: Pointer?): WithDefault = ITargetFileRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetFileRequest {
      val address = segment.toRawLongValue()
      return makeITargetFileRequest(Pointer(address))
    }

    public override fun toNative(obj: ITargetFileRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157170833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetFileRequest): Array<ITargetFileRequest?> =
        (elements as
        Array<ITargetFileRequest?>).castToImpl<ITargetFileRequest,ITargetFileRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetFileRequest?> =
        arrayOfNulls<ITargetFileRequest_Impl>(size) as Array<ITargetFileRequest?>
  }
}
