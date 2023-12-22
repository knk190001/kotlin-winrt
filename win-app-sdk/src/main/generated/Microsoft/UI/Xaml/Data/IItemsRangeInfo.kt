package Microsoft.UI.Xaml.Data

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IItemsRangeInfo.ABI::class)
@Signature("{b8376d08-85fb-563b-8273-39ef2d138256}")
@Guid("b8376d0885fb563b827339ef2d138256")
@WinRTInterface("b8376d0885fb563b827339ef2d138256")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRangeInfo.ByReference::class)
public interface IItemsRangeInfo : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun RangesChanged(visibleRange: ItemIndexRange?,
      trackedItems: IVectorView<ItemIndexRange?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRangeInfo> {
    public override fun getValue() = ABI.makeIItemsRangeInfo(pointer.getPointer(0))

    public fun setValue(value: IItemsRangeInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRangeInfo, IClosable.WithDefault {
    public val __1651450946_Ptr: Pointer?

    public val _1651450946_VtblPtr: Pointer?
      get() = __1651450946_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RangesChanged(visibleRange: ItemIndexRange?,
        trackedItems: IVectorView<ItemIndexRange?>?): Unit {
      val fnPtr = _1651450946_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651450946_Ptr, marshalToNative(visibleRange),
          marshalToNative(trackedItems),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsRangeInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1651450946_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1651450946_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRangeInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8376d0885fb563b827339ef2d138256")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRangeInfo(ptr: Pointer?): WithDefault = IItemsRangeInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRangeInfo {
      val address = segment.toRawLongValue()
      return makeIItemsRangeInfo(Pointer(address))
    }

    public override fun toNative(obj: IItemsRangeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651450946_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRangeInfo): Array<IItemsRangeInfo?> = (elements as
        Array<IItemsRangeInfo?>).castToImpl<IItemsRangeInfo,IItemsRangeInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRangeInfo?> =
        arrayOfNulls<IItemsRangeInfo_Impl>(size) as Array<IItemsRangeInfo?>
  }
}
