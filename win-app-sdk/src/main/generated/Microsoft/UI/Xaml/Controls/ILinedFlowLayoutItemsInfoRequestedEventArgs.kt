package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILinedFlowLayoutItemsInfoRequestedEventArgs.ABI::class)
@Signature("{d69a3096-c1d3-57e5-8af7-3f7088b1958b}")
@Guid("d69a3096c1d357e58af73f7088b1958b")
@WinRTInterface("d69a3096c1d357e58af73f7088b1958b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinedFlowLayoutItemsInfoRequestedEventArgs.ByReference::class)
public interface ILinedFlowLayoutItemsInfoRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsRangeStartIndex(): Int

  @InterfaceMethod(1)
  public fun put_ItemsRangeStartIndex(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_ItemsRangeRequestedLength(): Int

  @InterfaceMethod(3)
  public fun get_MinWidth(): Double

  @InterfaceMethod(4)
  public fun put_MinWidth(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_MaxWidth(): Double

  @InterfaceMethod(6)
  public fun put_MaxWidth(value: Double): Unit

  @InterfaceMethod(7)
  public fun SetDesiredAspectRatios(values: Array<Double>): Unit

  @InterfaceMethod(8)
  public fun SetMinWidths(values: Array<Double>): Unit

  @InterfaceMethod(9)
  public fun SetMaxWidths(values: Array<Double>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayoutItemsInfoRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeILinedFlowLayoutItemsInfoRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayoutItemsInfoRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayoutItemsInfoRequestedEventArgs {
    public val __922267946_Ptr: Pointer?

    public val _922267946_VtblPtr: Pointer?
      get() = __922267946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsRangeStartIndex(): Int {
      val fnPtr = _922267946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ItemsRangeStartIndex(value: Int): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemsRangeRequestedLength(): Int {
      val fnPtr = _922267946_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MinWidth(): Double {
      val fnPtr = _922267946_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_MinWidth(value: Double): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_MaxWidth(): Double {
      val fnPtr = _922267946_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_MaxWidth(value: Double): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetDesiredAspectRatios(values: Array<Double>): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, values.size,marshalToNative(values),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetMinWidths(values: Array<Double>): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, values.size,marshalToNative(values),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetMaxWidths(values: Array<Double>): Unit {
      val fnPtr = _922267946_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922267946_Ptr, values.size,marshalToNative(values),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILinedFlowLayoutItemsInfoRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922267946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayoutItemsInfoRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d69a3096c1d357e58af73f7088b1958b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayoutItemsInfoRequestedEventArgs(ptr: Pointer?): WithDefault =
        ILinedFlowLayoutItemsInfoRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILinedFlowLayoutItemsInfoRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayoutItemsInfoRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayoutItemsInfoRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922267946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayoutItemsInfoRequestedEventArgs):
        Array<ILinedFlowLayoutItemsInfoRequestedEventArgs?> = (elements as
        Array<ILinedFlowLayoutItemsInfoRequestedEventArgs?>).castToImpl<ILinedFlowLayoutItemsInfoRequestedEventArgs,ILinedFlowLayoutItemsInfoRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinedFlowLayoutItemsInfoRequestedEventArgs?> =
        arrayOfNulls<ILinedFlowLayoutItemsInfoRequestedEventArgs_Impl>(size) as
        Array<ILinedFlowLayoutItemsInfoRequestedEventArgs?>
  }
}
