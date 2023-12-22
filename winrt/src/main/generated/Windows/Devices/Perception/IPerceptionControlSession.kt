package Windows.Devices.Perception

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionControlSession.ABI::class)
@Signature("{99998653-5a3d-417f-9239-f1889e548b48}")
@Guid("999986535a3d417f9239f1889e548b48")
@WinRTInterface("999986535a3d417f9239f1889e548b48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionControlSession.ByReference::class)
public interface IPerceptionControlSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_ControlLost(handler: TypedEventHandler<PerceptionControlSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ControlLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun TrySetPropertyAsync(name: String?, value: IUnknown?):
      IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionControlSession> {
    public override fun getValue() = ABI.makeIPerceptionControlSession(pointer.getPointer(0))

    public fun setValue(value: IPerceptionControlSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionControlSession, IClosable.WithDefault {
    public val __1817070342_Ptr: Pointer?

    public val _1817070342_VtblPtr: Pointer?
      get() = __1817070342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ControlLost(handler: TypedEventHandler<PerceptionControlSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1817070342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1817070342_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ControlLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _1817070342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1817070342_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TrySetPropertyAsync(name: String?, value: IUnknown?):
        IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>? {
      val fnPtr = _1817070342_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1817070342_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionControlSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1817070342_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1817070342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionControlSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("999986535a3d417f9239f1889e548b48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionControlSession(ptr: Pointer?): WithDefault =
        IPerceptionControlSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionControlSession {
      val address = segment.toRawLongValue()
      return makeIPerceptionControlSession(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionControlSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1817070342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionControlSession):
        Array<IPerceptionControlSession?> = (elements as
        Array<IPerceptionControlSession?>).castToImpl<IPerceptionControlSession,IPerceptionControlSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionControlSession?> =
        arrayOfNulls<IPerceptionControlSession_Impl>(size) as Array<IPerceptionControlSession?>
  }
}
