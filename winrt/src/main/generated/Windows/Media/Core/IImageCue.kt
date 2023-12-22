package Windows.Media.Core

import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.Media.Core.IMediaCue.ABI.IID
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

@ABIMarker(IImageCue.ABI::class)
@Signature("{52828282-367b-440b-9116-3c84570dd270}")
@Guid("52828282367b440b91163c84570dd270")
@WinRTInterface("52828282367b440b91163c84570dd270")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageCue.ByReference::class)
public interface IImageCue : NativeMapped, IWinRTInterface, IMediaCue {
  @InterfaceMethod(0)
  public fun get_Position(): TimedTextPoint?

  @InterfaceMethod(1)
  public fun put_Position(value: TimedTextPoint?): Unit

  @InterfaceMethod(2)
  public fun get_Extent(): TimedTextSize?

  @InterfaceMethod(3)
  public fun put_Extent(value: TimedTextSize?): Unit

  @InterfaceMethod(4)
  public fun put_SoftwareBitmap(value: SoftwareBitmap?): Unit

  @InterfaceMethod(5)
  public fun get_SoftwareBitmap(): SoftwareBitmap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageCue> {
    public override fun getValue() = ABI.makeIImageCue(pointer.getPointer(0))

    public fun setValue(value: IImageCue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageCue, IMediaCue.WithDefault {
    public val __297816237_Ptr: Pointer?

    public val _297816237_VtblPtr: Pointer?
      get() = __297816237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): TimedTextPoint? {
      val fnPtr = _297816237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextPoint>()
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: TimedTextPoint?): Unit {
      val fnPtr = _297816237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Extent(): TimedTextSize? {
      val fnPtr = _297816237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSize>()
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Extent(value: TimedTextSize?): Unit {
      val fnPtr = _297816237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_SoftwareBitmap(value: SoftwareBitmap?): Unit {
      val fnPtr = _297816237_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SoftwareBitmap(): SoftwareBitmap? {
      val fnPtr = _297816237_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__297816237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }
  }

  public class IImageCue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaCue {
    public override val __256643460_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_297816237_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __297816237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageCue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52828282367b440b91163c84570dd270")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageCue(ptr: Pointer?): WithDefault = IImageCue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageCue {
      val address = segment.toRawLongValue()
      return makeIImageCue(Pointer(address))
    }

    public override fun toNative(obj: IImageCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__297816237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageCue): Array<IImageCue?> = (elements as
        Array<IImageCue?>).castToImpl<IImageCue,IImageCue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageCue?> = arrayOfNulls<IImageCue_Impl>(size)
        as Array<IImageCue?>
  }
}
