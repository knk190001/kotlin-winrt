package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Thickness
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewItemPresenter3.ABI::class)
@Signature("{36620013-0390-4e30-ad97-8744404f7010}")
@Guid("3662001303904e30ad978744404f7010")
@WinRTInterface("3662001303904e30ad978744404f7010")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenter3.ByReference::class)
public interface IListViewItemPresenter3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RevealBackground(): Brush?

  @InterfaceMethod(1)
  public fun put_RevealBackground(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_RevealBorderBrush(): Brush?

  @InterfaceMethod(3)
  public fun put_RevealBorderBrush(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_RevealBorderThickness(): Thickness?

  @InterfaceMethod(5)
  public fun put_RevealBorderThickness(value: Thickness?): Unit

  @InterfaceMethod(6)
  public fun get_RevealBackgroundShowsAboveContent(): Boolean

  @InterfaceMethod(7)
  public fun put_RevealBackgroundShowsAboveContent(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenter3> {
    public override fun getValue() = ABI.makeIListViewItemPresenter3(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenter3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenter3 {
    public val __1417391901_Ptr: Pointer?

    public val _1417391901_VtblPtr: Pointer?
      get() = __1417391901_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RevealBackground(): Brush? {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RevealBackground(value: Brush?): Unit {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RevealBorderBrush(): Brush? {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RevealBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RevealBorderThickness(): Thickness? {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RevealBorderThickness(value: Thickness?): Unit {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RevealBackgroundShowsAboveContent(): Boolean {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_RevealBackgroundShowsAboveContent(value: Boolean): Unit {
      val fnPtr = _1417391901_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391901_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewItemPresenter3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417391901_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenter3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3662001303904e30ad978744404f7010")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenter3(ptr: Pointer?): WithDefault =
        IListViewItemPresenter3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenter3 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenter3(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenter3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1417391901_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenter3): Array<IListViewItemPresenter3?>
        = (elements as
        Array<IListViewItemPresenter3?>).castToImpl<IListViewItemPresenter3,IListViewItemPresenter3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenter3?> =
        arrayOfNulls<IListViewItemPresenter3_Impl>(size) as Array<IListViewItemPresenter3?>
  }
}
