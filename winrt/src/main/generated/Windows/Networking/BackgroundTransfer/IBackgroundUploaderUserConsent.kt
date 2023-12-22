package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IIterable
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundUploaderUserConsent.ABI::class)
@Signature("{3bb384cb-0760-461d-907f-5138f84d44c1}")
@Guid("3bb384cb0760461d907f5138f84d44c1")
@WinRTInterface("3bb384cb0760461d907f5138f84d44c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploaderUserConsent.ByReference::class)
public interface IBackgroundUploaderUserConsent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestUnconstrainedUploadsAsync(operations: IIterable<UploadOperation?>?):
      IAsyncOperation<UnconstrainedTransferRequestResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploaderUserConsent> {
    public override fun getValue() = ABI.makeIBackgroundUploaderUserConsent(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploaderUserConsent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploaderUserConsent {
    public val __340342062_Ptr: Pointer?

    public val _340342062_VtblPtr: Pointer?
      get() = __340342062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestUnconstrainedUploadsAsync(operations: IIterable<UploadOperation?>?):
        IAsyncOperation<UnconstrainedTransferRequestResult?>? {
      val fnPtr = _340342062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UnconstrainedTransferRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__340342062_Ptr, marshalToNative(operations), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UnconstrainedTransferRequestResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundUploaderUserConsent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __340342062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploaderUserConsent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bb384cb0760461d907f5138f84d44c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploaderUserConsent(ptr: Pointer?): WithDefault =
        IBackgroundUploaderUserConsent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploaderUserConsent {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploaderUserConsent(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploaderUserConsent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340342062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploaderUserConsent):
        Array<IBackgroundUploaderUserConsent?> = (elements as
        Array<IBackgroundUploaderUserConsent?>).castToImpl<IBackgroundUploaderUserConsent,IBackgroundUploaderUserConsent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploaderUserConsent?> =
        arrayOfNulls<IBackgroundUploaderUserConsent_Impl>(size) as
        Array<IBackgroundUploaderUserConsent?>
  }
}
