package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppServiceConnection.ABI::class)
@Signature("{9dd474a2-871f-4d52-89a9-9e090531bd27}")
@Guid("9dd474a2871f4d5289a99e090531bd27")
@WinRTInterface("9dd474a2871f4d5289a99e090531bd27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceConnection.ByReference::class)
public interface IAppServiceConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppServiceName(): String?

  @InterfaceMethod(1)
  public fun put_AppServiceName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(3)
  public fun put_PackageFamilyName(value: String?): Unit

  @InterfaceMethod(4)
  public fun OpenAsync(): IAsyncOperation<AppServiceConnectionStatus?>?

  @InterfaceMethod(5)
  public fun SendMessageAsync(message: ValueSet?): IAsyncOperation<AppServiceResponse?>?

  @InterfaceMethod(6)
  public fun add_RequestReceived(handler: TypedEventHandler<AppServiceConnection?,
      AppServiceRequestReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RequestReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_ServiceClosed(handler: TypedEventHandler<AppServiceConnection?,
      AppServiceClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ServiceClosed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceConnection> {
    public override fun getValue() = ABI.makeIAppServiceConnection(pointer.getPointer(0))

    public fun setValue(value: IAppServiceConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceConnection {
    public val __1369690531_Ptr: Pointer?

    public val _1369690531_VtblPtr: Pointer?
      get() = __1369690531_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppServiceName(): String? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AppServiceName(value: String?): Unit {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PackageFamilyName(value: String?): Unit {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OpenAsync(): IAsyncOperation<AppServiceConnectionStatus?>? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppServiceConnectionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppServiceConnectionStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SendMessageAsync(message: ValueSet?):
        IAsyncOperation<AppServiceResponse?>? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_RequestReceived(handler: TypedEventHandler<AppServiceConnection?,
        AppServiceRequestReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RequestReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_ServiceClosed(handler: TypedEventHandler<AppServiceConnection?,
        AppServiceClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ServiceClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1369690531_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1369690531_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppServiceConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1369690531_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9dd474a2871f4d5289a99e090531bd27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceConnection(ptr: Pointer?): WithDefault =
        IAppServiceConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceConnection {
      val address = segment.toRawLongValue()
      return makeIAppServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369690531_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceConnection): Array<IAppServiceConnection?> =
        (elements as
        Array<IAppServiceConnection?>).castToImpl<IAppServiceConnection,IAppServiceConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceConnection?> =
        arrayOfNulls<IAppServiceConnection_Impl>(size) as Array<IAppServiceConnection?>
  }
}
