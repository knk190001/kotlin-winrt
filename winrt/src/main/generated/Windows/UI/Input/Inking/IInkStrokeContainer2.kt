package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IInkStrokeContainer2.ABI::class)
@Signature("{8901d364-da36-4bcf-9e5c-d195825995b4}")
@Guid("8901d364da364bcf9e5cd195825995b4")
@WinRTInterface("8901d364da364bcf9e5cd195825995b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeContainer2.ByReference::class)
public interface IInkStrokeContainer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddStrokes(strokes: IIterable<InkStroke?>?): Unit

  @InterfaceMethod(1)
  public fun Clear(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeContainer2> {
    public override fun getValue() = ABI.makeIInkStrokeContainer2(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeContainer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeContainer2 {
    public val __1109615701_Ptr: Pointer?

    public val _1109615701_VtblPtr: Pointer?
      get() = __1109615701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddStrokes(strokes: IIterable<InkStroke?>?): Unit {
      val fnPtr = _1109615701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1109615701_Ptr, marshalToNative(strokes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Clear(): Unit {
      val fnPtr = _1109615701_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1109615701_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkStrokeContainer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1109615701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeContainer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8901d364da364bcf9e5cd195825995b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeContainer2(ptr: Pointer?): WithDefault = IInkStrokeContainer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeContainer2 {
      val address = segment.toRawLongValue()
      return makeIInkStrokeContainer2(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeContainer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1109615701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeContainer2): Array<IInkStrokeContainer2?> =
        (elements as
        Array<IInkStrokeContainer2?>).castToImpl<IInkStrokeContainer2,IInkStrokeContainer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeContainer2?> =
        arrayOfNulls<IInkStrokeContainer2_Impl>(size) as Array<IInkStrokeContainer2?>
  }
}
