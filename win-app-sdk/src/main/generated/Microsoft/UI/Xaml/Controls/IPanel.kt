package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.BrushTransition
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Media.Brush
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

@ABIMarker(IPanel.ABI::class)
@Signature("{27a1b418-56f3-525e-b883-cefed905eed3}")
@Guid("27a1b41856f3525eb883cefed905eed3")
@WinRTInterface("27a1b41856f3525eb883cefed905eed3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPanel.ByReference::class)
public interface IPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): UIElementCollection?

  @InterfaceMethod(1)
  public fun get_Background(): Brush?

  @InterfaceMethod(2)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(3)
  public fun get_IsItemsHost(): Boolean

  @InterfaceMethod(4)
  public fun get_ChildrenTransitions(): TransitionCollection?

  @InterfaceMethod(5)
  public fun put_ChildrenTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(6)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(7)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPanel> {
    public override fun getValue() = ABI.makeIPanel(pointer.getPointer(0))

    public fun setValue(value: IPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPanel {
    public val __2005090147_Ptr: Pointer?

    public val _2005090147_VtblPtr: Pointer?
      get() = __2005090147_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): UIElementCollection? {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElementCollection>()
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElementCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Background(): Brush? {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsItemsHost(): Boolean {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ChildrenTransitions(): TransitionCollection? {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ChildrenTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _2005090147_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2005090147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2005090147_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27a1b41856f3525eb883cefed905eed3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPanel(ptr: Pointer?): WithDefault = IPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPanel {
      val address = segment.toRawLongValue()
      return makeIPanel(Pointer(address))
    }

    public override fun toNative(obj: IPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005090147_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPanel): Array<IPanel?> = (elements as
        Array<IPanel?>).castToImpl<IPanel,IPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPanel?> = arrayOfNulls<IPanel_Impl>(size) as
        Array<IPanel?>
  }
}
