package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastSignInStateChangedEventArgs.ABI::class)
@Signature("{02b692a4-5919-4a9e-8d5e-c9bb0dd3377a}")
@Guid("02b692a459194a9e8d5ec9bb0dd3377a")
@WinRTInterface("02b692a459194a9e8d5ec9bb0dd3377a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastSignInStateChangedEventArgs.ByReference::class)
public interface IAppBroadcastSignInStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SignInState(): AppBroadcastSignInState?

  @InterfaceMethod(1)
  public fun get_Result(): AppBroadcastSignInResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastSignInStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppBroadcastSignInStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastSignInStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastSignInStateChangedEventArgs {
    public val __916788154_Ptr: Pointer?

    public val _916788154_VtblPtr: Pointer?
      get() = __916788154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SignInState(): AppBroadcastSignInState? {
      val fnPtr = _916788154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastSignInState>()
      val hr = fn.invokeHR(arrayOf(__916788154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastSignInState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Result(): AppBroadcastSignInResult? {
      val fnPtr = _916788154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastSignInResult>()
      val hr = fn.invokeHR(arrayOf(__916788154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastSignInResult>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastSignInStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __916788154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastSignInStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02b692a459194a9e8d5ec9bb0dd3377a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastSignInStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppBroadcastSignInStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastSignInStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastSignInStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastSignInStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__916788154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastSignInStateChangedEventArgs):
        Array<IAppBroadcastSignInStateChangedEventArgs?> = (elements as
        Array<IAppBroadcastSignInStateChangedEventArgs?>).castToImpl<IAppBroadcastSignInStateChangedEventArgs,IAppBroadcastSignInStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastSignInStateChangedEventArgs?> =
        arrayOfNulls<IAppBroadcastSignInStateChangedEventArgs_Impl>(size) as
        Array<IAppBroadcastSignInStateChangedEventArgs?>
  }
}
