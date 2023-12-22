package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetManager.ABI::class)
@Signature("{71cb10c0-671e-48e3-b995-207940397123}")
@Guid("71cb10c0671e48e3b995207940397123")
@WinRTInterface("71cb10c0671e48e3b995207940397123")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetManager.ByReference::class)
public interface IWidgetManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UpdateWidget(widgetUpdateRequestOptions: WidgetUpdateRequestOptions?): Unit

  @InterfaceMethod(1)
  public fun GetWidgetIds(): Array<String?>?

  @InterfaceMethod(2)
  public fun GetWidgetInfo(widgetId: String?): WidgetInfo?

  @InterfaceMethod(3)
  public fun GetWidgetInfos(): Array<WidgetInfo?>?

  @InterfaceMethod(4)
  public fun DeleteWidget(widgetId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWidgetManager>
      {
    public override fun getValue() = ABI.makeIWidgetManager(pointer.getPointer(0))

    public fun setValue(value: IWidgetManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetManager {
    public val __629259016_Ptr: Pointer?

    public val _629259016_VtblPtr: Pointer?
      get() = __629259016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UpdateWidget(widgetUpdateRequestOptions: WidgetUpdateRequestOptions?):
        Unit {
      val fnPtr = _629259016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629259016_Ptr, marshalToNative(widgetUpdateRequestOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetWidgetIds(): Array<String?>? {
      val fnPtr = _629259016_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<String>()
      val hr = fn.invokeHR(arrayOf(__629259016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetWidgetInfo(widgetId: String?): WidgetInfo? {
      val fnPtr = _629259016_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetInfo>()
      val hr = fn.invokeHR(arrayOf(__629259016_Ptr, marshalToNative(widgetId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetWidgetInfos(): Array<WidgetInfo?>? {
      val fnPtr = _629259016_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<WidgetInfo>()
      val hr = fn.invokeHR(arrayOf(__629259016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun DeleteWidget(widgetId: String?): Unit {
      val fnPtr = _629259016_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629259016_Ptr, marshalToNative(widgetId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWidgetManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629259016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71cb10c0671e48e3b995207940397123")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetManager(ptr: Pointer?): WithDefault = IWidgetManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetManager {
      val address = segment.toRawLongValue()
      return makeIWidgetManager(Pointer(address))
    }

    public override fun toNative(obj: IWidgetManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629259016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetManager): Array<IWidgetManager?> = (elements as
        Array<IWidgetManager?>).castToImpl<IWidgetManager,IWidgetManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetManager?> =
        arrayOfNulls<IWidgetManager_Impl>(size) as Array<IWidgetManager?>
  }
}
