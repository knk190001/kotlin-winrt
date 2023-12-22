package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessage.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISmsBinaryMessage.ABI::class)
@Signature("{5bf4e813-3b53-4c6e-b61a-d86a63755650}")
@Guid("5bf4e8133b534c6eb61ad86a63755650")
@WinRTInterface("5bf4e8133b534c6eb61ad86a63755650")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsBinaryMessage.ByReference::class)
public interface ISmsBinaryMessage : NativeMapped, IWinRTInterface, ISmsMessage {
  @InterfaceMethod(0)
  public fun get_Format(): SmsDataFormat?

  @InterfaceMethod(1)
  public fun put_Format(value: SmsDataFormat?): Unit

  @InterfaceMethod(2)
  public fun GetData(): Array<Byte>?

  @InterfaceMethod(3)
  public fun SetData(value: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsBinaryMessage> {
    public override fun getValue() = ABI.makeISmsBinaryMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsBinaryMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsBinaryMessage, ISmsMessage.WithDefault {
    public val __1840365177_Ptr: Pointer?

    public val _1840365177_VtblPtr: Pointer?
      get() = __1840365177_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Format(): SmsDataFormat? {
      val fnPtr = _1840365177_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDataFormat>()
      val hr = fn.invokeHR(arrayOf(__1840365177_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDataFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Format(value: SmsDataFormat?): Unit {
      val fnPtr = _1840365177_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1840365177_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetData(): Array<Byte>? {
      val fnPtr = _1840365177_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1840365177_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetData(value: Array<Byte>): Unit {
      val fnPtr = _1840365177_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1840365177_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmsBinaryMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessage {
    public override val __1172998138_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1840365177_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1840365177_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsBinaryMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bf4e8133b534c6eb61ad86a63755650")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsBinaryMessage(ptr: Pointer?): WithDefault = ISmsBinaryMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsBinaryMessage {
      val address = segment.toRawLongValue()
      return makeISmsBinaryMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsBinaryMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1840365177_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsBinaryMessage): Array<ISmsBinaryMessage?> = (elements
        as Array<ISmsBinaryMessage?>).castToImpl<ISmsBinaryMessage,ISmsBinaryMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsBinaryMessage?> =
        arrayOfNulls<ISmsBinaryMessage_Impl>(size) as Array<ISmsBinaryMessage?>
  }
}
