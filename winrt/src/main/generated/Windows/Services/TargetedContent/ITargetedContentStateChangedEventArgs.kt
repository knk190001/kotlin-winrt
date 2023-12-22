package Windows.Services.TargetedContent

import Windows.Foundation.Deferral
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

@ABIMarker(ITargetedContentStateChangedEventArgs.ABI::class)
@Signature("{9a1cef3d-8073-4416-8df2-546835a6414f}")
@Guid("9a1cef3d807344168df2546835a6414f")
@WinRTInterface("9a1cef3d807344168df2546835a6414f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentStateChangedEventArgs.ByReference::class)
public interface ITargetedContentStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITargetedContentStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentStateChangedEventArgs {
    public val __639740528_Ptr: Pointer?

    public val _639740528_VtblPtr: Pointer?
      get() = __639740528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _639740528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__639740528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __639740528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a1cef3d807344168df2546835a6414f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentStateChangedEventArgs(ptr: Pointer?): WithDefault =
        ITargetedContentStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITargetedContentStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__639740528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentStateChangedEventArgs):
        Array<ITargetedContentStateChangedEventArgs?> = (elements as
        Array<ITargetedContentStateChangedEventArgs?>).castToImpl<ITargetedContentStateChangedEventArgs,ITargetedContentStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentStateChangedEventArgs?> =
        arrayOfNulls<ITargetedContentStateChangedEventArgs_Impl>(size) as
        Array<ITargetedContentStateChangedEventArgs?>
  }
}
