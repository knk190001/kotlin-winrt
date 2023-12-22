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

@ABIMarker(IWindowingEnvironmentRemovedEventArgs.ABI::class)
@Signature("{2e5b5473-beff-5e53-9316-7e775fe568b3}")
@Guid("2e5b5473beff5e5393167e775fe568b3")
@WinRTInterface("2e5b5473beff5e5393167e775fe568b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowingEnvironmentRemovedEventArgs.ByReference::class)
public interface IWindowingEnvironmentRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowingEnvironment(): WindowingEnvironment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowingEnvironmentRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIWindowingEnvironmentRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowingEnvironmentRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowingEnvironmentRemovedEventArgs {
    public val __1464109471_Ptr: Pointer?

    public val _1464109471_VtblPtr: Pointer?
      get() = __1464109471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowingEnvironment(): WindowingEnvironment? {
      val fnPtr = _1464109471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironment>()
      val hr = fn.invokeHR(arrayOf(__1464109471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironment>(result.getValue())
      return resultValue
    }
  }

  public class IWindowingEnvironmentRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464109471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowingEnvironmentRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e5b5473beff5e5393167e775fe568b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowingEnvironmentRemovedEventArgs(ptr: Pointer?): WithDefault =
        IWindowingEnvironmentRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowingEnvironmentRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowingEnvironmentRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowingEnvironmentRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464109471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowingEnvironmentRemovedEventArgs):
        Array<IWindowingEnvironmentRemovedEventArgs?> = (elements as
        Array<IWindowingEnvironmentRemovedEventArgs?>).castToImpl<IWindowingEnvironmentRemovedEventArgs,IWindowingEnvironmentRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowingEnvironmentRemovedEventArgs?> =
        arrayOfNulls<IWindowingEnvironmentRemovedEventArgs_Impl>(size) as
        Array<IWindowingEnvironmentRemovedEventArgs?>
  }
}
