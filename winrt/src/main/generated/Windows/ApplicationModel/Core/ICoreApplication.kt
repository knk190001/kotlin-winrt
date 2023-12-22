package Windows.ApplicationModel.Core

import Windows.ApplicationModel.SuspendingEventArgs
import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IGetActivationFactory
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreApplication.ABI::class)
@Signature("{0aacf7a4-5e1d-49df-8034-fb6a68bc5ed1}")
@Guid("0aacf7a45e1d49df8034fb6a68bc5ed1")
@WinRTInterface("0aacf7a45e1d49df8034fb6a68bc5ed1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplication.ByReference::class)
public interface ICoreApplication : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun add_Suspending(handler: EventHandler<SuspendingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Suspending(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Resuming(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Resuming(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_Properties(): IPropertySet?

  @InterfaceMethod(6)
  public fun GetCurrentView(): CoreApplicationView?

  @InterfaceMethod(7)
  public fun Run(viewSource: IFrameworkViewSource?): Unit

  @InterfaceMethod(8)
  public fun RunWithActivationFactories(activationFactoryCallback: IGetActivationFactory?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplication> {
    public override fun getValue() = ABI.makeICoreApplication(pointer.getPointer(0))

    public fun setValue(value: ICoreApplication_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplication {
    public val __830626287_Ptr: Pointer?

    public val _830626287_VtblPtr: Pointer?
      get() = __830626287_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _830626287_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Suspending(handler: EventHandler<SuspendingEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _830626287_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Suspending(token: EventRegistrationToken?): Unit {
      val fnPtr = _830626287_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Resuming(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _830626287_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Resuming(token: EventRegistrationToken?): Unit {
      val fnPtr = _830626287_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _830626287_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetCurrentView(): CoreApplicationView? {
      val fnPtr = _830626287_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreApplicationView>()
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreApplicationView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Run(viewSource: IFrameworkViewSource?): Unit {
      val fnPtr = _830626287_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(viewSource),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun RunWithActivationFactories(activationFactoryCallback: IGetActivationFactory?): Unit {
      val fnPtr = _830626287_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__830626287_Ptr, marshalToNative(activationFactoryCallback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplication_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __830626287_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplication, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0aacf7a45e1d49df8034fb6a68bc5ed1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplication(ptr: Pointer?): WithDefault = ICoreApplication_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplication {
      val address = segment.toRawLongValue()
      return makeICoreApplication(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__830626287_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplication): Array<ICoreApplication?> = (elements as
        Array<ICoreApplication?>).castToImpl<ICoreApplication,ICoreApplication_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplication?> =
        arrayOfNulls<ICoreApplication_Impl>(size) as Array<ICoreApplication?>
  }
}
