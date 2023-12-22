package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.GroupHeaderPlacement
import Microsoft.UI.Xaml.Thickness
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsWrapGrid.ABI::class)
@Signature("{29910bc5-b305-5529-b88c-776c66e1b3ba}")
@Guid("29910bc5b3055529b88c776c66e1b3ba")
@WinRTInterface("29910bc5b3055529b88c776c66e1b3ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsWrapGrid.ByReference::class)
public interface IItemsWrapGrid : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupPadding(): Thickness?

  @InterfaceMethod(1)
  public fun put_GroupPadding(value: Thickness?): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(3)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(4)
  public fun get_MaximumRowsOrColumns(): Int

  @InterfaceMethod(5)
  public fun put_MaximumRowsOrColumns(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_ItemWidth(): Double

  @InterfaceMethod(7)
  public fun put_ItemWidth(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_ItemHeight(): Double

  @InterfaceMethod(9)
  public fun put_ItemHeight(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_FirstCacheIndex(): Int

  @InterfaceMethod(11)
  public fun get_FirstVisibleIndex(): Int

  @InterfaceMethod(12)
  public fun get_LastVisibleIndex(): Int

  @InterfaceMethod(13)
  public fun get_LastCacheIndex(): Int

  @InterfaceMethod(14)
  public fun get_ScrollingDirection(): PanelScrollingDirection?

  @InterfaceMethod(15)
  public fun get_GroupHeaderPlacement(): GroupHeaderPlacement?

  @InterfaceMethod(16)
  public fun put_GroupHeaderPlacement(value: GroupHeaderPlacement?): Unit

  @InterfaceMethod(17)
  public fun get_CacheLength(): Double

  @InterfaceMethod(18)
  public fun put_CacheLength(value: Double): Unit

  @InterfaceMethod(19)
  public fun get_AreStickyGroupHeadersEnabled(): Boolean

  @InterfaceMethod(20)
  public fun put_AreStickyGroupHeadersEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItemsWrapGrid>
      {
    public override fun getValue() = ABI.makeIItemsWrapGrid(pointer.getPointer(0))

    public fun setValue(value: IItemsWrapGrid_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsWrapGrid {
    public val __1773259735_Ptr: Pointer?

    public val _1773259735_VtblPtr: Pointer?
      get() = __1773259735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupPadding(): Thickness? {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GroupPadding(value: Thickness?): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaximumRowsOrColumns(): Int {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaximumRowsOrColumns(value: Int): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ItemWidth(): Double {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_ItemWidth(value: Double): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ItemHeight(): Double {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ItemHeight(value: Double): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_FirstCacheIndex(): Int {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_FirstVisibleIndex(): Int {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_LastVisibleIndex(): Int {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_LastCacheIndex(): Int {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_ScrollingDirection(): PanelScrollingDirection? {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PanelScrollingDirection>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PanelScrollingDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_GroupHeaderPlacement(): GroupHeaderPlacement? {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupHeaderPlacement>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupHeaderPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_GroupHeaderPlacement(value: GroupHeaderPlacement?): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_CacheLength(): Double {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_CacheLength(value: Double): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_AreStickyGroupHeadersEnabled(): Boolean {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_AreStickyGroupHeadersEnabled(value: Boolean): Unit {
      val fnPtr = _1773259735_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1773259735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsWrapGrid_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773259735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsWrapGrid, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29910bc5b3055529b88c776c66e1b3ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsWrapGrid(ptr: Pointer?): WithDefault = IItemsWrapGrid_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsWrapGrid {
      val address = segment.toRawLongValue()
      return makeIItemsWrapGrid(Pointer(address))
    }

    public override fun toNative(obj: IItemsWrapGrid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773259735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsWrapGrid): Array<IItemsWrapGrid?> = (elements as
        Array<IItemsWrapGrid?>).castToImpl<IItemsWrapGrid,IItemsWrapGrid_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsWrapGrid?> =
        arrayOfNulls<IItemsWrapGrid_Impl>(size) as Array<IItemsWrapGrid?>
  }
}
