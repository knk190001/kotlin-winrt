package Microsoft.UI.Xaml.Data

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISelectionInfo.ABI::class)
@Signature("{1b84c26b-9532-5803-935b-a03bf7e875dc}")
@Guid("1b84c26b95325803935ba03bf7e875dc")
@WinRTInterface("1b84c26b95325803935ba03bf7e875dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionInfo.ByReference::class)
public interface ISelectionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectRange(itemIndexRange: ItemIndexRange?): Unit

  @InterfaceMethod(1)
  public fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit

  @InterfaceMethod(2)
  public fun IsSelected(index: Int): Boolean

  @InterfaceMethod(3)
  public fun GetSelectedRanges(): IVectorView<ItemIndexRange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISelectionInfo>
      {
    public override fun getValue() = ABI.makeISelectionInfo(pointer.getPointer(0))

    public fun setValue(value: ISelectionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionInfo {
    public val __1792546279_Ptr: Pointer?

    public val _1792546279_VtblPtr: Pointer?
      get() = __1792546279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1792546279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1792546279_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1792546279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1792546279_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun IsSelected(index: Int): Boolean {
      val fnPtr = _1792546279_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1792546279_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetSelectedRanges(): IVectorView<ItemIndexRange?>? {
      val fnPtr = _1792546279_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ItemIndexRange?>>()
      val hr = fn.invokeHR(arrayOf(__1792546279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ItemIndexRange?>>(result.getValue())
      return resultValue
    }
  }

  public class ISelectionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1792546279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b84c26b95325803935ba03bf7e875dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionInfo(ptr: Pointer?): WithDefault = ISelectionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionInfo {
      val address = segment.toRawLongValue()
      return makeISelectionInfo(Pointer(address))
    }

    public override fun toNative(obj: ISelectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1792546279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionInfo): Array<ISelectionInfo?> = (elements as
        Array<ISelectionInfo?>).castToImpl<ISelectionInfo,ISelectionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionInfo?> =
        arrayOfNulls<ISelectionInfo_Impl>(size) as Array<ISelectionInfo?>
  }
}
