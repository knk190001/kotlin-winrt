package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.UIElement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentControl.ABI::class)
@Signature("{07e81761-11b2-52ae-8f8b-4d53d2b5900a}")
@Guid("07e8176111b252ae8f8b4d53d2b5900a")
@WinRTInterface("07e8176111b252ae8f8b4d53d2b5900a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentControl.ByReference::class)
public interface IContentControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Content(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ContentTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_ContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_ContentTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(5)
  public fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(6)
  public fun get_ContentTransitions(): TransitionCollection?

  @InterfaceMethod(7)
  public fun put_ContentTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(8)
  public fun get_ContentTemplateRoot(): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentControl> {
    public override fun getValue() = ABI.makeIContentControl(pointer.getPointer(0))

    public fun setValue(value: IContentControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentControl {
    public val __714155051_Ptr: Pointer?

    public val _714155051_VtblPtr: Pointer?
      get() = __714155051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IUnknown? {
      val fnPtr = _714155051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IUnknown?): Unit {
      val fnPtr = _714155051_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentTemplate(): DataTemplate? {
      val fnPtr = _714155051_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _714155051_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _714155051_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _714155051_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentTransitions(): TransitionCollection? {
      val fnPtr = _714155051_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _714155051_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ContentTemplateRoot(): UIElement? {
      val fnPtr = _714155051_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__714155051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IContentControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __714155051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07e8176111b252ae8f8b4d53d2b5900a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentControl(ptr: Pointer?): WithDefault = IContentControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentControl {
      val address = segment.toRawLongValue()
      return makeIContentControl(Pointer(address))
    }

    public override fun toNative(obj: IContentControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714155051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentControl): Array<IContentControl?> = (elements as
        Array<IContentControl?>).castToImpl<IContentControl,IContentControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentControl?> =
        arrayOfNulls<IContentControl_Impl>(size) as Array<IContentControl?>
  }
}
