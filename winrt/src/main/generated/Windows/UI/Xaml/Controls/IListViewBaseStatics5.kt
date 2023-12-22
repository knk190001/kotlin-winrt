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

@ABIMarker(IListViewBaseStatics5.ABI::class)
@Signature("{40346fcf-0476-4259-895f-a6569738620f}")
@Guid("40346fcf04764259895fa6569738620f")
@WinRTInterface("40346fcf04764259895fa6569738620f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseStatics5.ByReference::class)
public interface IListViewBaseStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseStatics5> {
    public override fun getValue() = ABI.makeIListViewBaseStatics5(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseStatics5 {
    public val __1620774624_Ptr: Pointer?

    public val _1620774624_VtblPtr: Pointer?
      get() = __1620774624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty? {
      val fnPtr = _1620774624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBaseStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1620774624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40346fcf04764259895fa6569738620f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseStatics5(ptr: Pointer?): WithDefault =
        IListViewBaseStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseStatics5 {
      val address = segment.toRawLongValue()
      return makeIListViewBaseStatics5(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620774624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseStatics5): Array<IListViewBaseStatics5?> =
        (elements as
        Array<IListViewBaseStatics5?>).castToImpl<IListViewBaseStatics5,IListViewBaseStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseStatics5?> =
        arrayOfNulls<IListViewBaseStatics5_Impl>(size) as Array<IListViewBaseStatics5?>
  }
}
