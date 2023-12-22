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

@ABIMarker(IControlStatics4.ABI::class)
@Signature("{59fda728-c05a-4ec2-8a4b-06ad69b66e15}")
@Guid("59fda728c05a4ec28a4b06ad69b66e15")
@WinRTInterface("59fda728c05a4ec28a4b06ad69b66e15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlStatics4.ByReference::class)
public interface IControlStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFocusEngagementEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsFocusEngagedProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RequiresPointerProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_XYFocusLeftProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_XYFocusRightProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_XYFocusUpProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_XYFocusDownProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlStatics4> {
    public override fun getValue() = ABI.makeIControlStatics4(pointer.getPointer(0))

    public fun setValue(value: IControlStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlStatics4 {
    public val __2067758576_Ptr: Pointer?

    public val _2067758576_VtblPtr: Pointer?
      get() = __2067758576_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFocusEngagementEnabledProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsFocusEngagedProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RequiresPointerProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_XYFocusLeftProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_XYFocusRightProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_XYFocusUpProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusDownProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _2067758576_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IControlStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067758576_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59fda728c05a4ec28a4b06ad69b66e15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlStatics4(ptr: Pointer?): WithDefault = IControlStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlStatics4 {
      val address = segment.toRawLongValue()
      return makeIControlStatics4(Pointer(address))
    }

    public override fun toNative(obj: IControlStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067758576_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlStatics4): Array<IControlStatics4?> = (elements as
        Array<IControlStatics4?>).castToImpl<IControlStatics4,IControlStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlStatics4?> =
        arrayOfNulls<IControlStatics4_Impl>(size) as Array<IControlStatics4?>
  }
}
