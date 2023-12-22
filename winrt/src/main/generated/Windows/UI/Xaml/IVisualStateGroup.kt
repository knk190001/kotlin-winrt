package Windows.UI.Xaml

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IVisualStateGroup.ABI::class)
@Signature("{e4f9d9a4-e028-44de-9b15-4929ae0a26c2}")
@Guid("e4f9d9a4e02844de9b154929ae0a26c2")
@WinRTInterface("e4f9d9a4e02844de9b154929ae0a26c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateGroup.ByReference::class)
public interface IVisualStateGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Transitions(): IVector<VisualTransition?>?

  @InterfaceMethod(2)
  public fun get_States(): IVector<VisualState?>?

  @InterfaceMethod(3)
  public fun get_CurrentState(): VisualState?

  @InterfaceMethod(4)
  public fun add_CurrentStateChanged(handler: VisualStateChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_CurrentStateChanging(handler: VisualStateChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CurrentStateChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateGroup> {
    public override fun getValue() = ABI.makeIVisualStateGroup(pointer.getPointer(0))

    public fun setValue(value: IVisualStateGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateGroup {
    public val __1002395104_Ptr: Pointer?

    public val _1002395104_VtblPtr: Pointer?
      get() = __1002395104_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Transitions(): IVector<VisualTransition?>? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VisualTransition?>>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VisualTransition?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_States(): IVector<VisualState?>? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VisualState?>>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VisualState?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CurrentState(): VisualState? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualState>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_CurrentStateChanged(handler: VisualStateChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_CurrentStateChanging(handler: VisualStateChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CurrentStateChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1002395104_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1002395104_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualStateGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1002395104_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4f9d9a4e02844de9b154929ae0a26c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateGroup(ptr: Pointer?): WithDefault = IVisualStateGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateGroup {
      val address = segment.toRawLongValue()
      return makeIVisualStateGroup(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1002395104_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateGroup): Array<IVisualStateGroup?> = (elements
        as Array<IVisualStateGroup?>).castToImpl<IVisualStateGroup,IVisualStateGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateGroup?> =
        arrayOfNulls<IVisualStateGroup_Impl>(size) as Array<IVisualStateGroup?>
  }
}
