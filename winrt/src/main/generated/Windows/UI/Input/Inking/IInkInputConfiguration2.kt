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

@ABIMarker(IInkInputConfiguration2.ABI::class)
@Signature("{6ac2272e-81b4-5cc4-a36d-d057c387dfda}")
@Guid("6ac2272e81b45cc4a36dd057c387dfda")
@WinRTInterface("6ac2272e81b45cc4a36dd057c387dfda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkInputConfiguration2.ByReference::class)
public interface IInkInputConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPenHapticFeedbackEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPenHapticFeedbackEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkInputConfiguration2> {
    public override fun getValue() = ABI.makeIInkInputConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IInkInputConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkInputConfiguration2 {
    public val __1215680326_Ptr: Pointer?

    public val _1215680326_VtblPtr: Pointer?
      get() = __1215680326_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPenHapticFeedbackEnabled(): Boolean {
      val fnPtr = _1215680326_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1215680326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPenHapticFeedbackEnabled(value: Boolean): Unit {
      val fnPtr = _1215680326_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215680326_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkInputConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215680326_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkInputConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ac2272e81b45cc4a36dd057c387dfda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkInputConfiguration2(ptr: Pointer?): WithDefault =
        IInkInputConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkInputConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIInkInputConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IInkInputConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215680326_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkInputConfiguration2): Array<IInkInputConfiguration2?>
        = (elements as
        Array<IInkInputConfiguration2?>).castToImpl<IInkInputConfiguration2,IInkInputConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkInputConfiguration2?> =
        arrayOfNulls<IInkInputConfiguration2_Impl>(size) as Array<IInkInputConfiguration2?>
  }
}
