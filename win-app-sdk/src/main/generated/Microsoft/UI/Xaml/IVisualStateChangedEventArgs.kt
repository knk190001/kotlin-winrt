package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Controls.Control
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

@ABIMarker(IVisualStateChangedEventArgs.ABI::class)
@Signature("{11de9510-a195-577b-88c8-06391618868c}")
@Guid("11de9510a195577b88c806391618868c")
@WinRTInterface("11de9510a195577b88c806391618868c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateChangedEventArgs.ByReference::class)
public interface IVisualStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldState(): VisualState?

  @InterfaceMethod(1)
  public fun put_OldState(value: VisualState?): Unit

  @InterfaceMethod(2)
  public fun get_NewState(): VisualState?

  @InterfaceMethod(3)
  public fun put_NewState(value: VisualState?): Unit

  @InterfaceMethod(4)
  public fun get_Control(): Control?

  @InterfaceMethod(5)
  public fun put_Control(value: Control?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateChangedEventArgs> {
    public override fun getValue() = ABI.makeIVisualStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVisualStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateChangedEventArgs {
    public val __866733293_Ptr: Pointer?

    public val _866733293_VtblPtr: Pointer?
      get() = __866733293_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldState(): VisualState? {
      val fnPtr = _866733293_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualState>()
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OldState(value: VisualState?): Unit {
      val fnPtr = _866733293_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NewState(): VisualState? {
      val fnPtr = _866733293_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualState>()
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NewState(value: VisualState?): Unit {
      val fnPtr = _866733293_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Control(): Control? {
      val fnPtr = _866733293_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Control>()
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Control>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Control(value: Control?): Unit {
      val fnPtr = _866733293_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866733293_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866733293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11de9510a195577b88c806391618868c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IVisualStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVisualStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866733293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateChangedEventArgs):
        Array<IVisualStateChangedEventArgs?> = (elements as
        Array<IVisualStateChangedEventArgs?>).castToImpl<IVisualStateChangedEventArgs,IVisualStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateChangedEventArgs?> =
        arrayOfNulls<IVisualStateChangedEventArgs_Impl>(size) as
        Array<IVisualStateChangedEventArgs?>
  }
}
