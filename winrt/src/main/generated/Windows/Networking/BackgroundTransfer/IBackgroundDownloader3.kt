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

@ABIMarker(IBackgroundDownloader3.ABI::class)
@Signature("{d11a8c48-86e8-48e2-b615-6976aabf861d}")
@Guid("d11a8c4886e848e2b6156976aabf861d")
@WinRTInterface("d11a8c4886e848e2b6156976aabf861d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloader3.ByReference::class)
public interface IBackgroundDownloader3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompletionGroup(): BackgroundTransferCompletionGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloader3> {
    public override fun getValue() = ABI.makeIBackgroundDownloader3(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloader3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloader3 {
    public val __1020282095_Ptr: Pointer?

    public val _1020282095_VtblPtr: Pointer?
      get() = __1020282095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompletionGroup(): BackgroundTransferCompletionGroup? {
      val fnPtr = _1020282095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferCompletionGroup>()
      val hr = fn.invokeHR(arrayOf(__1020282095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferCompletionGroup>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloader3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1020282095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloader3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d11a8c4886e848e2b6156976aabf861d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloader3(ptr: Pointer?): WithDefault =
        IBackgroundDownloader3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloader3 {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloader3(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloader3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1020282095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloader3): Array<IBackgroundDownloader3?> =
        (elements as
        Array<IBackgroundDownloader3?>).castToImpl<IBackgroundDownloader3,IBackgroundDownloader3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloader3?> =
        arrayOfNulls<IBackgroundDownloader3_Impl>(size) as Array<IBackgroundDownloader3?>
  }
}
