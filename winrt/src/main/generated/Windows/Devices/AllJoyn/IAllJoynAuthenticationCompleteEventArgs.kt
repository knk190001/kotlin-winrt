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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynAuthenticationCompleteEventArgs.ABI::class)
@Signature("{97b4701c-15dc-4b53-b6a4-7d134300d7bf}")
@Guid("97b4701c15dc4b53b6a47d134300d7bf")
@WinRTInterface("97b4701c15dc4b53b6a47d134300d7bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynAuthenticationCompleteEventArgs.ByReference::class)
public interface IAllJoynAuthenticationCompleteEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AuthenticationMechanism(): AllJoynAuthenticationMechanism?

  @InterfaceMethod(1)
  public fun get_PeerUniqueName(): String?

  @InterfaceMethod(2)
  public fun get_Succeeded(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynAuthenticationCompleteEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynAuthenticationCompleteEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynAuthenticationCompleteEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynAuthenticationCompleteEventArgs {
    public val __1305570251_Ptr: Pointer?

    public val _1305570251_VtblPtr: Pointer?
      get() = __1305570251_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AuthenticationMechanism(): AllJoynAuthenticationMechanism? {
      val fnPtr = _1305570251_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynAuthenticationMechanism>()
      val hr = fn.invokeHR(arrayOf(__1305570251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynAuthenticationMechanism>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PeerUniqueName(): String? {
      val fnPtr = _1305570251_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1305570251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _1305570251_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1305570251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynAuthenticationCompleteEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1305570251_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynAuthenticationCompleteEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97b4701c15dc4b53b6a47d134300d7bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynAuthenticationCompleteEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynAuthenticationCompleteEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynAuthenticationCompleteEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynAuthenticationCompleteEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynAuthenticationCompleteEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305570251_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynAuthenticationCompleteEventArgs):
        Array<IAllJoynAuthenticationCompleteEventArgs?> = (elements as
        Array<IAllJoynAuthenticationCompleteEventArgs?>).castToImpl<IAllJoynAuthenticationCompleteEventArgs,IAllJoynAuthenticationCompleteEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynAuthenticationCompleteEventArgs?> =
        arrayOfNulls<IAllJoynAuthenticationCompleteEventArgs_Impl>(size) as
        Array<IAllJoynAuthenticationCompleteEventArgs?>
  }
}
