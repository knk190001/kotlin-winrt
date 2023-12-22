package Microsoft.Windows.Widgets.Providers

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWidgetCustomizationRequestedArgs.ABI::class)
@Signature("{41dea311-dd9b-5b8b-b493-3a30552116b8}")
@Guid("41dea311dd9b5b8bb4933a30552116b8")
@WinRTInterface("41dea311dd9b5b8bb4933a30552116b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetCustomizationRequestedArgs.ByReference::class)
public interface IWidgetCustomizationRequestedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetContext(): WidgetContext?

  @InterfaceMethod(1)
  public fun get_CustomState(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetCustomizationRequestedArgs> {
    public override fun getValue() =
        ABI.makeIWidgetCustomizationRequestedArgs(pointer.getPointer(0))

    public fun setValue(value: IWidgetCustomizationRequestedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetCustomizationRequestedArgs {
    public val __578422061_Ptr: Pointer?

    public val _578422061_VtblPtr: Pointer?
      get() = __578422061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetContext(): WidgetContext? {
      val fnPtr = _578422061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetContext>()
      val hr = fn.invokeHR(arrayOf(__578422061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CustomState(): String? {
      val fnPtr = _578422061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__578422061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetCustomizationRequestedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __578422061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetCustomizationRequestedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41dea311dd9b5b8bb4933a30552116b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetCustomizationRequestedArgs(ptr: Pointer?): WithDefault =
        IWidgetCustomizationRequestedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetCustomizationRequestedArgs {
      val address = segment.toRawLongValue()
      return makeIWidgetCustomizationRequestedArgs(Pointer(address))
    }

    public override fun toNative(obj: IWidgetCustomizationRequestedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__578422061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetCustomizationRequestedArgs):
        Array<IWidgetCustomizationRequestedArgs?> = (elements as
        Array<IWidgetCustomizationRequestedArgs?>).castToImpl<IWidgetCustomizationRequestedArgs,IWidgetCustomizationRequestedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetCustomizationRequestedArgs?> =
        arrayOfNulls<IWidgetCustomizationRequestedArgs_Impl>(size) as
        Array<IWidgetCustomizationRequestedArgs?>
  }
}
