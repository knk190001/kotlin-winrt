package Windows.Media.DialProtocol

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

@ABIMarker(IDialReceiverApp2.ABI::class)
@Signature("{530c5805-9130-42ac-a504-1977dcb2ea8a}")
@Guid("530c5805913042aca5041977dcb2ea8a")
@WinRTInterface("530c5805913042aca5041977dcb2ea8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialReceiverApp2.ByReference::class)
public interface IDialReceiverApp2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUniqueDeviceNameAsync(): IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialReceiverApp2> {
    public override fun getValue() = ABI.makeIDialReceiverApp2(pointer.getPointer(0))

    public fun setValue(value: IDialReceiverApp2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialReceiverApp2 {
    public val __2136119620_Ptr: Pointer?

    public val _2136119620_VtblPtr: Pointer?
      get() = __2136119620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUniqueDeviceNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _2136119620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__2136119620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IDialReceiverApp2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2136119620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialReceiverApp2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("530c5805913042aca5041977dcb2ea8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialReceiverApp2(ptr: Pointer?): WithDefault = IDialReceiverApp2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialReceiverApp2 {
      val address = segment.toRawLongValue()
      return makeIDialReceiverApp2(Pointer(address))
    }

    public override fun toNative(obj: IDialReceiverApp2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2136119620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialReceiverApp2): Array<IDialReceiverApp2?> = (elements
        as Array<IDialReceiverApp2?>).castToImpl<IDialReceiverApp2,IDialReceiverApp2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialReceiverApp2?> =
        arrayOfNulls<IDialReceiverApp2_Impl>(size) as Array<IDialReceiverApp2?>
  }
}
