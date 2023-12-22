package Windows.Networking.NetworkOperators

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

@ABIMarker(IUssdSessionStatics.ABI::class)
@Signature("{2f9acf82-1001-4d5d-bf81-2aba1b4be4a8}")
@Guid("2f9acf8210014d5dbf812aba1b4be4a8")
@WinRTInterface("2f9acf8210014d5dbf812aba1b4be4a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUssdSessionStatics.ByReference::class)
public interface IUssdSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromNetworkAccountId(networkAccountId: String?): UssdSession?

  @InterfaceMethod(1)
  public fun CreateFromNetworkInterfaceId(networkInterfaceId: String?): UssdSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUssdSessionStatics> {
    public override fun getValue() = ABI.makeIUssdSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IUssdSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUssdSessionStatics {
    public val __179106135_Ptr: Pointer?

    public val _179106135_VtblPtr: Pointer?
      get() = __179106135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromNetworkAccountId(networkAccountId: String?): UssdSession? {
      val fnPtr = _179106135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UssdSession>()
      val hr = fn.invokeHR(arrayOf(__179106135_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UssdSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNetworkInterfaceId(networkInterfaceId: String?): UssdSession? {
      val fnPtr = _179106135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UssdSession>()
      val hr = fn.invokeHR(arrayOf(__179106135_Ptr, marshalToNative(networkInterfaceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UssdSession>(result.getValue())
      return resultValue
    }
  }

  public class IUssdSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179106135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUssdSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f9acf8210014d5dbf812aba1b4be4a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUssdSessionStatics(ptr: Pointer?): WithDefault = IUssdSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUssdSessionStatics {
      val address = segment.toRawLongValue()
      return makeIUssdSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IUssdSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179106135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUssdSessionStatics): Array<IUssdSessionStatics?> =
        (elements as
        Array<IUssdSessionStatics?>).castToImpl<IUssdSessionStatics,IUssdSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUssdSessionStatics?> =
        arrayOfNulls<IUssdSessionStatics_Impl>(size) as Array<IUssdSessionStatics?>
  }
}
