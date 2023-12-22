package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkToolbarToolButton.ABI::class)
@Signature("{5c5af41e-ccb7-4458-8064-a9849d31561b}")
@Guid("5c5af41eccb744588064a9849d31561b")
@WinRTInterface("5c5af41eccb744588064a9849d31561b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarToolButton.ByReference::class)
public interface IInkToolbarToolButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ToolKind(): InkToolbarTool?

  @InterfaceMethod(1)
  public fun get_IsExtensionGlyphShown(): Boolean

  @InterfaceMethod(2)
  public fun put_IsExtensionGlyphShown(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarToolButton> {
    public override fun getValue() = ABI.makeIInkToolbarToolButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarToolButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarToolButton {
    public val __103588965_Ptr: Pointer?

    public val _103588965_VtblPtr: Pointer?
      get() = __103588965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ToolKind(): InkToolbarTool? {
      val fnPtr = _103588965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarTool>()
      val hr = fn.invokeHR(arrayOf(__103588965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarTool>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsExtensionGlyphShown(): Boolean {
      val fnPtr = _103588965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__103588965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsExtensionGlyphShown(value: Boolean): Unit {
      val fnPtr = _103588965_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__103588965_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarToolButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103588965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarToolButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c5af41eccb744588064a9849d31561b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarToolButton(ptr: Pointer?): WithDefault =
        IInkToolbarToolButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarToolButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarToolButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarToolButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103588965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarToolButton): Array<IInkToolbarToolButton?> =
        (elements as
        Array<IInkToolbarToolButton?>).castToImpl<IInkToolbarToolButton,IInkToolbarToolButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarToolButton?> =
        arrayOfNulls<IInkToolbarToolButton_Impl>(size) as Array<IInkToolbarToolButton?>
  }
}
