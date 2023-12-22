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

@ABIMarker(IListViewBaseStatics4.ABI::class)
@Signature("{ad13258b-fbd0-4f18-8bf8-9b8613951c22}")
@Guid("ad13258bfbd04f188bf89b8613951c22")
@WinRTInterface("ad13258bfbd04f188bf89b8613951c22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseStatics4.ByReference::class)
public interface IListViewBaseStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsMultiSelectCheckBoxEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseStatics4> {
    public override fun getValue() = ABI.makeIListViewBaseStatics4(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseStatics4 {
    public val __1620774625_Ptr: Pointer?

    public val _1620774625_VtblPtr: Pointer?
      get() = __1620774625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsMultiSelectCheckBoxEnabledProperty(): DependencyProperty? {
      val fnPtr = _1620774625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBaseStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1620774625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad13258bfbd04f188bf89b8613951c22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseStatics4(ptr: Pointer?): WithDefault =
        IListViewBaseStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseStatics4 {
      val address = segment.toRawLongValue()
      return makeIListViewBaseStatics4(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620774625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseStatics4): Array<IListViewBaseStatics4?> =
        (elements as
        Array<IListViewBaseStatics4?>).castToImpl<IListViewBaseStatics4,IListViewBaseStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseStatics4?> =
        arrayOfNulls<IListViewBaseStatics4_Impl>(size) as Array<IListViewBaseStatics4?>
  }
}
