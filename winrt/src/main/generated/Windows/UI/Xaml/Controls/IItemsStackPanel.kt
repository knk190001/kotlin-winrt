package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.GroupHeaderPlacement
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsStackPanel.ABI::class)
@Signature("{df7ab79d-7ad5-4b58-9363-919af90226e6}")
@Guid("df7ab79d7ad54b589363919af90226e6")
@WinRTInterface("df7ab79d7ad54b589363919af90226e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsStackPanel.ByReference::class)
public interface IItemsStackPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupPadding(): Thickness?

  @InterfaceMethod(1)
  public fun put_GroupPadding(value: Thickness?): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(3)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(4)
  public fun get_FirstCacheIndex(): Int

  @InterfaceMethod(5)
  public fun get_FirstVisibleIndex(): Int

  @InterfaceMethod(6)
  public fun get_LastVisibleIndex(): Int

  @InterfaceMethod(7)
  public fun get_LastCacheIndex(): Int

  @InterfaceMethod(8)
  public fun get_ScrollingDirection(): PanelScrollingDirection?

  @InterfaceMethod(9)
  public fun get_GroupHeaderPlacement(): GroupHeaderPlacement?

  @InterfaceMethod(10)
  public fun put_GroupHeaderPlacement(value: GroupHeaderPlacement?): Unit

  @InterfaceMethod(11)
  public fun get_ItemsUpdatingScrollMode(): ItemsUpdatingScrollMode?

  @InterfaceMethod(12)
  public fun put_ItemsUpdatingScrollMode(value: ItemsUpdatingScrollMode?): Unit

  @InterfaceMethod(13)
  public fun get_CacheLength(): Double

  @InterfaceMethod(14)
  public fun put_CacheLength(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsStackPanel> {
    public override fun getValue() = ABI.makeIItemsStackPanel(pointer.getPointer(0))

    public fun setValue(value: IItemsStackPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsStackPanel {
    public val __542779552_Ptr: Pointer?

    public val _542779552_VtblPtr: Pointer?
      get() = __542779552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupPadding(): Thickness? {
      val fnPtr = _542779552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GroupPadding(value: Thickness?): Unit {
      val fnPtr = _542779552_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _542779552_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _542779552_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FirstCacheIndex(): Int {
      val fnPtr = _542779552_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_FirstVisibleIndex(): Int {
      val fnPtr = _542779552_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_LastVisibleIndex(): Int {
      val fnPtr = _542779552_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_LastCacheIndex(): Int {
      val fnPtr = _542779552_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_ScrollingDirection(): PanelScrollingDirection? {
      val fnPtr = _542779552_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PanelScrollingDirection>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PanelScrollingDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_GroupHeaderPlacement(): GroupHeaderPlacement? {
      val fnPtr = _542779552_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupHeaderPlacement>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupHeaderPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_GroupHeaderPlacement(value: GroupHeaderPlacement?): Unit {
      val fnPtr = _542779552_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ItemsUpdatingScrollMode(): ItemsUpdatingScrollMode? {
      val fnPtr = _542779552_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsUpdatingScrollMode>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsUpdatingScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ItemsUpdatingScrollMode(value: ItemsUpdatingScrollMode?): Unit {
      val fnPtr = _542779552_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_CacheLength(): Double {
      val fnPtr = _542779552_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_CacheLength(value: Double): Unit {
      val fnPtr = _542779552_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__542779552_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsStackPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __542779552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsStackPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df7ab79d7ad54b589363919af90226e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsStackPanel(ptr: Pointer?): WithDefault = IItemsStackPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsStackPanel {
      val address = segment.toRawLongValue()
      return makeIItemsStackPanel(Pointer(address))
    }

    public override fun toNative(obj: IItemsStackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__542779552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsStackPanel): Array<IItemsStackPanel?> = (elements as
        Array<IItemsStackPanel?>).castToImpl<IItemsStackPanel,IItemsStackPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsStackPanel?> =
        arrayOfNulls<IItemsStackPanel_Impl>(size) as Array<IItemsStackPanel?>
  }
}
