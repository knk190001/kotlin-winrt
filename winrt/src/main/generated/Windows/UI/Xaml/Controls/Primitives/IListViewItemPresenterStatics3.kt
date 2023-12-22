package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IListViewItemPresenterStatics3.ABI::class)
@Signature("{c3d3d11e-fa26-4ce7-a4ed-ff948f01b7c0}")
@Guid("c3d3d11efa264ce7a4edff948f01b7c0")
@WinRTInterface("c3d3d11efa264ce7a4edff948f01b7c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenterStatics3.ByReference::class)
public interface IListViewItemPresenterStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RevealBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RevealBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RevealBorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RevealBackgroundShowsAboveContentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterStatics3> {
    public override fun getValue() = ABI.makeIListViewItemPresenterStatics3(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterStatics3 {
    public val __233173764_Ptr: Pointer?

    public val _233173764_VtblPtr: Pointer?
      get() = __233173764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RevealBackgroundProperty(): DependencyProperty? {
      val fnPtr = _233173764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RevealBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RevealBorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _233173764_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RevealBackgroundShowsAboveContentProperty(): DependencyProperty? {
      val fnPtr = _233173764_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemPresenterStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __233173764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3d3d11efa264ce7a4edff948f01b7c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterStatics3(ptr: Pointer?): WithDefault =
        IListViewItemPresenterStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterStatics3 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterStatics3(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__233173764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenterStatics3):
        Array<IListViewItemPresenterStatics3?> = (elements as
        Array<IListViewItemPresenterStatics3?>).castToImpl<IListViewItemPresenterStatics3,IListViewItemPresenterStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenterStatics3?> =
        arrayOfNulls<IListViewItemPresenterStatics3_Impl>(size) as
        Array<IListViewItemPresenterStatics3?>
  }
}
