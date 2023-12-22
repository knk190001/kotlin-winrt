package Microsoft.UI.Input

import Windows.UI.Core.CoreCursor
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

@ABIMarker(IInputCursorStatics.ABI::class)
@Signature("{92f6a552-099f-55fb-8c31-e450284c9643}")
@Guid("92f6a552099f55fb8c31e450284c9643")
@WinRTInterface("92f6a552099f55fb8c31e450284c9643")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputCursorStatics.ByReference::class)
public interface IInputCursorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromCoreCursor(cursor: CoreCursor?): InputCursor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputCursorStatics> {
    public override fun getValue() = ABI.makeIInputCursorStatics(pointer.getPointer(0))

    public fun setValue(value: IInputCursorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputCursorStatics {
    public val __894653726_Ptr: Pointer?

    public val _894653726_VtblPtr: Pointer?
      get() = __894653726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromCoreCursor(cursor: CoreCursor?): InputCursor? {
      val fnPtr = _894653726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputCursor>()
      val hr = fn.invokeHR(arrayOf(__894653726_Ptr, marshalToNative(cursor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputCursor>(result.getValue())
      return resultValue
    }
  }

  public class IInputCursorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894653726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputCursorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92f6a552099f55fb8c31e450284c9643")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputCursorStatics(ptr: Pointer?): WithDefault = IInputCursorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputCursorStatics {
      val address = segment.toRawLongValue()
      return makeIInputCursorStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputCursorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894653726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputCursorStatics): Array<IInputCursorStatics?> =
        (elements as
        Array<IInputCursorStatics?>).castToImpl<IInputCursorStatics,IInputCursorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputCursorStatics?> =
        arrayOfNulls<IInputCursorStatics_Impl>(size) as Array<IInputCursorStatics?>
  }
}
