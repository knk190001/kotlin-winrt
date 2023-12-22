package Windows.Devices.AllJoyn

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynSessionMemberAddedEventArgs.ABI::class)
@Signature("{49a2798a-0dd1-46c1-9cd6-27190e503a5e}")
@Guid("49a2798a0dd146c19cd627190e503a5e")
@WinRTInterface("49a2798a0dd146c19cd627190e503a5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynSessionMemberAddedEventArgs.ByReference::class)
public interface IAllJoynSessionMemberAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UniqueName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynSessionMemberAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynSessionMemberAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynSessionMemberAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynSessionMemberAddedEventArgs {
    public val __639633322_Ptr: Pointer?

    public val _639633322_VtblPtr: Pointer?
      get() = __639633322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UniqueName(): String? {
      val fnPtr = _639633322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__639633322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynSessionMemberAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __639633322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynSessionMemberAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49a2798a0dd146c19cd627190e503a5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynSessionMemberAddedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynSessionMemberAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynSessionMemberAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynSessionMemberAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynSessionMemberAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__639633322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynSessionMemberAddedEventArgs):
        Array<IAllJoynSessionMemberAddedEventArgs?> = (elements as
        Array<IAllJoynSessionMemberAddedEventArgs?>).castToImpl<IAllJoynSessionMemberAddedEventArgs,IAllJoynSessionMemberAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynSessionMemberAddedEventArgs?> =
        arrayOfNulls<IAllJoynSessionMemberAddedEventArgs_Impl>(size) as
        Array<IAllJoynSessionMemberAddedEventArgs?>
  }
}
