package Microsoft.UI.Xaml

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindingFailedEventArgs.ABI::class)
@Signature("{a7bf50f3-dbc0-5b44-be74-56e8f80fd716}")
@Guid("a7bf50f3dbc05b44be7456e8f80fd716")
@WinRTInterface("a7bf50f3dbc05b44be7456e8f80fd716")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingFailedEventArgs.ByReference::class)
public interface IBindingFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingFailedEventArgs> {
    public override fun getValue() = ABI.makeIBindingFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBindingFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingFailedEventArgs {
    public val __817388900_Ptr: Pointer?

    public val _817388900_VtblPtr: Pointer?
      get() = __817388900_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): String? {
      val fnPtr = _817388900_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__817388900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBindingFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __817388900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7bf50f3dbc05b44be7456e8f80fd716")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingFailedEventArgs(ptr: Pointer?): WithDefault =
        IBindingFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBindingFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBindingFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817388900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingFailedEventArgs): Array<IBindingFailedEventArgs?>
        = (elements as
        Array<IBindingFailedEventArgs?>).castToImpl<IBindingFailedEventArgs,IBindingFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingFailedEventArgs?> =
        arrayOfNulls<IBindingFailedEventArgs_Impl>(size) as Array<IBindingFailedEventArgs?>
  }
}
