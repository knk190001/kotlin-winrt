package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCard.ABI::class)
@Signature("{1b718871-6434-43f4-b55a-6a29623870aa}")
@Guid("1b718871643443f4b55a6a29623870aa")
@WinRTInterface("1b718871643443f4b55a6a29623870aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCard.ByReference::class)
public interface ISmartCard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reader(): SmartCardReader?

  @InterfaceMethod(1)
  public fun GetStatusAsync(): IAsyncOperation<SmartCardStatus?>?

  @InterfaceMethod(2)
  public fun GetAnswerToResetAsync(): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISmartCard> {
    public override fun getValue() = ABI.makeISmartCard(pointer.getPointer(0))

    public fun setValue(value: ISmartCard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCard {
    public val __204168922_Ptr: Pointer?

    public val _204168922_VtblPtr: Pointer?
      get() = __204168922_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reader(): SmartCardReader? {
      val fnPtr = _204168922_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardReader>()
      val hr = fn.invokeHR(arrayOf(__204168922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetStatusAsync(): IAsyncOperation<SmartCardStatus?>? {
      val fnPtr = _204168922_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardStatus?>>()
      val hr = fn.invokeHR(arrayOf(__204168922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SmartCardStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAnswerToResetAsync(): IAsyncOperation<IBuffer?>? {
      val fnPtr = _204168922_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__204168922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __204168922_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b718871643443f4b55a6a29623870aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCard(ptr: Pointer?): WithDefault = ISmartCard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCard {
      val address = segment.toRawLongValue()
      return makeISmartCard(Pointer(address))
    }

    public override fun toNative(obj: ISmartCard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__204168922_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCard): Array<ISmartCard?> = (elements as
        Array<ISmartCard?>).castToImpl<ISmartCard,ISmartCard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCard?> = arrayOfNulls<ISmartCard_Impl>(size)
        as Array<ISmartCard?>
  }
}
