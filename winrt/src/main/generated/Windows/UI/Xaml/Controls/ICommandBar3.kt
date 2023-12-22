package Windows.UI.Xaml.Controls

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

@ABIMarker(ICommandBar3.ABI::class)
@Signature("{40ebbc23-2a79-48b3-9a67-649b852d8589}")
@Guid("40ebbc232a7948b39a67649b852d8589")
@WinRTInterface("40ebbc232a7948b39a67649b852d8589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBar3.ByReference::class)
public interface ICommandBar3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultLabelPosition(): CommandBarDefaultLabelPosition?

  @InterfaceMethod(1)
  public fun put_DefaultLabelPosition(value: CommandBarDefaultLabelPosition?): Unit

  @InterfaceMethod(2)
  public fun get_OverflowButtonVisibility(): CommandBarOverflowButtonVisibility?

  @InterfaceMethod(3)
  public fun put_OverflowButtonVisibility(value: CommandBarOverflowButtonVisibility?): Unit

  @InterfaceMethod(4)
  public fun get_IsDynamicOverflowEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsDynamicOverflowEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun add_DynamicOverflowItemsChanging(handler: TypedEventHandler<CommandBar?,
      DynamicOverflowItemsChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DynamicOverflowItemsChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICommandBar3> {
    public override fun getValue() = ABI.makeICommandBar3(pointer.getPointer(0))

    public fun setValue(value: ICommandBar3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBar3 {
    public val __1417873713_Ptr: Pointer?

    public val _1417873713_VtblPtr: Pointer?
      get() = __1417873713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultLabelPosition(): CommandBarDefaultLabelPosition? {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarDefaultLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarDefaultLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DefaultLabelPosition(value: CommandBarDefaultLabelPosition?): Unit {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OverflowButtonVisibility(): CommandBarOverflowButtonVisibility? {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarOverflowButtonVisibility>()
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarOverflowButtonVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OverflowButtonVisibility(value: CommandBarOverflowButtonVisibility?):
        Unit {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsDynamicOverflowEnabled(): Boolean {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsDynamicOverflowEnabled(value: Boolean): Unit {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_DynamicOverflowItemsChanging(handler: TypedEventHandler<CommandBar?,
        DynamicOverflowItemsChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DynamicOverflowItemsChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1417873713_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417873713_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBar3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417873713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBar3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40ebbc232a7948b39a67649b852d8589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBar3(ptr: Pointer?): WithDefault = ICommandBar3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBar3 {
      val address = segment.toRawLongValue()
      return makeICommandBar3(Pointer(address))
    }

    public override fun toNative(obj: ICommandBar3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1417873713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBar3): Array<ICommandBar3?> = (elements as
        Array<ICommandBar3?>).castToImpl<ICommandBar3,ICommandBar3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBar3?> =
        arrayOfNulls<ICommandBar3_Impl>(size) as Array<ICommandBar3?>
  }
}
