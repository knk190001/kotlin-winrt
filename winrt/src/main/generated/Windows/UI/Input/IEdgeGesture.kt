package Windows.UI.Input

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

@ABIMarker(IEdgeGesture.ABI::class)
@Signature("{580d5292-2ab1-49aa-a7f0-33bd3f8df9f1}")
@Guid("580d52922ab149aaa7f033bd3f8df9f1")
@WinRTInterface("580d52922ab149aaa7f033bd3f8df9f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEdgeGesture.ByReference::class)
public interface IEdgeGesture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Starting(handler: TypedEventHandler<EdgeGesture?, EdgeGestureEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Starting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Completed(handler: TypedEventHandler<EdgeGesture?, EdgeGestureEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Canceled(handler: TypedEventHandler<EdgeGesture?, EdgeGestureEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Canceled(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEdgeGesture> {
    public override fun getValue() = ABI.makeIEdgeGesture(pointer.getPointer(0))

    public fun setValue(value: IEdgeGesture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEdgeGesture {
    public val __1750011710_Ptr: Pointer?

    public val _1750011710_VtblPtr: Pointer?
      get() = __1750011710_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Starting(handler: TypedEventHandler<EdgeGesture?,
        EdgeGestureEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Starting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Completed(handler: TypedEventHandler<EdgeGesture?,
        EdgeGestureEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Canceled(handler: TypedEventHandler<EdgeGesture?,
        EdgeGestureEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Canceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1750011710_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1750011710_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEdgeGesture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1750011710_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEdgeGesture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("580d52922ab149aaa7f033bd3f8df9f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEdgeGesture(ptr: Pointer?): WithDefault = IEdgeGesture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEdgeGesture {
      val address = segment.toRawLongValue()
      return makeIEdgeGesture(Pointer(address))
    }

    public override fun toNative(obj: IEdgeGesture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1750011710_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEdgeGesture): Array<IEdgeGesture?> = (elements as
        Array<IEdgeGesture?>).castToImpl<IEdgeGesture,IEdgeGesture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEdgeGesture?> =
        arrayOfNulls<IEdgeGesture_Impl>(size) as Array<IEdgeGesture?>
  }
}
