package Windows.UI.Xaml

import Windows.UI.Xaml.Controls.Control
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVisualStateManagerOverrides.ABI::class)
@Signature("{4a66910e-7979-43c8-8ff4-ec6122750006}")
@Guid("4a66910e797943c88ff4ec6122750006")
@WinRTInterface("4a66910e797943c88ff4ec6122750006")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateManagerOverrides.ByReference::class)
public interface IVisualStateManagerOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GoToStateCore(
    control: Control?,
    templateRoot: FrameworkElement?,
    stateName: String?,
    group: VisualStateGroup?,
    state: VisualState?,
    useTransitions: Boolean
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateManagerOverrides> {
    public override fun getValue() = ABI.makeIVisualStateManagerOverrides(pointer.getPointer(0))

    public fun setValue(value: IVisualStateManagerOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateManagerOverrides {
    public val __1542663865_Ptr: Pointer?

    public val _1542663865_VtblPtr: Pointer?
      get() = __1542663865_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GoToStateCore(
      control: Control?,
      templateRoot: FrameworkElement?,
      stateName: String?,
      group: VisualStateGroup?,
      state: VisualState?,
      useTransitions: Boolean
    ): Boolean {
      val fnPtr = _1542663865_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1542663865_Ptr, marshalToNative(control),
          marshalToNative(templateRoot), marshalToNative(stateName), marshalToNative(group),
          marshalToNative(state), useTransitions, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVisualStateManagerOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1542663865_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateManagerOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a66910e797943c88ff4ec6122750006")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateManagerOverrides(ptr: Pointer?): WithDefault =
        IVisualStateManagerOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateManagerOverrides {
      val address = segment.toRawLongValue()
      return makeIVisualStateManagerOverrides(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateManagerOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1542663865_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateManagerOverrides):
        Array<IVisualStateManagerOverrides?> = (elements as
        Array<IVisualStateManagerOverrides?>).castToImpl<IVisualStateManagerOverrides,IVisualStateManagerOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateManagerOverrides?> =
        arrayOfNulls<IVisualStateManagerOverrides_Impl>(size) as
        Array<IVisualStateManagerOverrides?>
  }
}
