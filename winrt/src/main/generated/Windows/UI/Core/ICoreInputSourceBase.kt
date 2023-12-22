package Windows.UI.Core

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

@ABIMarker(ICoreInputSourceBase.ABI::class)
@Signature("{9f488807-4580-4be8-be68-92a9311713bb}")
@Guid("9f48880745804be8be6892a9311713bb")
@WinRTInterface("9f48880745804be8be6892a9311713bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputSourceBase.ByReference::class)
public interface ICoreInputSourceBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Dispatcher(): CoreDispatcher?

  @InterfaceMethod(1)
  public fun get_IsInputEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsInputEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun add_InputEnabled(handler: TypedEventHandler<IUnknown?, InputEnabledEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_InputEnabled(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputSourceBase> {
    public override fun getValue() = ABI.makeICoreInputSourceBase(pointer.getPointer(0))

    public fun setValue(value: ICoreInputSourceBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputSourceBase {
    public val __218075036_Ptr: Pointer?

    public val _218075036_VtblPtr: Pointer?
      get() = __218075036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _218075036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__218075036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInputEnabled(): Boolean {
      val fnPtr = _218075036_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__218075036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsInputEnabled(value: Boolean): Unit {
      val fnPtr = _218075036_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__218075036_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_InputEnabled(handler: TypedEventHandler<IUnknown?,
        InputEnabledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _218075036_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__218075036_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_InputEnabled(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _218075036_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__218075036_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreInputSourceBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __218075036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputSourceBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f48880745804be8be6892a9311713bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputSourceBase(ptr: Pointer?): WithDefault = ICoreInputSourceBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputSourceBase {
      val address = segment.toRawLongValue()
      return makeICoreInputSourceBase(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputSourceBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__218075036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputSourceBase): Array<ICoreInputSourceBase?> =
        (elements as
        Array<ICoreInputSourceBase?>).castToImpl<ICoreInputSourceBase,ICoreInputSourceBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputSourceBase?> =
        arrayOfNulls<ICoreInputSourceBase_Impl>(size) as Array<ICoreInputSourceBase?>
  }
}
