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

@ABIMarker(IUICommandFactory.ABI::class)
@Signature("{a21a8189-26b0-4676-ae94-54041bc125e8}")
@Guid("a21a818926b04676ae9454041bc125e8")
@WinRTInterface("a21a818926b04676ae9454041bc125e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUICommandFactory.ByReference::class)
public interface IUICommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(label: String?): UICommand?

  @InterfaceMethod(1)
  public fun CreateWithHandler(label: String?, action: UICommandInvokedHandler?): UICommand?

  @InterfaceMethod(2)
  public fun CreateWithHandlerAndId(
    label: String?,
    action: UICommandInvokedHandler?,
    commandId: IUnknown?
  ): UICommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUICommandFactory> {
    public override fun getValue() = ABI.makeIUICommandFactory(pointer.getPointer(0))

    public fun setValue(value: IUICommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUICommandFactory {
    public val __2085197882_Ptr: Pointer?

    public val _2085197882_VtblPtr: Pointer?
      get() = __2085197882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(label: String?): UICommand? {
      val fnPtr = _2085197882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommand>()
      val hr = fn.invokeHR(arrayOf(__2085197882_Ptr, marshalToNative(label), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithHandler(label: String?, action: UICommandInvokedHandler?):
        UICommand? {
      val fnPtr = _2085197882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommand>()
      val hr = fn.invokeHR(arrayOf(__2085197882_Ptr, marshalToNative(label),
          marshalToNative(action), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithHandlerAndId(
      label: String?,
      action: UICommandInvokedHandler?,
      commandId: IUnknown?
    ): UICommand? {
      val fnPtr = _2085197882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommand>()
      val hr = fn.invokeHR(arrayOf(__2085197882_Ptr, marshalToNative(label),
          marshalToNative(action), marshalToNative(commandId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommand>(result.getValue())
      return resultValue
    }
  }

  public class IUICommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2085197882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUICommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a21a818926b04676ae9454041bc125e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUICommandFactory(ptr: Pointer?): WithDefault = IUICommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUICommandFactory {
      val address = segment.toRawLongValue()
      return makeIUICommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IUICommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2085197882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUICommandFactory): Array<IUICommandFactory?> = (elements
        as Array<IUICommandFactory?>).castToImpl<IUICommandFactory,IUICommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUICommandFactory?> =
        arrayOfNulls<IUICommandFactory_Impl>(size) as Array<IUICommandFactory?>
  }
}
