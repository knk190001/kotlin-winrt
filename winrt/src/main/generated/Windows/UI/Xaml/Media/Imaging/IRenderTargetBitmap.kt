package Windows.UI.Xaml.Media.Imaging

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IRenderTargetBitmap.ABI::class)
@Signature("{500dee81-893c-4c0a-8fec-4678ac717589}")
@Guid("500dee81893c4c0a8fec4678ac717589")
@WinRTInterface("500dee81893c4c0a8fec4678ac717589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRenderTargetBitmap.ByReference::class)
public interface IRenderTargetBitmap : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelWidth(): Int

  @InterfaceMethod(1)
  public fun get_PixelHeight(): Int

  @InterfaceMethod(2)
  public fun RenderAsync(element: UIElement?): IAsyncAction?

  @InterfaceMethod(3)
  public fun RenderAsync(
    element: UIElement?,
    scaledWidth: Int,
    scaledHeight: Int
  ): IAsyncAction?

  @InterfaceMethod(4)
  public fun GetPixelsAsync(): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRenderTargetBitmap> {
    public override fun getValue() = ABI.makeIRenderTargetBitmap(pointer.getPointer(0))

    public fun setValue(value: IRenderTargetBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRenderTargetBitmap {
    public val __870768824_Ptr: Pointer?

    public val _870768824_VtblPtr: Pointer?
      get() = __870768824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelWidth(): Int {
      val fnPtr = _870768824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__870768824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PixelHeight(): Int {
      val fnPtr = _870768824_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__870768824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RenderAsync(element: UIElement?): IAsyncAction? {
      val fnPtr = _870768824_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__870768824_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RenderAsync(
      element: UIElement?,
      scaledWidth: Int,
      scaledHeight: Int
    ): IAsyncAction? {
      val fnPtr = _870768824_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__870768824_Ptr, marshalToNative(element), scaledWidth,
          scaledHeight, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPixelsAsync(): IAsyncOperation<IBuffer?>? {
      val fnPtr = _870768824_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__870768824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class IRenderTargetBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __870768824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRenderTargetBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("500dee81893c4c0a8fec4678ac717589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRenderTargetBitmap(ptr: Pointer?): WithDefault = IRenderTargetBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRenderTargetBitmap {
      val address = segment.toRawLongValue()
      return makeIRenderTargetBitmap(Pointer(address))
    }

    public override fun toNative(obj: IRenderTargetBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__870768824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRenderTargetBitmap): Array<IRenderTargetBitmap?> =
        (elements as
        Array<IRenderTargetBitmap?>).castToImpl<IRenderTargetBitmap,IRenderTargetBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRenderTargetBitmap?> =
        arrayOfNulls<IRenderTargetBitmap_Impl>(size) as Array<IRenderTargetBitmap?>
  }
}
