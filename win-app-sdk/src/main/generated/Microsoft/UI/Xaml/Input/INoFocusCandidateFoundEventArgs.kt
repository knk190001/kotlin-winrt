package Microsoft.UI.Xaml.Input

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

@ABIMarker(INoFocusCandidateFoundEventArgs.ABI::class)
@Signature("{a2d7153a-cd2a-59cb-a574-ac82e30b9201}")
@Guid("a2d7153acd2a59cba574ac82e30b9201")
@WinRTInterface("a2d7153acd2a59cba574ac82e30b9201")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INoFocusCandidateFoundEventArgs.ByReference::class)
public interface INoFocusCandidateFoundEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direction(): FocusNavigationDirection?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_InputDevice(): FocusInputDeviceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INoFocusCandidateFoundEventArgs> {
    public override fun getValue() = ABI.makeINoFocusCandidateFoundEventArgs(pointer.getPointer(0))

    public fun setValue(value: INoFocusCandidateFoundEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INoFocusCandidateFoundEventArgs {
    public val __1893012428_Ptr: Pointer?

    public val _1893012428_VtblPtr: Pointer?
      get() = __1893012428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direction(): FocusNavigationDirection? {
      val fnPtr = _1893012428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusNavigationDirection>()
      val hr = fn.invokeHR(arrayOf(__1893012428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusNavigationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1893012428_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1893012428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1893012428_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1893012428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_InputDevice(): FocusInputDeviceKind? {
      val fnPtr = _1893012428_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusInputDeviceKind>()
      val hr = fn.invokeHR(arrayOf(__1893012428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusInputDeviceKind>(result.getValue())
      return resultValue
    }
  }

  public class INoFocusCandidateFoundEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1893012428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INoFocusCandidateFoundEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2d7153acd2a59cba574ac82e30b9201")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINoFocusCandidateFoundEventArgs(ptr: Pointer?): WithDefault =
        INoFocusCandidateFoundEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INoFocusCandidateFoundEventArgs {
      val address = segment.toRawLongValue()
      return makeINoFocusCandidateFoundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INoFocusCandidateFoundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893012428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INoFocusCandidateFoundEventArgs):
        Array<INoFocusCandidateFoundEventArgs?> = (elements as
        Array<INoFocusCandidateFoundEventArgs?>).castToImpl<INoFocusCandidateFoundEventArgs,INoFocusCandidateFoundEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INoFocusCandidateFoundEventArgs?> =
        arrayOfNulls<INoFocusCandidateFoundEventArgs_Impl>(size) as
        Array<INoFocusCandidateFoundEventArgs?>
  }
}
