package Windows.UI.Xaml

import Windows.Foundation.Point
import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.UI.Xaml.Media.Imaging.BitmapImage
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

@ABIMarker(IDragUI.ABI::class)
@Signature("{2d9bd838-7c60-4842-9170-346fe10a226a}")
@Guid("2d9bd8387c6048429170346fe10a226a")
@WinRTInterface("2d9bd8387c6048429170346fe10a226a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragUI.ByReference::class)
public interface IDragUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetContentFromBitmapImage(bitmapImage: BitmapImage?): Unit

  @InterfaceMethod(1)
  public fun SetContentFromBitmapImage(bitmapImage: BitmapImage?, anchorPoint: Point?): Unit

  @InterfaceMethod(2)
  public fun SetContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?): Unit

  @InterfaceMethod(3)
  public fun SetContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?, anchorPoint: Point?):
      Unit

  @InterfaceMethod(4)
  public fun SetContentFromDataPackage(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDragUI> {
    public override fun getValue() = ABI.makeIDragUI(pointer.getPointer(0))

    public fun setValue(value: IDragUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragUI {
    public val __1692992614_Ptr: Pointer?

    public val _1692992614_VtblPtr: Pointer?
      get() = __1692992614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetContentFromBitmapImage(bitmapImage: BitmapImage?): Unit {
      val fnPtr = _1692992614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692992614_Ptr, marshalToNative(bitmapImage),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetContentFromBitmapImage(bitmapImage: BitmapImage?, anchorPoint: Point?):
        Unit {
      val fnPtr = _1692992614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692992614_Ptr, marshalToNative(bitmapImage),
          marshalToNative(anchorPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?): Unit {
      val fnPtr = _1692992614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692992614_Ptr, marshalToNative(softwareBitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?,
        anchorPoint: Point?): Unit {
      val fnPtr = _1692992614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692992614_Ptr, marshalToNative(softwareBitmap),
          marshalToNative(anchorPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetContentFromDataPackage(): Unit {
      val fnPtr = _1692992614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692992614_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1692992614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d9bd8387c6048429170346fe10a226a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragUI(ptr: Pointer?): WithDefault = IDragUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragUI {
      val address = segment.toRawLongValue()
      return makeIDragUI(Pointer(address))
    }

    public override fun toNative(obj: IDragUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1692992614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragUI): Array<IDragUI?> = (elements as
        Array<IDragUI?>).castToImpl<IDragUI,IDragUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragUI?> = arrayOfNulls<IDragUI_Impl>(size) as
        Array<IDragUI?>
  }
}
