package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IBackgroundUploaderStaticMethods.ABI::class)
@Signature("{f2875cfb-9b05-4741-9121-740a83e247df}")
@Guid("f2875cfb9b0547419121740a83e247df")
@WinRTInterface("f2875cfb9b0547419121740a83e247df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploaderStaticMethods.ByReference::class)
public interface IBackgroundUploaderStaticMethods : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentUploadsAsync(): IAsyncOperation<IVectorView<UploadOperation?>?>?

  @InterfaceMethod(1)
  public fun GetCurrentUploadsAsync(group: String?):
      IAsyncOperation<IVectorView<UploadOperation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploaderStaticMethods> {
    public override fun getValue() = ABI.makeIBackgroundUploaderStaticMethods(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploaderStaticMethods_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploaderStaticMethods {
    public val __743140953_Ptr: Pointer?

    public val _743140953_VtblPtr: Pointer?
      get() = __743140953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentUploadsAsync(): IAsyncOperation<IVectorView<UploadOperation?>?>? {
      val fnPtr = _743140953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UploadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__743140953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UploadOperation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentUploadsAsync(group: String?):
        IAsyncOperation<IVectorView<UploadOperation?>?>? {
      val fnPtr = _743140953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UploadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__743140953_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UploadOperation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundUploaderStaticMethods_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __743140953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploaderStaticMethods, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2875cfb9b0547419121740a83e247df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploaderStaticMethods(ptr: Pointer?): WithDefault =
        IBackgroundUploaderStaticMethods_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploaderStaticMethods {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploaderStaticMethods(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploaderStaticMethods): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__743140953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploaderStaticMethods):
        Array<IBackgroundUploaderStaticMethods?> = (elements as
        Array<IBackgroundUploaderStaticMethods?>).castToImpl<IBackgroundUploaderStaticMethods,IBackgroundUploaderStaticMethods_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploaderStaticMethods?> =
        arrayOfNulls<IBackgroundUploaderStaticMethods_Impl>(size) as
        Array<IBackgroundUploaderStaticMethods?>
  }
}
