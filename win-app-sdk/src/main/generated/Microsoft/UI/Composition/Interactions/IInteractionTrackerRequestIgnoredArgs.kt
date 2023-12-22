package Microsoft.UI.Composition.Interactions

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

@ABIMarker(IInteractionTrackerRequestIgnoredArgs.ABI::class)
@Signature("{c276205e-f7a5-5ba2-ad45-d12c3c339149}")
@Guid("c276205ef7a55ba2ad45d12c3c339149")
@WinRTInterface("c276205ef7a55ba2ad45d12c3c339149")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerRequestIgnoredArgs.ByReference::class)
public interface IInteractionTrackerRequestIgnoredArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerRequestIgnoredArgs> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerRequestIgnoredArgs(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerRequestIgnoredArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerRequestIgnoredArgs {
    public val __1237563856_Ptr: Pointer?

    public val _1237563856_VtblPtr: Pointer?
      get() = __1237563856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): Int {
      val fnPtr = _1237563856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1237563856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerRequestIgnoredArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237563856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerRequestIgnoredArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c276205ef7a55ba2ad45d12c3c339149")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerRequestIgnoredArgs(ptr: Pointer?): WithDefault =
        IInteractionTrackerRequestIgnoredArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerRequestIgnoredArgs {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerRequestIgnoredArgs(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerRequestIgnoredArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237563856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerRequestIgnoredArgs):
        Array<IInteractionTrackerRequestIgnoredArgs?> = (elements as
        Array<IInteractionTrackerRequestIgnoredArgs?>).castToImpl<IInteractionTrackerRequestIgnoredArgs,IInteractionTrackerRequestIgnoredArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerRequestIgnoredArgs?> =
        arrayOfNulls<IInteractionTrackerRequestIgnoredArgs_Impl>(size) as
        Array<IInteractionTrackerRequestIgnoredArgs?>
  }
}
