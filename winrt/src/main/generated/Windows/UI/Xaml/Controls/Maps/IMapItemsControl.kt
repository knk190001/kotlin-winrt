package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMapItemsControl.ABI::class)
@Signature("{94c2c4d3-b335-42c5-b660-e6a07ec3bddc}")
@Guid("94c2c4d3b33542c5b660e6a07ec3bddc")
@WinRTInterface("94c2c4d3b33542c5b660e6a07ec3bddc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapItemsControl.ByReference::class)
public interface IMapItemsControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(1)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_Items(): IVector<DependencyObject?>?

  @InterfaceMethod(3)
  public fun get_ItemTemplate(): DataTemplate?

  @InterfaceMethod(4)
  public fun put_ItemTemplate(value: DataTemplate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapItemsControl> {
    public override fun getValue() = ABI.makeIMapItemsControl(pointer.getPointer(0))

    public fun setValue(value: IMapItemsControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapItemsControl {
    public val __1314583432_Ptr: Pointer?

    public val _1314583432_VtblPtr: Pointer?
      get() = __1314583432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _1314583432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1314583432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _1314583432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314583432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Items(): IVector<DependencyObject?>? {
      val fnPtr = _1314583432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__1314583432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemTemplate(): DataTemplate? {
      val fnPtr = _1314583432_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1314583432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1314583432_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314583432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapItemsControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314583432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapItemsControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94c2c4d3b33542c5b660e6a07ec3bddc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapItemsControl(ptr: Pointer?): WithDefault = IMapItemsControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapItemsControl {
      val address = segment.toRawLongValue()
      return makeIMapItemsControl(Pointer(address))
    }

    public override fun toNative(obj: IMapItemsControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314583432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapItemsControl): Array<IMapItemsControl?> = (elements as
        Array<IMapItemsControl?>).castToImpl<IMapItemsControl,IMapItemsControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapItemsControl?> =
        arrayOfNulls<IMapItemsControl_Impl>(size) as Array<IMapItemsControl?>
  }
}
