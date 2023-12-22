package Windows.Devices.AllJoyn

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.Language
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

@ABIMarker(IAllJoynBusAttachment2.ABI::class)
@Signature("{3474cb1e-2368-43b2-b43e-6a3ac1278d98}")
@Guid("3474cb1e236843b2b43e6a3ac1278d98")
@WinRTInterface("3474cb1e236843b2b43e6a3ac1278d98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusAttachment2.ByReference::class)
public interface IAllJoynBusAttachment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAboutDataAsync(serviceInfo: AllJoynServiceInfo?):
      IAsyncOperation<AllJoynAboutDataView?>?

  @InterfaceMethod(1)
  public fun GetAboutDataAsync(serviceInfo: AllJoynServiceInfo?, language: Language?):
      IAsyncOperation<AllJoynAboutDataView?>?

  @InterfaceMethod(2)
  public fun add_AcceptSessionJoinerRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynAcceptSessionJoinerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AcceptSessionJoinerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SessionJoined(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynSessionJoinedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SessionJoined(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusAttachment2> {
    public override fun getValue() = ABI.makeIAllJoynBusAttachment2(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusAttachment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusAttachment2 {
    public val __1270120832_Ptr: Pointer?

    public val _1270120832_VtblPtr: Pointer?
      get() = __1270120832_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAboutDataAsync(serviceInfo: AllJoynServiceInfo?):
        IAsyncOperation<AllJoynAboutDataView?>? {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynAboutDataView?>>()
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(serviceInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynAboutDataView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAboutDataAsync(serviceInfo: AllJoynServiceInfo?, language: Language?):
        IAsyncOperation<AllJoynAboutDataView?>? {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynAboutDataView?>>()
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(serviceInfo),
          marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynAboutDataView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_AcceptSessionJoinerRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynAcceptSessionJoinerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AcceptSessionJoinerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SessionJoined(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynSessionJoinedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SessionJoined(token: EventRegistrationToken?): Unit {
      val fnPtr = _1270120832_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1270120832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAllJoynBusAttachment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270120832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusAttachment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3474cb1e236843b2b43e6a3ac1278d98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusAttachment2(ptr: Pointer?): WithDefault =
        IAllJoynBusAttachment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusAttachment2 {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusAttachment2(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusAttachment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270120832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusAttachment2): Array<IAllJoynBusAttachment2?> =
        (elements as
        Array<IAllJoynBusAttachment2?>).castToImpl<IAllJoynBusAttachment2,IAllJoynBusAttachment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusAttachment2?> =
        arrayOfNulls<IAllJoynBusAttachment2_Impl>(size) as Array<IAllJoynBusAttachment2?>
  }
}
