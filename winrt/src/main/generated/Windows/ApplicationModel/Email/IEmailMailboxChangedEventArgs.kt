package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxChangedEventArgs.ABI::class)
@Signature("{3cfd5f6e-01d4-4e4a-a44c-b22dd42ec207}")
@Guid("3cfd5f6e01d44e4aa44cb22dd42ec207")
@WinRTInterface("3cfd5f6e01d44e4aa44cb22dd42ec207")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxChangedEventArgs.ByReference::class)
public interface IEmailMailboxChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): EmailMailboxChangedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxChangedEventArgs> {
    public override fun getValue() = ABI.makeIEmailMailboxChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxChangedEventArgs {
    public val __715801842_Ptr: Pointer?

    public val _715801842_VtblPtr: Pointer?
      get() = __715801842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): EmailMailboxChangedDeferral? {
      val fnPtr = _715801842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxChangedDeferral>()
      val hr = fn.invokeHR(arrayOf(__715801842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxChangedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __715801842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cfd5f6e01d44e4aa44cb22dd42ec207")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxChangedEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__715801842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxChangedEventArgs):
        Array<IEmailMailboxChangedEventArgs?> = (elements as
        Array<IEmailMailboxChangedEventArgs?>).castToImpl<IEmailMailboxChangedEventArgs,IEmailMailboxChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxChangedEventArgs?> =
        arrayOfNulls<IEmailMailboxChangedEventArgs_Impl>(size) as
        Array<IEmailMailboxChangedEventArgs?>
  }
}
