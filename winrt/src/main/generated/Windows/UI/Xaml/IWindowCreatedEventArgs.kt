package Windows.UI.Xaml

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

@ABIMarker(IWindowCreatedEventArgs.ABI::class)
@Signature("{31b71470-feff-4654-af48-9b398ab5772b}")
@Guid("31b71470feff4654af489b398ab5772b")
@WinRTInterface("31b71470feff4654af489b398ab5772b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowCreatedEventArgs.ByReference::class)
public interface IWindowCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Window(): Window?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowCreatedEventArgs> {
    public override fun getValue() = ABI.makeIWindowCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowCreatedEventArgs {
    public val __976790159_Ptr: Pointer?

    public val _976790159_VtblPtr: Pointer?
      get() = __976790159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Window(): Window? {
      val fnPtr = _976790159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Window>()
      val hr = fn.invokeHR(arrayOf(__976790159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Window>(result.getValue())
      return resultValue
    }
  }

  public class IWindowCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __976790159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31b71470feff4654af489b398ab5772b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowCreatedEventArgs(ptr: Pointer?): WithDefault =
        IWindowCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__976790159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowCreatedEventArgs): Array<IWindowCreatedEventArgs?>
        = (elements as
        Array<IWindowCreatedEventArgs?>).castToImpl<IWindowCreatedEventArgs,IWindowCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowCreatedEventArgs?> =
        arrayOfNulls<IWindowCreatedEventArgs_Impl>(size) as Array<IWindowCreatedEventArgs?>
  }
}
