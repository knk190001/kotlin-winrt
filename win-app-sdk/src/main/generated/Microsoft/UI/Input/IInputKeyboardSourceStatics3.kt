package Microsoft.UI.Input

import Microsoft.UI.WindowId
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

@ABIMarker(IInputKeyboardSourceStatics3.ABI::class)
@Signature("{34b960c5-a5ae-52af-8566-6d2d55ff52d1}")
@Guid("34b960c5a5ae52af85666d2d55ff52d1")
@WinRTInterface("34b960c5a5ae52af85666d2d55ff52d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputKeyboardSourceStatics3.ByReference::class)
public interface IInputKeyboardSourceStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForWindowId(windowId: WindowId?): InputKeyboardSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputKeyboardSourceStatics3> {
    public override fun getValue() = ABI.makeIInputKeyboardSourceStatics3(pointer.getPointer(0))

    public fun setValue(value: IInputKeyboardSourceStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputKeyboardSourceStatics3 {
    public val __712969569_Ptr: Pointer?

    public val _712969569_VtblPtr: Pointer?
      get() = __712969569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForWindowId(windowId: WindowId?): InputKeyboardSource? {
      val fnPtr = _712969569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputKeyboardSource>()
      val hr = fn.invokeHR(arrayOf(__712969569_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputKeyboardSource>(result.getValue())
      return resultValue
    }
  }

  public class IInputKeyboardSourceStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __712969569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputKeyboardSourceStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34b960c5a5ae52af85666d2d55ff52d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputKeyboardSourceStatics3(ptr: Pointer?): WithDefault =
        IInputKeyboardSourceStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputKeyboardSourceStatics3 {
      val address = segment.toRawLongValue()
      return makeIInputKeyboardSourceStatics3(Pointer(address))
    }

    public override fun toNative(obj: IInputKeyboardSourceStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__712969569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputKeyboardSourceStatics3):
        Array<IInputKeyboardSourceStatics3?> = (elements as
        Array<IInputKeyboardSourceStatics3?>).castToImpl<IInputKeyboardSourceStatics3,IInputKeyboardSourceStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputKeyboardSourceStatics3?> =
        arrayOfNulls<IInputKeyboardSourceStatics3_Impl>(size) as
        Array<IInputKeyboardSourceStatics3?>
  }
}
