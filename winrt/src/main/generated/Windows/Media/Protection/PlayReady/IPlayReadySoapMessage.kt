package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.Uri
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

@ABIMarker(IPlayReadySoapMessage.ABI::class)
@Signature("{b659fcb5-ce41-41ba-8a0d-61df5fffa139}")
@Guid("b659fcb5ce4141ba8a0d61df5fffa139")
@WinRTInterface("b659fcb5ce4141ba8a0d61df5fffa139")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadySoapMessage.ByReference::class)
public interface IPlayReadySoapMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetMessageBody(): Array<Byte>?

  @InterfaceMethod(1)
  public fun get_MessageHeaders(): IPropertySet?

  @InterfaceMethod(2)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadySoapMessage> {
    public override fun getValue() = ABI.makeIPlayReadySoapMessage(pointer.getPointer(0))

    public fun setValue(value: IPlayReadySoapMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadySoapMessage {
    public val __264603815_Ptr: Pointer?

    public val _264603815_VtblPtr: Pointer?
      get() = __264603815_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMessageBody(): Array<Byte>? {
      val fnPtr = _264603815_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__264603815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MessageHeaders(): IPropertySet? {
      val fnPtr = _264603815_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__264603815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Uri(): Uri? {
      val fnPtr = _264603815_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__264603815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadySoapMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __264603815_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadySoapMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b659fcb5ce4141ba8a0d61df5fffa139")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadySoapMessage(ptr: Pointer?): WithDefault =
        IPlayReadySoapMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadySoapMessage {
      val address = segment.toRawLongValue()
      return makeIPlayReadySoapMessage(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadySoapMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__264603815_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadySoapMessage): Array<IPlayReadySoapMessage?> =
        (elements as
        Array<IPlayReadySoapMessage?>).castToImpl<IPlayReadySoapMessage,IPlayReadySoapMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadySoapMessage?> =
        arrayOfNulls<IPlayReadySoapMessage_Impl>(size) as Array<IPlayReadySoapMessage?>
  }
}
