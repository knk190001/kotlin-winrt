package Windows.System

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppActivationResult.ABI::class)
@Signature("{6b528900-f46e-4eb0-aa6c-38af557cf9ed}")
@Guid("6b528900f46e4eb0aa6c38af557cf9ed")
@WinRTInterface("6b528900f46e4eb0aa6c38af557cf9ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppActivationResult.ByReference::class)
public interface IAppActivationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_AppResourceGroupInfo(): AppResourceGroupInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppActivationResult> {
    public override fun getValue() = ABI.makeIAppActivationResult(pointer.getPointer(0))

    public fun setValue(value: IAppActivationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppActivationResult {
    public val __191408827_Ptr: Pointer?

    public val _191408827_VtblPtr: Pointer?
      get() = __191408827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _191408827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__191408827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppResourceGroupInfo(): AppResourceGroupInfo? {
      val fnPtr = _191408827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupInfo>()
      val hr = fn.invokeHR(arrayOf(__191408827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppActivationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __191408827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppActivationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b528900f46e4eb0aa6c38af557cf9ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppActivationResult(ptr: Pointer?): WithDefault = IAppActivationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppActivationResult {
      val address = segment.toRawLongValue()
      return makeIAppActivationResult(Pointer(address))
    }

    public override fun toNative(obj: IAppActivationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__191408827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppActivationResult): Array<IAppActivationResult?> =
        (elements as
        Array<IAppActivationResult?>).castToImpl<IAppActivationResult,IAppActivationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppActivationResult?> =
        arrayOfNulls<IAppActivationResult_Impl>(size) as Array<IAppActivationResult?>
  }
}
