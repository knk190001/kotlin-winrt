package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISwipeItemInvokedEventArgs.ABI::class)
@Signature("{7bf51c95-53a2-5a0d-bb32-2b4b1f7d2f20}")
@Guid("7bf51c9553a25a0dbb322b4b1f7d2f20")
@WinRTInterface("7bf51c9553a25a0dbb322b4b1f7d2f20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItemInvokedEventArgs.ByReference::class)
public interface ISwipeItemInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SwipeControl(): SwipeControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeItemInvokedEventArgs> {
    public override fun getValue() = ABI.makeISwipeItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISwipeItemInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItemInvokedEventArgs {
    public val __1957595983_Ptr: Pointer?

    public val _1957595983_VtblPtr: Pointer?
      get() = __1957595983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SwipeControl(): SwipeControl? {
      val fnPtr = _1957595983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeControl>()
      val hr = fn.invokeHR(arrayOf(__1957595983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeControl>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeItemInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957595983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItemInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bf51c9553a25a0dbb322b4b1f7d2f20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItemInvokedEventArgs(ptr: Pointer?): WithDefault =
        ISwipeItemInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeISwipeItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957595983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItemInvokedEventArgs):
        Array<ISwipeItemInvokedEventArgs?> = (elements as
        Array<ISwipeItemInvokedEventArgs?>).castToImpl<ISwipeItemInvokedEventArgs,ISwipeItemInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItemInvokedEventArgs?> =
        arrayOfNulls<ISwipeItemInvokedEventArgs_Impl>(size) as Array<ISwipeItemInvokedEventArgs?>
  }
}
