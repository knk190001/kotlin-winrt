package Windows.Graphics.Capture

import Windows.Graphics.DisplayId
import Windows.UI.WindowId
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

@ABIMarker(IGraphicsCaptureItemStatics2.ABI::class)
@Signature("{3b92acc9-e584-5862-bf5c-9c316c6d2dbb}")
@Guid("3b92acc9e5845862bf5c9c316c6d2dbb")
@WinRTInterface("3b92acc9e5845862bf5c9c316c6d2dbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCaptureItemStatics2.ByReference::class)
public interface IGraphicsCaptureItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateFromWindowId(windowId: WindowId?): GraphicsCaptureItem?

  @InterfaceMethod(1)
  public fun TryCreateFromDisplayId(displayId: DisplayId?): GraphicsCaptureItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCaptureItemStatics2> {
    public override fun getValue() = ABI.makeIGraphicsCaptureItemStatics2(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCaptureItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCaptureItemStatics2 {
    public val __1699461920_Ptr: Pointer?

    public val _1699461920_VtblPtr: Pointer?
      get() = __1699461920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateFromWindowId(windowId: WindowId?): GraphicsCaptureItem? {
      val fnPtr = _1699461920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GraphicsCaptureItem>()
      val hr = fn.invokeHR(arrayOf(__1699461920_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GraphicsCaptureItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateFromDisplayId(displayId: DisplayId?): GraphicsCaptureItem? {
      val fnPtr = _1699461920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GraphicsCaptureItem>()
      val hr = fn.invokeHR(arrayOf(__1699461920_Ptr, marshalToNative(displayId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GraphicsCaptureItem>(result.getValue())
      return resultValue
    }
  }

  public class IGraphicsCaptureItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1699461920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCaptureItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b92acc9e5845862bf5c9c316c6d2dbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCaptureItemStatics2(ptr: Pointer?): WithDefault =
        IGraphicsCaptureItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCaptureItemStatics2 {
      val address = segment.toRawLongValue()
      return makeIGraphicsCaptureItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCaptureItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1699461920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCaptureItemStatics2):
        Array<IGraphicsCaptureItemStatics2?> = (elements as
        Array<IGraphicsCaptureItemStatics2?>).castToImpl<IGraphicsCaptureItemStatics2,IGraphicsCaptureItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCaptureItemStatics2?> =
        arrayOfNulls<IGraphicsCaptureItemStatics2_Impl>(size) as
        Array<IGraphicsCaptureItemStatics2?>
  }
}
