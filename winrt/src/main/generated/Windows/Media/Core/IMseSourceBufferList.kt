package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMseSourceBufferList.ABI::class)
@Signature("{95fae8e7-a8e7-4ebf-8927-145e940ba511}")
@Guid("95fae8e7a8e74ebf8927145e940ba511")
@WinRTInterface("95fae8e7a8e74ebf8927145e940ba511")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMseSourceBufferList.ByReference::class)
public interface IMseSourceBufferList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SourceBufferAdded(handler: TypedEventHandler<MseSourceBufferList?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SourceBufferAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceBufferRemoved(handler: TypedEventHandler<MseSourceBufferList?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceBufferRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_Buffers(): IVectorView<MseSourceBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMseSourceBufferList> {
    public override fun getValue() = ABI.makeIMseSourceBufferList(pointer.getPointer(0))

    public fun setValue(value: IMseSourceBufferList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMseSourceBufferList {
    public val __303002589_Ptr: Pointer?

    public val _303002589_VtblPtr: Pointer?
      get() = __303002589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SourceBufferAdded(handler: TypedEventHandler<MseSourceBufferList?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _303002589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__303002589_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SourceBufferAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _303002589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__303002589_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SourceBufferRemoved(handler: TypedEventHandler<MseSourceBufferList?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _303002589_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__303002589_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceBufferRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _303002589_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__303002589_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Buffers(): IVectorView<MseSourceBuffer?>? {
      val fnPtr = _303002589_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MseSourceBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__303002589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MseSourceBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class IMseSourceBufferList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __303002589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMseSourceBufferList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95fae8e7a8e74ebf8927145e940ba511")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMseSourceBufferList(ptr: Pointer?): WithDefault = IMseSourceBufferList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMseSourceBufferList {
      val address = segment.toRawLongValue()
      return makeIMseSourceBufferList(Pointer(address))
    }

    public override fun toNative(obj: IMseSourceBufferList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__303002589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMseSourceBufferList): Array<IMseSourceBufferList?> =
        (elements as
        Array<IMseSourceBufferList?>).castToImpl<IMseSourceBufferList,IMseSourceBufferList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMseSourceBufferList?> =
        arrayOfNulls<IMseSourceBufferList_Impl>(size) as Array<IMseSourceBufferList?>
  }
}
