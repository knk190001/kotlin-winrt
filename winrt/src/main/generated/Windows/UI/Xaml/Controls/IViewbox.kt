package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Stretch
import Windows.UI.Xaml.UIElement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IViewbox.ABI::class)
@Signature("{05252c58-ba9d-4809-9ec3-fa0d16710ba1}")
@Guid("05252c58ba9d48099ec3fa0d16710ba1")
@WinRTInterface("05252c58ba9d48099ec3fa0d16710ba1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IViewbox.ByReference::class)
public interface IViewbox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Child(): UIElement?

  @InterfaceMethod(1)
  public fun put_Child(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(3)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(4)
  public fun get_StretchDirection(): StretchDirection?

  @InterfaceMethod(5)
  public fun put_StretchDirection(value: StretchDirection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IViewbox> {
    public override fun getValue() = ABI.makeIViewbox(pointer.getPointer(0))

    public fun setValue(value: IViewbox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IViewbox {
    public val __392818326_Ptr: Pointer?

    public val _392818326_VtblPtr: Pointer?
      get() = __392818326_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Child(): UIElement? {
      val fnPtr = _392818326_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _392818326_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _392818326_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _392818326_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StretchDirection(): StretchDirection? {
      val fnPtr = _392818326_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StretchDirection>()
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StretchDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StretchDirection(value: StretchDirection?): Unit {
      val fnPtr = _392818326_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__392818326_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IViewbox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __392818326_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IViewbox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05252c58ba9d48099ec3fa0d16710ba1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIViewbox(ptr: Pointer?): WithDefault = IViewbox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IViewbox {
      val address = segment.toRawLongValue()
      return makeIViewbox(Pointer(address))
    }

    public override fun toNative(obj: IViewbox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__392818326_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IViewbox): Array<IViewbox?> = (elements as
        Array<IViewbox?>).castToImpl<IViewbox,IViewbox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IViewbox?> = arrayOfNulls<IViewbox_Impl>(size) as
        Array<IViewbox?>
  }
}
