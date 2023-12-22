package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IInkToolbarRulerButtonStatics.ABI::class)
@Signature("{bae75f65-be30-4bee-964b-ff9e498fee37}")
@Guid("bae75f65be304bee964bff9e498fee37")
@WinRTInterface("bae75f65be304bee964bff9e498fee37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarRulerButtonStatics.ByReference::class)
public interface IInkToolbarRulerButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RulerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarRulerButtonStatics> {
    public override fun getValue() = ABI.makeIInkToolbarRulerButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarRulerButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarRulerButtonStatics {
    public val __1667224946_Ptr: Pointer?

    public val _1667224946_VtblPtr: Pointer?
      get() = __1667224946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RulerProperty(): DependencyProperty? {
      val fnPtr = _1667224946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1667224946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarRulerButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667224946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarRulerButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bae75f65be304bee964bff9e498fee37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarRulerButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarRulerButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarRulerButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarRulerButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarRulerButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667224946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarRulerButtonStatics):
        Array<IInkToolbarRulerButtonStatics?> = (elements as
        Array<IInkToolbarRulerButtonStatics?>).castToImpl<IInkToolbarRulerButtonStatics,IInkToolbarRulerButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarRulerButtonStatics?> =
        arrayOfNulls<IInkToolbarRulerButtonStatics_Impl>(size) as
        Array<IInkToolbarRulerButtonStatics?>
  }
}
