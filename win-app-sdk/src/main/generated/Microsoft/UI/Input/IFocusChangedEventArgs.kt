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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFocusChangedEventArgs.ABI::class)
@Signature("{a039b115-dbdf-594c-9b86-da6aa05c9fa2}")
@Guid("a039b115dbdf594c9b86da6aa05c9fa2")
@WinRTInterface("a039b115dbdf594c9b86da6aa05c9fa2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusChangedEventArgs.ByReference::class)
public interface IFocusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusChangedEventArgs> {
    public override fun getValue() = ABI.makeIFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFocusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusChangedEventArgs {
    public val __65386654_Ptr: Pointer?

    public val _65386654_VtblPtr: Pointer?
      get() = __65386654_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _65386654_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__65386654_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _65386654_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__65386654_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFocusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __65386654_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a039b115dbdf594c9b86da6aa05c9fa2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusChangedEventArgs(ptr: Pointer?): WithDefault =
        IFocusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__65386654_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusChangedEventArgs): Array<IFocusChangedEventArgs?> =
        (elements as
        Array<IFocusChangedEventArgs?>).castToImpl<IFocusChangedEventArgs,IFocusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusChangedEventArgs?> =
        arrayOfNulls<IFocusChangedEventArgs_Impl>(size) as Array<IFocusChangedEventArgs?>
  }
}
