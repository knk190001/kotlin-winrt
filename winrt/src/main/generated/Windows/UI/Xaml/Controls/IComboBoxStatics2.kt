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

@ABIMarker(IComboBoxStatics2.ABI::class)
@Signature("{93988a11-402c-4b13-96d1-7220266b9220}")
@Guid("93988a11402c4b1396d17220266b9220")
@WinRTInterface("93988a11402c4b1396d17220266b9220")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxStatics2.ByReference::class)
public interface IComboBoxStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxStatics2> {
    public override fun getValue() = ABI.makeIComboBoxStatics2(pointer.getPointer(0))

    public fun setValue(value: IComboBoxStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxStatics2 {
    public val __1235937882_Ptr: Pointer?

    public val _1235937882_VtblPtr: Pointer?
      get() = __1235937882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _1235937882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1235937882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _1235937882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1235937882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93988a11402c4b1396d17220266b9220")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxStatics2(ptr: Pointer?): WithDefault = IComboBoxStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxStatics2 {
      val address = segment.toRawLongValue()
      return makeIComboBoxStatics2(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1235937882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxStatics2): Array<IComboBoxStatics2?> = (elements
        as Array<IComboBoxStatics2?>).castToImpl<IComboBoxStatics2,IComboBoxStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxStatics2?> =
        arrayOfNulls<IComboBoxStatics2_Impl>(size) as Array<IComboBoxStatics2?>
  }
}
