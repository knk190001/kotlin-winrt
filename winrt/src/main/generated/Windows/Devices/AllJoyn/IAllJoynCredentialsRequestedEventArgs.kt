package Windows.Devices.AllJoyn

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAllJoynCredentialsRequestedEventArgs.ABI::class)
@Signature("{6a87e34e-b069-4b80-9e1a-41bc837c65d2}")
@Guid("6a87e34eb0694b809e1a41bc837c65d2")
@WinRTInterface("6a87e34eb0694b809e1a41bc837c65d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynCredentialsRequestedEventArgs.ByReference::class)
public interface IAllJoynCredentialsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AttemptCount(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Credentials(): AllJoynCredentials?

  @InterfaceMethod(2)
  public fun get_PeerUniqueName(): String?

  @InterfaceMethod(3)
  public fun get_RequestedUserName(): String?

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynCredentialsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynCredentialsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynCredentialsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynCredentialsRequestedEventArgs {
    public val __1822218988_Ptr: Pointer?

    public val _1822218988_VtblPtr: Pointer?
      get() = __1822218988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AttemptCount(): WinDef.USHORT {
      val fnPtr = _1822218988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1822218988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Credentials(): AllJoynCredentials? {
      val fnPtr = _1822218988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynCredentials>()
      val hr = fn.invokeHR(arrayOf(__1822218988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynCredentials>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PeerUniqueName(): String? {
      val fnPtr = _1822218988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1822218988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RequestedUserName(): String? {
      val fnPtr = _1822218988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1822218988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1822218988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1822218988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynCredentialsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1822218988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynCredentialsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a87e34eb0694b809e1a41bc837c65d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynCredentialsRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynCredentialsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynCredentialsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynCredentialsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynCredentialsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1822218988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynCredentialsRequestedEventArgs):
        Array<IAllJoynCredentialsRequestedEventArgs?> = (elements as
        Array<IAllJoynCredentialsRequestedEventArgs?>).castToImpl<IAllJoynCredentialsRequestedEventArgs,IAllJoynCredentialsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynCredentialsRequestedEventArgs?> =
        arrayOfNulls<IAllJoynCredentialsRequestedEventArgs_Impl>(size) as
        Array<IAllJoynCredentialsRequestedEventArgs?>
  }
}
