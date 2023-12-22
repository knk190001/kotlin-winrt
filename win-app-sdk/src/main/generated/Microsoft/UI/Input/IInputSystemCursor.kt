package Microsoft.UI.Input

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

@ABIMarker(IInputSystemCursor.ABI::class)
@Signature("{59f538e7-c500-59ab-8b54-0bc6100fd49e}")
@Guid("59f538e7c50059ab8b540bc6100fd49e")
@WinRTInterface("59f538e7c50059ab8b540bc6100fd49e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputSystemCursor.ByReference::class)
public interface IInputSystemCursor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CursorShape(): InputSystemCursorShape?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputSystemCursor> {
    public override fun getValue() = ABI.makeIInputSystemCursor(pointer.getPointer(0))

    public fun setValue(value: IInputSystemCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputSystemCursor {
    public val __324909322_Ptr: Pointer?

    public val _324909322_VtblPtr: Pointer?
      get() = __324909322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CursorShape(): InputSystemCursorShape? {
      val fnPtr = _324909322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputSystemCursorShape>()
      val hr = fn.invokeHR(arrayOf(__324909322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputSystemCursorShape>(result.getValue())
      return resultValue
    }
  }

  public class IInputSystemCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __324909322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputSystemCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59f538e7c50059ab8b540bc6100fd49e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputSystemCursor(ptr: Pointer?): WithDefault = IInputSystemCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputSystemCursor {
      val address = segment.toRawLongValue()
      return makeIInputSystemCursor(Pointer(address))
    }

    public override fun toNative(obj: IInputSystemCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324909322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputSystemCursor): Array<IInputSystemCursor?> =
        (elements as
        Array<IInputSystemCursor?>).castToImpl<IInputSystemCursor,IInputSystemCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputSystemCursor?> =
        arrayOfNulls<IInputSystemCursor_Impl>(size) as Array<IInputSystemCursor?>
  }
}
