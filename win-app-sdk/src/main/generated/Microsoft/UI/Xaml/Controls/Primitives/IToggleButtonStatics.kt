package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IToggleButtonStatics.ABI::class)
@Signature("{4b8397e3-76fd-59df-824f-40ae339fb00b}")
@Guid("4b8397e376fd59df824f40ae339fb00b")
@WinRTInterface("4b8397e376fd59df824f40ae339fb00b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleButtonStatics.ByReference::class)
public interface IToggleButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCheckedProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsThreeStateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleButtonStatics> {
    public override fun getValue() = ABI.makeIToggleButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IToggleButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleButtonStatics {
    public val __1341950642_Ptr: Pointer?

    public val _1341950642_VtblPtr: Pointer?
      get() = __1341950642_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCheckedProperty(): DependencyProperty? {
      val fnPtr = _1341950642_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1341950642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsThreeStateProperty(): DependencyProperty? {
      val fnPtr = _1341950642_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1341950642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToggleButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1341950642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b8397e376fd59df824f40ae339fb00b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleButtonStatics(ptr: Pointer?): WithDefault = IToggleButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleButtonStatics {
      val address = segment.toRawLongValue()
      return makeIToggleButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IToggleButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1341950642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleButtonStatics): Array<IToggleButtonStatics?> =
        (elements as
        Array<IToggleButtonStatics?>).castToImpl<IToggleButtonStatics,IToggleButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleButtonStatics?> =
        arrayOfNulls<IToggleButtonStatics_Impl>(size) as Array<IToggleButtonStatics?>
  }
}
