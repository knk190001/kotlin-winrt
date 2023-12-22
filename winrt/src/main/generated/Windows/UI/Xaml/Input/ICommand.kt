package Windows.UI.Xaml.Input

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

@ABIMarker(ICommand.ABI::class)
@Signature("{e5af3542-ca67-4081-995b-709dd13792df}")
@Guid("e5af3542ca674081995b709dd13792df")
@WinRTInterface("e5af3542ca674081995b709dd13792df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommand.ByReference::class)
public interface ICommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_CanExecuteChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CanExecuteChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun CanExecute(parameter: IUnknown?): Boolean

  @InterfaceMethod(3)
  public fun Execute(parameter: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICommand> {
    public override fun getValue() = ABI.makeICommand(pointer.getPointer(0))

    public fun setValue(value: ICommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommand {
    public val __2120975435_Ptr: Pointer?

    public val _2120975435_VtblPtr: Pointer?
      get() = __2120975435_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_CanExecuteChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2120975435_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2120975435_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CanExecuteChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2120975435_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2120975435_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CanExecute(parameter: IUnknown?): Boolean {
      val fnPtr = _2120975435_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2120975435_Ptr, marshalToNative(parameter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Execute(parameter: IUnknown?): Unit {
      val fnPtr = _2120975435_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2120975435_Ptr, marshalToNative(parameter),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2120975435_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5af3542ca674081995b709dd13792df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommand(ptr: Pointer?): WithDefault = ICommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommand {
      val address = segment.toRawLongValue()
      return makeICommand(Pointer(address))
    }

    public override fun toNative(obj: ICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120975435_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommand): Array<ICommand?> = (elements as
        Array<ICommand?>).castToImpl<ICommand,ICommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommand?> = arrayOfNulls<ICommand_Impl>(size) as
        Array<ICommand?>
  }
}
