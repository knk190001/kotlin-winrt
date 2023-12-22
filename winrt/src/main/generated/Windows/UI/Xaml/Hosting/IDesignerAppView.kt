package Windows.UI.Xaml.Hosting

import Windows.Foundation.IAsyncAction
import Windows.Foundation.Size
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

@ABIMarker(IDesignerAppView.ABI::class)
@Signature("{5c777cea-dd71-4a84-a56f-dacb4b14706f}")
@Guid("5c777ceadd714a84a56fdacb4b14706f")
@WinRTInterface("5c777ceadd714a84a56fdacb4b14706f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesignerAppView.ByReference::class)
public interface IDesignerAppView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ApplicationViewId(): Int

  @InterfaceMethod(1)
  public fun get_AppUserModelId(): String?

  @InterfaceMethod(2)
  public fun get_ViewState(): DesignerAppViewState?

  @InterfaceMethod(3)
  public fun get_ViewSize(): Size?

  @InterfaceMethod(4)
  public fun UpdateViewAsync(viewState: DesignerAppViewState?, viewSize: Size?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesignerAppView> {
    public override fun getValue() = ABI.makeIDesignerAppView(pointer.getPointer(0))

    public fun setValue(value: IDesignerAppView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesignerAppView {
    public val __2135213931_Ptr: Pointer?

    public val _2135213931_VtblPtr: Pointer?
      get() = __2135213931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ApplicationViewId(): Int {
      val fnPtr = _2135213931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2135213931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _2135213931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2135213931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ViewState(): DesignerAppViewState? {
      val fnPtr = _2135213931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesignerAppViewState>()
      val hr = fn.invokeHR(arrayOf(__2135213931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesignerAppViewState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ViewSize(): Size? {
      val fnPtr = _2135213931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2135213931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun UpdateViewAsync(viewState: DesignerAppViewState?, viewSize: Size?):
        IAsyncAction? {
      val fnPtr = _2135213931_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2135213931_Ptr, marshalToNative(viewState),
          marshalToNative(viewSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDesignerAppView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2135213931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesignerAppView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c777ceadd714a84a56fdacb4b14706f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesignerAppView(ptr: Pointer?): WithDefault = IDesignerAppView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesignerAppView {
      val address = segment.toRawLongValue()
      return makeIDesignerAppView(Pointer(address))
    }

    public override fun toNative(obj: IDesignerAppView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2135213931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesignerAppView): Array<IDesignerAppView?> = (elements as
        Array<IDesignerAppView?>).castToImpl<IDesignerAppView,IDesignerAppView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesignerAppView?> =
        arrayOfNulls<IDesignerAppView_Impl>(size) as Array<IDesignerAppView?>
  }
}
