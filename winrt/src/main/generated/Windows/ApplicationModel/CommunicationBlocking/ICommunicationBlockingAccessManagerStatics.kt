package Windows.ApplicationModel.CommunicationBlocking

import Windows.Foundation.Collections.IIterable
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommunicationBlockingAccessManagerStatics.ABI::class)
@Signature("{1c969998-9d2a-5db7-edd5-0ce407fc2595}")
@Guid("1c9699989d2a5db7edd50ce407fc2595")
@WinRTInterface("1c9699989d2a5db7edd50ce407fc2595")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommunicationBlockingAccessManagerStatics.ByReference::class)
public interface ICommunicationBlockingAccessManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBlockingActive(): Boolean

  @InterfaceMethod(1)
  public fun IsBlockedNumberAsync(number: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun ShowBlockNumbersUI(phoneNumbers: IIterable<String?>?): Boolean

  @InterfaceMethod(3)
  public fun ShowUnblockNumbersUI(phoneNumbers: IIterable<String?>?): Boolean

  @InterfaceMethod(4)
  public fun ShowBlockedCallsUI(): Unit

  @InterfaceMethod(5)
  public fun ShowBlockedMessagesUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommunicationBlockingAccessManagerStatics> {
    public override fun getValue() =
        ABI.makeICommunicationBlockingAccessManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICommunicationBlockingAccessManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommunicationBlockingAccessManagerStatics {
    public val __476374207_Ptr: Pointer?

    public val _476374207_VtblPtr: Pointer?
      get() = __476374207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBlockingActive(): Boolean {
      val fnPtr = _476374207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsBlockedNumberAsync(number: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _476374207_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr, marshalToNative(number), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowBlockNumbersUI(phoneNumbers: IIterable<String?>?): Boolean {
      val fnPtr = _476374207_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr, marshalToNative(phoneNumbers), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun ShowUnblockNumbersUI(phoneNumbers: IIterable<String?>?): Boolean {
      val fnPtr = _476374207_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr, marshalToNative(phoneNumbers), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun ShowBlockedCallsUI(): Unit {
      val fnPtr = _476374207_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ShowBlockedMessagesUI(): Unit {
      val fnPtr = _476374207_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__476374207_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommunicationBlockingAccessManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __476374207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommunicationBlockingAccessManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c9699989d2a5db7edd50ce407fc2595")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommunicationBlockingAccessManagerStatics(ptr: Pointer?): WithDefault =
        ICommunicationBlockingAccessManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICommunicationBlockingAccessManagerStatics {
      val address = segment.toRawLongValue()
      return makeICommunicationBlockingAccessManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICommunicationBlockingAccessManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__476374207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommunicationBlockingAccessManagerStatics):
        Array<ICommunicationBlockingAccessManagerStatics?> = (elements as
        Array<ICommunicationBlockingAccessManagerStatics?>).castToImpl<ICommunicationBlockingAccessManagerStatics,ICommunicationBlockingAccessManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommunicationBlockingAccessManagerStatics?> =
        arrayOfNulls<ICommunicationBlockingAccessManagerStatics_Impl>(size) as
        Array<ICommunicationBlockingAccessManagerStatics?>
  }
}
