package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayStateOperationResult.ABI::class)
@Signature("{fcadbfdf-dc27-5638-b7f2-ebdfa4f7ea93}")
@Guid("fcadbfdfdc275638b7f2ebdfa4f7ea93")
@WinRTInterface("fcadbfdfdc275638b7f2ebdfa4f7ea93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayStateOperationResult.ByReference::class)
public interface IDisplayStateOperationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DisplayStateOperationStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayStateOperationResult> {
    public override fun getValue() = ABI.makeIDisplayStateOperationResult(pointer.getPointer(0))

    public fun setValue(value: IDisplayStateOperationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayStateOperationResult {
    public val __1813875379_Ptr: Pointer?

    public val _1813875379_VtblPtr: Pointer?
      get() = __1813875379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DisplayStateOperationStatus? {
      val fnPtr = _1813875379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayStateOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1813875379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayStateOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedErrorCode(): HResult? {
      val fnPtr = _1813875379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1813875379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayStateOperationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813875379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayStateOperationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcadbfdfdc275638b7f2ebdfa4f7ea93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayStateOperationResult(ptr: Pointer?): WithDefault =
        IDisplayStateOperationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayStateOperationResult {
      val address = segment.toRawLongValue()
      return makeIDisplayStateOperationResult(Pointer(address))
    }

    public override fun toNative(obj: IDisplayStateOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813875379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayStateOperationResult):
        Array<IDisplayStateOperationResult?> = (elements as
        Array<IDisplayStateOperationResult?>).castToImpl<IDisplayStateOperationResult,IDisplayStateOperationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayStateOperationResult?> =
        arrayOfNulls<IDisplayStateOperationResult_Impl>(size) as
        Array<IDisplayStateOperationResult?>
  }
}
