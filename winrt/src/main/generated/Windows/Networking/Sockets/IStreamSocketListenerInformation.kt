package Windows.Networking.Sockets

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

@ABIMarker(IStreamSocketListenerInformation.ABI::class)
@Signature("{e62ba82f-a63a-430b-bf62-29e93e5633b4}")
@Guid("e62ba82fa63a430bbf6229e93e5633b4")
@WinRTInterface("e62ba82fa63a430bbf6229e93e5633b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListenerInformation.ByReference::class)
public interface IStreamSocketListenerInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalPort(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListenerInformation> {
    public override fun getValue() = ABI.makeIStreamSocketListenerInformation(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListenerInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListenerInformation {
    public val __1181402125_Ptr: Pointer?

    public val _1181402125_VtblPtr: Pointer?
      get() = __1181402125_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalPort(): String? {
      val fnPtr = _1181402125_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1181402125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketListenerInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1181402125_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListenerInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e62ba82fa63a430bbf6229e93e5633b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListenerInformation(ptr: Pointer?): WithDefault =
        IStreamSocketListenerInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketListenerInformation {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListenerInformation(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListenerInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1181402125_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListenerInformation):
        Array<IStreamSocketListenerInformation?> = (elements as
        Array<IStreamSocketListenerInformation?>).castToImpl<IStreamSocketListenerInformation,IStreamSocketListenerInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListenerInformation?> =
        arrayOfNulls<IStreamSocketListenerInformation_Impl>(size) as
        Array<IStreamSocketListenerInformation?>
  }
}
