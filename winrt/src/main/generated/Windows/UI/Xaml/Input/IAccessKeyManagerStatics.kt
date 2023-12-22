package Windows.UI.Xaml.Input

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccessKeyManagerStatics.ABI::class)
@Signature("{4ca0efe6-d9c8-4ebc-b4c7-30d1838a81f1}")
@Guid("4ca0efe6d9c84ebcb4c730d1838a81f1")
@WinRTInterface("4ca0efe6d9c84ebcb4c730d1838a81f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyManagerStatics.ByReference::class)
public interface IAccessKeyManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDisplayModeEnabled(): Boolean

  @InterfaceMethod(1)
  public fun add_IsDisplayModeEnabledChanged(handler: TypedEventHandler<IUnknown?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_IsDisplayModeEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun ExitDisplayMode(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyManagerStatics> {
    public override fun getValue() = ABI.makeIAccessKeyManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyManagerStatics {
    public val __898213123_Ptr: Pointer?

    public val _898213123_VtblPtr: Pointer?
      get() = __898213123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDisplayModeEnabled(): Boolean {
      val fnPtr = _898213123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__898213123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_IsDisplayModeEnabledChanged(handler: TypedEventHandler<IUnknown?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _898213123_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__898213123_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_IsDisplayModeEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _898213123_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__898213123_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ExitDisplayMode(): Unit {
      val fnPtr = _898213123_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__898213123_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessKeyManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __898213123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ca0efe6d9c84ebcb4c730d1838a81f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyManagerStatics(ptr: Pointer?): WithDefault =
        IAccessKeyManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAccessKeyManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__898213123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyManagerStatics):
        Array<IAccessKeyManagerStatics?> = (elements as
        Array<IAccessKeyManagerStatics?>).castToImpl<IAccessKeyManagerStatics,IAccessKeyManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyManagerStatics?> =
        arrayOfNulls<IAccessKeyManagerStatics_Impl>(size) as Array<IAccessKeyManagerStatics?>
  }
}
