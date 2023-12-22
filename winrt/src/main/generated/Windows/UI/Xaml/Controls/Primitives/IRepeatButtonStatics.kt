package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IRepeatButtonStatics.ABI::class)
@Signature("{3914ac4e-f462-4f73-8197-e8846639c682}")
@Guid("3914ac4ef4624f738197e8846639c682")
@WinRTInterface("3914ac4ef4624f738197e8846639c682")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatButtonStatics.ByReference::class)
public interface IRepeatButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DelayProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IntervalProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatButtonStatics> {
    public override fun getValue() = ABI.makeIRepeatButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IRepeatButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatButtonStatics {
    public val __24558076_Ptr: Pointer?

    public val _24558076_VtblPtr: Pointer?
      get() = __24558076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DelayProperty(): DependencyProperty? {
      val fnPtr = _24558076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__24558076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IntervalProperty(): DependencyProperty? {
      val fnPtr = _24558076_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__24558076_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRepeatButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __24558076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3914ac4ef4624f738197e8846639c682")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatButtonStatics(ptr: Pointer?): WithDefault = IRepeatButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatButtonStatics {
      val address = segment.toRawLongValue()
      return makeIRepeatButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IRepeatButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__24558076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatButtonStatics): Array<IRepeatButtonStatics?> =
        (elements as
        Array<IRepeatButtonStatics?>).castToImpl<IRepeatButtonStatics,IRepeatButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatButtonStatics?> =
        arrayOfNulls<IRepeatButtonStatics_Impl>(size) as Array<IRepeatButtonStatics?>
  }
}
