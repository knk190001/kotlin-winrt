package Windows.Devices.AllJoyn

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IAllJoynBusObject.ABI::class)
@Signature("{e8fd825e-f73a-490c-8804-04e026643047}")
@Guid("e8fd825ef73a490c880404e026643047")
@WinRTInterface("e8fd825ef73a490c880404e026643047")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusObject.ByReference::class)
public interface IAllJoynBusObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun AddProducer(producer: IAllJoynProducer?): Unit

  @InterfaceMethod(3)
  public fun get_BusAttachment(): AllJoynBusAttachment?

  @InterfaceMethod(4)
  public fun get_Session(): AllJoynSession?

  @InterfaceMethod(5)
  public fun add_Stopped(handler: TypedEventHandler<AllJoynBusObject?,
      AllJoynBusObjectStoppedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusObject> {
    public override fun getValue() = ABI.makeIAllJoynBusObject(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusObject {
    public val __1177056882_Ptr: Pointer?

    public val _1177056882_VtblPtr: Pointer?
      get() = __1177056882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddProducer(producer: IAllJoynProducer?): Unit {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr, marshalToNative(producer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BusAttachment(): AllJoynBusAttachment? {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusAttachment>()
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusAttachment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Session(): AllJoynSession? {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynSession>()
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_Stopped(handler: TypedEventHandler<AllJoynBusObject?,
        AllJoynBusObjectStoppedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1177056882_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1177056882_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAllJoynBusObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177056882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8fd825ef73a490c880404e026643047")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusObject(ptr: Pointer?): WithDefault = IAllJoynBusObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusObject {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusObject(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177056882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusObject): Array<IAllJoynBusObject?> = (elements
        as Array<IAllJoynBusObject?>).castToImpl<IAllJoynBusObject,IAllJoynBusObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusObject?> =
        arrayOfNulls<IAllJoynBusObject_Impl>(size) as Array<IAllJoynBusObject?>
  }
}
