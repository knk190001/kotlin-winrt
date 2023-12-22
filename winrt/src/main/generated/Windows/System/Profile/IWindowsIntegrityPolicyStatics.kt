package Windows.System.Profile

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

@ABIMarker(IWindowsIntegrityPolicyStatics.ABI::class)
@Signature("{7d1d81db-8d63-4789-9ea5-ddcf65a94f3c}")
@Guid("7d1d81db8d6347899ea5ddcf65a94f3c")
@WinRTInterface("7d1d81db8d6347899ea5ddcf65a94f3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowsIntegrityPolicyStatics.ByReference::class)
public interface IWindowsIntegrityPolicyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsEnabledForTrial(): Boolean

  @InterfaceMethod(2)
  public fun get_CanDisable(): Boolean

  @InterfaceMethod(3)
  public fun get_IsDisableSupported(): Boolean

  @InterfaceMethod(4)
  public fun add_PolicyChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PolicyChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowsIntegrityPolicyStatics> {
    public override fun getValue() = ABI.makeIWindowsIntegrityPolicyStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowsIntegrityPolicyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowsIntegrityPolicyStatics {
    public val __895778709_Ptr: Pointer?

    public val _895778709_VtblPtr: Pointer?
      get() = __895778709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _895778709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabledForTrial(): Boolean {
      val fnPtr = _895778709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanDisable(): Boolean {
      val fnPtr = _895778709_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsDisableSupported(): Boolean {
      val fnPtr = _895778709_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_PolicyChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _895778709_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PolicyChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _895778709_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895778709_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindowsIntegrityPolicyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __895778709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowsIntegrityPolicyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d1d81db8d6347899ea5ddcf65a94f3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowsIntegrityPolicyStatics(ptr: Pointer?): WithDefault =
        IWindowsIntegrityPolicyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowsIntegrityPolicyStatics {
      val address = segment.toRawLongValue()
      return makeIWindowsIntegrityPolicyStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowsIntegrityPolicyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__895778709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowsIntegrityPolicyStatics):
        Array<IWindowsIntegrityPolicyStatics?> = (elements as
        Array<IWindowsIntegrityPolicyStatics?>).castToImpl<IWindowsIntegrityPolicyStatics,IWindowsIntegrityPolicyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowsIntegrityPolicyStatics?> =
        arrayOfNulls<IWindowsIntegrityPolicyStatics_Impl>(size) as
        Array<IWindowsIntegrityPolicyStatics?>
  }
}
