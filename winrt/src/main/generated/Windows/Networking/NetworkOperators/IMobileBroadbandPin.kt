package Windows.Networking.NetworkOperators

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMobileBroadbandPin.ABI::class)
@Signature("{e661d709-e779-45bf-8281-75323df9e321}")
@Guid("e661d709e77945bf828175323df9e321")
@WinRTInterface("e661d709e77945bf828175323df9e321")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandPin.ByReference::class)
public interface IMobileBroadbandPin : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): MobileBroadbandPinType?

  @InterfaceMethod(1)
  public fun get_LockState(): MobileBroadbandPinLockState?

  @InterfaceMethod(2)
  public fun get_Format(): MobileBroadbandPinFormat?

  @InterfaceMethod(3)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(4)
  public fun get_MaxLength(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_MinLength(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_AttemptsRemaining(): WinDef.UINT

  @InterfaceMethod(7)
  public fun EnableAsync(currentPin: String?): IAsyncOperation<MobileBroadbandPinOperationResult?>?

  @InterfaceMethod(8)
  public fun DisableAsync(currentPin: String?): IAsyncOperation<MobileBroadbandPinOperationResult?>?

  @InterfaceMethod(9)
  public fun EnterAsync(currentPin: String?): IAsyncOperation<MobileBroadbandPinOperationResult?>?

  @InterfaceMethod(10)
  public fun ChangeAsync(currentPin: String?, newPin: String?):
      IAsyncOperation<MobileBroadbandPinOperationResult?>?

  @InterfaceMethod(11)
  public fun UnblockAsync(pinUnblockKey: String?, newPin: String?):
      IAsyncOperation<MobileBroadbandPinOperationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandPin> {
    public override fun getValue() = ABI.makeIMobileBroadbandPin(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandPin_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandPin {
    public val __205333031_Ptr: Pointer?

    public val _205333031_VtblPtr: Pointer?
      get() = __205333031_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): MobileBroadbandPinType? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinType>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LockState(): MobileBroadbandPinLockState? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinLockState>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinLockState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Format(): MobileBroadbandPinFormat? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandPinFormat>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandPinFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _205333031_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxLength(): WinDef.UINT {
      val fnPtr = _205333031_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_MinLength(): WinDef.UINT {
      val fnPtr = _205333031_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AttemptsRemaining(): WinDef.UINT {
      val fnPtr = _205333031_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun EnableAsync(currentPin: String?):
        IAsyncOperation<MobileBroadbandPinOperationResult?>? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPinOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr, marshalToNative(currentPin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandPinOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DisableAsync(currentPin: String?):
        IAsyncOperation<MobileBroadbandPinOperationResult?>? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPinOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr, marshalToNative(currentPin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandPinOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun EnterAsync(currentPin: String?):
        IAsyncOperation<MobileBroadbandPinOperationResult?>? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPinOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr, marshalToNative(currentPin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandPinOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ChangeAsync(currentPin: String?, newPin: String?):
        IAsyncOperation<MobileBroadbandPinOperationResult?>? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPinOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr, marshalToNative(currentPin),
          marshalToNative(newPin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandPinOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun UnblockAsync(pinUnblockKey: String?, newPin: String?):
        IAsyncOperation<MobileBroadbandPinOperationResult?>? {
      val fnPtr = _205333031_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandPinOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__205333031_Ptr, marshalToNative(pinUnblockKey),
          marshalToNative(newPin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandPinOperationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandPin_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __205333031_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandPin, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e661d709e77945bf828175323df9e321")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandPin(ptr: Pointer?): WithDefault = IMobileBroadbandPin_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandPin {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandPin(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandPin): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__205333031_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandPin): Array<IMobileBroadbandPin?> =
        (elements as
        Array<IMobileBroadbandPin?>).castToImpl<IMobileBroadbandPin,IMobileBroadbandPin_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandPin?> =
        arrayOfNulls<IMobileBroadbandPin_Impl>(size) as Array<IMobileBroadbandPin?>
  }
}
