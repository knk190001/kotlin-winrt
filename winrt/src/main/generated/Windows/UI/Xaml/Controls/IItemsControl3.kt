package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IItemsControl3.ABI::class)
@Signature("{502b7489-aee4-4de3-a2ab-195ac20c4212}")
@Guid("502b7489aee44de3a2ab195ac20c4212")
@WinRTInterface("502b7489aee44de3a2ab195ac20c4212")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControl3.ByReference::class)
public interface IItemsControl3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GroupHeaderContainerFromItemContainer(itemContainer: DependencyObject?):
      DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItemsControl3>
      {
    public override fun getValue() = ABI.makeIItemsControl3(pointer.getPointer(0))

    public fun setValue(value: IItemsControl3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControl3 {
    public val __1652753338_Ptr: Pointer?

    public val _1652753338_VtblPtr: Pointer?
      get() = __1652753338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GroupHeaderContainerFromItemContainer(itemContainer: DependencyObject?):
        DependencyObject? {
      val fnPtr = _1652753338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1652753338_Ptr, marshalToNative(itemContainer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IItemsControl3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1652753338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControl3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("502b7489aee44de3a2ab195ac20c4212")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControl3(ptr: Pointer?): WithDefault = IItemsControl3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControl3 {
      val address = segment.toRawLongValue()
      return makeIItemsControl3(Pointer(address))
    }

    public override fun toNative(obj: IItemsControl3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1652753338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControl3): Array<IItemsControl3?> = (elements as
        Array<IItemsControl3?>).castToImpl<IItemsControl3,IItemsControl3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControl3?> =
        arrayOfNulls<IItemsControl3_Impl>(size) as Array<IItemsControl3?>
  }
}
