package Windows.UI.WindowManagement

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

@ABIMarker(IWindowingEnvironmentAddedEventArgs.ABI::class)
@Signature("{ff2a5b7f-f183-5c66-99b2-429082069299}")
@Guid("ff2a5b7ff1835c6699b2429082069299")
@WinRTInterface("ff2a5b7ff1835c6699b2429082069299")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowingEnvironmentAddedEventArgs.ByReference::class)
public interface IWindowingEnvironmentAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowingEnvironment(): WindowingEnvironment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowingEnvironmentAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIWindowingEnvironmentAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowingEnvironmentAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowingEnvironmentAddedEventArgs {
    public val __388216575_Ptr: Pointer?

    public val _388216575_VtblPtr: Pointer?
      get() = __388216575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowingEnvironment(): WindowingEnvironment? {
      val fnPtr = _388216575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironment>()
      val hr = fn.invokeHR(arrayOf(__388216575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironment>(result.getValue())
      return resultValue
    }
  }

  public class IWindowingEnvironmentAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __388216575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowingEnvironmentAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff2a5b7ff1835c6699b2429082069299")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowingEnvironmentAddedEventArgs(ptr: Pointer?): WithDefault =
        IWindowingEnvironmentAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowingEnvironmentAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowingEnvironmentAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowingEnvironmentAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__388216575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowingEnvironmentAddedEventArgs):
        Array<IWindowingEnvironmentAddedEventArgs?> = (elements as
        Array<IWindowingEnvironmentAddedEventArgs?>).castToImpl<IWindowingEnvironmentAddedEventArgs,IWindowingEnvironmentAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowingEnvironmentAddedEventArgs?> =
        arrayOfNulls<IWindowingEnvironmentAddedEventArgs_Impl>(size) as
        Array<IWindowingEnvironmentAddedEventArgs?>
  }
}
