package Windows.UI.Xaml

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

@ABIMarker(IAdaptiveTriggerStatics.ABI::class)
@Signature("{b92e29ea-1615-4350-9c3b-92b2986bf444}")
@Guid("b92e29ea161543509c3b92b2986bf444")
@WinRTInterface("b92e29ea161543509c3b92b2986bf444")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveTriggerStatics.ByReference::class)
public interface IAdaptiveTriggerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinWindowWidthProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MinWindowHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveTriggerStatics> {
    public override fun getValue() = ABI.makeIAdaptiveTriggerStatics(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveTriggerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveTriggerStatics {
    public val __1755929557_Ptr: Pointer?

    public val _1755929557_VtblPtr: Pointer?
      get() = __1755929557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinWindowWidthProperty(): DependencyProperty? {
      val fnPtr = _1755929557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1755929557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinWindowHeightProperty(): DependencyProperty? {
      val fnPtr = _1755929557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1755929557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveTriggerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1755929557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveTriggerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b92e29ea161543509c3b92b2986bf444")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveTriggerStatics(ptr: Pointer?): WithDefault =
        IAdaptiveTriggerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveTriggerStatics {
      val address = segment.toRawLongValue()
      return makeIAdaptiveTriggerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveTriggerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1755929557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveTriggerStatics): Array<IAdaptiveTriggerStatics?>
        = (elements as
        Array<IAdaptiveTriggerStatics?>).castToImpl<IAdaptiveTriggerStatics,IAdaptiveTriggerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveTriggerStatics?> =
        arrayOfNulls<IAdaptiveTriggerStatics_Impl>(size) as Array<IAdaptiveTriggerStatics?>
  }
}
