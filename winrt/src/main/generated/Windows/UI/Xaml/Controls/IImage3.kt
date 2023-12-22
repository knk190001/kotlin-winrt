package Windows.UI.Xaml.Controls

import Windows.UI.Composition.CompositionBrush
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

@ABIMarker(IImage3.ABI::class)
@Signature("{06ebe792-47c2-4d92-a488-8cd685d06aca}")
@Guid("06ebe79247c24d92a4888cd685d06aca")
@WinRTInterface("06ebe79247c24d92a4888cd685d06aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImage3.ByReference::class)
public interface IImage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAlphaMask(): CompositionBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImage3> {
    public override fun getValue() = ABI.makeIImage3(pointer.getPointer(0))

    public fun setValue(value: IImage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImage3 {
    public val __449993044_Ptr: Pointer?

    public val _449993044_VtblPtr: Pointer?
      get() = __449993044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAlphaMask(): CompositionBrush? {
      val fnPtr = _449993044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__449993044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }
  }

  public class IImage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449993044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06ebe79247c24d92a4888cd685d06aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImage3(ptr: Pointer?): WithDefault = IImage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImage3 {
      val address = segment.toRawLongValue()
      return makeIImage3(Pointer(address))
    }

    public override fun toNative(obj: IImage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449993044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImage3): Array<IImage3?> = (elements as
        Array<IImage3?>).castToImpl<IImage3,IImage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImage3?> = arrayOfNulls<IImage3_Impl>(size) as
        Array<IImage3?>
  }
}
