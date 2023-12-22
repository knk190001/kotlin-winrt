package Windows.UI.Xaml.Controls

import Windows.UI.Input.Inking.InkPresenter
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

@ABIMarker(IInkToolbar3.ABI::class)
@Signature("{a8a6def0-7aa8-5326-b7c4-88ae25013362}")
@Guid("a8a6def07aa85326b7c488ae25013362")
@WinRTInterface("a8a6def07aa85326b7c488ae25013362")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbar3.ByReference::class)
public interface IInkToolbar3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetInkPresenter(): InkPresenter?

  @InterfaceMethod(1)
  public fun put_TargetInkPresenter(value: InkPresenter?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkToolbar3> {
    public override fun getValue() = ABI.makeIInkToolbar3(pointer.getPointer(0))

    public fun setValue(value: IInkToolbar3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbar3 {
    public val __841689982_Ptr: Pointer?

    public val _841689982_VtblPtr: Pointer?
      get() = __841689982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetInkPresenter(): InkPresenter? {
      val fnPtr = _841689982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__841689982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetInkPresenter(value: InkPresenter?): Unit {
      val fnPtr = _841689982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__841689982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbar3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __841689982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbar3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8a6def07aa85326b7c488ae25013362")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbar3(ptr: Pointer?): WithDefault = IInkToolbar3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbar3 {
      val address = segment.toRawLongValue()
      return makeIInkToolbar3(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbar3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__841689982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbar3): Array<IInkToolbar3?> = (elements as
        Array<IInkToolbar3?>).castToImpl<IInkToolbar3,IInkToolbar3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbar3?> =
        arrayOfNulls<IInkToolbar3_Impl>(size) as Array<IInkToolbar3?>
  }
}
