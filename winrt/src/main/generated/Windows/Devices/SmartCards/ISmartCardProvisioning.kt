package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardProvisioning.ABI::class)
@Signature("{19eeedbd-1fab-477c-b712-1a2c5af1fd6e}")
@Guid("19eeedbd1fab477cb7121a2c5af1fd6e")
@WinRTInterface("19eeedbd1fab477cb7121a2c5af1fd6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardProvisioning.ByReference::class)
public interface ISmartCardProvisioning : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmartCard(): SmartCard?

  @InterfaceMethod(1)
  public fun GetIdAsync(): IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(2)
  public fun GetNameAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(3)
  public fun GetChallengeContextAsync(): IAsyncOperation<SmartCardChallengeContext?>?

  @InterfaceMethod(4)
  public fun RequestPinChangeAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun RequestPinResetAsync(handler: SmartCardPinResetHandler?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardProvisioning> {
    public override fun getValue() = ABI.makeISmartCardProvisioning(pointer.getPointer(0))

    public fun setValue(value: ISmartCardProvisioning_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardProvisioning {
    public val __1251918029_Ptr: Pointer?

    public val _1251918029_VtblPtr: Pointer?
      get() = __1251918029_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmartCard(): SmartCard? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCard>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCard>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIdAsync(): IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetChallengeContextAsync(): IAsyncOperation<SmartCardChallengeContext?>? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardChallengeContext?>>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardChallengeContext?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestPinChangeAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestPinResetAsync(handler: SmartCardPinResetHandler?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1251918029_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1251918029_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardProvisioning_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1251918029_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardProvisioning, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19eeedbd1fab477cb7121a2c5af1fd6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardProvisioning(ptr: Pointer?): WithDefault =
        ISmartCardProvisioning_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardProvisioning {
      val address = segment.toRawLongValue()
      return makeISmartCardProvisioning(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardProvisioning): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1251918029_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardProvisioning): Array<ISmartCardProvisioning?> =
        (elements as
        Array<ISmartCardProvisioning?>).castToImpl<ISmartCardProvisioning,ISmartCardProvisioning_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardProvisioning?> =
        arrayOfNulls<ISmartCardProvisioning_Impl>(size) as Array<ISmartCardProvisioning?>
  }
}
