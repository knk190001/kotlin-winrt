package Windows.ApplicationModel.Core

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ICoreApplicationUnhandledError.ABI::class)
@Signature("{f0e24ab0-dd09-42e1-b0bc-e0e131f78d7e}")
@Guid("f0e24ab0dd0942e1b0bce0e131f78d7e")
@WinRTInterface("f0e24ab0dd0942e1b0bce0e131f78d7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationUnhandledError.ByReference::class)
public interface ICoreApplicationUnhandledError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_UnhandledErrorDetected(handler: EventHandler<UnhandledErrorDetectedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_UnhandledErrorDetected(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationUnhandledError> {
    public override fun getValue() = ABI.makeICoreApplicationUnhandledError(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationUnhandledError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationUnhandledError {
    public val __1229086282_Ptr: Pointer?

    public val _1229086282_VtblPtr: Pointer?
      get() = __1229086282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_UnhandledErrorDetected(handler: EventHandler<UnhandledErrorDetectedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1229086282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1229086282_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_UnhandledErrorDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1229086282_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1229086282_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplicationUnhandledError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1229086282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationUnhandledError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0e24ab0dd0942e1b0bce0e131f78d7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationUnhandledError(ptr: Pointer?): WithDefault =
        ICoreApplicationUnhandledError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationUnhandledError {
      val address = segment.toRawLongValue()
      return makeICoreApplicationUnhandledError(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationUnhandledError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1229086282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationUnhandledError):
        Array<ICoreApplicationUnhandledError?> = (elements as
        Array<ICoreApplicationUnhandledError?>).castToImpl<ICoreApplicationUnhandledError,ICoreApplicationUnhandledError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationUnhandledError?> =
        arrayOfNulls<ICoreApplicationUnhandledError_Impl>(size) as
        Array<ICoreApplicationUnhandledError?>
  }
}
