package Windows.ApplicationModel.DataTransfer

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClipboardHistoryItemsResult.ABI::class)
@Signature("{e6dfdee6-0ee2-52e3-852b-f295db65939a}")
@Guid("e6dfdee60ee252e3852bf295db65939a")
@WinRTInterface("e6dfdee60ee252e3852bf295db65939a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClipboardHistoryItemsResult.ByReference::class)
public interface IClipboardHistoryItemsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ClipboardHistoryItemsResultStatus?

  @InterfaceMethod(1)
  public fun get_Items(): IVectorView<ClipboardHistoryItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClipboardHistoryItemsResult> {
    public override fun getValue() = ABI.makeIClipboardHistoryItemsResult(pointer.getPointer(0))

    public fun setValue(value: IClipboardHistoryItemsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClipboardHistoryItemsResult {
    public val __487385099_Ptr: Pointer?

    public val _487385099_VtblPtr: Pointer?
      get() = __487385099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ClipboardHistoryItemsResultStatus? {
      val fnPtr = _487385099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClipboardHistoryItemsResultStatus>()
      val hr = fn.invokeHR(arrayOf(__487385099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClipboardHistoryItemsResultStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Items(): IVectorView<ClipboardHistoryItem?>? {
      val fnPtr = _487385099_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ClipboardHistoryItem?>>()
      val hr = fn.invokeHR(arrayOf(__487385099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ClipboardHistoryItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IClipboardHistoryItemsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __487385099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClipboardHistoryItemsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6dfdee60ee252e3852bf295db65939a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClipboardHistoryItemsResult(ptr: Pointer?): WithDefault =
        IClipboardHistoryItemsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClipboardHistoryItemsResult {
      val address = segment.toRawLongValue()
      return makeIClipboardHistoryItemsResult(Pointer(address))
    }

    public override fun toNative(obj: IClipboardHistoryItemsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__487385099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClipboardHistoryItemsResult):
        Array<IClipboardHistoryItemsResult?> = (elements as
        Array<IClipboardHistoryItemsResult?>).castToImpl<IClipboardHistoryItemsResult,IClipboardHistoryItemsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClipboardHistoryItemsResult?> =
        arrayOfNulls<IClipboardHistoryItemsResult_Impl>(size) as
        Array<IClipboardHistoryItemsResult?>
  }
}
