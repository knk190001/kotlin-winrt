package Windows.Media.PlayTo

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayToManager.ABI::class)
@Signature("{f56a206e-1b77-42ef-8f0d-b949f8d9b260}")
@Guid("f56a206e1b7742ef8f0db949f8d9b260")
@WinRTInterface("f56a206e1b7742ef8f0db949f8d9b260")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToManager.ByReference::class)
public interface IPlayToManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SourceRequested(handler: TypedEventHandler<PlayToManager?,
      PlayToSourceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SourceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceSelected(handler: TypedEventHandler<PlayToManager?,
      PlayToSourceSelectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceSelected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun put_DefaultSourceSelection(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_DefaultSourceSelection(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPlayToManager>
      {
    public override fun getValue() = ABI.makeIPlayToManager(pointer.getPointer(0))

    public fun setValue(value: IPlayToManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToManager {
    public val __258998503_Ptr: Pointer?

    public val _258998503_VtblPtr: Pointer?
      get() = __258998503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SourceRequested(handler: TypedEventHandler<PlayToManager?,
        PlayToSourceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _258998503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SourceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _258998503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SourceSelected(handler: TypedEventHandler<PlayToManager?,
        PlayToSourceSelectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _258998503_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceSelected(token: EventRegistrationToken?): Unit {
      val fnPtr = _258998503_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_DefaultSourceSelection(value: Boolean): Unit {
      val fnPtr = _258998503_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DefaultSourceSelection(): Boolean {
      val fnPtr = _258998503_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__258998503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlayToManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __258998503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f56a206e1b7742ef8f0db949f8d9b260")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToManager(ptr: Pointer?): WithDefault = IPlayToManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToManager {
      val address = segment.toRawLongValue()
      return makeIPlayToManager(Pointer(address))
    }

    public override fun toNative(obj: IPlayToManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__258998503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToManager): Array<IPlayToManager?> = (elements as
        Array<IPlayToManager?>).castToImpl<IPlayToManager,IPlayToManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToManager?> =
        arrayOfNulls<IPlayToManager_Impl>(size) as Array<IPlayToManager?>
  }
}
