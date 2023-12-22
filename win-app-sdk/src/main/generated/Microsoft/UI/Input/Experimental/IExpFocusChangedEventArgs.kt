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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpFocusChangedEventArgs.ABI::class)
@Signature("{714933b6-ba0d-58bc-97a9-bcc89a0b3431}")
@Guid("714933b6ba0d58bc97a9bcc89a0b3431")
@WinRTInterface("714933b6ba0d58bc97a9bcc89a0b3431")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusChangedEventArgs.ByReference::class)
public interface IExpFocusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direction(): ExpFocusChangedDirection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusChangedEventArgs> {
    public override fun getValue() = ABI.makeIExpFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExpFocusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusChangedEventArgs {
    public val __27209727_Ptr: Pointer?

    public val _27209727_VtblPtr: Pointer?
      get() = __27209727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direction(): ExpFocusChangedDirection? {
      val fnPtr = _27209727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusChangedDirection>()
      val hr = fn.invokeHR(arrayOf(__27209727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusChangedDirection>(result.getValue())
      return resultValue
    }
  }

  public class IExpFocusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __27209727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("714933b6ba0d58bc97a9bcc89a0b3431")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusChangedEventArgs(ptr: Pointer?): WithDefault =
        IExpFocusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExpFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__27209727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusChangedEventArgs):
        Array<IExpFocusChangedEventArgs?> = (elements as
        Array<IExpFocusChangedEventArgs?>).castToImpl<IExpFocusChangedEventArgs,IExpFocusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusChangedEventArgs?> =
        arrayOfNulls<IExpFocusChangedEventArgs_Impl>(size) as Array<IExpFocusChangedEventArgs?>
  }
}
