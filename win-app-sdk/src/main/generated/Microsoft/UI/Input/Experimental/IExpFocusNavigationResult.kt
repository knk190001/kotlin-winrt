package Microsoft.UI.Input.Experimental

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

@ABIMarker(IExpFocusNavigationResult.ABI::class)
@Signature("{33007903-6cd1-54a2-a5d3-5724ef673c6c}")
@Guid("330079036cd154a2a5d35724ef673c6c")
@WinRTInterface("330079036cd154a2a5d35724ef673c6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusNavigationResult.ByReference::class)
public interface IExpFocusNavigationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WasMoved(): Boolean

  @InterfaceMethod(1)
  public fun put_WasMoved(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusNavigationResult> {
    public override fun getValue() = ABI.makeIExpFocusNavigationResult(pointer.getPointer(0))

    public fun setValue(value: IExpFocusNavigationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusNavigationResult {
    public val __1202238193_Ptr: Pointer?

    public val _1202238193_VtblPtr: Pointer?
      get() = __1202238193_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WasMoved(): Boolean {
      val fnPtr = _1202238193_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1202238193_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_WasMoved(value: Boolean): Unit {
      val fnPtr = _1202238193_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1202238193_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpFocusNavigationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1202238193_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusNavigationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("330079036cd154a2a5d35724ef673c6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusNavigationResult(ptr: Pointer?): WithDefault =
        IExpFocusNavigationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusNavigationResult {
      val address = segment.toRawLongValue()
      return makeIExpFocusNavigationResult(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusNavigationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1202238193_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusNavigationResult):
        Array<IExpFocusNavigationResult?> = (elements as
        Array<IExpFocusNavigationResult?>).castToImpl<IExpFocusNavigationResult,IExpFocusNavigationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusNavigationResult?> =
        arrayOfNulls<IExpFocusNavigationResult_Impl>(size) as Array<IExpFocusNavigationResult?>
  }
}
