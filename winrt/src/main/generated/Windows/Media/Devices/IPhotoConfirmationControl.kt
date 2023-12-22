package Windows.Media.Devices

import Windows.Media.MediaProperties.MediaPixelFormat
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoConfirmationControl.ABI::class)
@Signature("{c8f3f363-ff5e-4582-a9a8-0550f85a4a76}")
@Guid("c8f3f363ff5e4582a9a80550f85a4a76")
@WinRTInterface("c8f3f363ff5e4582a9a80550f85a4a76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoConfirmationControl.ByReference::class)
public interface IPhotoConfirmationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun put_Enabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_PixelFormat(): MediaPixelFormat?

  @InterfaceMethod(4)
  public fun put_PixelFormat(format: MediaPixelFormat?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoConfirmationControl> {
    public override fun getValue() = ABI.makeIPhotoConfirmationControl(pointer.getPointer(0))

    public fun setValue(value: IPhotoConfirmationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoConfirmationControl {
    public val __60554761_Ptr: Pointer?

    public val _60554761_VtblPtr: Pointer?
      get() = __60554761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _60554761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60554761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _60554761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60554761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _60554761_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60554761_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PixelFormat(): MediaPixelFormat? {
      val fnPtr = _60554761_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__60554761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_PixelFormat(format: MediaPixelFormat?): Unit {
      val fnPtr = _60554761_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__60554761_Ptr, marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhotoConfirmationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60554761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoConfirmationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8f3f363ff5e4582a9a80550f85a4a76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoConfirmationControl(ptr: Pointer?): WithDefault =
        IPhotoConfirmationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoConfirmationControl {
      val address = segment.toRawLongValue()
      return makeIPhotoConfirmationControl(Pointer(address))
    }

    public override fun toNative(obj: IPhotoConfirmationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60554761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoConfirmationControl):
        Array<IPhotoConfirmationControl?> = (elements as
        Array<IPhotoConfirmationControl?>).castToImpl<IPhotoConfirmationControl,IPhotoConfirmationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoConfirmationControl?> =
        arrayOfNulls<IPhotoConfirmationControl_Impl>(size) as Array<IPhotoConfirmationControl?>
  }
}
