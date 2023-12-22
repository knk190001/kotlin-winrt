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

@ABIMarker(IUploadOperation3.ABI::class)
@Signature("{42c92ca3-de39-4546-bc62-3774b4294de3}")
@Guid("42c92ca3de394546bc623774b4294de3")
@WinRTInterface("42c92ca3de394546bc623774b4294de3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUploadOperation3.ByReference::class)
public interface IUploadOperation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MakeCurrentInTransferGroup(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUploadOperation3> {
    public override fun getValue() = ABI.makeIUploadOperation3(pointer.getPointer(0))

    public fun setValue(value: IUploadOperation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUploadOperation3 {
    public val __525389262_Ptr: Pointer?

    public val _525389262_VtblPtr: Pointer?
      get() = __525389262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MakeCurrentInTransferGroup(): Unit {
      val fnPtr = _525389262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__525389262_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUploadOperation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __525389262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUploadOperation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42c92ca3de394546bc623774b4294de3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUploadOperation3(ptr: Pointer?): WithDefault = IUploadOperation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUploadOperation3 {
      val address = segment.toRawLongValue()
      return makeIUploadOperation3(Pointer(address))
    }

    public override fun toNative(obj: IUploadOperation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__525389262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUploadOperation3): Array<IUploadOperation3?> = (elements
        as Array<IUploadOperation3?>).castToImpl<IUploadOperation3,IUploadOperation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUploadOperation3?> =
        arrayOfNulls<IUploadOperation3_Impl>(size) as Array<IUploadOperation3?>
  }
}
