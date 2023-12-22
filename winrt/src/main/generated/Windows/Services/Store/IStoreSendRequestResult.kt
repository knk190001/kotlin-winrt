package Windows.Services.Store

import Windows.Foundation.HResult
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

@ABIMarker(IStoreSendRequestResult.ABI::class)
@Signature("{c73abe60-8272-4502-8a69-6e75153a4299}")
@Guid("c73abe60827245028a696e75153a4299")
@WinRTInterface("c73abe60827245028a696e75153a4299")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreSendRequestResult.ByReference::class)
public interface IStoreSendRequestResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Response(): String?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreSendRequestResult> {
    public override fun getValue() = ABI.makeIStoreSendRequestResult(pointer.getPointer(0))

    public fun setValue(value: IStoreSendRequestResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreSendRequestResult {
    public val __1272856560_Ptr: Pointer?

    public val _1272856560_VtblPtr: Pointer?
      get() = __1272856560_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Response(): String? {
      val fnPtr = _1272856560_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272856560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1272856560_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1272856560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreSendRequestResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272856560_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreSendRequestResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c73abe60827245028a696e75153a4299")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreSendRequestResult(ptr: Pointer?): WithDefault =
        IStoreSendRequestResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreSendRequestResult {
      val address = segment.toRawLongValue()
      return makeIStoreSendRequestResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreSendRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272856560_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreSendRequestResult): Array<IStoreSendRequestResult?>
        = (elements as
        Array<IStoreSendRequestResult?>).castToImpl<IStoreSendRequestResult,IStoreSendRequestResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreSendRequestResult?> =
        arrayOfNulls<IStoreSendRequestResult_Impl>(size) as Array<IStoreSendRequestResult?>
  }
}
