package Windows.Graphics.Imaging

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

@ABIMarker(IBitmapEncoderWithSoftwareBitmap.ABI::class)
@Signature("{686cd241-4330-4c77-ace4-0334968b1768}")
@Guid("686cd24143304c77ace40334968b1768")
@WinRTInterface("686cd24143304c77ace40334968b1768")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapEncoderWithSoftwareBitmap.ByReference::class)
public interface IBitmapEncoderWithSoftwareBitmap : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetSoftwareBitmap(bitmap: SoftwareBitmap?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapEncoderWithSoftwareBitmap> {
    public override fun getValue() = ABI.makeIBitmapEncoderWithSoftwareBitmap(pointer.getPointer(0))

    public fun setValue(value: IBitmapEncoderWithSoftwareBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapEncoderWithSoftwareBitmap {
    public val __234285696_Ptr: Pointer?

    public val _234285696_VtblPtr: Pointer?
      get() = __234285696_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetSoftwareBitmap(bitmap: SoftwareBitmap?): Unit {
      val fnPtr = _234285696_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__234285696_Ptr, marshalToNative(bitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapEncoderWithSoftwareBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __234285696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapEncoderWithSoftwareBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("686cd24143304c77ace40334968b1768")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapEncoderWithSoftwareBitmap(ptr: Pointer?): WithDefault =
        IBitmapEncoderWithSoftwareBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapEncoderWithSoftwareBitmap {
      val address = segment.toRawLongValue()
      return makeIBitmapEncoderWithSoftwareBitmap(Pointer(address))
    }

    public override fun toNative(obj: IBitmapEncoderWithSoftwareBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__234285696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapEncoderWithSoftwareBitmap):
        Array<IBitmapEncoderWithSoftwareBitmap?> = (elements as
        Array<IBitmapEncoderWithSoftwareBitmap?>).castToImpl<IBitmapEncoderWithSoftwareBitmap,IBitmapEncoderWithSoftwareBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapEncoderWithSoftwareBitmap?> =
        arrayOfNulls<IBitmapEncoderWithSoftwareBitmap_Impl>(size) as
        Array<IBitmapEncoderWithSoftwareBitmap?>
  }
}
