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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVisualStateManagerProtected.ABI::class)
@Signature("{4b3b8640-b0b7-404c-9ef4-d949640e245d}")
@Guid("4b3b8640b0b7404c9ef4d949640e245d")
@WinRTInterface("4b3b8640b0b7404c9ef4d949640e245d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateManagerProtected.ByReference::class)
public interface IVisualStateManagerProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RaiseCurrentStateChanging(
    stateGroup: VisualStateGroup?,
    oldState: VisualState?,
    newState: VisualState?,
    control: Control?
  ): Unit

  @InterfaceMethod(1)
  public fun RaiseCurrentStateChanged(
    stateGroup: VisualStateGroup?,
    oldState: VisualState?,
    newState: VisualState?,
    control: Control?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateManagerProtected> {
    public override fun getValue() = ABI.makeIVisualStateManagerProtected(pointer.getPointer(0))

    public fun setValue(value: IVisualStateManagerProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateManagerProtected {
    public val __1684094016_Ptr: Pointer?

    public val _1684094016_VtblPtr: Pointer?
      get() = __1684094016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RaiseCurrentStateChanging(
      stateGroup: VisualStateGroup?,
      oldState: VisualState?,
      newState: VisualState?,
      control: Control?
    ): Unit {
      val fnPtr = _1684094016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684094016_Ptr, marshalToNative(stateGroup),
          marshalToNative(oldState), marshalToNative(newState), marshalToNative(control),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RaiseCurrentStateChanged(
      stateGroup: VisualStateGroup?,
      oldState: VisualState?,
      newState: VisualState?,
      control: Control?
    ): Unit {
      val fnPtr = _1684094016_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684094016_Ptr, marshalToNative(stateGroup),
          marshalToNative(oldState), marshalToNative(newState), marshalToNative(control),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualStateManagerProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1684094016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateManagerProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b3b8640b0b7404c9ef4d949640e245d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateManagerProtected(ptr: Pointer?): WithDefault =
        IVisualStateManagerProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateManagerProtected {
      val address = segment.toRawLongValue()
      return makeIVisualStateManagerProtected(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateManagerProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1684094016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateManagerProtected):
        Array<IVisualStateManagerProtected?> = (elements as
        Array<IVisualStateManagerProtected?>).castToImpl<IVisualStateManagerProtected,IVisualStateManagerProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateManagerProtected?> =
        arrayOfNulls<IVisualStateManagerProtected_Impl>(size) as
        Array<IVisualStateManagerProtected?>
  }
}
