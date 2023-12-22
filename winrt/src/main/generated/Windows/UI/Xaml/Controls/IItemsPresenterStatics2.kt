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

@ABIMarker(IItemsPresenterStatics2.ABI::class)
@Signature("{8971632e-7867-4d66-9630-29f1c5f7403f}")
@Guid("8971632e78674d66963029f1c5f7403f")
@WinRTInterface("8971632e78674d66963029f1c5f7403f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsPresenterStatics2.ByReference::class)
public interface IItemsPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FooterProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FooterTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FooterTransitionsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsPresenterStatics2> {
    public override fun getValue() = ABI.makeIItemsPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IItemsPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsPresenterStatics2 {
    public val __1599760145_Ptr: Pointer?

    public val _1599760145_VtblPtr: Pointer?
      get() = __1599760145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FooterProperty(): DependencyProperty? {
      val fnPtr = _1599760145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599760145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FooterTemplateProperty(): DependencyProperty? {
      val fnPtr = _1599760145_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599760145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FooterTransitionsProperty(): DependencyProperty? {
      val fnPtr = _1599760145_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599760145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1599760145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8971632e78674d66963029f1c5f7403f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsPresenterStatics2(ptr: Pointer?): WithDefault =
        IItemsPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIItemsPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IItemsPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1599760145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsPresenterStatics2): Array<IItemsPresenterStatics2?>
        = (elements as
        Array<IItemsPresenterStatics2?>).castToImpl<IItemsPresenterStatics2,IItemsPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsPresenterStatics2?> =
        arrayOfNulls<IItemsPresenterStatics2_Impl>(size) as Array<IItemsPresenterStatics2?>
  }
}
