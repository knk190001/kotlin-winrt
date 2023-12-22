package Windows.Security.DataProtection

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

@ABIMarker(IUserDataAvailabilityStateChangedEventArgs.ABI::class)
@Signature("{a76582c9-06a2-4273-a803-834c9f87fbeb}")
@Guid("a76582c906a24273a803834c9f87fbeb")
@WinRTInterface("a76582c906a24273a803834c9f87fbeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAvailabilityStateChangedEventArgs.ByReference::class)
public interface IUserDataAvailabilityStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAvailabilityStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUserDataAvailabilityStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserDataAvailabilityStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAvailabilityStateChangedEventArgs {
    public val __97976063_Ptr: Pointer?

    public val _97976063_VtblPtr: Pointer?
      get() = __97976063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _97976063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__97976063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAvailabilityStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97976063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAvailabilityStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a76582c906a24273a803834c9f87fbeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAvailabilityStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IUserDataAvailabilityStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAvailabilityStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserDataAvailabilityStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAvailabilityStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97976063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAvailabilityStateChangedEventArgs):
        Array<IUserDataAvailabilityStateChangedEventArgs?> = (elements as
        Array<IUserDataAvailabilityStateChangedEventArgs?>).castToImpl<IUserDataAvailabilityStateChangedEventArgs,IUserDataAvailabilityStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAvailabilityStateChangedEventArgs?> =
        arrayOfNulls<IUserDataAvailabilityStateChangedEventArgs_Impl>(size) as
        Array<IUserDataAvailabilityStateChangedEventArgs?>
  }
}
