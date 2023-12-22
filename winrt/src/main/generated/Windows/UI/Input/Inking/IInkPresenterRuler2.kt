package Windows.UI.Input.Inking

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

@ABIMarker(IInkPresenterRuler2.ABI::class)
@Signature("{45130dc1-bc61-44d4-a423-54712ae671c4}")
@Guid("45130dc1bc6144d4a42354712ae671c4")
@WinRTInterface("45130dc1bc6144d4a42354712ae671c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterRuler2.ByReference::class)
public interface IInkPresenterRuler2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreTickMarksVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_AreTickMarksVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsCompassVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCompassVisible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterRuler2> {
    public override fun getValue() = ABI.makeIInkPresenterRuler2(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterRuler2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterRuler2 {
    public val __681901336_Ptr: Pointer?

    public val _681901336_VtblPtr: Pointer?
      get() = __681901336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreTickMarksVisible(): Boolean {
      val fnPtr = _681901336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__681901336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreTickMarksVisible(value: Boolean): Unit {
      val fnPtr = _681901336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__681901336_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCompassVisible(): Boolean {
      val fnPtr = _681901336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__681901336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCompassVisible(value: Boolean): Unit {
      val fnPtr = _681901336_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__681901336_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenterRuler2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __681901336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterRuler2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45130dc1bc6144d4a42354712ae671c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterRuler2(ptr: Pointer?): WithDefault = IInkPresenterRuler2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterRuler2 {
      val address = segment.toRawLongValue()
      return makeIInkPresenterRuler2(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterRuler2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__681901336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterRuler2): Array<IInkPresenterRuler2?> =
        (elements as
        Array<IInkPresenterRuler2?>).castToImpl<IInkPresenterRuler2,IInkPresenterRuler2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterRuler2?> =
        arrayOfNulls<IInkPresenterRuler2_Impl>(size) as Array<IInkPresenterRuler2?>
  }
}
