package Windows.Gaming.Input

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IUINavigationControllerStatics.ABI::class)
@Signature("{2f14930a-f6f8-4a48-8d89-94786cca0c2e}")
@Guid("2f14930af6f84a488d8994786cca0c2e")
@WinRTInterface("2f14930af6f84a488d8994786cca0c2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUINavigationControllerStatics.ByReference::class)
public interface IUINavigationControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_UINavigationControllerAdded(value: EventHandler<UINavigationController?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_UINavigationControllerAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_UINavigationControllerRemoved(value: EventHandler<UINavigationController?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_UINavigationControllerRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_UINavigationControllers(): IVectorView<UINavigationController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUINavigationControllerStatics> {
    public override fun getValue() = ABI.makeIUINavigationControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IUINavigationControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUINavigationControllerStatics {
    public val __990121362_Ptr: Pointer?

    public val _990121362_VtblPtr: Pointer?
      get() = __990121362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_UINavigationControllerAdded(value: EventHandler<UINavigationController?>?):
        EventRegistrationToken? {
      val fnPtr = _990121362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990121362_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_UINavigationControllerAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _990121362_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990121362_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_UINavigationControllerRemoved(value: EventHandler<UINavigationController?>?):
        EventRegistrationToken? {
      val fnPtr = _990121362_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990121362_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_UINavigationControllerRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _990121362_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990121362_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UINavigationControllers(): IVectorView<UINavigationController?>? {
      val fnPtr = _990121362_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UINavigationController?>>()
      val hr = fn.invokeHR(arrayOf(__990121362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UINavigationController?>>(result.getValue())
      return resultValue
    }
  }

  public class IUINavigationControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __990121362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUINavigationControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f14930af6f84a488d8994786cca0c2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUINavigationControllerStatics(ptr: Pointer?): WithDefault =
        IUINavigationControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUINavigationControllerStatics {
      val address = segment.toRawLongValue()
      return makeIUINavigationControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUINavigationControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__990121362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUINavigationControllerStatics):
        Array<IUINavigationControllerStatics?> = (elements as
        Array<IUINavigationControllerStatics?>).castToImpl<IUINavigationControllerStatics,IUINavigationControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUINavigationControllerStatics?> =
        arrayOfNulls<IUINavigationControllerStatics_Impl>(size) as
        Array<IUINavigationControllerStatics?>
  }
}
