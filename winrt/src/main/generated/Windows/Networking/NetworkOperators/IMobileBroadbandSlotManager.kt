package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IMobileBroadbandSlotManager.ABI::class)
@Signature("{eba07cd6-2019-5f81-a294-cc364a11d0b2}")
@Guid("eba07cd620195f81a294cc364a11d0b2")
@WinRTInterface("eba07cd620195f81a294cc364a11d0b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandSlotManager.ByReference::class)
public interface IMobileBroadbandSlotManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SlotInfos(): IVectorView<MobileBroadbandSlotInfo?>?

  @InterfaceMethod(1)
  public fun get_CurrentSlotIndex(): Int

  @InterfaceMethod(2)
  public fun SetCurrentSlot(slotIndex: Int): MobileBroadbandModemStatus?

  @InterfaceMethod(3)
  public fun SetCurrentSlotAsync(slotIndex: Int): IAsyncOperation<MobileBroadbandModemStatus?>?

  @InterfaceMethod(4)
  public fun add_SlotInfoChanged(handler: TypedEventHandler<MobileBroadbandSlotManager?,
      MobileBroadbandSlotInfoChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SlotInfoChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_CurrentSlotIndexChanged(handler: TypedEventHandler<MobileBroadbandSlotManager?,
      MobileBroadbandCurrentSlotIndexChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CurrentSlotIndexChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandSlotManager> {
    public override fun getValue() = ABI.makeIMobileBroadbandSlotManager(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandSlotManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandSlotManager {
    public val __1435448301_Ptr: Pointer?

    public val _1435448301_VtblPtr: Pointer?
      get() = __1435448301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SlotInfos(): IVectorView<MobileBroadbandSlotInfo?>? {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandSlotInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandSlotInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentSlotIndex(): Int {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetCurrentSlot(slotIndex: Int): MobileBroadbandModemStatus? {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandModemStatus>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, slotIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandModemStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetCurrentSlotAsync(slotIndex: Int):
        IAsyncOperation<MobileBroadbandModemStatus?>? {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandModemStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, slotIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandModemStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_SlotInfoChanged(handler: TypedEventHandler<MobileBroadbandSlotManager?,
        MobileBroadbandSlotInfoChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SlotInfoChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_CurrentSlotIndexChanged(handler: TypedEventHandler<MobileBroadbandSlotManager?,
        MobileBroadbandCurrentSlotIndexChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CurrentSlotIndexChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1435448301_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435448301_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandSlotManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1435448301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandSlotManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eba07cd620195f81a294cc364a11d0b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandSlotManager(ptr: Pointer?): WithDefault =
        IMobileBroadbandSlotManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandSlotManager {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandSlotManager(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandSlotManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1435448301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandSlotManager):
        Array<IMobileBroadbandSlotManager?> = (elements as
        Array<IMobileBroadbandSlotManager?>).castToImpl<IMobileBroadbandSlotManager,IMobileBroadbandSlotManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandSlotManager?> =
        arrayOfNulls<IMobileBroadbandSlotManager_Impl>(size) as Array<IMobileBroadbandSlotManager?>
  }
}
