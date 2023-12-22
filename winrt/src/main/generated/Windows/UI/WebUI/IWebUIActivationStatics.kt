package Windows.UI.WebUI

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

@ABIMarker(IWebUIActivationStatics.ABI::class)
@Signature("{351b86bd-43b3-482b-85db-35d87b517ad9}")
@Guid("351b86bd43b3482b85db35d87b517ad9")
@WinRTInterface("351b86bd43b3482b85db35d87b517ad9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIActivationStatics.ByReference::class)
public interface IWebUIActivationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Activated(handler: ActivatedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Activated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Suspending(handler: SuspendingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Suspending(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Resuming(handler: ResumingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Resuming(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Navigated(handler: NavigatedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Navigated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIActivationStatics> {
    public override fun getValue() = ABI.makeIWebUIActivationStatics(pointer.getPointer(0))

    public fun setValue(value: IWebUIActivationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIActivationStatics {
    public val __537710281_Ptr: Pointer?

    public val _537710281_VtblPtr: Pointer?
      get() = __537710281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Activated(handler: ActivatedEventHandler?): EventRegistrationToken? {
      val fnPtr = _537710281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Activated(token: EventRegistrationToken?): Unit {
      val fnPtr = _537710281_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Suspending(handler: SuspendingEventHandler?): EventRegistrationToken? {
      val fnPtr = _537710281_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Suspending(token: EventRegistrationToken?): Unit {
      val fnPtr = _537710281_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Resuming(handler: ResumingEventHandler?): EventRegistrationToken? {
      val fnPtr = _537710281_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Resuming(token: EventRegistrationToken?): Unit {
      val fnPtr = _537710281_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Navigated(handler: NavigatedEventHandler?): EventRegistrationToken? {
      val fnPtr = _537710281_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Navigated(token: EventRegistrationToken?): Unit {
      val fnPtr = _537710281_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__537710281_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUIActivationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __537710281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIActivationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("351b86bd43b3482b85db35d87b517ad9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIActivationStatics(ptr: Pointer?): WithDefault =
        IWebUIActivationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIActivationStatics {
      val address = segment.toRawLongValue()
      return makeIWebUIActivationStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebUIActivationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__537710281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIActivationStatics): Array<IWebUIActivationStatics?>
        = (elements as
        Array<IWebUIActivationStatics?>).castToImpl<IWebUIActivationStatics,IWebUIActivationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIActivationStatics?> =
        arrayOfNulls<IWebUIActivationStatics_Impl>(size) as Array<IWebUIActivationStatics?>
  }
}
