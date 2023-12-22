package Windows.Devices.PointOfService

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

@ABIMarker(IMagneticStripeReaderBankCardDataReceivedEventArgs.ABI::class)
@Signature("{2e958823-a31a-4763-882c-23725e39b08e}")
@Guid("2e958823a31a4763882c23725e39b08e")
@WinRTInterface("2e958823a31a4763882c23725e39b08e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderBankCardDataReceivedEventArgs.ByReference::class)
public interface IMagneticStripeReaderBankCardDataReceivedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Report(): MagneticStripeReaderReport?

  @InterfaceMethod(1)
  public fun get_AccountNumber(): String?

  @InterfaceMethod(2)
  public fun get_ExpirationDate(): String?

  @InterfaceMethod(3)
  public fun get_ServiceCode(): String?

  @InterfaceMethod(4)
  public fun get_Title(): String?

  @InterfaceMethod(5)
  public fun get_FirstName(): String?

  @InterfaceMethod(6)
  public fun get_MiddleInitial(): String?

  @InterfaceMethod(7)
  public fun get_Surname(): String?

  @InterfaceMethod(8)
  public fun get_Suffix(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderBankCardDataReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderBankCardDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderBankCardDataReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderBankCardDataReceivedEventArgs {
    public val __1127474861_Ptr: Pointer?

    public val _1127474861_VtblPtr: Pointer?
      get() = __1127474861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Report(): MagneticStripeReaderReport? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderReport>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AccountNumber(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationDate(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ServiceCode(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Title(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FirstName(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MiddleInitial(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Surname(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Suffix(): String? {
      val fnPtr = _1127474861_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1127474861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMagneticStripeReaderBankCardDataReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1127474861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderBankCardDataReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e958823a31a4763882c23725e39b08e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderBankCardDataReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderBankCardDataReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMagneticStripeReaderBankCardDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderBankCardDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderBankCardDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1127474861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderBankCardDataReceivedEventArgs):
        Array<IMagneticStripeReaderBankCardDataReceivedEventArgs?> = (elements as
        Array<IMagneticStripeReaderBankCardDataReceivedEventArgs?>).castToImpl<IMagneticStripeReaderBankCardDataReceivedEventArgs,IMagneticStripeReaderBankCardDataReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMagneticStripeReaderBankCardDataReceivedEventArgs?> =
        arrayOfNulls<IMagneticStripeReaderBankCardDataReceivedEventArgs_Impl>(size) as
        Array<IMagneticStripeReaderBankCardDataReceivedEventArgs?>
  }
}
