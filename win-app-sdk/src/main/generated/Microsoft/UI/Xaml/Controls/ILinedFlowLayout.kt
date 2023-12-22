package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILinedFlowLayout.ABI::class)
@Signature("{f887a64b-b146-540c-8953-d8184b79ba6e}")
@Guid("f887a64bb146540c8953d8184b79ba6e")
@WinRTInterface("f887a64bb146540c8953d8184b79ba6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinedFlowLayout.ByReference::class)
public interface ILinedFlowLayout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ItemsInfoRequested(handler: TypedEventHandler<LinedFlowLayout?,
      LinedFlowLayoutItemsInfoRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemsInfoRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ItemsUnlocked(handler: TypedEventHandler<LinedFlowLayout?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ItemsUnlocked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_ItemsJustification(): LinedFlowLayoutItemsJustification?

  @InterfaceMethod(5)
  public fun put_ItemsJustification(value: LinedFlowLayoutItemsJustification?): Unit

  @InterfaceMethod(6)
  public fun get_ItemsStretch(): LinedFlowLayoutItemsStretch?

  @InterfaceMethod(7)
  public fun put_ItemsStretch(value: LinedFlowLayoutItemsStretch?): Unit

  @InterfaceMethod(8)
  public fun get_MinItemSpacing(): Double

  @InterfaceMethod(9)
  public fun put_MinItemSpacing(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_LineSpacing(): Double

  @InterfaceMethod(11)
  public fun put_LineSpacing(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_LineHeight(): Double

  @InterfaceMethod(13)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_ActualLineHeight(): Double

  @InterfaceMethod(15)
  public fun get_RequestedRangeStartIndex(): Int

  @InterfaceMethod(16)
  public fun get_RequestedRangeLength(): Int

  @InterfaceMethod(17)
  public fun InvalidateItemsInfo(): Unit

  @InterfaceMethod(18)
  public fun LockItemToLine(itemIndex: Int): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayout> {
    public override fun getValue() = ABI.makeILinedFlowLayout(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayout {
    public val __1980045409_Ptr: Pointer?

    public val _1980045409_VtblPtr: Pointer?
      get() = __1980045409_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemsInfoRequested(handler: TypedEventHandler<LinedFlowLayout?,
        LinedFlowLayoutItemsInfoRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemsInfoRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ItemsUnlocked(handler: TypedEventHandler<LinedFlowLayout?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ItemsUnlocked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ItemsJustification(): LinedFlowLayoutItemsJustification? {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinedFlowLayoutItemsJustification>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinedFlowLayoutItemsJustification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ItemsJustification(value: LinedFlowLayoutItemsJustification?): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ItemsStretch(): LinedFlowLayoutItemsStretch? {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinedFlowLayoutItemsStretch>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinedFlowLayoutItemsStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ItemsStretch(value: LinedFlowLayoutItemsStretch?): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MinItemSpacing(): Double {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MinItemSpacing(value: Double): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_LineSpacing(): Double {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_LineSpacing(value: Double): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ActualLineHeight(): Double {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_RequestedRangeStartIndex(): Int {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_RequestedRangeLength(): Int {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun InvalidateItemsInfo(): Unit {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun LockItemToLine(itemIndex: Int): Int {
      val fnPtr = _1980045409_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1980045409_Ptr, itemIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ILinedFlowLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980045409_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f887a64bb146540c8953d8184b79ba6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayout(ptr: Pointer?): WithDefault = ILinedFlowLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinedFlowLayout {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayout(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980045409_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayout): Array<ILinedFlowLayout?> = (elements as
        Array<ILinedFlowLayout?>).castToImpl<ILinedFlowLayout,ILinedFlowLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinedFlowLayout?> =
        arrayOfNulls<ILinedFlowLayout_Impl>(size) as Array<ILinedFlowLayout?>
  }
}
