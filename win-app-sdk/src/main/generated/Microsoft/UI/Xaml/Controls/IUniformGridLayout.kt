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

@ABIMarker(IUniformGridLayout.ABI::class)
@Signature("{8a164cbc-2a5e-56e5-a011-fb76334aabdf}")
@Guid("8a164cbc2a5e56e5a011fb76334aabdf")
@WinRTInterface("8a164cbc2a5e56e5a011fb76334aabdf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUniformGridLayout.ByReference::class)
public interface IUniformGridLayout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(1)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(2)
  public fun get_MinItemWidth(): Double

  @InterfaceMethod(3)
  public fun put_MinItemWidth(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_MinItemHeight(): Double

  @InterfaceMethod(5)
  public fun put_MinItemHeight(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_MinRowSpacing(): Double

  @InterfaceMethod(7)
  public fun put_MinRowSpacing(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_MinColumnSpacing(): Double

  @InterfaceMethod(9)
  public fun put_MinColumnSpacing(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_ItemsJustification(): UniformGridLayoutItemsJustification?

  @InterfaceMethod(11)
  public fun put_ItemsJustification(value: UniformGridLayoutItemsJustification?): Unit

  @InterfaceMethod(12)
  public fun get_ItemsStretch(): UniformGridLayoutItemsStretch?

  @InterfaceMethod(13)
  public fun put_ItemsStretch(value: UniformGridLayoutItemsStretch?): Unit

  @InterfaceMethod(14)
  public fun get_MaximumRowsOrColumns(): Int

  @InterfaceMethod(15)
  public fun put_MaximumRowsOrColumns(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUniformGridLayout> {
    public override fun getValue() = ABI.makeIUniformGridLayout(pointer.getPointer(0))

    public fun setValue(value: IUniformGridLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUniformGridLayout {
    public val __1821563907_Ptr: Pointer?

    public val _1821563907_VtblPtr: Pointer?
      get() = __1821563907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MinItemWidth(): Double {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MinItemWidth(value: Double): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinItemHeight(): Double {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MinItemHeight(value: Double): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MinRowSpacing(): Double {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MinRowSpacing(value: Double): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MinColumnSpacing(): Double {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MinColumnSpacing(value: Double): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ItemsJustification(): UniformGridLayoutItemsJustification? {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UniformGridLayoutItemsJustification>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UniformGridLayoutItemsJustification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ItemsJustification(value: UniformGridLayoutItemsJustification?): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ItemsStretch(): UniformGridLayoutItemsStretch? {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UniformGridLayoutItemsStretch>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UniformGridLayoutItemsStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ItemsStretch(value: UniformGridLayoutItemsStretch?): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaximumRowsOrColumns(): Int {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_MaximumRowsOrColumns(value: Int): Unit {
      val fnPtr = _1821563907_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1821563907_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUniformGridLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821563907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUniformGridLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a164cbc2a5e56e5a011fb76334aabdf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUniformGridLayout(ptr: Pointer?): WithDefault = IUniformGridLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUniformGridLayout {
      val address = segment.toRawLongValue()
      return makeIUniformGridLayout(Pointer(address))
    }

    public override fun toNative(obj: IUniformGridLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821563907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUniformGridLayout): Array<IUniformGridLayout?> =
        (elements as
        Array<IUniformGridLayout?>).castToImpl<IUniformGridLayout,IUniformGridLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUniformGridLayout?> =
        arrayOfNulls<IUniformGridLayout_Impl>(size) as Array<IUniformGridLayout?>
  }
}
