package Microsoft.Windows.AppLifecycle

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstance.ABI::class)
@Signature("{75766ae4-0239-5a26-b9da-d5bfc75a4866}")
@Guid("75766ae402395a26b9dad5bfc75a4866")
@WinRTInterface("75766ae402395a26b9dad5bfc75a4866")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstance.ByReference::class)
public interface IAppInstance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UnregisterKey(): Unit

  @InterfaceMethod(1)
  public fun RedirectActivationToAsync(args: AppActivationArguments?): IAsyncAction?

  @InterfaceMethod(2)
  public fun GetActivatedEventArgs(): AppActivationArguments?

  @InterfaceMethod(3)
  public fun add_Activated(handler: EventHandler<AppActivationArguments?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Activated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_Key(): String?

  @InterfaceMethod(6)
  public fun get_IsCurrent(): Boolean

  @InterfaceMethod(7)
  public fun get_ProcessId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppInstance> {
    public override fun getValue() = ABI.makeIAppInstance(pointer.getPointer(0))

    public fun setValue(value: IAppInstance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstance {
    public val __545275137_Ptr: Pointer?

    public val _545275137_VtblPtr: Pointer?
      get() = __545275137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnregisterKey(): Unit {
      val fnPtr = _545275137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RedirectActivationToAsync(args: AppActivationArguments?): IAsyncAction? {
      val fnPtr = _545275137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr, marshalToNative(args), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetActivatedEventArgs(): AppActivationArguments? {
      val fnPtr = _545275137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppActivationArguments>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppActivationArguments>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Activated(handler: EventHandler<AppActivationArguments?>?):
        EventRegistrationToken? {
      val fnPtr = _545275137_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Activated(token: EventRegistrationToken?): Unit {
      val fnPtr = _545275137_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Key(): String? {
      val fnPtr = _545275137_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsCurrent(): Boolean {
      val fnPtr = _545275137_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ProcessId(): WinDef.UINT {
      val fnPtr = _545275137_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__545275137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppInstance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545275137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75766ae402395a26b9dad5bfc75a4866")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstance(ptr: Pointer?): WithDefault = IAppInstance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstance {
      val address = segment.toRawLongValue()
      return makeIAppInstance(Pointer(address))
    }

    public override fun toNative(obj: IAppInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545275137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstance): Array<IAppInstance?> = (elements as
        Array<IAppInstance?>).castToImpl<IAppInstance,IAppInstance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstance?> =
        arrayOfNulls<IAppInstance_Impl>(size) as Array<IAppInstance?>
  }
}
