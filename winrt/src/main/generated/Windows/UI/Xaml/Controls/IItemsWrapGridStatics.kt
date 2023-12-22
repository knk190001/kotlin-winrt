package Windows.UI.Xaml.Controls

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

@ABIMarker(IItemsWrapGridStatics.ABI::class)
@Signature("{4ec5427d-24a0-449a-b763-3077ba0f2dd5}")
@Guid("4ec5427d24a0449ab7633077ba0f2dd5")
@WinRTInterface("4ec5427d24a0449ab7633077ba0f2dd5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsWrapGridStatics.ByReference::class)
public interface IItemsWrapGridStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupPaddingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MaximumRowsOrColumnsProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ItemWidthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ItemHeightProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_GroupHeaderPlacementProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CacheLengthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsWrapGridStatics> {
    public override fun getValue() = ABI.makeIItemsWrapGridStatics(pointer.getPointer(0))

    public fun setValue(value: IItemsWrapGridStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsWrapGridStatics {
    public val __764336847_Ptr: Pointer?

    public val _764336847_VtblPtr: Pointer?
      get() = __764336847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupPaddingProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaximumRowsOrColumnsProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemWidthProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ItemHeightProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_GroupHeaderPlacementProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CacheLengthProperty(): DependencyProperty? {
      val fnPtr = _764336847_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__764336847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsWrapGridStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __764336847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsWrapGridStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ec5427d24a0449ab7633077ba0f2dd5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsWrapGridStatics(ptr: Pointer?): WithDefault =
        IItemsWrapGridStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsWrapGridStatics {
      val address = segment.toRawLongValue()
      return makeIItemsWrapGridStatics(Pointer(address))
    }

    public override fun toNative(obj: IItemsWrapGridStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__764336847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsWrapGridStatics): Array<IItemsWrapGridStatics?> =
        (elements as
        Array<IItemsWrapGridStatics?>).castToImpl<IItemsWrapGridStatics,IItemsWrapGridStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsWrapGridStatics?> =
        arrayOfNulls<IItemsWrapGridStatics_Impl>(size) as Array<IItemsWrapGridStatics?>
  }
}
