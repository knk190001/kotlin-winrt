package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewConsolidatedEventArgs.ABI::class)
@Signature("{514449ec-7ea2-4de7-a6a6-7dfbaaebb6fb}")
@Guid("514449ec7ea24de7a6a67dfbaaebb6fb")
@WinRTInterface("514449ec7ea24de7a6a67dfbaaebb6fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewConsolidatedEventArgs.ByReference::class)
public interface IApplicationViewConsolidatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsUserInitiated(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewConsolidatedEventArgs> {
    public override fun getValue() =
        ABI.makeIApplicationViewConsolidatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewConsolidatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewConsolidatedEventArgs {
    public val __205798567_Ptr: Pointer?

    public val _205798567_VtblPtr: Pointer?
      get() = __205798567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _205798567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__205798567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewConsolidatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __205798567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewConsolidatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("514449ec7ea24de7a6a67dfbaaebb6fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewConsolidatedEventArgs(ptr: Pointer?): WithDefault =
        IApplicationViewConsolidatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewConsolidatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIApplicationViewConsolidatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewConsolidatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__205798567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewConsolidatedEventArgs):
        Array<IApplicationViewConsolidatedEventArgs?> = (elements as
        Array<IApplicationViewConsolidatedEventArgs?>).castToImpl<IApplicationViewConsolidatedEventArgs,IApplicationViewConsolidatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewConsolidatedEventArgs?> =
        arrayOfNulls<IApplicationViewConsolidatedEventArgs_Impl>(size) as
        Array<IApplicationViewConsolidatedEventArgs?>
  }
}
