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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationOverrides.ABI::class)
@Signature("{a33e81ef-c665-503b-8827-d27ef1720a06}")
@Guid("a33e81efc665503b8827d27ef1720a06")
@WinRTInterface("a33e81efc665503b8827d27ef1720a06")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationOverrides.ByReference::class)
public interface IApplicationOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnLaunched(args: LaunchActivatedEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationOverrides> {
    public override fun getValue() = ABI.makeIApplicationOverrides(pointer.getPointer(0))

    public fun setValue(value: IApplicationOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationOverrides {
    public val __1930314110_Ptr: Pointer?

    public val _1930314110_VtblPtr: Pointer?
      get() = __1930314110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnLaunched(args: LaunchActivatedEventArgs?): Unit {
      val fnPtr = _1930314110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930314110_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930314110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a33e81efc665503b8827d27ef1720a06")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationOverrides(ptr: Pointer?): WithDefault =
        IApplicationOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationOverrides {
      val address = segment.toRawLongValue()
      return makeIApplicationOverrides(Pointer(address))
    }

    public override fun toNative(obj: IApplicationOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930314110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationOverrides): Array<IApplicationOverrides?> =
        (elements as
        Array<IApplicationOverrides?>).castToImpl<IApplicationOverrides,IApplicationOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationOverrides?> =
        arrayOfNulls<IApplicationOverrides_Impl>(size) as Array<IApplicationOverrides?>
  }
}
