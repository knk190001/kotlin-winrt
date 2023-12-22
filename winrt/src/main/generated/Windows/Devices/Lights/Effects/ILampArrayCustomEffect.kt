package Windows.Devices.Lights.Effects

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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

@ABIMarker(ILampArrayCustomEffect.ABI::class)
@Signature("{ec579170-3c34-4876-818b-5765f78b0ee4}")
@Guid("ec5791703c344876818b5765f78b0ee4")
@WinRTInterface("ec5791703c344876818b5765f78b0ee4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayCustomEffect.ByReference::class)
public interface ILampArrayCustomEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_UpdateInterval(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_UpdateInterval(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun add_UpdateRequested(handler: TypedEventHandler<LampArrayCustomEffect?,
      LampArrayUpdateRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_UpdateRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayCustomEffect> {
    public override fun getValue() = ABI.makeILampArrayCustomEffect(pointer.getPointer(0))

    public fun setValue(value: ILampArrayCustomEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayCustomEffect {
    public val __351821497_Ptr: Pointer?

    public val _351821497_VtblPtr: Pointer?
      get() = __351821497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _351821497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _351821497_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UpdateInterval(): TimeSpan? {
      val fnPtr = _351821497_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_UpdateInterval(value: TimeSpan?): Unit {
      val fnPtr = _351821497_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_UpdateRequested(handler: TypedEventHandler<LampArrayCustomEffect?,
        LampArrayUpdateRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _351821497_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_UpdateRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _351821497_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__351821497_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayCustomEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __351821497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayCustomEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec5791703c344876818b5765f78b0ee4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayCustomEffect(ptr: Pointer?): WithDefault =
        ILampArrayCustomEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayCustomEffect {
      val address = segment.toRawLongValue()
      return makeILampArrayCustomEffect(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayCustomEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__351821497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayCustomEffect): Array<ILampArrayCustomEffect?> =
        (elements as
        Array<ILampArrayCustomEffect?>).castToImpl<ILampArrayCustomEffect,ILampArrayCustomEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayCustomEffect?> =
        arrayOfNulls<ILampArrayCustomEffect_Impl>(size) as Array<ILampArrayCustomEffect?>
  }
}
