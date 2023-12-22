package Microsoft.UI.Content

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Numerics.Vector2
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentSite.ABI::class)
@Signature("{996c60c4-02b2-5eef-93b0-dd6b1ec2fd7b}")
@Guid("996c60c402b25eef93b0dd6b1ec2fd7b")
@WinRTInterface("996c60c402b25eef93b0dd6b1ec2fd7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSite.ByReference::class)
public interface IContentSite : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualSize(): Vector2?

  @InterfaceMethod(1)
  public fun put_ActualSize(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_ClientSize(): SizeInt32?

  @InterfaceMethod(3)
  public fun put_ClientSize(value: SizeInt32?): Unit

  @InterfaceMethod(4)
  public fun get_CoordinateConverter(): ContentCoordinateConverter?

  @InterfaceMethod(5)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(6)
  public fun get_Environment(): ContentSiteEnvironment?

  @InterfaceMethod(7)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(8)
  public fun get_IsSiteEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsSiteEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsSiteVisible(): Boolean

  @InterfaceMethod(11)
  public fun put_IsSiteVisible(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_LayoutDirection(): ContentLayoutDirection?

  @InterfaceMethod(13)
  public fun put_LayoutDirection(value: ContentLayoutDirection?): Unit

  @InterfaceMethod(14)
  public fun get_OverrideScale(): Float

  @InterfaceMethod(15)
  public fun put_OverrideScale(value: Float): Unit

  @InterfaceMethod(16)
  public fun get_ParentScale(): Float

  @InterfaceMethod(17)
  public fun put_ParentScale(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_RasterizationScale(): Float

  @InterfaceMethod(19)
  public fun get_RequestedSize(): Vector2?

  @InterfaceMethod(20)
  public fun get_ShouldApplyRasterizationScale(): Boolean

  @InterfaceMethod(21)
  public fun put_ShouldApplyRasterizationScale(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_View(): ContentSiteView?

  @InterfaceMethod(23)
  public fun GetIslandStateChangeDeferral(): ContentDeferral?

  @InterfaceMethod(24)
  public fun add_RequestedStateChanged(handler: TypedEventHandler<ContentSite?,
      ContentSiteRequestedStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_RequestedStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentSite> {
    public override fun getValue() = ABI.makeIContentSite(pointer.getPointer(0))

    public fun setValue(value: IContentSite_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSite {
    public val __1000354038_Ptr: Pointer?

    public val _1000354038_VtblPtr: Pointer?
      get() = __1000354038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualSize(): Vector2? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ActualSize(value: Vector2?): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ClientSize(): SizeInt32? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ClientSize(value: SizeInt32?): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CoordinateConverter(): ContentCoordinateConverter? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentCoordinateConverter>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentCoordinateConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Environment(): ContentSiteEnvironment? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSiteEnvironment>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSiteEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsSiteEnabled(): Boolean {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsSiteEnabled(value: Boolean): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsSiteVisible(): Boolean {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsSiteVisible(value: Boolean): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_LayoutDirection(): ContentLayoutDirection? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLayoutDirection>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLayoutDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_LayoutDirection(value: ContentLayoutDirection?): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_OverrideScale(): Float {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_OverrideScale(value: Float): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ParentScale(): Float {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_ParentScale(value: Float): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_RasterizationScale(): Float {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_RequestedSize(): Vector2? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_ShouldApplyRasterizationScale(): Boolean {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_ShouldApplyRasterizationScale(value: Boolean): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_View(): ContentSiteView? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSiteView>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSiteView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun GetIslandStateChangeDeferral(): ContentDeferral? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDeferral>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun add_RequestedStateChanged(handler: TypedEventHandler<ContentSite?,
        ContentSiteRequestedStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_RequestedStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1000354038_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1000354038_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentSite_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1000354038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSite, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("996c60c402b25eef93b0dd6b1ec2fd7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSite(ptr: Pointer?): WithDefault = IContentSite_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSite {
      val address = segment.toRawLongValue()
      return makeIContentSite(Pointer(address))
    }

    public override fun toNative(obj: IContentSite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1000354038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSite): Array<IContentSite?> = (elements as
        Array<IContentSite?>).castToImpl<IContentSite,IContentSite_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSite?> =
        arrayOfNulls<IContentSite_Impl>(size) as Array<IContentSite?>
  }
}
