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

@ABIMarker(IWidgetProvider.ABI::class)
@Signature("{5c5774cc-72a0-452d-b9ed-075c0dd25eed}")
@Guid("5c5774cc72a0452db9ed075c0dd25eed")
@WinRTInterface("5c5774cc72a0452db9ed075c0dd25eed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetProvider.ByReference::class)
public interface IWidgetProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWidget(widgetContext: WidgetContext?): Unit

  @InterfaceMethod(1)
  public fun DeleteWidget(widgetId: String?, customState: String?): Unit

  @InterfaceMethod(2)
  public fun OnActionInvoked(actionInvokedArgs: WidgetActionInvokedArgs?): Unit

  @InterfaceMethod(3)
  public fun OnWidgetContextChanged(contextChangedArgs: WidgetContextChangedArgs?): Unit

  @InterfaceMethod(4)
  public fun Activate(widgetContext: WidgetContext?): Unit

  @InterfaceMethod(5)
  public fun Deactivate(widgetId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetProvider> {
    public override fun getValue() = ABI.makeIWidgetProvider(pointer.getPointer(0))

    public fun setValue(value: IWidgetProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetProvider {
    public val __857045510_Ptr: Pointer?

    public val _857045510_VtblPtr: Pointer?
      get() = __857045510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWidget(widgetContext: WidgetContext?): Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(widgetContext),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun DeleteWidget(widgetId: String?, customState: String?): Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(widgetId),
          marshalToNative(customState),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnActionInvoked(actionInvokedArgs: WidgetActionInvokedArgs?): Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(actionInvokedArgs),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnWidgetContextChanged(contextChangedArgs: WidgetContextChangedArgs?):
        Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(contextChangedArgs),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Activate(widgetContext: WidgetContext?): Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(widgetContext),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Deactivate(widgetId: String?): Unit {
      val fnPtr = _857045510_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857045510_Ptr, marshalToNative(widgetId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWidgetProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __857045510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c5774cc72a0452db9ed075c0dd25eed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetProvider(ptr: Pointer?): WithDefault = IWidgetProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetProvider {
      val address = segment.toRawLongValue()
      return makeIWidgetProvider(Pointer(address))
    }

    public override fun toNative(obj: IWidgetProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__857045510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetProvider): Array<IWidgetProvider?> = (elements as
        Array<IWidgetProvider?>).castToImpl<IWidgetProvider,IWidgetProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetProvider?> =
        arrayOfNulls<IWidgetProvider_Impl>(size) as Array<IWidgetProvider?>
  }
}
