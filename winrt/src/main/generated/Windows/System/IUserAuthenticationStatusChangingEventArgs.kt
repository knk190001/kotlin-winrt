package Windows.System

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

@ABIMarker(IUserAuthenticationStatusChangingEventArgs.ABI::class)
@Signature("{8c030f28-a711-4c1e-ab48-04179c15938f}")
@Guid("8c030f28a7114c1eab4804179c15938f")
@WinRTInterface("8c030f28a7114c1eab4804179c15938f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserAuthenticationStatusChangingEventArgs.ByReference::class)
public interface IUserAuthenticationStatusChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): UserAuthenticationStatusChangeDeferral?

  @InterfaceMethod(1)
  public fun get_User(): User?

  @InterfaceMethod(2)
  public fun get_NewStatus(): UserAuthenticationStatus?

  @InterfaceMethod(3)
  public fun get_CurrentStatus(): UserAuthenticationStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserAuthenticationStatusChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIUserAuthenticationStatusChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserAuthenticationStatusChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserAuthenticationStatusChangingEventArgs {
    public val __44358054_Ptr: Pointer?

    public val _44358054_VtblPtr: Pointer?
      get() = __44358054_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): UserAuthenticationStatusChangeDeferral? {
      val fnPtr = _44358054_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationStatusChangeDeferral>()
      val hr = fn.invokeHR(arrayOf(__44358054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationStatusChangeDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _44358054_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__44358054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NewStatus(): UserAuthenticationStatus? {
      val fnPtr = _44358054_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationStatus>()
      val hr = fn.invokeHR(arrayOf(__44358054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CurrentStatus(): UserAuthenticationStatus? {
      val fnPtr = _44358054_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationStatus>()
      val hr = fn.invokeHR(arrayOf(__44358054_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationStatus>(result.getValue())
      return resultValue
    }
  }

  public class IUserAuthenticationStatusChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __44358054_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserAuthenticationStatusChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c030f28a7114c1eab4804179c15938f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserAuthenticationStatusChangingEventArgs(ptr: Pointer?): WithDefault =
        IUserAuthenticationStatusChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserAuthenticationStatusChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserAuthenticationStatusChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserAuthenticationStatusChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__44358054_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserAuthenticationStatusChangingEventArgs):
        Array<IUserAuthenticationStatusChangingEventArgs?> = (elements as
        Array<IUserAuthenticationStatusChangingEventArgs?>).castToImpl<IUserAuthenticationStatusChangingEventArgs,IUserAuthenticationStatusChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserAuthenticationStatusChangingEventArgs?> =
        arrayOfNulls<IUserAuthenticationStatusChangingEventArgs_Impl>(size) as
        Array<IUserAuthenticationStatusChangingEventArgs?>
  }
}
