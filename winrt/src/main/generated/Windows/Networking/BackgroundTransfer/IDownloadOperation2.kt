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

@ABIMarker(IDownloadOperation2.ABI::class)
@Signature("{a3cced40-8f9c-4353-9cd4-290dee387c38}")
@Guid("a3cced408f9c43539cd4290dee387c38")
@WinRTInterface("a3cced408f9c43539cd4290dee387c38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadOperation2.ByReference::class)
public interface IDownloadOperation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransferGroup(): BackgroundTransferGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadOperation2> {
    public override fun getValue() = ABI.makeIDownloadOperation2(pointer.getPointer(0))

    public fun setValue(value: IDownloadOperation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadOperation2 {
    public val __214957908_Ptr: Pointer?

    public val _214957908_VtblPtr: Pointer?
      get() = __214957908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransferGroup(): BackgroundTransferGroup? {
      val fnPtr = _214957908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferGroup>()
      val hr = fn.invokeHR(arrayOf(__214957908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferGroup>(result.getValue())
      return resultValue
    }
  }

  public class IDownloadOperation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214957908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadOperation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3cced408f9c43539cd4290dee387c38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadOperation2(ptr: Pointer?): WithDefault = IDownloadOperation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadOperation2 {
      val address = segment.toRawLongValue()
      return makeIDownloadOperation2(Pointer(address))
    }

    public override fun toNative(obj: IDownloadOperation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214957908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadOperation2): Array<IDownloadOperation2?> =
        (elements as
        Array<IDownloadOperation2?>).castToImpl<IDownloadOperation2,IDownloadOperation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadOperation2?> =
        arrayOfNulls<IDownloadOperation2_Impl>(size) as Array<IDownloadOperation2?>
  }
}
