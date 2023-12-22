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

@ABIMarker(IUploadOperation2.ABI::class)
@Signature("{556189f2-2774-4df6-9fa5-209f2bfb12f7}")
@Guid("556189f227744df69fa5209f2bfb12f7")
@WinRTInterface("556189f227744df69fa5209f2bfb12f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUploadOperation2.ByReference::class)
public interface IUploadOperation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransferGroup(): BackgroundTransferGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUploadOperation2> {
    public override fun getValue() = ABI.makeIUploadOperation2(pointer.getPointer(0))

    public fun setValue(value: IUploadOperation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUploadOperation2 {
    public val __525389261_Ptr: Pointer?

    public val _525389261_VtblPtr: Pointer?
      get() = __525389261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransferGroup(): BackgroundTransferGroup? {
      val fnPtr = _525389261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferGroup>()
      val hr = fn.invokeHR(arrayOf(__525389261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferGroup>(result.getValue())
      return resultValue
    }
  }

  public class IUploadOperation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __525389261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUploadOperation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("556189f227744df69fa5209f2bfb12f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUploadOperation2(ptr: Pointer?): WithDefault = IUploadOperation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUploadOperation2 {
      val address = segment.toRawLongValue()
      return makeIUploadOperation2(Pointer(address))
    }

    public override fun toNative(obj: IUploadOperation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__525389261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUploadOperation2): Array<IUploadOperation2?> = (elements
        as Array<IUploadOperation2?>).castToImpl<IUploadOperation2,IUploadOperation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUploadOperation2?> =
        arrayOfNulls<IUploadOperation2_Impl>(size) as Array<IUploadOperation2?>
  }
}
