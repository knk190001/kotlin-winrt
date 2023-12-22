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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundUploaderStaticMethods2.ABI::class)
@Signature("{e919ac62-ea08-42f0-a2ac-07e467549080}")
@Guid("e919ac62ea0842f0a2ac07e467549080")
@WinRTInterface("e919ac62ea0842f0a2ac07e467549080")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploaderStaticMethods2.ByReference::class)
public interface IBackgroundUploaderStaticMethods2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentUploadsForTransferGroupAsync(group: BackgroundTransferGroup?):
      IAsyncOperation<IVectorView<UploadOperation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploaderStaticMethods2> {
    public override fun getValue() =
        ABI.makeIBackgroundUploaderStaticMethods2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploaderStaticMethods2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploaderStaticMethods2 {
    public val __1562533013_Ptr: Pointer?

    public val _1562533013_VtblPtr: Pointer?
      get() = __1562533013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentUploadsForTransferGroupAsync(group: BackgroundTransferGroup?):
        IAsyncOperation<IVectorView<UploadOperation?>?>? {
      val fnPtr = _1562533013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UploadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__1562533013_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UploadOperation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundUploaderStaticMethods2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1562533013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploaderStaticMethods2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e919ac62ea0842f0a2ac07e467549080")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploaderStaticMethods2(ptr: Pointer?): WithDefault =
        IBackgroundUploaderStaticMethods2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploaderStaticMethods2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploaderStaticMethods2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploaderStaticMethods2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1562533013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploaderStaticMethods2):
        Array<IBackgroundUploaderStaticMethods2?> = (elements as
        Array<IBackgroundUploaderStaticMethods2?>).castToImpl<IBackgroundUploaderStaticMethods2,IBackgroundUploaderStaticMethods2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploaderStaticMethods2?> =
        arrayOfNulls<IBackgroundUploaderStaticMethods2_Impl>(size) as
        Array<IBackgroundUploaderStaticMethods2?>
  }
}
