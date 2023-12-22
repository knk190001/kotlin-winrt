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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUssdMessage.ABI::class)
@Signature("{2f9acf82-2004-4d5d-bf81-2aba1b4be4a8}")
@Guid("2f9acf8220044d5dbf812aba1b4be4a8")
@WinRTInterface("2f9acf8220044d5dbf812aba1b4be4a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUssdMessage.ByReference::class)
public interface IUssdMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataCodingScheme(): Byte

  @InterfaceMethod(1)
  public fun put_DataCodingScheme(value: Byte): Unit

  @InterfaceMethod(2)
  public fun GetPayload(): Array<Byte>?

  @InterfaceMethod(3)
  public fun SetPayload(value: Array<Byte>): Unit

  @InterfaceMethod(4)
  public fun get_PayloadAsText(): String?

  @InterfaceMethod(5)
  public fun put_PayloadAsText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUssdMessage> {
    public override fun getValue() = ABI.makeIUssdMessage(pointer.getPointer(0))

    public fun setValue(value: IUssdMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUssdMessage {
    public val __470927359_Ptr: Pointer?

    public val _470927359_VtblPtr: Pointer?
      get() = __470927359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataCodingScheme(): Byte {
      val fnPtr = _470927359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DataCodingScheme(value: Byte): Unit {
      val fnPtr = _470927359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetPayload(): Array<Byte>? {
      val fnPtr = _470927359_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetPayload(value: Array<Byte>): Unit {
      val fnPtr = _470927359_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PayloadAsText(): String? {
      val fnPtr = _470927359_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PayloadAsText(value: String?): Unit {
      val fnPtr = _470927359_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__470927359_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUssdMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __470927359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUssdMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f9acf8220044d5dbf812aba1b4be4a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUssdMessage(ptr: Pointer?): WithDefault = IUssdMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUssdMessage {
      val address = segment.toRawLongValue()
      return makeIUssdMessage(Pointer(address))
    }

    public override fun toNative(obj: IUssdMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__470927359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUssdMessage): Array<IUssdMessage?> = (elements as
        Array<IUssdMessage?>).castToImpl<IUssdMessage,IUssdMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUssdMessage?> =
        arrayOfNulls<IUssdMessage_Impl>(size) as Array<IUssdMessage?>
  }
}
