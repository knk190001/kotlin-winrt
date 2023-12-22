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

@ABIMarker(IInkToolbarMenuButton.ABI::class)
@Signature("{860ecae5-7633-4ea1-a209-50392d1aebd1}")
@Guid("860ecae576334ea1a20950392d1aebd1")
@WinRTInterface("860ecae576334ea1a20950392d1aebd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarMenuButton.ByReference::class)
public interface IInkToolbarMenuButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MenuKind(): InkToolbarMenuKind?

  @InterfaceMethod(1)
  public fun get_IsExtensionGlyphShown(): Boolean

  @InterfaceMethod(2)
  public fun put_IsExtensionGlyphShown(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarMenuButton> {
    public override fun getValue() = ABI.makeIInkToolbarMenuButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarMenuButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarMenuButton {
    public val __178530782_Ptr: Pointer?

    public val _178530782_VtblPtr: Pointer?
      get() = __178530782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MenuKind(): InkToolbarMenuKind? {
      val fnPtr = _178530782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarMenuKind>()
      val hr = fn.invokeHR(arrayOf(__178530782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarMenuKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsExtensionGlyphShown(): Boolean {
      val fnPtr = _178530782_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__178530782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsExtensionGlyphShown(value: Boolean): Unit {
      val fnPtr = _178530782_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178530782_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarMenuButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __178530782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarMenuButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("860ecae576334ea1a20950392d1aebd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarMenuButton(ptr: Pointer?): WithDefault =
        IInkToolbarMenuButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarMenuButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarMenuButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarMenuButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178530782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarMenuButton): Array<IInkToolbarMenuButton?> =
        (elements as
        Array<IInkToolbarMenuButton?>).castToImpl<IInkToolbarMenuButton,IInkToolbarMenuButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarMenuButton?> =
        arrayOfNulls<IInkToolbarMenuButton_Impl>(size) as Array<IInkToolbarMenuButton?>
  }
}
