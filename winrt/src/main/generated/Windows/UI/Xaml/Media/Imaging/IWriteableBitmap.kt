package Windows.UI.Xaml.Media.Imaging

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWriteableBitmap.ABI::class)
@Signature("{bf0b7e6f-df7c-4a85-8413-a1216285835c}")
@Guid("bf0b7e6fdf7c4a858413a1216285835c")
@WinRTInterface("bf0b7e6fdf7c4a858413a1216285835c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWriteableBitmap.ByReference::class)
public interface IWriteableBitmap : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelBuffer(): IBuffer?

  @InterfaceMethod(1)
  public fun Invalidate(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWriteableBitmap> {
    public override fun getValue() = ABI.makeIWriteableBitmap(pointer.getPointer(0))

    public fun setValue(value: IWriteableBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWriteableBitmap {
    public val __2015929066_Ptr: Pointer?

    public val _2015929066_VtblPtr: Pointer?
      get() = __2015929066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelBuffer(): IBuffer? {
      val fnPtr = _2015929066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2015929066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Invalidate(): Unit {
      val fnPtr = _2015929066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2015929066_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWriteableBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2015929066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWriteableBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf0b7e6fdf7c4a858413a1216285835c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWriteableBitmap(ptr: Pointer?): WithDefault = IWriteableBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWriteableBitmap {
      val address = segment.toRawLongValue()
      return makeIWriteableBitmap(Pointer(address))
    }

    public override fun toNative(obj: IWriteableBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2015929066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWriteableBitmap): Array<IWriteableBitmap?> = (elements as
        Array<IWriteableBitmap?>).castToImpl<IWriteableBitmap,IWriteableBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWriteableBitmap?> =
        arrayOfNulls<IWriteableBitmap_Impl>(size) as Array<IWriteableBitmap?>
  }
}
