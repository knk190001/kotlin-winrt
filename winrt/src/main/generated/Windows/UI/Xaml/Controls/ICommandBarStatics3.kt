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

@ABIMarker(ICommandBarStatics3.ABI::class)
@Signature("{b45a24a4-8af1-4843-b319-e03fc45ab726}")
@Guid("b45a24a48af14843b319e03fc45ab726")
@WinRTInterface("b45a24a48af14843b319e03fc45ab726")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarStatics3.ByReference::class)
public interface ICommandBarStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultLabelPositionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OverflowButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsDynamicOverflowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarStatics3> {
    public override fun getValue() = ABI.makeICommandBarStatics3(pointer.getPointer(0))

    public fun setValue(value: ICommandBarStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarStatics3 {
    public val __1312293102_Ptr: Pointer?

    public val _1312293102_VtblPtr: Pointer?
      get() = __1312293102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultLabelPositionProperty(): DependencyProperty? {
      val fnPtr = _1312293102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1312293102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OverflowButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1312293102_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1312293102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsDynamicOverflowEnabledProperty(): DependencyProperty? {
      val fnPtr = _1312293102_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1312293102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1312293102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b45a24a48af14843b319e03fc45ab726")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarStatics3(ptr: Pointer?): WithDefault = ICommandBarStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarStatics3 {
      val address = segment.toRawLongValue()
      return makeICommandBarStatics3(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1312293102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarStatics3): Array<ICommandBarStatics3?> =
        (elements as
        Array<ICommandBarStatics3?>).castToImpl<ICommandBarStatics3,ICommandBarStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarStatics3?> =
        arrayOfNulls<ICommandBarStatics3_Impl>(size) as Array<ICommandBarStatics3?>
  }
}
