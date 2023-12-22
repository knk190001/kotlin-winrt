package Microsoft.UI.Content

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Numerics.Vector2
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentIsland.ABI::class)
@Signature("{5b2504ba-361c-50aa-bd6e-4122c6d93889}")
@Guid("5b2504ba361c50aabd6e4122c6d93889")
@WinRTInterface("5b2504ba361c50aabd6e4122c6d93889")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIsland.ByReference::class)
public interface IContentIsland : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualSize(): Vector2?

  @InterfaceMethod(1)
  public fun get_AppData(): IUnknown?

  @InterfaceMethod(2)
  public fun put_AppData(value: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun get_CoordinateConverter(): ContentCoordinateConverter?

  @InterfaceMethod(4)
  public fun get_CustomProperties(): IPropertySet?

  @InterfaceMethod(5)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(6)
  public fun get_Environment(): ContentIslandEnvironment?

  @InterfaceMethod(7)
  public fun get_Id(): WinDef.ULONG

  @InterfaceMethod(8)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(9)
  public fun get_IsHitTestVisibleWhenTransparent(): Boolean

  @InterfaceMethod(10)
  public fun put_IsHitTestVisibleWhenTransparent(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_IsIslandEnabled(): Boolean

  @InterfaceMethod(12)
  public fun put_IsIslandEnabled(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun get_IsIslandVisible(): Boolean

  @InterfaceMethod(14)
  public fun put_IsIslandVisible(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_IsSiteEnabled(): Boolean

  @InterfaceMethod(16)
  public fun get_IsSiteVisible(): Boolean

  @InterfaceMethod(17)
  public fun get_LayoutDirection(): ContentLayoutDirection?

  @InterfaceMethod(18)
  public fun get_RasterizationScale(): Float

  @InterfaceMethod(19)
  public fun GetAutomationHostProvider(): IUnknown?

  @InterfaceMethod(20)
  public fun GetStateChangeDeferral(): ContentDeferral?

  @InterfaceMethod(21)
  public fun RequestSize(size: Vector2?): Unit

  @InterfaceMethod(22)
  public fun add_AutomationProviderRequested(handler: TypedEventHandler<ContentIsland?,
      ContentIslandAutomationProviderRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_AutomationProviderRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_StateChanged(handler: TypedEventHandler<ContentIsland?,
      ContentIslandStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentIsland>
      {
    public override fun getValue() = ABI.makeIContentIsland(pointer.getPointer(0))

    public fun setValue(value: IContentIsland_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIsland {
    public val __1009738748_Ptr: Pointer?

    public val _1009738748_VtblPtr: Pointer?
      get() = __1009738748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualSize(): Vector2? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppData(): IUnknown? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AppData(value: IUnknown?): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CoordinateConverter(): ContentCoordinateConverter? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentCoordinateConverter>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentCoordinateConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CustomProperties(): IPropertySet? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Environment(): ContentIslandEnvironment? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIslandEnvironment>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIslandEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Id(): WinDef.ULONG {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsHitTestVisibleWhenTransparent(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsHitTestVisibleWhenTransparent(value: Boolean): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_IsIslandEnabled(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_IsIslandEnabled(value: Boolean): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsIslandVisible(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IsIslandVisible(value: Boolean): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IsSiteEnabled(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_IsSiteVisible(): Boolean {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_LayoutDirection(): ContentLayoutDirection? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLayoutDirection>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLayoutDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_RasterizationScale(): Float {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun GetAutomationHostProvider(): IUnknown? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetStateChangeDeferral(): ContentDeferral? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDeferral>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun RequestSize(size: Vector2?): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(size),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_AutomationProviderRequested(handler: TypedEventHandler<ContentIsland?,
        ContentIslandAutomationProviderRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_AutomationProviderRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_StateChanged(handler: TypedEventHandler<ContentIsland?,
        ContentIslandStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1009738748_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009738748_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentIsland_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1009738748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIsland, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b2504ba361c50aabd6e4122c6d93889")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIsland(ptr: Pointer?): WithDefault = IContentIsland_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIsland {
      val address = segment.toRawLongValue()
      return makeIContentIsland(Pointer(address))
    }

    public override fun toNative(obj: IContentIsland): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1009738748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIsland): Array<IContentIsland?> = (elements as
        Array<IContentIsland?>).castToImpl<IContentIsland,IContentIsland_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIsland?> =
        arrayOfNulls<IContentIsland_Impl>(size) as Array<IContentIsland?>
  }
}
