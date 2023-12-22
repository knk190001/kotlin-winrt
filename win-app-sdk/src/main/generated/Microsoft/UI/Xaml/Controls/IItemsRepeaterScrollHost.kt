package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsRepeaterScrollHost.ABI::class)
@Signature("{6f3cee8e-078a-59b4-931f-faa891c8c073}")
@Guid("6f3cee8e078a59b4931ffaa891c8c073")
@WinRTInterface("6f3cee8e078a59b4931ffaa891c8c073")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterScrollHost.ByReference::class)
public interface IItemsRepeaterScrollHost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScrollViewer(): ScrollViewer?

  @InterfaceMethod(1)
  public fun put_ScrollViewer(value: ScrollViewer?): Unit

  @InterfaceMethod(2)
  public fun get_CurrentAnchor(): UIElement?

  @InterfaceMethod(3)
  public fun get_HorizontalAnchorRatio(): Double

  @InterfaceMethod(4)
  public fun put_HorizontalAnchorRatio(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_VerticalAnchorRatio(): Double

  @InterfaceMethod(6)
  public fun put_VerticalAnchorRatio(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterScrollHost> {
    public override fun getValue() = ABI.makeIItemsRepeaterScrollHost(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterScrollHost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterScrollHost {
    public val __1821750794_Ptr: Pointer?

    public val _1821750794_VtblPtr: Pointer?
      get() = __1821750794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScrollViewer(): ScrollViewer? {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollViewer>()
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollViewer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ScrollViewer(value: ScrollViewer?): Unit {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrentAnchor(): UIElement? {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HorizontalAnchorRatio(): Double {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_HorizontalAnchorRatio(value: Double): Unit {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_VerticalAnchorRatio(): Double {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_VerticalAnchorRatio(value: Double): Unit {
      val fnPtr = _1821750794_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821750794_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsRepeaterScrollHost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821750794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterScrollHost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f3cee8e078a59b4931ffaa891c8c073")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterScrollHost(ptr: Pointer?): WithDefault =
        IItemsRepeaterScrollHost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterScrollHost {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterScrollHost(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterScrollHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821750794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterScrollHost):
        Array<IItemsRepeaterScrollHost?> = (elements as
        Array<IItemsRepeaterScrollHost?>).castToImpl<IItemsRepeaterScrollHost,IItemsRepeaterScrollHost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterScrollHost?> =
        arrayOfNulls<IItemsRepeaterScrollHost_Impl>(size) as Array<IItemsRepeaterScrollHost?>
  }
}
