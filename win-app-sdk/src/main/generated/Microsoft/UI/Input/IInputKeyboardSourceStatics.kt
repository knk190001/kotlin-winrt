package Microsoft.UI.Input

import Windows.System.VirtualKey
import Windows.UI.Core.CoreVirtualKeyStates
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

@ABIMarker(IInputKeyboardSourceStatics.ABI::class)
@Signature("{f4e1563d-8c2e-5bcd-b784-47adeaa3cd7e}")
@Guid("f4e1563d8c2e5bcdb78447adeaa3cd7e")
@WinRTInterface("f4e1563d8c2e5bcdb78447adeaa3cd7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputKeyboardSourceStatics.ByReference::class)
public interface IInputKeyboardSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetKeyStateForCurrentThread(virtualKey: VirtualKey?): CoreVirtualKeyStates?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputKeyboardSourceStatics> {
    public override fun getValue() = ABI.makeIInputKeyboardSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IInputKeyboardSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputKeyboardSourceStatics {
    public val __1408472338_Ptr: Pointer?

    public val _1408472338_VtblPtr: Pointer?
      get() = __1408472338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetKeyStateForCurrentThread(virtualKey: VirtualKey?):
        CoreVirtualKeyStates? {
      val fnPtr = _1408472338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreVirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__1408472338_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreVirtualKeyStates>(result.getValue())
      return resultValue
    }
  }

  public class IInputKeyboardSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1408472338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputKeyboardSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4e1563d8c2e5bcdb78447adeaa3cd7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputKeyboardSourceStatics(ptr: Pointer?): WithDefault =
        IInputKeyboardSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputKeyboardSourceStatics {
      val address = segment.toRawLongValue()
      return makeIInputKeyboardSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputKeyboardSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1408472338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputKeyboardSourceStatics):
        Array<IInputKeyboardSourceStatics?> = (elements as
        Array<IInputKeyboardSourceStatics?>).castToImpl<IInputKeyboardSourceStatics,IInputKeyboardSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputKeyboardSourceStatics?> =
        arrayOfNulls<IInputKeyboardSourceStatics_Impl>(size) as Array<IInputKeyboardSourceStatics?>
  }
}
