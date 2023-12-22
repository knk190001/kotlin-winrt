package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IWriteableBitmapFactory.ABI::class)
@Signature("{5563ebb1-3ef2-42c5-9c6d-1cf5dcc041ff}")
@Guid("5563ebb13ef242c59c6d1cf5dcc041ff")
@WinRTInterface("5563ebb13ef242c59c6d1cf5dcc041ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWriteableBitmapFactory.ByReference::class)
public interface IWriteableBitmapFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithDimensions(pixelWidth: Int, pixelHeight: Int): WriteableBitmap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWriteableBitmapFactory> {
    public override fun getValue() = ABI.makeIWriteableBitmapFactory(pointer.getPointer(0))

    public fun setValue(value: IWriteableBitmapFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWriteableBitmapFactory {
    public val __622044948_Ptr: Pointer?

    public val _622044948_VtblPtr: Pointer?
      get() = __622044948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithDimensions(pixelWidth: Int, pixelHeight: Int):
        WriteableBitmap? {
      val fnPtr = _622044948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WriteableBitmap>()
      val hr = fn.invokeHR(arrayOf(__622044948_Ptr, pixelWidth, pixelHeight, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WriteableBitmap>(result.getValue())
      return resultValue
    }
  }

  public class IWriteableBitmapFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __622044948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWriteableBitmapFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5563ebb13ef242c59c6d1cf5dcc041ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWriteableBitmapFactory(ptr: Pointer?): WithDefault =
        IWriteableBitmapFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWriteableBitmapFactory {
      val address = segment.toRawLongValue()
      return makeIWriteableBitmapFactory(Pointer(address))
    }

    public override fun toNative(obj: IWriteableBitmapFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__622044948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWriteableBitmapFactory): Array<IWriteableBitmapFactory?>
        = (elements as
        Array<IWriteableBitmapFactory?>).castToImpl<IWriteableBitmapFactory,IWriteableBitmapFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWriteableBitmapFactory?> =
        arrayOfNulls<IWriteableBitmapFactory_Impl>(size) as Array<IWriteableBitmapFactory?>
  }
}
