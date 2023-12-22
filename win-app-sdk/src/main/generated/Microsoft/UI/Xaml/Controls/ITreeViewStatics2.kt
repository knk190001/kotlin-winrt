package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ITreeViewStatics2.ABI::class)
@Signature("{ddd01c44-a883-583b-9181-dca583da0ad9}")
@Guid("ddd01c44a883583b9181dca583da0ad9")
@WinRTInterface("ddd01c44a883583b9181dca583da0ad9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewStatics2.ByReference::class)
public interface ITreeViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanDragItemsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanReorderItemsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ItemTemplateSelectorProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ItemContainerStyleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ItemContainerStyleSelectorProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ItemContainerTransitionsProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewStatics2> {
    public override fun getValue() = ABI.makeITreeViewStatics2(pointer.getPointer(0))

    public fun setValue(value: ITreeViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewStatics2 {
    public val __449563991_Ptr: Pointer?

    public val _449563991_VtblPtr: Pointer?
      get() = __449563991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanDragItemsProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanReorderItemsProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemTemplateSelectorProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ItemContainerStyleProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ItemContainerStyleSelectorProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ItemContainerTransitionsProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _449563991_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449563991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449563991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddd01c44a883583b9181dca583da0ad9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewStatics2(ptr: Pointer?): WithDefault = ITreeViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewStatics2 {
      val address = segment.toRawLongValue()
      return makeITreeViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449563991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewStatics2): Array<ITreeViewStatics2?> = (elements
        as Array<ITreeViewStatics2?>).castToImpl<ITreeViewStatics2,ITreeViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewStatics2?> =
        arrayOfNulls<ITreeViewStatics2_Impl>(size) as Array<ITreeViewStatics2?>
  }
}
