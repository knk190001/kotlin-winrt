package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IBackgroundDownloaderFactory.ABI::class)
@Signature("{26836c24-d89e-46f4-a29a-4f4d4f144155}")
@Guid("26836c24d89e46f4a29a4f4d4f144155")
@WinRTInterface("26836c24d89e46f4a29a4f4d4f144155")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloaderFactory.ByReference::class)
public interface IBackgroundDownloaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithCompletionGroup(completionGroup: BackgroundTransferCompletionGroup?):
      BackgroundDownloader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloaderFactory> {
    public override fun getValue() = ABI.makeIBackgroundDownloaderFactory(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloaderFactory {
    public val __2084269914_Ptr: Pointer?

    public val _2084269914_VtblPtr: Pointer?
      get() = __2084269914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateWithCompletionGroup(completionGroup: BackgroundTransferCompletionGroup?):
        BackgroundDownloader? {
      val fnPtr = _2084269914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundDownloader>()
      val hr = fn.invokeHR(arrayOf(__2084269914_Ptr, marshalToNative(completionGroup), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundDownloader>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2084269914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26836c24d89e46f4a29a4f4d4f144155")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloaderFactory(ptr: Pointer?): WithDefault =
        IBackgroundDownloaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloaderFactory {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2084269914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloaderFactory):
        Array<IBackgroundDownloaderFactory?> = (elements as
        Array<IBackgroundDownloaderFactory?>).castToImpl<IBackgroundDownloaderFactory,IBackgroundDownloaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloaderFactory?> =
        arrayOfNulls<IBackgroundDownloaderFactory_Impl>(size) as
        Array<IBackgroundDownloaderFactory?>
  }
}
