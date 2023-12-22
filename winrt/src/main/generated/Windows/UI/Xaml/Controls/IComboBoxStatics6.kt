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

@ABIMarker(IComboBoxStatics6.ABI::class)
@Signature("{516c88e0-ec6b-54ac-8c57-5ec080ee05c8}")
@Guid("516c88e0ec6b54ac8c575ec080ee05c8")
@WinRTInterface("516c88e0ec6b54ac8c575ec080ee05c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxStatics6.ByReference::class)
public interface IComboBoxStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEditableProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TextBoxStyleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxStatics6> {
    public override fun getValue() = ABI.makeIComboBoxStatics6(pointer.getPointer(0))

    public fun setValue(value: IComboBoxStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxStatics6 {
    public val __1235937878_Ptr: Pointer?

    public val _1235937878_VtblPtr: Pointer?
      get() = __1235937878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEditableProperty(): DependencyProperty? {
      val fnPtr = _1235937878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _1235937878_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TextBoxStyleProperty(): DependencyProperty? {
      val fnPtr = _1235937878_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _1235937878_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1235937878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("516c88e0ec6b54ac8c575ec080ee05c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxStatics6(ptr: Pointer?): WithDefault = IComboBoxStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxStatics6 {
      val address = segment.toRawLongValue()
      return makeIComboBoxStatics6(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1235937878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxStatics6): Array<IComboBoxStatics6?> = (elements
        as Array<IComboBoxStatics6?>).castToImpl<IComboBoxStatics6,IComboBoxStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxStatics6?> =
        arrayOfNulls<IComboBoxStatics6_Impl>(size) as Array<IComboBoxStatics6?>
  }
}
