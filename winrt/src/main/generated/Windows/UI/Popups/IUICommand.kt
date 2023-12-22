package Windows.UI.Popups

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

@ABIMarker(IUICommand.ABI::class)
@Signature("{4ff93a75-4145-47ff-ac7f-dff1c1fa5b0f}")
@Guid("4ff93a75414547ffac7fdff1c1fa5b0f")
@WinRTInterface("4ff93a75414547ffac7fdff1c1fa5b0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUICommand.ByReference::class)
public interface IUICommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  @InterfaceMethod(1)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Invoked(): UICommandInvokedHandler?

  @InterfaceMethod(3)
  public fun put_Invoked(value: UICommandInvokedHandler?): Unit

  @InterfaceMethod(4)
  public fun get_Id(): IUnknown?

  @InterfaceMethod(5)
  public fun put_Id(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUICommand> {
    public override fun getValue() = ABI.makeIUICommand(pointer.getPointer(0))

    public fun setValue(value: IUICommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUICommand {
    public val __250994524_Ptr: Pointer?

    public val _250994524_VtblPtr: Pointer?
      get() = __250994524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _250994524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _250994524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Invoked(): UICommandInvokedHandler? {
      val fnPtr = _250994524_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommandInvokedHandler>()
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommandInvokedHandler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Invoked(value: UICommandInvokedHandler?): Unit {
      val fnPtr = _250994524_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Id(): IUnknown? {
      val fnPtr = _250994524_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Id(value: IUnknown?): Unit {
      val fnPtr = _250994524_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__250994524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUICommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __250994524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUICommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ff93a75414547ffac7fdff1c1fa5b0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUICommand(ptr: Pointer?): WithDefault = IUICommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUICommand {
      val address = segment.toRawLongValue()
      return makeIUICommand(Pointer(address))
    }

    public override fun toNative(obj: IUICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__250994524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUICommand): Array<IUICommand?> = (elements as
        Array<IUICommand?>).castToImpl<IUICommand,IUICommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUICommand?> = arrayOfNulls<IUICommand_Impl>(size)
        as Array<IUICommand?>
  }
}
