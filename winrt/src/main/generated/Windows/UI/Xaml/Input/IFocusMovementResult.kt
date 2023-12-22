package Windows.UI.Xaml.Input

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

@ABIMarker(IFocusMovementResult.ABI::class)
@Signature("{06dfead3-c2ae-44bb-bfab-9c73de8407a4}")
@Guid("06dfead3c2ae44bbbfab9c73de8407a4")
@WinRTInterface("06dfead3c2ae44bbbfab9c73de8407a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusMovementResult.ByReference::class)
public interface IFocusMovementResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Succeeded(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusMovementResult> {
    public override fun getValue() = ABI.makeIFocusMovementResult(pointer.getPointer(0))

    public fun setValue(value: IFocusMovementResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusMovementResult {
    public val __367217166_Ptr: Pointer?

    public val _367217166_VtblPtr: Pointer?
      get() = __367217166_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _367217166_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__367217166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFocusMovementResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __367217166_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusMovementResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06dfead3c2ae44bbbfab9c73de8407a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusMovementResult(ptr: Pointer?): WithDefault = IFocusMovementResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusMovementResult {
      val address = segment.toRawLongValue()
      return makeIFocusMovementResult(Pointer(address))
    }

    public override fun toNative(obj: IFocusMovementResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__367217166_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusMovementResult): Array<IFocusMovementResult?> =
        (elements as
        Array<IFocusMovementResult?>).castToImpl<IFocusMovementResult,IFocusMovementResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusMovementResult?> =
        arrayOfNulls<IFocusMovementResult_Impl>(size) as Array<IFocusMovementResult?>
  }
}
