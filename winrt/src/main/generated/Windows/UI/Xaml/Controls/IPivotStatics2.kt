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

@ABIMarker(IPivotStatics2.ABI::class)
@Signature("{d7518add-be75-4023-8deb-c6513c3192a3}")
@Guid("d7518addbe7540238debc6513c3192a3")
@WinRTInterface("d7518addbe7540238debc6513c3192a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotStatics2.ByReference::class)
public interface IPivotStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LeftHeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RightHeaderProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RightHeaderTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivotStatics2>
      {
    public override fun getValue() = ABI.makeIPivotStatics2(pointer.getPointer(0))

    public fun setValue(value: IPivotStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotStatics2 {
    public val __1675360467_Ptr: Pointer?

    public val _1675360467_VtblPtr: Pointer?
      get() = __1675360467_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _1675360467_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LeftHeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1675360467_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RightHeaderProperty(): DependencyProperty? {
      val fnPtr = _1675360467_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RightHeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1675360467_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPivotStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1675360467_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7518addbe7540238debc6513c3192a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotStatics2(ptr: Pointer?): WithDefault = IPivotStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotStatics2 {
      val address = segment.toRawLongValue()
      return makeIPivotStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPivotStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1675360467_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotStatics2): Array<IPivotStatics2?> = (elements as
        Array<IPivotStatics2?>).castToImpl<IPivotStatics2,IPivotStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotStatics2?> =
        arrayOfNulls<IPivotStatics2_Impl>(size) as Array<IPivotStatics2?>
  }
}
