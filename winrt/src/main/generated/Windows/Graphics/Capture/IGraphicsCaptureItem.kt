package Windows.Graphics.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.SizeInt32
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGraphicsCaptureItem.ABI::class)
@Signature("{79c3f95b-31f7-4ec2-a464-632ef5d30760}")
@Guid("79c3f95b31f74ec2a464632ef5d30760")
@WinRTInterface("79c3f95b31f74ec2a464632ef5d30760")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCaptureItem.ByReference::class)
public interface IGraphicsCaptureItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Size(): SizeInt32?

  @InterfaceMethod(2)
  public fun add_Closed(handler: TypedEventHandler<GraphicsCaptureItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCaptureItem> {
    public override fun getValue() = ABI.makeIGraphicsCaptureItem(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCaptureItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCaptureItem {
    public val __1108868877_Ptr: Pointer?

    public val _1108868877_VtblPtr: Pointer?
      get() = __1108868877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1108868877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1108868877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): SizeInt32? {
      val fnPtr = _1108868877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1108868877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_Closed(handler: TypedEventHandler<GraphicsCaptureItem?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1108868877_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1108868877_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1108868877_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1108868877_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGraphicsCaptureItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1108868877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCaptureItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79c3f95b31f74ec2a464632ef5d30760")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCaptureItem(ptr: Pointer?): WithDefault = IGraphicsCaptureItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCaptureItem {
      val address = segment.toRawLongValue()
      return makeIGraphicsCaptureItem(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCaptureItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1108868877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCaptureItem): Array<IGraphicsCaptureItem?> =
        (elements as
        Array<IGraphicsCaptureItem?>).castToImpl<IGraphicsCaptureItem,IGraphicsCaptureItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCaptureItem?> =
        arrayOfNulls<IGraphicsCaptureItem_Impl>(size) as Array<IGraphicsCaptureItem?>
  }
}
