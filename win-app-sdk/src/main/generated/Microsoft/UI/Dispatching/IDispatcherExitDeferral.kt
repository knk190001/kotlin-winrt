package Microsoft.UI.Dispatching

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

@ABIMarker(IDispatcherExitDeferral.ABI::class)
@Signature("{910b5aac-3310-563e-8418-f3005579729e}")
@Guid("910b5aac3310563e8418f3005579729e")
@WinRTInterface("910b5aac3310563e8418f3005579729e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherExitDeferral.ByReference::class)
public interface IDispatcherExitDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherExitDeferral> {
    public override fun getValue() = ABI.makeIDispatcherExitDeferral(pointer.getPointer(0))

    public fun setValue(value: IDispatcherExitDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherExitDeferral {
    public val __1069401355_Ptr: Pointer?

    public val _1069401355_VtblPtr: Pointer?
      get() = __1069401355_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1069401355_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1069401355_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDispatcherExitDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1069401355_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherExitDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("910b5aac3310563e8418f3005579729e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherExitDeferral(ptr: Pointer?): WithDefault =
        IDispatcherExitDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherExitDeferral {
      val address = segment.toRawLongValue()
      return makeIDispatcherExitDeferral(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherExitDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1069401355_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherExitDeferral): Array<IDispatcherExitDeferral?>
        = (elements as
        Array<IDispatcherExitDeferral?>).castToImpl<IDispatcherExitDeferral,IDispatcherExitDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherExitDeferral?> =
        arrayOfNulls<IDispatcherExitDeferral_Impl>(size) as Array<IDispatcherExitDeferral?>
  }
}
