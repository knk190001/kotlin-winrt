package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreInputView.ABI::class)
@Signature("{c770cd7a-7001-4c32-bf94-25c1f554cbf1}")
@Guid("c770cd7a70014c32bf9425c1f554cbf1")
@WinRTInterface("c770cd7a70014c32bf9425c1f554cbf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputView.ByReference::class)
public interface ICoreInputView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_OcclusionsChanged(handler: TypedEventHandler<CoreInputView?,
      CoreInputViewOcclusionsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_OcclusionsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetCoreInputViewOcclusions(): IVectorView<CoreInputViewOcclusion?>?

  @InterfaceMethod(3)
  public fun TryShowPrimaryView(): Boolean

  @InterfaceMethod(4)
  public fun TryHidePrimaryView(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreInputView>
      {
    public override fun getValue() = ABI.makeICoreInputView(pointer.getPointer(0))

    public fun setValue(value: ICoreInputView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputView {
    public val __364805885_Ptr: Pointer?

    public val _364805885_VtblPtr: Pointer?
      get() = __364805885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_OcclusionsChanged(handler: TypedEventHandler<CoreInputView?,
        CoreInputViewOcclusionsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _364805885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__364805885_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_OcclusionsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _364805885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__364805885_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetCoreInputViewOcclusions(): IVectorView<CoreInputViewOcclusion?>? {
      val fnPtr = _364805885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreInputViewOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__364805885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreInputViewOcclusion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryShowPrimaryView(): Boolean {
      val fnPtr = _364805885_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__364805885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun TryHidePrimaryView(): Boolean {
      val fnPtr = _364805885_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__364805885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreInputView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __364805885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c770cd7a70014c32bf9425c1f554cbf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputView(ptr: Pointer?): WithDefault = ICoreInputView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputView {
      val address = segment.toRawLongValue()
      return makeICoreInputView(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__364805885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputView): Array<ICoreInputView?> = (elements as
        Array<ICoreInputView?>).castToImpl<ICoreInputView,ICoreInputView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputView?> =
        arrayOfNulls<ICoreInputView_Impl>(size) as Array<ICoreInputView?>
  }
}
