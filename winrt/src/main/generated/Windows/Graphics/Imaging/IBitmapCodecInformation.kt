package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapCodecInformation.ABI::class)
@Signature("{400caaf2-c4b0-4392-a3b0-6f6f9ba95cb4}")
@Guid("400caaf2c4b04392a3b06f6f9ba95cb4")
@WinRTInterface("400caaf2c4b04392a3b06f6f9ba95cb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapCodecInformation.ByReference::class)
public interface IBitmapCodecInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CodecId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_FileExtensions(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(3)
  public fun get_MimeTypes(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapCodecInformation> {
    public override fun getValue() = ABI.makeIBitmapCodecInformation(pointer.getPointer(0))

    public fun setValue(value: IBitmapCodecInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapCodecInformation {
    public val __1785920754_Ptr: Pointer?

    public val _1785920754_VtblPtr: Pointer?
      get() = __1785920754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CodecId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1785920754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1785920754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FileExtensions(): IVectorView<String?>? {
      val fnPtr = _1785920754_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1785920754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _1785920754_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1785920754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MimeTypes(): IVectorView<String?>? {
      val fnPtr = _1785920754_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1785920754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapCodecInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1785920754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapCodecInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("400caaf2c4b04392a3b06f6f9ba95cb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapCodecInformation(ptr: Pointer?): WithDefault =
        IBitmapCodecInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapCodecInformation {
      val address = segment.toRawLongValue()
      return makeIBitmapCodecInformation(Pointer(address))
    }

    public override fun toNative(obj: IBitmapCodecInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1785920754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapCodecInformation): Array<IBitmapCodecInformation?>
        = (elements as
        Array<IBitmapCodecInformation?>).castToImpl<IBitmapCodecInformation,IBitmapCodecInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapCodecInformation?> =
        arrayOfNulls<IBitmapCodecInformation_Impl>(size) as Array<IBitmapCodecInformation?>
  }
}
