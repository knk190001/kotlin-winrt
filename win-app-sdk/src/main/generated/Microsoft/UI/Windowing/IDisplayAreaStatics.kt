package Microsoft.UI.Windowing

import Microsoft.UI.WindowId
import Windows.Foundation.Collections.IVectorView
import Windows.Graphics.PointInt32
import Windows.Graphics.RectInt32
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

@ABIMarker(IDisplayAreaStatics.ABI::class)
@Signature("{02ab4926-211e-5d49-8e4b-2af193daed09}")
@Guid("02ab4926211e5d498e4b2af193daed09")
@WinRTInterface("02ab4926211e5d498e4b2af193daed09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayAreaStatics.ByReference::class)
public interface IDisplayAreaStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Primary(): DisplayArea?

  @InterfaceMethod(1)
  public fun CreateWatcher(): DisplayAreaWatcher?

  @InterfaceMethod(2)
  public fun FindAll(): IVectorView<DisplayArea?>?

  @InterfaceMethod(3)
  public fun GetFromWindowId(windowId: WindowId?, displayAreaFallback: DisplayAreaFallback?):
      DisplayArea?

  @InterfaceMethod(4)
  public fun GetFromPoint(point: PointInt32?, displayAreaFallback: DisplayAreaFallback?):
      DisplayArea?

  @InterfaceMethod(5)
  public fun GetFromRect(rect: RectInt32?, displayAreaFallback: DisplayAreaFallback?): DisplayArea?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayAreaStatics> {
    public override fun getValue() = ABI.makeIDisplayAreaStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayAreaStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayAreaStatics {
    public val __1889612135_Ptr: Pointer?

    public val _1889612135_VtblPtr: Pointer?
      get() = __1889612135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Primary(): DisplayArea? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayArea>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayArea>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWatcher(): DisplayAreaWatcher? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAreaWatcher>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAreaWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAll(): IVectorView<DisplayArea?>? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayArea?>>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayArea?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetFromWindowId(windowId: WindowId?,
        displayAreaFallback: DisplayAreaFallback?): DisplayArea? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayArea>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr, marshalToNative(windowId),
          marshalToNative(displayAreaFallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayArea>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFromPoint(point: PointInt32?, displayAreaFallback: DisplayAreaFallback?):
        DisplayArea? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayArea>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr, marshalToNative(point),
          marshalToNative(displayAreaFallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayArea>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetFromRect(rect: RectInt32?, displayAreaFallback: DisplayAreaFallback?):
        DisplayArea? {
      val fnPtr = _1889612135_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayArea>()
      val hr = fn.invokeHR(arrayOf(__1889612135_Ptr, marshalToNative(rect),
          marshalToNative(displayAreaFallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayArea>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayAreaStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1889612135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayAreaStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02ab4926211e5d498e4b2af193daed09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayAreaStatics(ptr: Pointer?): WithDefault = IDisplayAreaStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayAreaStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayAreaStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayAreaStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1889612135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayAreaStatics): Array<IDisplayAreaStatics?> =
        (elements as
        Array<IDisplayAreaStatics?>).castToImpl<IDisplayAreaStatics,IDisplayAreaStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayAreaStatics?> =
        arrayOfNulls<IDisplayAreaStatics_Impl>(size) as Array<IDisplayAreaStatics?>
  }
}
