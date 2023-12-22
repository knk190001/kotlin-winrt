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

@ABIMarker(ITargetedContentAvailabilityChangedEventArgs.ABI::class)
@Signature("{e0f59d26-5927-4450-965c-1ceb7becde65}")
@Guid("e0f59d2659274450965c1ceb7becde65")
@WinRTInterface("e0f59d2659274450965c1ceb7becde65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentAvailabilityChangedEventArgs.ByReference::class)
public interface ITargetedContentAvailabilityChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentAvailabilityChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITargetedContentAvailabilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentAvailabilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentAvailabilityChangedEventArgs {
    public val __1743404862_Ptr: Pointer?

    public val _1743404862_VtblPtr: Pointer?
      get() = __1743404862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1743404862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1743404862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentAvailabilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1743404862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentAvailabilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0f59d2659274450965c1ceb7becde65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentAvailabilityChangedEventArgs(ptr: Pointer?): WithDefault =
        ITargetedContentAvailabilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITargetedContentAvailabilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITargetedContentAvailabilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentAvailabilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1743404862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentAvailabilityChangedEventArgs):
        Array<ITargetedContentAvailabilityChangedEventArgs?> = (elements as
        Array<ITargetedContentAvailabilityChangedEventArgs?>).castToImpl<ITargetedContentAvailabilityChangedEventArgs,ITargetedContentAvailabilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentAvailabilityChangedEventArgs?> =
        arrayOfNulls<ITargetedContentAvailabilityChangedEventArgs_Impl>(size) as
        Array<ITargetedContentAvailabilityChangedEventArgs?>
  }
}
