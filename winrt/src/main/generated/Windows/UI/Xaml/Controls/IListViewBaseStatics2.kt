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

@ABIMarker(IListViewBaseStatics2.ABI::class)
@Signature("{821c00c8-78cc-411f-9f2e-a55758227f3e}")
@Guid("821c00c878cc411f9f2ea55758227f3e")
@WinRTInterface("821c00c878cc411f9f2ea55758227f3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseStatics2.ByReference::class)
public interface IListViewBaseStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowsScrollingPlaceholdersProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FooterProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FooterTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FooterTransitionsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseStatics2> {
    public override fun getValue() = ABI.makeIListViewBaseStatics2(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseStatics2 {
    public val __1620774627_Ptr: Pointer?

    public val _1620774627_VtblPtr: Pointer?
      get() = __1620774627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowsScrollingPlaceholdersProperty(): DependencyProperty? {
      val fnPtr = _1620774627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FooterProperty(): DependencyProperty? {
      val fnPtr = _1620774627_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FooterTemplateProperty(): DependencyProperty? {
      val fnPtr = _1620774627_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FooterTransitionsProperty(): DependencyProperty? {
      val fnPtr = _1620774627_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1620774627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBaseStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1620774627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("821c00c878cc411f9f2ea55758227f3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseStatics2(ptr: Pointer?): WithDefault =
        IListViewBaseStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseStatics2 {
      val address = segment.toRawLongValue()
      return makeIListViewBaseStatics2(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620774627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseStatics2): Array<IListViewBaseStatics2?> =
        (elements as
        Array<IListViewBaseStatics2?>).castToImpl<IListViewBaseStatics2,IListViewBaseStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseStatics2?> =
        arrayOfNulls<IListViewBaseStatics2_Impl>(size) as Array<IListViewBaseStatics2?>
  }
}
