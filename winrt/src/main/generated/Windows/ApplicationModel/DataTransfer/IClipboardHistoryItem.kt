package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.DateTime
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClipboardHistoryItem.ABI::class)
@Signature("{0173bd8a-afff-5c50-ab92-3d19f481ec58}")
@Guid("0173bd8aafff5c50ab923d19f481ec58")
@WinRTInterface("0173bd8aafff5c50ab923d19f481ec58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClipboardHistoryItem.ByReference::class)
public interface IClipboardHistoryItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(2)
  public fun get_Content(): DataPackageView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClipboardHistoryItem> {
    public override fun getValue() = ABI.makeIClipboardHistoryItem(pointer.getPointer(0))

    public fun setValue(value: IClipboardHistoryItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClipboardHistoryItem {
    public val __855427557_Ptr: Pointer?

    public val _855427557_VtblPtr: Pointer?
      get() = __855427557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _855427557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__855427557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _855427557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__855427557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Content(): DataPackageView? {
      val fnPtr = _855427557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__855427557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }
  }

  public class IClipboardHistoryItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855427557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClipboardHistoryItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0173bd8aafff5c50ab923d19f481ec58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClipboardHistoryItem(ptr: Pointer?): WithDefault =
        IClipboardHistoryItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClipboardHistoryItem {
      val address = segment.toRawLongValue()
      return makeIClipboardHistoryItem(Pointer(address))
    }

    public override fun toNative(obj: IClipboardHistoryItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855427557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClipboardHistoryItem): Array<IClipboardHistoryItem?> =
        (elements as
        Array<IClipboardHistoryItem?>).castToImpl<IClipboardHistoryItem,IClipboardHistoryItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClipboardHistoryItem?> =
        arrayOfNulls<IClipboardHistoryItem_Impl>(size) as Array<IClipboardHistoryItem?>
  }
}
