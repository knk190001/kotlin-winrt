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

@ABIMarker(IUssdMessageFactory.ABI::class)
@Signature("{2f9acf82-1003-4d5d-bf81-2aba1b4be4a8}")
@Guid("2f9acf8210034d5dbf812aba1b4be4a8")
@WinRTInterface("2f9acf8210034d5dbf812aba1b4be4a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUssdMessageFactory.ByReference::class)
public interface IUssdMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMessage(messageText: String?): UssdMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUssdMessageFactory> {
    public override fun getValue() = ABI.makeIUssdMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IUssdMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUssdMessageFactory {
    public val __69194763_Ptr: Pointer?

    public val _69194763_VtblPtr: Pointer?
      get() = __69194763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMessage(messageText: String?): UssdMessage? {
      val fnPtr = _69194763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UssdMessage>()
      val hr = fn.invokeHR(arrayOf(__69194763_Ptr, marshalToNative(messageText), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UssdMessage>(result.getValue())
      return resultValue
    }
  }

  public class IUssdMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __69194763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUssdMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f9acf8210034d5dbf812aba1b4be4a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUssdMessageFactory(ptr: Pointer?): WithDefault = IUssdMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUssdMessageFactory {
      val address = segment.toRawLongValue()
      return makeIUssdMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IUssdMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__69194763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUssdMessageFactory): Array<IUssdMessageFactory?> =
        (elements as
        Array<IUssdMessageFactory?>).castToImpl<IUssdMessageFactory,IUssdMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUssdMessageFactory?> =
        arrayOfNulls<IUssdMessageFactory_Impl>(size) as Array<IUssdMessageFactory?>
  }
}
