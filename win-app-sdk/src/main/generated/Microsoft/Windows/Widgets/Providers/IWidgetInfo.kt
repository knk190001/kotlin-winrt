package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetInfo.ABI::class)
@Signature("{cea11f42-a020-5db5-89e2-b7dece4ae5cb}")
@Guid("cea11f42a0205db589e2b7dece4ae5cb")
@WinRTInterface("cea11f42a0205db589e2b7dece4ae5cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetInfo.ByReference::class)
public interface IWidgetInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetContext(): WidgetContext?

  @InterfaceMethod(1)
  public fun get_Template(): String?

  @InterfaceMethod(2)
  public fun get_Data(): String?

  @InterfaceMethod(3)
  public fun get_CustomState(): String?

  @InterfaceMethod(4)
  public fun get_LastUpdateTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWidgetInfo> {
    public override fun getValue() = ABI.makeIWidgetInfo(pointer.getPointer(0))

    public fun setValue(value: IWidgetInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetInfo {
    public val __943576253_Ptr: Pointer?

    public val _943576253_VtblPtr: Pointer?
      get() = __943576253_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetContext(): WidgetContext? {
      val fnPtr = _943576253_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetContext>()
      val hr = fn.invokeHR(arrayOf(__943576253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Template(): String? {
      val fnPtr = _943576253_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__943576253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Data(): String? {
      val fnPtr = _943576253_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__943576253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CustomState(): String? {
      val fnPtr = _943576253_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__943576253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LastUpdateTime(): DateTime? {
      val fnPtr = _943576253_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__943576253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943576253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cea11f42a0205db589e2b7dece4ae5cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetInfo(ptr: Pointer?): WithDefault = IWidgetInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetInfo {
      val address = segment.toRawLongValue()
      return makeIWidgetInfo(Pointer(address))
    }

    public override fun toNative(obj: IWidgetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__943576253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetInfo): Array<IWidgetInfo?> = (elements as
        Array<IWidgetInfo?>).castToImpl<IWidgetInfo,IWidgetInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetInfo?> =
        arrayOfNulls<IWidgetInfo_Impl>(size) as Array<IWidgetInfo?>
  }
}
