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

@ABIMarker(IItemsStackPanelStatics.ABI::class)
@Signature("{7ca08d59-be10-5d61-abe2-089ad44db1d6}")
@Guid("7ca08d59be105d61abe2089ad44db1d6")
@WinRTInterface("7ca08d59be105d61abe2089ad44db1d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsStackPanelStatics.ByReference::class)
public interface IItemsStackPanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupPaddingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_GroupHeaderPlacementProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CacheLengthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_AreStickyGroupHeadersEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsStackPanelStatics> {
    public override fun getValue() = ABI.makeIItemsStackPanelStatics(pointer.getPointer(0))

    public fun setValue(value: IItemsStackPanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsStackPanelStatics {
    public val __1629063792_Ptr: Pointer?

    public val _1629063792_VtblPtr: Pointer?
      get() = __1629063792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupPaddingProperty(): DependencyProperty? {
      val fnPtr = _1629063792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1629063792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1629063792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1629063792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_GroupHeaderPlacementProperty(): DependencyProperty? {
      val fnPtr = _1629063792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1629063792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CacheLengthProperty(): DependencyProperty? {
      val fnPtr = _1629063792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1629063792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AreStickyGroupHeadersEnabledProperty(): DependencyProperty? {
      val fnPtr = _1629063792_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1629063792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsStackPanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1629063792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsStackPanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ca08d59be105d61abe2089ad44db1d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsStackPanelStatics(ptr: Pointer?): WithDefault =
        IItemsStackPanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsStackPanelStatics {
      val address = segment.toRawLongValue()
      return makeIItemsStackPanelStatics(Pointer(address))
    }

    public override fun toNative(obj: IItemsStackPanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1629063792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsStackPanelStatics): Array<IItemsStackPanelStatics?>
        = (elements as
        Array<IItemsStackPanelStatics?>).castToImpl<IItemsStackPanelStatics,IItemsStackPanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsStackPanelStatics?> =
        arrayOfNulls<IItemsStackPanelStatics_Impl>(size) as Array<IItemsStackPanelStatics?>
  }
}
