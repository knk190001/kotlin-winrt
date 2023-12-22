package Windows.UI.StartScreen

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IJumpListStatics.ABI::class)
@Signature("{a7e0c681-e67e-4b74-8250-3f322c4d92c3}")
@Guid("a7e0c681e67e4b7482503f322c4d92c3")
@WinRTInterface("a7e0c681e67e4b7482503f322c4d92c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListStatics.ByReference::class)
public interface IJumpListStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadCurrentAsync(): IAsyncOperation<JumpList?>?

  @InterfaceMethod(1)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListStatics> {
    public override fun getValue() = ABI.makeIJumpListStatics(pointer.getPointer(0))

    public fun setValue(value: IJumpListStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListStatics {
    public val __1180670095_Ptr: Pointer?

    public val _1180670095_VtblPtr: Pointer?
      get() = __1180670095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadCurrentAsync(): IAsyncOperation<JumpList?>? {
      val fnPtr = _1180670095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<JumpList?>>()
      val hr = fn.invokeHR(arrayOf(__1180670095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<JumpList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1180670095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1180670095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJumpListStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1180670095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7e0c681e67e4b7482503f322c4d92c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListStatics(ptr: Pointer?): WithDefault = IJumpListStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpListStatics {
      val address = segment.toRawLongValue()
      return makeIJumpListStatics(Pointer(address))
    }

    public override fun toNative(obj: IJumpListStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1180670095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListStatics): Array<IJumpListStatics?> = (elements as
        Array<IJumpListStatics?>).castToImpl<IJumpListStatics,IJumpListStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListStatics?> =
        arrayOfNulls<IJumpListStatics_Impl>(size) as Array<IJumpListStatics?>
  }
}
