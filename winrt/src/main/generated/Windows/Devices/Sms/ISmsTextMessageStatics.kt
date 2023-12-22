package Windows.Devices.Sms

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsTextMessageStatics.ABI::class)
@Signature("{7f68c5ed-3ccc-47a3-8c55-380d3b010892}")
@Guid("7f68c5ed3ccc47a38c55380d3b010892")
@WinRTInterface("7f68c5ed3ccc47a38c55380d3b010892")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsTextMessageStatics.ByReference::class)
public interface ISmsTextMessageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromBinaryMessage(binaryMessage: SmsBinaryMessage?): SmsTextMessage?

  @InterfaceMethod(1)
  public fun FromBinaryData(format: SmsDataFormat?, value: Array<Byte>): SmsTextMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsTextMessageStatics> {
    public override fun getValue() = ABI.makeISmsTextMessageStatics(pointer.getPointer(0))

    public fun setValue(value: ISmsTextMessageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsTextMessageStatics {
    public val __145351288_Ptr: Pointer?

    public val _145351288_VtblPtr: Pointer?
      get() = __145351288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromBinaryMessage(binaryMessage: SmsBinaryMessage?): SmsTextMessage? {
      val fnPtr = _145351288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsTextMessage>()
      val hr = fn.invokeHR(arrayOf(__145351288_Ptr, marshalToNative(binaryMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsTextMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromBinaryData(format: SmsDataFormat?, value: Array<Byte>):
        SmsTextMessage? {
      val fnPtr = _145351288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsTextMessage>()
      val hr = fn.invokeHR(arrayOf(__145351288_Ptr, marshalToNative(format),
          value.size,marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsTextMessage>(result.getValue())
      return resultValue
    }
  }

  public class ISmsTextMessageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145351288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsTextMessageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f68c5ed3ccc47a38c55380d3b010892")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsTextMessageStatics(ptr: Pointer?): WithDefault =
        ISmsTextMessageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsTextMessageStatics {
      val address = segment.toRawLongValue()
      return makeISmsTextMessageStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmsTextMessageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145351288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsTextMessageStatics): Array<ISmsTextMessageStatics?> =
        (elements as
        Array<ISmsTextMessageStatics?>).castToImpl<ISmsTextMessageStatics,ISmsTextMessageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsTextMessageStatics?> =
        arrayOfNulls<ISmsTextMessageStatics_Impl>(size) as Array<ISmsTextMessageStatics?>
  }
}
