package Windows.Services.TargetedContent

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

@ABIMarker(ITargetedContentSubscription.ABI::class)
@Signature("{882c2c49-c652-4c7a-acad-1f7fa2986c73}")
@Guid("882c2c49c6524c7aacad1f7fa2986c73")
@WinRTInterface("882c2c49c6524c7aacad1f7fa2986c73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentSubscription.ByReference::class)
public interface ITargetedContentSubscription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun GetContentContainerAsync(): IAsyncOperation<TargetedContentContainer?>?

  @InterfaceMethod(2)
  public fun add_ContentChanged(handler: TypedEventHandler<TargetedContentSubscription?,
      TargetedContentChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ContentChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_AvailabilityChanged(handler: TypedEventHandler<TargetedContentSubscription?,
      TargetedContentAvailabilityChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_AvailabilityChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_StateChanged(handler: TypedEventHandler<TargetedContentSubscription?,
      TargetedContentStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StateChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentSubscription> {
    public override fun getValue() = ABI.makeITargetedContentSubscription(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentSubscription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentSubscription {
    public val __644807713_Ptr: Pointer?

    public val _644807713_VtblPtr: Pointer?
      get() = __644807713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _644807713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetContentContainerAsync(): IAsyncOperation<TargetedContentContainer?>? {
      val fnPtr = _644807713_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<TargetedContentContainer?>>()
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<TargetedContentContainer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_ContentChanged(handler: TypedEventHandler<TargetedContentSubscription?,
        TargetedContentChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _644807713_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ContentChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _644807713_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_AvailabilityChanged(handler: TypedEventHandler<TargetedContentSubscription?,
        TargetedContentAvailabilityChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _644807713_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_AvailabilityChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _644807713_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_StateChanged(handler: TypedEventHandler<TargetedContentSubscription?,
        TargetedContentStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _644807713_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StateChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _644807713_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__644807713_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITargetedContentSubscription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __644807713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentSubscription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("882c2c49c6524c7aacad1f7fa2986c73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentSubscription(ptr: Pointer?): WithDefault =
        ITargetedContentSubscription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentSubscription {
      val address = segment.toRawLongValue()
      return makeITargetedContentSubscription(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentSubscription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__644807713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentSubscription):
        Array<ITargetedContentSubscription?> = (elements as
        Array<ITargetedContentSubscription?>).castToImpl<ITargetedContentSubscription,ITargetedContentSubscription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentSubscription?> =
        arrayOfNulls<ITargetedContentSubscription_Impl>(size) as
        Array<ITargetedContentSubscription?>
  }
}
