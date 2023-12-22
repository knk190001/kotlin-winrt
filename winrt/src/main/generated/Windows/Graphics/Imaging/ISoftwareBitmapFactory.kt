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

@ABIMarker(ISoftwareBitmapFactory.ABI::class)
@Signature("{c99feb69-2d62-4d47-a6b3-4fdb6a07fdf8}")
@Guid("c99feb692d624d47a6b34fdb6a07fdf8")
@WinRTInterface("c99feb692d624d47a6b34fdb6a07fdf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISoftwareBitmapFactory.ByReference::class)
public interface ISoftwareBitmapFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    format: BitmapPixelFormat?,
    width: Int,
    height: Int
  ): SoftwareBitmap?

  @InterfaceMethod(1)
  public fun CreateWithAlpha(
    format: BitmapPixelFormat?,
    width: Int,
    height: Int,
    alpha: BitmapAlphaMode?
  ): SoftwareBitmap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISoftwareBitmapFactory> {
    public override fun getValue() = ABI.makeISoftwareBitmapFactory(pointer.getPointer(0))

    public fun setValue(value: ISoftwareBitmapFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISoftwareBitmapFactory {
    public val __26373323_Ptr: Pointer?

    public val _26373323_VtblPtr: Pointer?
      get() = __26373323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      format: BitmapPixelFormat?,
      width: Int,
      height: Int
    ): SoftwareBitmap? {
      val fnPtr = _26373323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__26373323_Ptr, marshalToNative(format), width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithAlpha(
      format: BitmapPixelFormat?,
      width: Int,
      height: Int,
      alpha: BitmapAlphaMode?
    ): SoftwareBitmap? {
      val fnPtr = _26373323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__26373323_Ptr, marshalToNative(format), width, height,
          marshalToNative(alpha), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }
  }

  public class ISoftwareBitmapFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __26373323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISoftwareBitmapFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c99feb692d624d47a6b34fdb6a07fdf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISoftwareBitmapFactory(ptr: Pointer?): WithDefault =
        ISoftwareBitmapFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISoftwareBitmapFactory {
      val address = segment.toRawLongValue()
      return makeISoftwareBitmapFactory(Pointer(address))
    }

    public override fun toNative(obj: ISoftwareBitmapFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__26373323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISoftwareBitmapFactory): Array<ISoftwareBitmapFactory?> =
        (elements as
        Array<ISoftwareBitmapFactory?>).castToImpl<ISoftwareBitmapFactory,ISoftwareBitmapFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISoftwareBitmapFactory?> =
        arrayOfNulls<ISoftwareBitmapFactory_Impl>(size) as Array<ISoftwareBitmapFactory?>
  }
}
